package com.heroiclabs.nakama;

import lombok.*;

/**
 * A message to join a party, or request to join if the party is not open.
 */
@Data
public class PartyJoinMessage {
    /**
     * Party ID to join.
     */
    private String partyId;
}
