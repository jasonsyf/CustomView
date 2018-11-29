package com.syf.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {
    private Paint mPaint;

    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    @Override
    public void setOnCreateContextMenuListener(OnCreateContextMenuListener l) {
        super.setOnCreateContextMenuListener(l);
    }

    public void initPaint() {
        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);  //設置畫筆顔色
        mPaint.setStyle(Paint.Style.FILL);  //設置填充模式
        mPaint.setStrokeWidth(10f);//設置畫筆寬度
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);

        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
//        如果对View的宽高进行修改了，不要调用super.onMeasure(widthMeasureSpec,heightMeasureSpec);
//        要调用setMeasuredDimension(widthsize,heightsize); 这个函数。
//        setMeasuredDimension(widthSize, heightSize);
        //測量模式有三種
//        UNSPECIFIED	00	默认值，父控件没有给子view任何限制，子View可以设置为任意大小。
//        EXACTLY	    01	表示父控件已经确切的指定了子View的大小。
//        AT_MOST	    10	表示子View具体大小没有尺寸限制，但是存在上限，上限一般为父View大小。
    }

    // 確定View 的大小 （这个函数在视图大小发生改变时调用）
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
//        left	    View左侧距父View左侧的距离	getLeft();
//        top	    View顶部距父View顶部的距离	getTop();
//        right	    View右侧距父View左侧的距离	getRight();
//        bottom    View底部距父View顶部的距离  getBottom();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        canvas.drawColor(Color.BLUE);
        canvas.drawPoint(100, 100, mPaint);
        canvas.drawLines(new float[]{100, 200, 300, 400,
                        200, 250, 300, 300}
                , mPaint);
//        canvas.drawRect(200,200,600,600,mPaint);
        mPaint.setColor(Color.GREEN);
        canvas.drawCircle(200,200,150,mPaint);
    }
}
