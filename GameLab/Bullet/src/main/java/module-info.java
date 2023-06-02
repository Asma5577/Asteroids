import org.example.asteroids.BulletSPI;
import org.example.asteroids.services.IEntityProcessingService;
import org.example.asteroids.services.IGamePluginService;
module Bullet {
    requires Common;
    requires CommonBullet;
    provides IEntityProcessingService with org.example.asteroids.BulletControlSystem;
    provides BulletSPI with org.example.asteroids.BulletControlSystem;
    provides IGamePluginService with org.example.asteroids.BulletPlugin;
}