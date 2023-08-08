package com.mygdx.game;

import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;

public abstract class screens extends InputAdapter implements Screen {
   public static final float  SCREEN_WIDTH = 480;
   public static final float  SCREEN_HEIGHT = 800;

   public static final float  WORLD_HEIGHT = 8f;
   public static final float  WORLD_WIDTH = 4.8f;

   public App game ;

   public OrthographicCamera oCamUI;
   public OrthographicCamera oCamBox20;

   public com.badlogic.gdx.graphics.g2d.SpriteBatch SpriteBatch;

   public Stage stage;

   public screens(App game){
      this.game = game;

      stage = new Stage(new StretchViewport(screens.SCREEN_WIDTH,SCREEN_HEIGHT));

      oCamUI = new OrthographicCamera(SCREEN_WIDTH, SCREEN_HEIGHT);
      oCamUI.position.set(SCREEN_WIDTH/2f,SCREEN_HEIGHT/2f,0);

      oCamBox20 = new OrthographicCamera(WORLD_WIDTH,WORLD_HEIGHT);
     oCamBox20.position.set(WORLD_WIDTH/2f,WORLD_HEIGHT/2f,0);




   }



   
      




    
}
