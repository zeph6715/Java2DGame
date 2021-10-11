/*
a class for enemy movements
 */



/*
package com.mygdx.game.ObjectsMethods;

import com.badlogic.gdx.Gdx;

import java.util.Timer;
import java.util.TimerTask;

public class enemyMovement {
    public boolean verticalEdge() {
        if ((getY() >= 960) || (getY() <= 0)) {
            return true;
        }
        return false;
    }

    public boolean widthEdge() {
        if ((getX() >= 640) || (getX() <= 0)) {
            return true;
        }
        return false;
    }

    public void movement() {
        t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            float delta = Gdx.graphics.getDeltaTime();
            long speed = 1;

            public void run() {
                if (getX() < width) {
                    x = getX();
                    x += 0.05 * delta;
                } else if (getX() >= width) {
                    x = getX();
                    x -= 0.05 * delta;
                }
                if (getY() < height) {
                    y = getY();
                    y += 0.05 * delta;
                } else if (getY() >= height) {
                    y = getY();
                    y -= 0.05 * delta;
                }
            }


        }, delay, speed);
    }
}
*/