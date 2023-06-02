
import dk.sdu.mmmi.cbse.common.services.IPostEntityProcessingService;
import org.example.collisionsystem.CollisionDetector;

module Collision {
    requires Common;
    provides IPostEntityProcessingService with CollisionDetector;
}