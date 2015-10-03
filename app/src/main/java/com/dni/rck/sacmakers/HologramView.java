package com.dni.rck.sacmakers;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

import java.util.Vector;

/**
 * Created by rck on 10/2/2015.
 */
public class HologramView extends View {
    ImagePane leftPane, rightPane, topPane, bottomPane;
    Vector<Bitmap> leftBitmaps = new Vector<>();
    Vector<Bitmap> rightBitmaps = new Vector<>();
    Vector<Bitmap> topBitmaps = new Vector<>();
    Vector<Bitmap> bottomBitmaps = new Vector<>();
    SacMakersMain main;

    public HologramView(Context context) {
        super(context);
        main = (SacMakersMain)context;
        loadImages();
        leftPane = new ImagePane(leftBitmaps,main.screenWidth*.3f,main.screenWidth*.3f,main.screenWidth*.4f,main.screenHeight*.4f);
        rightPane = new ImagePane(rightBitmaps,main.screenWidth*3f,main.screenWidth*.3f,main.screenWidth*.6f,main.screenHeight*.4f);
        topPane = new ImagePane(topBitmaps,main.screenWidth*.2f,main.screenWidth*.3f,main.screenWidth*.6f,main.screenHeight*.3f);
        leftPane = new ImagePane(bottomBitmaps,main.screenWidth*.3f,main.screenWidth*.3f,main.screenWidth*.4f,main.screenHeight*.7f);

    }

    private void loadImages(){
        leftBitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.one));
        rightBitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.one));
        topBitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.one));
        bottomBitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.one));
        leftBitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.two));
        rightBitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.two));
        topBitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.two));
        bottomBitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.two));
        leftBitmaps.add(BitmapFactory.decodeResource(getResources(), R.drawable.three));
        rightBitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.three));
        topBitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.three));
        bottomBitmaps.add(BitmapFactory.decodeResource(getResources(),R.drawable.three));
    }
    protected  void onDraw(Canvas canvas){
        leftPane.drawFrame(canvas,0,90);

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        invalidate();

    }
}
