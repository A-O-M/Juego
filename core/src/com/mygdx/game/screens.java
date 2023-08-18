package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
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


     InputMultiplexer input = new InputMultiplexer(this,stage);
     Gdx.input.setInputProcessor(input);

     SpriteBatch = new com.badlogic.gdx.graphics.g2d.SpriteBatch();




   }
   @Override
   public void render (float delta) {

      update(delta);
      stage.act(delta);

      Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

      draw(delta);

      stage.draw();


   }

   public abstract void draw(float delte); 

   public abstract void update (float delte);

   @Override
   public void resize(int width,int height){
      stage.getViewport().update(width, height, true);

   }

   @Override
   public boolean keyDown(int keycode){
      if(keycode == Input.Keys.ESCAPE || keycode == Input.Keys.BACK ){
         //Si estoy estoy en el menu principal salgo de la app
         //Si estoy dentro de un tutorial regreso al menu principal
         // TODO: Implement loter

      }
      return super.keyDown(keycode);
   }



    
}
