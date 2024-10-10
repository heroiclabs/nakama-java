package com.heroiclabs.nakama;

import lombok.*;

import java.util.List;

/**
 * A party.
 */
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class Party {
    /**
     * Unique party identifier.
     */
    private String partyId;
    /**
     * Whether the party requires join requests to be approved by the party leader.
     */
    private boolean open;
    /**
     * Maximum number of party members.
     */
    private int maxSize;
    /**
     * Self.
     */
    private UserPresence self;
    /**
     * Leader.
     */
    private UserPresence leader;
    /**
     * All current party members.
     */
    private List<UserPresence> presences;
}
