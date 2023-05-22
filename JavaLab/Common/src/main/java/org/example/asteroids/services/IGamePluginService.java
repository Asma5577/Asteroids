package org.example.asteroids.services;

import org.example.asteroids.data.GameData;
import org.example.asteroids.data.World;

public interface IGamePluginService {
    void start(GameData gameData, World world);

    void stop(GameData gameData, World world);
}
