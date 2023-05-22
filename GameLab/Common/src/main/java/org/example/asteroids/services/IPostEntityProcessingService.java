package org.example.asteroids.services;
import org.example.asteroids.data.GameData;
import org.example.asteroids.data.World;

public interface IPostEntityProcessingService {
    void process(GameData gameData, World world);
}
