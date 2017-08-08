/*
 * Copyright 2017 The Nakama Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.heroiclabs.nakama;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.stumbleupon.async.Deferred;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import okhttp3.*;
import okio.ByteString;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class DefaultClient implements Client {

    final Gson GSON = new GsonBuilder()
            .enableComplexMapKeySerialization()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .create();

    private final String serverKey;
    private final String host;
    private final int port;
    private final String lang;

    private final boolean ssl;
    private final int timeout;
    private final boolean noDelay;

    private final Map<String, Deferred> collationIds;

    private final OkHttpClient client;
    private WebSocket socket;

    private DefaultClient(final String serverKey, final String host, final int port, final String lang,
                          final boolean ssl, final int timeout, final boolean noDelay) {
        this.host = host;
        this.port = port;
        this.serverKey = serverKey;
        this.lang = lang;
        this.ssl = ssl;
        this.timeout = timeout;
        this.noDelay = noDelay;

        collationIds = new ConcurrentHashMap<>();

        client = new OkHttpClient.Builder()
                .connectTimeout(3000, TimeUnit.MILLISECONDS)
                .readTimeout(timeout, TimeUnit.MILLISECONDS)
                .writeTimeout(timeout, TimeUnit.MILLISECONDS)
                .build();
    }

    public Deferred<Session> login(final @NonNull AuthenticateMessage auth) {
        return authenticate(auth, "/user/login");
    }

    public Deferred<Session> register(final @NonNull AuthenticateMessage auth) {
        return authenticate(auth, "/user/register");
    }

    private Deferred<Session> authenticate(final AuthenticateMessage auth, final String path) {
        final Deferred<Session> deferred = new Deferred<>();

        final byte[] payload = auth.asBytes(UUID.randomUUID().toString());

        final HttpUrl url = new HttpUrl.Builder()
                .scheme(ssl ? "https" : "http")
                .host(host)
                .port(port)
                .encodedPath(path)
                .build();

        final Request request = new Request.Builder()
                .url(url)
                .method("POST", RequestBody.create(MediaType.parse("application/octet-stream;"), payload))
                .header("Authorization", "Basic " + ByteString.of((serverKey + ":").getBytes()).base64())
                .header("Accept-Language", lang)
                .header("User-Agent", "nakama-java/0.1.0") // TODO set user-agent based on build version.
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                // FIXME
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final ResponseBody body = response.body();
                if (body == null) {
                    // FIXME
                    return;
                }
                final com.heroiclabs.nakama.Api.AuthenticateResponse authResponse;
                try {
                    authResponse = com.heroiclabs.nakama.Api.AuthenticateResponse.parseFrom(body.byteStream());
                } catch (IOException e) {
                    // FIXME
                    return;
                } finally {
                    response.close();
                }

                if (authResponse.getIdCase() == com.heroiclabs.nakama.Api.AuthenticateResponse.IdCase.SESSION) {
                    deferred.callback(DefaultSession.restore(authResponse.getSession().getToken()));
                } else if (authResponse.getIdCase() == com.heroiclabs.nakama.Api.AuthenticateResponse.IdCase.ERROR) {
                    // FIXME
                } else {
                    // FIXME unknown response
                }
            }
        });

        return deferred;
    }

    public Deferred<Void> connect(Session session) {
        final Deferred<Void> deferred = new Deferred<>();

        final String url = new HttpUrl.Builder()
                .scheme(ssl ? "https" : "http")
                .host(host)
                .port(port)
                .encodedPath("/api")
                .build()
                .toString()
                .replaceFirst("http", "ws");

        final Request request = new Request.Builder()
                .url(url)
                .build();

        return deferred;
    }

    public Deferred<Void> disconnect() {
        final Deferred<Void> deferred = new Deferred<>();
        return deferred;
    }

    public static Client defaults(String serverKey) {
        return builder(serverKey).build();
    }

    public static Builder builder(String serverKey) {
        return new Builder(serverKey);
    }

    @RequiredArgsConstructor
    public static class Builder {
        private final String serverKey;
        private String host = "127.0.0.1";
        private int port = 7350;
        private String lang = "en";
        private boolean ssl = false;
        private int timeout = 5000;
        private boolean noDelay = true;

        public Client build() {
            return new DefaultClient(serverKey, host, port, lang, ssl, timeout, noDelay);
        }

        public Builder host(final @NonNull String host) {
            this.host = host;
            return this;
        }

        public Builder port(final int port) {
            this.port = port;
            return this;
        }

        public Builder lang(final @NonNull String lang) {
            this.lang = lang;
            return this;
        }

        public Builder ssl(final boolean ssl) {
            this.ssl = ssl;
            return this;
        }

        public Builder timeout(final int timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder noDelay(final boolean noDelay) {
            this.noDelay = noDelay;
            return this;
        }
    }
}
