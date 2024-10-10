package com.heroiclabs.nakama;

import lombok.*;

/**
 * A promote message for a party.
 */
@Data
public class PartyPromoteMessage {
    /**
     * Party ID to promote a new leader for.
     */
    private String partyId;
    /**
     * The presence of an existing party member to promote as the new leader.
     */
    private UserPresence presence;
}
