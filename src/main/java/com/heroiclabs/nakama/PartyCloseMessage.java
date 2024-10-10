package com.heroiclabs.nakama;

import lombok.*;

/**
 * A message to end a party, kicking all party members and closing it.
 */
@Data
public class PartyCloseMessage {
    /**
     * Party ID to close.
     */
    private String partyId;
}
