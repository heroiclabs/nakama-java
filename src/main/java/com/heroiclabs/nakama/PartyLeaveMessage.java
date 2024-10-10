package com.heroiclabs.nakama;

import lombok.*;

/**
 * A message to leave a party.
 */
@Data
public class PartyLeaveMessage {
    /**
     * Party ID to leave.
     */
    private String partyId;
}
