package com.neonto.exportedByUser_s969932972038319.MSD;

import android.content.*;
import android.content.res.TypedArray;
import android.graphics.*;
import android.text.*;
import android.util.*;
import android.view.*;

public class REGISTERLineCopy4View extends View {



    public REGISTERLineCopy4View(Context context) {
        super(context);
        init(null, 0);
    }
    
    public REGISTERLineCopy4View(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }
    
    public REGISTERLineCopy4View(Context context, AttributeSet attrs, int defStyle) {
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
        
        path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(canvas.getWidth(), canvas.getHeight());
        path.close();
        
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.STROKE);
        paint.setARGB(255, 228, 235, 236);
        paint.setStrokeWidth(2.0f);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPath(path, paint);
    }

}
