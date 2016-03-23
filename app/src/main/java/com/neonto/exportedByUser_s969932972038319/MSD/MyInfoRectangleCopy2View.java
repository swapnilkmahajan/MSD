package com.neonto.exportedByUser_s969932972038319.MSD;

import android.content.*;
import android.content.res.TypedArray;
import android.graphics.*;
import android.text.*;
import android.util.*;
import android.view.*;

public class MyInfoRectangleCopy2View extends View {



    public MyInfoRectangleCopy2View(Context context) {
        super(context);
        init(null, 0);
    }
    
    public MyInfoRectangleCopy2View(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }
    
    public MyInfoRectangleCopy2View(Context context, AttributeSet attrs, int defStyle) {
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
        
        canvas.scale(m_realLayoutWidthInPx/192.469454503f, m_realLayoutHeightInPx/37.0f);
        canvas.translate(96.234727252f, 18.5f);
        path = new Path();
        path.moveTo(-96.23f, -18.5f);
          path.lineTo(96.23f, -18.5f);
        path.lineTo(96.23f, 18.5f);
        path.lineTo(-96.23f, 18.5f);
        
        path.close();
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        paint.setARGB(173, 102, 255, 102);
        canvas.drawPath(path, paint);
    }

}
