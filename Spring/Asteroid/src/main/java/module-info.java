import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import org.example.asteroid.AsteroidPlugin;
import org.example.asteroid.AsteroidProcessor;

module Asteroid {
    requires Common;
    requires CommonAsteroids;
    provides IGamePluginService with AsteroidPlugin;
    provides IEntityProcessingService with AsteroidProcessor;

}