package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.mygdx.game.ObjectsMethods.Evolution;
import com.mygdx.game.objects.*;
import java.util.Random;




public class GameScreen extends ScreenAdapter {
    private OrthographicCamera camera;
    private SpriteBatch batch;
    private World world;
    private Box2DDebugRenderer box2DDebugRenderer;
    Random rand = new Random();

    // Random values for enemies to make spawning more convenient. For now the radius is set to always be less than the players
    private float randX = 50 + rand.nextFloat() * (640 - 50);
    private float randY = 50 + rand.nextFloat() * (980 - 50);
    private float randRad = 10 + rand.nextFloat() * (30 - 10);

    // Our game objects and methods
    private Player player;
    private Enemies enemies;
    private Evolution evolution;




    // This is where our main game objects are initialized
    public GameScreen(OrthographicCamera camera) {
        this.camera = camera;
        int height = Launcher.INSTANCE.getScreenHeight();
        int width = Launcher.INSTANCE.getScreenWidth();
        this.camera.position.set(new Vector3(width / 2, height / 2, 0));
        this.batch = new SpriteBatch();
        this.world = new World(new Vector2(0, 0), false);
        this.box2DDebugRenderer = new Box2DDebugRenderer();
        this.player = new Player(200, 100, 30, this);
        this.enemies = new Enemies(randX, randY, randRad);

    }

    // Updates all game objects before they're rendered.
    public void update() {
        world.step(1 / 60f, 6, 2);
        batch.setProjectionMatrix(camera.combined);
        player.update();
        this.evolution = new Evolution(player, enemies, this);
    }

    // Main render method
    @Override
    public void render(float delta) {
        update();

        Gdx.gl.glClearColor(255,255,255,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        player.render();
        enemies.render();
        batch.end();
    }

    public World getWorld() {
        return world;
    }
}
