import org.example.asteroids.services.IEntityProcessingService;
import org.example.asteroids.services.IGamePluginService;

module Asteroid {
    requires Common;
    requires CommonAsteroids;
    provides IGamePluginService with org.example.asteroids.asteroid.AsteroidPlugin;
    provides IEntityProcessingService with org.example.asteroids.asteroid.AsteroidProcessor;

}