package org.example.asteroids.data.entityparts;

import org.example.asteroids.data.Entity;
import org.example.asteroids.data.GameData;

public interface IEntityPart {
    void process(GameData gameData, Entity entity);
}
