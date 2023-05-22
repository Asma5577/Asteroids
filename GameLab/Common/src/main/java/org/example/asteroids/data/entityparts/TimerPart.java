package org.example.asteroids.data.entityparts;
import org.example.asteroids.data.Entity;
import org.example.asteroids.data.GameData;
public class TimerPart implements IEntityPart{
    private float expiration;

    public TimerPart(float expiration) {
        this.expiration = expiration;
    }

    public float getExpiration() {
        return expiration;
    }

    public void setExpiration(float expiration) {
        this.expiration = expiration;
    }

    public void reduceExpiration(float delta) {
        this.expiration -= delta;
    }

    @Override
    public void process(GameData gameData, Entity entity) {
        if (expiration > 0) {
            reduceExpiration(gameData.getDelta());
        }

        if (expiration <= 0) {
            LifePart lifePart = entity.getPart(LifePart.class);
            lifePart.setLife(0);

        }
    }

}
