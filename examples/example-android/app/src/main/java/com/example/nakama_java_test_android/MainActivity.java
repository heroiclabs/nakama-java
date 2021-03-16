/*
 * Copyright 2020 The Nakama Authors
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

package com.example.nakama_java_test_android;

import java.util.concurrent.*;
import com.google.common.util.concurrent.*;
import com.heroiclabs.nakama.*;
import android.app.*;
import android.os.Bundle;
import android.util.*;

// fat jar
// import nakama.com.google.common.util.concurrent.*;


public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final DefaultClient client = new DefaultClient("defaultkey", "10.0.2.2", 7349, false);
        final ExecutorService executor = Executors.newSingleThreadExecutor();

        try {
            String email = "super@heroes.com";
            String password = "batsignal";
            Futures.addCallback(client.authenticateEmail(email, password), new FutureCallback<Session>() {
                @Override
                public void onSuccess(final Session result) {
                    Log.i("auth","got session: " + result.getAuthToken());
                    client.createSocket();
                    executor.shutdown();
                }
                @Override
                public void onFailure(final Throwable throwable) {
                    Log.e("auth", throwable.getMessage());
                    executor.shutdown();
                }
            }, executor);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
