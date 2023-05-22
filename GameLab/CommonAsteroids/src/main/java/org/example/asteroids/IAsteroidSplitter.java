package org.example.asteroids;

import org.example.asteroids.data.Entity;
import org.example.asteroids.data.World;

public interface IAsteroidSplitter {
    void createSplitAsteroid(Entity e, World w);
}
