import org.example.asteroids.services.IEntityProcessingService;
import org.example.asteroids.services.IGamePluginService;
module Enemy {
    requires Common;
    requires CommonBullet;
    uses org.example.asteroids.BulletSPI;
    provides IEntityProcessingService with org.example.asteroids.EnemyControlSystem;
    provides IGamePluginService with org.example.asteroids.EnemyPlugin;
}