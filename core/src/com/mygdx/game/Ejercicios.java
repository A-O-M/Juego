package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;

public class Ejercicios {

    public static BitmapFont font;
    public static TextButtonStyle txButtonStyle;
    public static ScrollPaneStyle scrollPaneStyle;



  public static void load(){
    font = new BitmapFont(null, null, false, false);

    TextureAtlas atlas = new TextureAtlas(Gdx.files.internal("data/ui.txt"));




  }


}
