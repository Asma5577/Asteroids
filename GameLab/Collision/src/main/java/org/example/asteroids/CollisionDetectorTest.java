package org.example.asteroids;
import org.example.asteroids.data.Entity;
import org.example.asteroids.data.entityparts.PositionPart;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class CollisionDetectorTest {
    private Entity player;
    private Entity enemy;
    private CollisionDetector collisionDetector;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.player = new Entity();
        this.enemy = new Entity();
        player.setRadius(2);
        enemy.setRadius(2);
        collisionDetector = new CollisionDetector();

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    @DisplayName("They collide")
    void collide() {
        player.add(new PositionPart(5,5,5));
        enemy.add(new PositionPart(5,5,5));
        assertTrue(collisionDetector.collides(player,enemy));
        System.out.println("They collide");

    }
    @org.junit.jupiter.api.Test
    @DisplayName("They do not collide")
    void NotCollide() {
        player.add(new PositionPart(5,5,5));
        enemy.add(new PositionPart(12,12,5));
        assertFalse(collisionDetector.collides(player,enemy));
        System.out.println("They do not collide");
    }
}
