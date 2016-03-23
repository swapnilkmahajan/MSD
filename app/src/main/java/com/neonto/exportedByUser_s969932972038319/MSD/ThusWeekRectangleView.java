package com.neonto.exportedByUser_s969932972038319.MSD;

import android.content.*;
import android.content.res.TypedArray;
import android.graphics.*;
import android.text.*;
import android.util.*;
import android.view.*;

public class ThusWeekRectangleView extends View {



    public ThusWeekRectangleView(Context context) {
        super(context);
        init(null, 0);
    }
    
    public ThusWeekRectangleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }
    
    public ThusWeekRectangleView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }
    
    private void init(AttributeSet attrs, int defStyle) {
        // This method is just a stub that you can extend.
        // If you make this class styleable, you can load XML-declared
        // style attributes using getContext().obtainStyledAttributes().
        
        setLayerType(LAYER_TYPE_HARDWARE, null);
    }


    private int m_realLayoutWidthInPx;
    private int m_realLayoutHeightInPx;

    public void applyLayoutAndContentTransform(int w, int h, String contentTransform, float sc) {
        m_realLayoutWidthInPx = w;
        m_realLayoutHeightInPx = h;
    }
    
    @Override
    protected void onDraw(Canvas canvas) {
        Path path;
        Paint paint;
        
        super.onDraw(canvas);
        
        canvas.scale(m_realLayoutWidthInPx/316.942468844f, m_realLayoutHeightInPx/49.408413792f);
        canvas.translate(158.471234422f, 24.704206896f);
        path = new Path();
        path.moveTo(-158.47f, -24.70f);
          path.lineTo(158.47f, -24.70f);
        path.lineTo(158.47f, 24.70f);
        path.lineTo(-158.47f, 24.70f);
        
        path.close();
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        paint.setARGB(71, 255, 255, 255);
        canvas.drawPath(path, paint);
        
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.STROKE);
        paint.setARGB(255, 0, 0, 0);
        paint.setStrokeWidth(2.0f);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPath(path, paint);
        
    }

}
