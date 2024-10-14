package com.heroiclabs.nakama;

import lombok.*;

/**
 * A create message for a party.
 */
@Data
public class PartyCreateMessage {
    /**
     * Whether the party will require join requests to be approved by the party leader.
     */
    private boolean open;
    /**
     * Maximum number of party members.
     */
    private int maxSize;
}
