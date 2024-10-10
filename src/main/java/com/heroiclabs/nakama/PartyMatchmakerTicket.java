package com.heroiclabs.nakama;

import lombok.*;

/**
 * A response from starting a new party matchmaking process.
 */
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class PartyMatchmakerTicket {
    /**
     * Party ID.
     */
    private String partyId;
    /**
     * The ticket that can be used to cancel matchmaking.
     */
    private String ticket;
}
