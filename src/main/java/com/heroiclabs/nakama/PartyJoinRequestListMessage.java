package com.heroiclabs.nakama;

import lombok.*;

/**
 * A request of a list of pending join requests for a party.
 */
@Data
public class PartyJoinRequestListMessage {
    /**
     * Party ID to get a list of join requests for.
     */
    private String partyId;
}
