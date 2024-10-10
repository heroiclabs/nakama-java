package com.heroiclabs.nakama;

import lombok.*;

/**
 * A message for the announcement of a new party leader.
 */
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class PartyLeader {
    /**
     * Party ID to announce the new leader for.
     */
    private String partyId;
    /**
     * The presence of the new party leader.
     */
    private UserPresence presence;
}
