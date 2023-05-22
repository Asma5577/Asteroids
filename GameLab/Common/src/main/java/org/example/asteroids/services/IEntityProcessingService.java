package org.example.asteroids.services;
import org.example.asteroids.data.GameData;
import org.example.asteroids.data.World;

public interface IEntityProcessingService {
    void process(GameData gameData, World world);
}
