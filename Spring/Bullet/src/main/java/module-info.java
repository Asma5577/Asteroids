import dk.sdu.mmmi.cbse.common.bullet.BulletSPI;
import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import org.example.bulletsystem.BulletControlSystem;
import org.example.bulletsystem.BulletPlugin;

module Bullet {
    requires Common;
    requires CommonBullet;
    provides IEntityProcessingService with BulletControlSystem;
    provides BulletSPI with BulletControlSystem;
    provides IGamePluginService with BulletPlugin;
}