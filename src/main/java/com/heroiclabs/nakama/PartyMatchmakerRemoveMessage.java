package com.heroiclabs.nakama;

import lombok.*;

/**
 * A message to cancel a party matchmaking process using a ticket.
 */
@Data
public class PartyMatchmakerRemoveMessage {
    /**
     * Party ID.
     */
    private String partyId;
    /**
     * The ticket to cancel.
     */
    private String ticket;
}
