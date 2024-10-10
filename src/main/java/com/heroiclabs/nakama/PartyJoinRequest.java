package com.heroiclabs.nakama;

import lombok.*;

import java.util.List;

/**
 * Notification for one or more new presences attempting to join the party.
 */
@Data
public class PartyJoinRequest {
    /**
     * Party ID these presences are attempting to join.
     */
    private String partyId;
    /**
     * Presences attempting to join.
     */
    private List<UserPresence> presence;
}
