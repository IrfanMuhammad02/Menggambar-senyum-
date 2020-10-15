package com.example.menggambar;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.menggambar.R;

public class GraphicsDemoActivity extends Activity {
    ImageView ourView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        draw();
        setContentView(ourView);
    }

    public void draw() {
        Bitmap blankBitmap;
        blankBitmap = Bitmap.createBitmap(600, 600, Bitmap.Config.ARGB_8888);

        Canvas canvas;
        canvas = new Canvas(blankBitmap);
        ourView = new ImageView(this);
        ourView.setImageBitmap(blankBitmap);

        Paint paint;
        paint = new Paint();
        canvas.drawColor(Color.argb(255, 255, 255, 255));

        paint.setColor(Color.argb(255, 26, 128, 182));
        //Bitmap bitmapHati;
        // bitmapHati = BitmapFactory.decodeResource(this.getResources(), R.drawable.hati);

        paint.setColor(Color.argb(255, 26, 128, 182));
        Bitmap bitmapsenyum;
        bitmapsenyum = BitmapFactory.decodeResource(this.getResources(), R.drawable.senyum);

        //wajah
        paint.setColor(Color.argb(225, 225, 222, 0));
        canvas.drawCircle(300, 300, 250, paint);
        //canvas.drawBitmap(bitmapHati, 10, 50, paint);
        canvas.drawBitmap(bitmapsenyum, 170, 195, paint);
        canvas.drawPoint(40, 50, paint);
        //Bckground Mata kanan
        paint.setColor(Color.argb(225, 0, 0, 0));
        canvas.drawCircle(350, 200, 50, paint);
        //bckground mata kiri
        paint.setColor(Color.argb(225, 0, 0, 0));
        canvas.drawCircle(145, 200, 50, paint);
        //pupil mata kanan
        paint.setColor(Color.argb(225, 225, 225, 225));
        canvas.drawCircle(350, 200, 20, paint);
        //pupil mata kiri
        paint.setColor(Color.argb(225, 225, 225, 225));
        canvas.drawCircle(145, 200, 20, paint);

    }
}