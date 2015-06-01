package ado.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;


public class CustomView2 extends View {

    // in pixels
    private static final int DESIRED_W = 100;
    private static final int DESIRED_H = 100;


    private static final String TAG = "CustomView2";

    public CustomView2(Context context) {
        super(context);
    }

    public CustomView2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onMeasure (int widthMeasureSpec, int heightMeasureSpec) {

        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);

        int width;
        int height;

        Log.d(TAG, String.format("1. size w %d, h %d", widthSize, heightSize));

        if(widthMode == MeasureSpec.EXACTLY) {
            Log.d(TAG, "w EXACTLY");
            width = widthSize;
        } else if(widthMode == MeasureSpec.AT_MOST) {
            Log.d(TAG, "w AT_MOST");
            width = Math.min(DESIRED_W, widthSize);
        } else {
            Log.d(TAG, "w UNSPECIFIED");
            width = DESIRED_W;
        }

        if(heightMode == MeasureSpec.EXACTLY) {
            Log.d(TAG, "h EXACTLY");
            height = heightSize;
        } else if(heightMode == MeasureSpec.AT_MOST) {
            Log.d(TAG, "h AT_MOST");
            height = Math.min(DESIRED_H, heightSize);
        } else {
            Log.d(TAG, "h UNSPECIFIED");
            height = DESIRED_H;
        }

        Log.d(TAG, String.format("2. w %d, h %d", getWidth(), getHeight()));
        Log.d(TAG, String.format("setting w %d, h %d", width, height));
        setMeasuredDimension(width, height);
        Log.d(TAG, String.format("3. now w %d, h %d", getWidth(), getHeight()));

    }

    @Override
    public void onSizeChanged (int w, int h, int oldw, int oldh) {
        //this is called after onMeasure() when w,h change
        Log.d(TAG, String.format("size-changed. now w %d, h %d, oldw %d, oldh %d", w, h, oldw, oldh));
    }

    @Override
    public void onLayout (boolean changed, int left, int top, int right, int bottom) {
        //this is called after onSizeChanged()
        Log.d(TAG, "called onlayout()");
        Log.d(TAG, String.format("onLayout() changed? %b, l, %d, t %d, r %d, b %d", changed, left, top, right, bottom));
    }
}
