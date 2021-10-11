package com.mygdx.game.objects;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
/*
This will be changed to a linked list which will store all of our enemy objects.
Example: private LinkedList<Enemies> enemy;      enemy = new LinkedList<Enemies>
To create a new enemy object in a linked list enemy.add(enemy);
 */

// Base enemies class
public class Enemies {
    private float x;
    private float y;
    private float radius;
    private ShapeRenderer shape;

    // Constructor
    public Enemies(float x, float y, float radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Creates new enemy circle
    public void render() {
        ShapeRenderer shape = new ShapeRenderer();
        shape.begin(ShapeRenderer.ShapeType.Filled);
        shape.setColor(1, 0, 0, 1);
        shape.circle(getX(), getY(), getRadius());
        shape.end();
    }

    public void update() {
        x = this.getX();
        y = this.getY();
        radius = this.getRadius();
    }

    // Getters and setters for enemies
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

    // Disposes enemy
    public void dispose() {
        shape.dispose();
    }
}
