package ado.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;


public class CustomVIew1 extends View {

    public CustomVIew1(Context context) {
        super(context);
    }

    public CustomVIew1(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomVIew1(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onMeasure (int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

}
