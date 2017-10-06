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

import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Set;

public interface MatchmakeAddMessage extends CollatedMessage<MatchmakeTicket> {

    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    class Builder {

        public static MatchmakeAddMessage.Builder newBuilder(long requiredCount) {
            com.heroiclabs.nakama.Api.TMatchmakeAdd.Builder add = com.heroiclabs.nakama.Api.TMatchmakeAdd.newBuilder()
                    .setRequiredCount(requiredCount);
            return new MatchmakeAddMessage.Builder(add);
        }

        private final @NonNull
        com.heroiclabs.nakama.Api.TMatchmakeAdd.Builder add;

        public MatchmakeAddMessage.Builder addTermFilter(String name, Set<String> terms, boolean matchAllTerms)
        {
            com.heroiclabs.nakama.Api.MatchmakeFilter.TermFilter.Builder f = com.heroiclabs.nakama.Api.MatchmakeFilter.TermFilter.newBuilder()
                .addAllTerms(terms)
                .setMatchAllTerms(matchAllTerms);

            add.addFilters(com.heroiclabs.nakama.Api.MatchmakeFilter.newBuilder().setName(name).setTerm(f));
            return this;
        }

        public MatchmakeAddMessage.Builder addRangeFilter(String name, long lowerbound, long upperbound)
        {
            com.heroiclabs.nakama.Api.MatchmakeFilter.RangeFilter.Builder f = com.heroiclabs.nakama.Api.MatchmakeFilter.RangeFilter.newBuilder()
                    .setLowerBound(lowerbound)
                    .setUpperBound(upperbound);

            add.addFilters(com.heroiclabs.nakama.Api.MatchmakeFilter.newBuilder().setName(name).setRange(f));
            return this;
        }

        public MatchmakeAddMessage.Builder addCheckFilter(String name, boolean value)
        {
            add.addFilters(com.heroiclabs.nakama.Api.MatchmakeFilter.newBuilder().setName(name).setCheck(value));
            return this;
        }

        public MatchmakeAddMessage.Builder addProperty(String key, boolean value)
        {
            com.heroiclabs.nakama.Api.PropertyPair.Builder p = com.heroiclabs.nakama.Api.PropertyPair.newBuilder()
                    .setKey(key)
                    .setBoolValue(value);

            add.addProperties(p);
            return this;
        }

        public MatchmakeAddMessage.Builder addProperty(String key, long value)
        {
            com.heroiclabs.nakama.Api.PropertyPair.Builder p = com.heroiclabs.nakama.Api.PropertyPair.newBuilder()
                    .setKey(key)
                    .setIntValue(value);

            add.addProperties(p);
            return this;
        }

        public MatchmakeAddMessage.Builder addProperty(String key, Set<String> values)
        {
            com.heroiclabs.nakama.Api.PropertyPair.Builder p = com.heroiclabs.nakama.Api.PropertyPair.newBuilder()
                    .setKey(key)
                    .setStringSet(com.heroiclabs.nakama.Api.PropertyPair.StringSet.newBuilder().addAllValues(values));

            add.addProperties(p);
            return this;
        }

        public MatchmakeAddMessage build() {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setMatchmakeAdd(add);
            return new DefaultMatchmakeAddMessage(payload);
        }

        public static MatchmakeAddMessage build(long requiredCount) {
            com.heroiclabs.nakama.Api.TMatchmakeAdd.Builder add = com.heroiclabs.nakama.Api.TMatchmakeAdd.newBuilder()
                    .setRequiredCount(requiredCount);

            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setMatchmakeAdd(add);
            return new DefaultMatchmakeAddMessage(payload);
        }

    }
}
