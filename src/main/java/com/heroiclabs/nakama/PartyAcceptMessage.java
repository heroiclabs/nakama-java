package com.heroiclabs.nakama;

import lombok.*;

/**
 * A message to accept a request to join.
 */
@Data
public class PartyAcceptMessage {
    /**
     * Party ID to accept a join request for.
     */
    private String partyId;
    /**
     * The presence to accept as a party member.
     */
    private UserPresence presence;
}
