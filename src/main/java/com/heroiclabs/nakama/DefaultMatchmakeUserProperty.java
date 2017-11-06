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

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Data
@ToString(includeFieldNames = true)
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class DefaultMatchmakeUserProperty implements MatchmakeUserProperty {
    private final String userId;
    private final Map<String, Object> properties;
    private final Map<String, MatchmakeFilter> filters;

    static DefaultMatchmakeUserProperty fromProto(final @NonNull com.heroiclabs.nakama.Api.MatchmakeMatched.UserProperty p) {
        Map<String, Object> props = new HashMap<>();
        for (com.heroiclabs.nakama.Api.PropertyPair pp : p.getPropertiesList()) {
            switch (pp.getValueCase()) {
                case INTVALUE:
                    props.put(pp.getKey(), pp.getIntValue());
                    break;
                case BOOLVALUE:
                    props.put(pp.getKey(), pp.getBoolValue());
                    break;
                case STRINGSET:
                    props.put(pp.getKey(), pp.getStringSet().getValuesList());
                    break;
            }
        }

        Map<String, MatchmakeFilter> filters = new HashMap<>();
        for (com.heroiclabs.nakama.Api.MatchmakeFilter f : p.getFiltersList()) {
            switch (f.getValueCase()) {
                case TERM:
                    filters.put(f.getName(), DefaultMatchmakeTermFilter.fromProto(f.getTerm()));
                    break;
                case RANGE:
                    filters.put(f.getName(), DefaultMatchmakeRangeFilter.fromProto(f.getRange()));
                    break;
                case CHECK:
                    filters.put(f.getName(), new DefaultMatchmakeCheckFilter(f.getCheck()));
                    break;
            }
        }

        return new DefaultMatchmakeUserProperty(p.getUserId(), props, filters);
    }
}
