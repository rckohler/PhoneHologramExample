package com.dni.rck.sacmakers;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;

import java.util.Vector;

/**
 * Created by rck on 10/2/2015.
 */

public class ImagePane {
    Vector<Bitmap> bitmaps;
    RectF bounds = new RectF();

    public static Bitmap rotateBitmap(Bitmap source, float angle)
    {
        Matrix matrix = new Matrix();
        matrix.postRotate(angle);
        return Bitmap.createBitmap(source, 0, 0, source.getWidth(), source.getHeight(), matrix, true);
    }
    public ImagePane(Vector<Bitmap> bitmaps,float width, float height, float xPos, float yPos){
        bounds.set(xPos,yPos,xPos+width, yPos+height);
        this.bitmaps = bitmaps;
    }
    public void drawFrame(Canvas canvas, int i, float rotation){
        Bitmap currentBitmap = rotateBitmap(bitmaps.elementAt(i),rotation);
       // Bitmap currentBitmap = bitmaps.elementAt(i);
        canvas.drawBitmap(currentBitmap,null,bounds,null);
    }
}
