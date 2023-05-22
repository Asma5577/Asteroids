package org.example.asteroids;

import org.example.asteroids.data.Entity;
import org.example.asteroids.data.GameData;
import org.example.asteroids.Bullet;
import org.example.asteroids.data.World;
import org.example.asteroids.services.IGamePluginService;

public class BulletPlugin implements IGamePluginService {
    private Entity bullet;

    @Override
    public void start(GameData gameData, World world) {

    }

    @Override
    public void stop(GameData gameData, World world) {
        for (Entity e : world.getEntities()) {
            if (e.getClass() == Bullet.class) {
                world.removeEntity(e);
            }
        }
    }
}
