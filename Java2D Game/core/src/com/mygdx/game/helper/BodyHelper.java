package com.mygdx.game.helper;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.physics.box2d.*;
import com.badlogic.gdx.physics.box2d.Contact;





public class BodyHelper {

    public static Body createBody(float x, float y, float radius, boolean isStatic,
                                  float density, World world, Contact type) {

        BodyDef bodyDef = new BodyDef();
        bodyDef.type = !isStatic ? BodyDef.BodyType.DynamicBody : BodyDef.BodyType.StaticBody;
        bodyDef.position.set(x / Constants.PPM, y / Constants.PPM);
        Body body = world.createBody(bodyDef);

        CircleShape shape = new CircleShape();


        FixtureDef fixtureDef = new FixtureDef();
        fixtureDef.shape = shape;
        fixtureDef.density = density;
        body.createFixture(fixtureDef).setUserData(type);

        shape.dispose();
        return body;
    }
}
