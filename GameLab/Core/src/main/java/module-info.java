module Core {
    requires Common;
    requires CommonEnemy;
    requires CommonBullet;
    requires CommonAsteroids;
    requires java.desktop;
    requires com.badlogic.gdx;
    uses org.example.asteroids.services.IGamePluginService;
    uses org.example.asteroids.services.IEntityProcessingService;
    uses org.example.asteroids.services.IPostEntityProcessingService;
}
