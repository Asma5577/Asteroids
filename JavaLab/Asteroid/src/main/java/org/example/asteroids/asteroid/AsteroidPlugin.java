package org.example.asteroids.asteroid;

import org.example.asteroids.Asteroid;
import org.example.asteroids.data.Entity;
import org.example.asteroids.data.GameData;
import org.example.asteroids.data.entityparts.MovingPart;
import org.example.asteroids.services.IGamePluginService;
import org.example.asteroids.data.World;
import org.example.asteroids.data.entityparts.LifePart;
import org.example.asteroids.data.entityparts.PositionPart;

public class AsteroidPlugin implements IGamePluginService {

    @Override
    public void start(GameData gameData, World world) {
        // Add entities to the world
        Entity asteroid = createAsteroid(gameData);
        world.addEntity(asteroid);
    }

    @Override
    public void stop(GameData gameData, World world) {
        // Remove entities
        for (Entity asteroid : world.getEntities(Asteroid.class)) {
            world.removeEntity(asteroid);
        }
    }

    private Entity createAsteroid(GameData gameData) {
        Entity asteroid = new Asteroid();
        float radians = (float) Math.random() * 2 * 3.1415f;
        float speed = (float) Math.random() * 10f + 20f;

        asteroid.setRadius(20);
        asteroid.add(new MovingPart(0, speed, speed, 0));
        asteroid.add(new PositionPart(30, 30, radians));
        asteroid.add(new LifePart(1));

        return asteroid;
    }
}
