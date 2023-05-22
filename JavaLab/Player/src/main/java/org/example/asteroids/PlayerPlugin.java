package org.example.asteroids;

import org.example.asteroids.data.Entity;
import org.example.asteroids.data.GameData;
import org.example.asteroids.data.World;
import org.example.asteroids.data.entityparts.LifePart;
import org.example.asteroids.data.entityparts.MovingPart;
import org.example.asteroids.data.entityparts.PositionPart;
import org.example.asteroids.services.IGamePluginService;
public class PlayerPlugin implements IGamePluginService {
    private Entity player;


    public PlayerPlugin() {
    }

    @Override
    public void start(GameData gameData, World world) {

        // Add entities to the world
        player = createPlayerShip(gameData);
        world.addEntity(player);
    }

    private Entity createPlayerShip(GameData gameData) {

        float deacceleration = 10;
        float acceleration = 200;
        float maxSpeed = 300;
        float rotationSpeed = 5;
        float x = gameData.getDisplayWidth() / 2;
        float y = gameData.getDisplayHeight() / 2;
        float radians = 3.1415f / 2;

        Entity playerShip = new Player();
        playerShip.setRadius(8);
        playerShip.add(new MovingPart(deacceleration, acceleration, maxSpeed, rotationSpeed));
        playerShip.add(new PositionPart(x, y, radians));
        playerShip.add(new LifePart(1));

        return playerShip;
    }

    @Override
    public void stop(GameData gameData, World world) {
        // Remove entities
        world.removeEntity(player);
    }
}
