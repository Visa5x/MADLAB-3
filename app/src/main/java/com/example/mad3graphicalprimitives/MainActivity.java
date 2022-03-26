package com.example.mad3graphicalprimitives;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        Scanvas sc=new Scanvas(this);
        setContentView(sc);
    }
    private class Scanvas extends View {

        public Scanvas(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            //super.onDraw(canvas);
            Paint paint=new Paint();
            paint.setColor(Color.YELLOW);
            canvas.drawPaint(paint);
            paint.setColor(Color.BLUE);
            paint.setTextSize(70);
            canvas.drawText("Circle", 120, 150, paint);
            canvas.drawCircle(200, 350, 150, paint);
            paint.setColor(Color.RED);
            canvas.drawText("Square", 120, 800, paint);
            canvas.drawRect(50, 850, 350, 1150, paint);
            paint.setColor(Color.BLACK);
            canvas.drawText("Rectangle", 420, 150, paint);
            canvas.drawRect(400, 200, 650, 700, paint);
            paint.setColor(Color.BLACK);
            paint.setTextSize(200);
            canvas.drawText("REC", 680, 900, paint);



        }
    }
} 