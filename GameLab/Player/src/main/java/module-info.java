import org.example.asteroids.services.IEntityProcessingService;
import org.example.asteroids.services.IGamePluginService;
import org.example.asteroids.PlayerControlSystem;
import org.example.asteroids.PlayerPlugin;
import org.example.asteroids.BulletSPI;

module Player {
    requires Common;
    requires CommonBullet;
    uses BulletSPI;
    provides IEntityProcessingService with PlayerControlSystem;
    provides IGamePluginService with PlayerPlugin;
}