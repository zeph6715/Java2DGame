package com.mygdx.game.ObjectsMethods;

import com.mygdx.game.GameScreen;
import com.mygdx.game.objects.Enemies;
import com.mygdx.game.objects.Player;
/*
This class handles collision and player evolution
 */
public class Evolution {
    GameScreen screen;
    private Player player;
    private Enemies enemies;

    // Constructor for evolution
    public Evolution(Player player, Enemies enemies, GameScreen screen ) {
        this.player = player;
        this.enemies = enemies;
        this.screen = screen;

        // Player evolution method
        if (isCirclesColliding(player,enemies)) {
            if ((player.getRadius() > enemies.getRadius()) && (player.getRadius() < 65)) {
                player.setRadius(player.getRadius() + 0.4f);
                enemies.setRadius(enemies.getRadius() - 2f);
            }
        }
    }

    // Boolean for collision detection
    public boolean isCirclesColliding(Player player, Enemies enemies) {
        float sidea = Math.abs(player.getX() - enemies.getX());
        float sideb = Math.abs(player.getY() - enemies.getY());
        sidea = sidea * sidea;
        sideb = sideb * sideb;
        float distance = (float) Math.sqrt(sidea + sideb);
        if (distance < player.getRadius() + enemies.getRadius()) {
            return true;
        }
        return false;
    }
}
