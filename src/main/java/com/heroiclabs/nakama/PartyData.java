package com.heroiclabs.nakama;

import com.google.common.io.BaseEncoding;
import lombok.*;

import java.util.List;

/**
 * Incoming party data delivered from the server.
 */
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class PartyData {
    /**
     * The party ID.
     */
    private String partyId;
    /**
     * A reference to the user presence that sent this data, if any.
     */
    private UserPresence presence;
    /**
     * Op code value.
     */
    private int opCode;
    /**
     * The base-64 contents of the state change.
     */
    private String data;
    /**
     * Returns party data
     * @return party data
     */
    public byte[] getData() {
        if (this.data == null) {
            return null;
        }
        return BaseEncoding.base64().decode(this.data);
    }
}
