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

package com.heroiclabs.nakama.example;

//import android.content.SharedPreferences;

import com.heroiclabs.nakama.Client;
import com.heroiclabs.nakama.DefaultClient;
import com.heroiclabs.nakama.DefaultSession;
import com.heroiclabs.nakama.Error;
import com.heroiclabs.nakama.Session;
import com.stumbleupon.async.Callback;

public class NakamaSessionManager {
    private final Client client;
    private final Callback<Error, Error> errback;
    private Session session;

    public NakamaSessionManager() {
        client = DefaultClient.builder("defaultkey").build();
        errback = new Callback<Error, Error>() {
            @Override
            public Error call(Error err) throws Exception {
                System.err.format("Error('%s', '%s')", err.getCode(), err.getMessage());
                return err;
            }
        };
    }

    public void connect() {

    }

    private void restoreSessionAndConnect() {
        //SharedPreferences pref = getActivity().getPreferences(Context.MODE_PRIVATE);
        // Lets check if we can restore a cached session.
        String sessionString = ""; //pref.getString("nk.session");
        if (sessionString == null || sessionString.isEmpty()) {
            return; // We have no session to restore.
        }

        Session session = DefaultSession.restore(sessionString);
        if (session.isExpired(System.currentTimeMillis())) {
            return; // We can't restore an expired session.
        }

        final NakamaSessionManager self = this;
        client.connect(session)
                .addCallback(new Callback<Session, Session>() {
                    @Override
                    public Session call(Session session) throws Exception {
                        System.out.format("Session connected: '%s'.", session.getToken());
                        self.session = session;
                        return session;
                    }
                });
    }

}
