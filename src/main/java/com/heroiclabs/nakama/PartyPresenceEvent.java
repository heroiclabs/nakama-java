package com.heroiclabs.nakama;

import lombok.*;

import java.util.List;

/**
 * A presence update for a particular party.
 */
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class PartyPresenceEvent {
    /**
     * The party ID.
     */
    private String partyId;
    /**
     * User presences that have just joined the party.
     */
    private List<UserPresence> joins;
    /**
     * User presences that have just left the party.
     */
    private List<UserPresence> leaves;
}
