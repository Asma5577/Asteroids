import org.example.asteroids.services.IPostEntityProcessingService;

module Collision {
    requires Common;
    provides IPostEntityProcessingService with org.example.asteroids.CollisionDetector;
}