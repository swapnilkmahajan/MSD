package com.neonto.exportedByUser_s969932972038319.MSD;

import android.content.*;
import android.content.res.TypedArray;
import android.graphics.*;
import android.text.*;
import android.util.*;
import android.view.*;

public class MyInfoRectangleCopyView extends View {



    public MyInfoRectangleCopyView(Context context) {
        super(context);
        init(null, 0);
    }
    
    public MyInfoRectangleCopyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }
    
    public MyInfoRectangleCopyView(Context context, AttributeSet attrs, int defStyle) {
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
        
        canvas.scale(m_realLayoutWidthInPx/130.846259350f, m_realLayoutHeightInPx/42.078125000f);
        canvas.translate(65.423129675f, 21.039062500f);
        path = new Path();
        path.moveTo(-65.42f, -21.04f);
          path.lineTo(65.42f, -21.04f);
        path.lineTo(65.42f, 21.04f);
        path.lineTo(-65.42f, 21.04f);
        
        path.close();
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        paint.setARGB(150, 0, 128, 255);
        canvas.drawPath(path, paint);
    }

}
