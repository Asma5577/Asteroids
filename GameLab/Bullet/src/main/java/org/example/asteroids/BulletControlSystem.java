package org.example.asteroids;
import org.example.asteroids.Bullet;
import org.example.asteroids.BulletSPI;
import org.example.asteroids.data.Entity;
import org.example.asteroids.data.GameData;
import org.example.asteroids.data.World;
import org.example.asteroids.data.entityparts.LifePart;
import org.example.asteroids.data.entityparts.MovingPart;
import org.example.asteroids.data.entityparts.PositionPart;
import org.example.asteroids.data.entityparts.TimerPart;
import org.example.asteroids.services.IEntityProcessingService;
import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class BulletControlSystem implements IEntityProcessingService, BulletSPI {

    @Override
    public void process(GameData gameData, World world) {

        for (Entity bullet : world.getEntities(Bullet.class)) {

            PositionPart positionPart = bullet.getPart(PositionPart.class);
            MovingPart movingPart = bullet.getPart(MovingPart.class);
            TimerPart timerPart = bullet.getPart(TimerPart.class);
            movingPart.setUp(true);
            if (timerPart.getExpiration() < 0) {
                world.removeEntity(bullet);
            }
            timerPart.process(gameData, bullet);
            movingPart.process(gameData, bullet);
            positionPart.process(gameData, bullet);

            setShape(bullet);
        }
    }

    @Override
    public Entity createBullet(Entity shooter, GameData gameData) {
        PositionPart shooterPos = shooter.getPart(PositionPart.class);

        float x = shooterPos.getX();
        float y = shooterPos.getY();
        float radians = shooterPos.getRadians();
        float dt = gameData.getDelta();
        float speed = 350;

        Entity bullet = new Bullet();
        bullet.setRadius(2);

        float bx = (float) cos(radians) * shooter.getRadius() * bullet.getRadius();
        float by = (float) sin(radians) * shooter.getRadius() * bullet.getRadius();

        bullet.add(new PositionPart(bx + x, by + y, radians));
        bullet.add(new LifePart(1));
        bullet.add(new MovingPart(0, 5000000, speed, 5));
        bullet.add(new TimerPart(1));

        bullet.setShapeX(new float[2]);
        bullet.setShapeY(new float[2]);

        return bullet;
    }

    private void setShape(Entity entity) {
        float[] shapex = entity.getShapeX();
        float[] shapey = entity.getShapeY();
        PositionPart positionPart = entity.getPart(PositionPart.class);
        float x = positionPart.getX();
        float y = positionPart.getY();
        float radians = positionPart.getRadians();

        shapex[0] = x;
        shapey[0] = y;

        shapex[1] = (float) (x + Math.cos(radians - 4 * 3.1415f / 5));
        shapey[1] = (float) (y + Math.sin(radians - 4 * 3.1145f / 5));

        entity.setShapeX(shapex);
        entity.setShapeY(shapey);
    }

}
