package com.heroiclabs.nakama;

import lombok.*;

import java.util.List;
import java.util.Map;

/**
 * A message to begin matchmaking as a party.
 */
@Data
public class PartyMatchmakerAddMessage {
    /**
     * Party ID.
     */
    private String partyId;
    /**
     * Minimum total user count to match together.
     */
    private int minCount;
    /**
     * Maximum total user count to match together.
     */
    private int maxCount;
    /**
     * Filter query used to identify suitable users.
     */
    private String query;
    /**
     * String properties.
     */
    private Map<String, String> stringProperties;
    /**
     * Numeric properties.
     */
    private Map<String, Double> numericProperties;
    /**
     * Optional multiple of the count that must be satisfied.
     */
    private int countMultiple;
}
