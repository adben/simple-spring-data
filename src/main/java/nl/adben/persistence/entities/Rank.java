package nl.adben.persistence.entities;

import javax.persistence.Enumerated;

@Enumerated(EnumType.STRING)
public enum Rank {
    ENSIGN, LIEUTENANT, COMMANDER, CAPTAIN, COMMODORE, ADMIRAL
}
