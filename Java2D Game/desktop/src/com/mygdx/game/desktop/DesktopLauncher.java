package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.Launcher;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.foregroundFPS = 60;
		config.backgroundFPS = 60;
		config.samples = 9; // For anti aliasing Shape Rendered circles
		config.width = 960;
		config.height = 640;
		config.title = "Warwick.IO";

		new LwjglApplication(new Launcher(), config);
	}
}
