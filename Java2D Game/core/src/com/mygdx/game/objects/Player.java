package com.mygdx.game.objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.GameScreen;

public class Player {
    private ShapeRenderer shape;
    private  float x, y, radius; // player x position, y position, and radius
    GameScreen screen;


    // Constructor for our player object
    public Player(float x, float y, float radius, GameScreen screen) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.screen = screen;
    }

    // Updates player position from user input
    public void update() {
        x = this.getX();
        y = this.getY();
        radius = this.getRadius();

        if(Gdx.input.isKeyPressed(Input.Keys.UP))
            y = y + 2;
        if(Gdx.input.isKeyPressed(Input.Keys.DOWN))
            y = y - 2;
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT))
            x = x - 2;
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT))
            x = x + 2;

    }

    // Creates new player circle
    public void render() {
        ShapeRenderer shape = new ShapeRenderer();
        shape.begin(ShapeRenderer.ShapeType.Filled);
        shape.setColor(0, 0, 1, 1);
        shape.circle(this.getX(),this.getY(), this.getRadius());
        shape.end();
    }

    // Getters and Setters for player
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void dispose() {
        shape.dispose();
    }

}
