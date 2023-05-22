package org.example.asteroids;

import org.example.asteroids.data.GameData;
import org.example.asteroids.data.Entity;

public interface BulletSPI {
    Entity createBullet(Entity e, GameData gameData);
}
