package com.samsung.itschool.mydraw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;

public class MyDraw extends View {

	public MyDraw(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	Paint paint = new Paint();
	Bitmap droid = BitmapFactory.decodeResource(getResources(), R.drawable.droid);
	@Override
	protected void onDraw(Canvas canvas) {
		//зеленый цвет
		paint.setColor(Color.GREEN);
		//толщина 10 пикселей
		paint.setStrokeWidth(10);
		//только контур
		paint.setStyle(Style.STROKE);
		int r = 200;
		int alpha = 255;
		while ( r < 400)
		{
			r += 40;
			paint.setAlpha(alpha);
			canvas.drawCircle(canvas.getWidth()/2, canvas.getHeight()/2, r, paint);
			alpha -= 50;
		}
		paint.setAlpha(255);
		canvas.drawBitmap(droid, canvas.getWidth()/2 - droid.getWidth()/2, canvas.getHeight()/2 - droid.getHeight()/2, paint);
	}

}
