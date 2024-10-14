package com.heroiclabs.nakama;

import com.google.common.io.BaseEncoding;
import lombok.*;

import java.util.List;

/**
 * A message to send data to a party.
 */
@Data
public class PartyDataSendMessage {
    /**
     * The party ID to send data to.
     */
    private final String partyId;
    /**
     * Op code value.
     */
    private final int opCode;
    /**
     * Data payload, if any
     */
    private final byte[] data;
}
