package com.heroiclabs.nakama;

import lombok.*;

/**
 * A message to kick a party member, or decline a request to join.
 */
@Data
public class PartyRemoveMessage {
    /**
     * Party ID to remove/reject from.
     */
    private String partyId;
    /**
     * The presence to remove or reject.
     */
    private UserPresence presence;
}
