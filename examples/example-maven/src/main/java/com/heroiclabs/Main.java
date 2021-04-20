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

import java.util.concurrent.*;
import com.google.common.util.concurrent.*;
import com.heroiclabs.nakama.DefaultClient;
import com.heroiclabs.nakama.Session;
import com.heroiclabs.nakama.api.Account;

// fat jar
// import nakama.com.google.common.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        DefaultClient client = new DefaultClient("defaultkey", "127.0.0.1", 7349, false);
        ExecutorService executor = Executors.newSingleThreadExecutor();

        String email = "super@heroes.com";
        String password = "batsignal";

        ListenableFuture<Session> authFuture = client.authenticateEmail(email, password);

        AsyncFunction<Session, Account> accountFunction = new AsyncFunction<Session, Account>() {
            public ListenableFuture<Account> apply(Session session) {
                return client.getAccount(session);
            }
        };

        ListenableFuture<Account> accountFuture = Futures.transformAsync(authFuture, accountFunction, executor);
        Futures.addCallback(accountFuture, new FutureCallback<Account>() {
            @Override
            public void onSuccess(Account account) {
                System.out.println("Got account: " + account.getUser().getId());
                executor.shutdown();
            }

            @Override
            public void onFailure(Throwable e) {
                System.out.println(e.getMessage());
                executor.shutdown();
            }

        }, executor);

        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
