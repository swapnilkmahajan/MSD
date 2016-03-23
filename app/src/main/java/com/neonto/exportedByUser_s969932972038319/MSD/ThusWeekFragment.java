/*
  This code was generated in Neonto Studio Personal Edition:
  
    http://www.neonto.com
  
  You may use this code ONLY for non-commercial purposes and evaluation.
  Reusing any part of this code for commercial purposes is not permitted.
  
  Would you like to remove this restriction?
  With Neonto's flexible licensing options, you can have your own copyright
  in all this code.
  
  Find out more -- click 'Upgrade to Pro' in Neonto Studio's toolbar.
  
*/

package com.neonto.exportedByUser_s969932972038319.MSD;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.*;
import android.util.*;
import android.view.*;
import android.webkit.WebView;
import android.widget.*;

import com.neonto.exportedByUser_s969932972038319.MSD.R;

public class ThusWeekFragment extends Fragment {

    private ThusWeekBackgroundShapeView mBackgroundShape;
    private EditText mField;
    private ImageButton mIconButton3;
    private TextView mText14;
    private Button mButton7;
    private Button mButton6;
    private Button mButton5;
    private Button mButton4;
    private Button mButton;
    private Button mButton2;
    private Button mButton3;
    private ThusWeekImageView mImage;
    private TextView mText6;
    private TextView mText7;
    private TextView mText8;
    private TextView mText;
    private Button mHotspot;
    private Button mFixedButton;
    private ThusWeekImage4View mImage4;
    private TextView mText4;
    private TextView mText5;
    private ThusWeekRectangle2View mRectangle2;
    private ThusWeekRectangleView mRectangle;
    private ImageButton mIconButton2;
    private ImageButton mIconButton;
    private TextView mText2;
    private TextView mText22;
    private TextView mText3;
    private ScrollView mFlowScrollView;

    public ThusWeekFragment() {  // fragment must have a constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_thus_week, container, false);
                
        mBackgroundShape = (ThusWeekBackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mField = (EditText) rootView.findViewById(R.id.mField);
        mIconButton3 = (ImageButton) rootView.findViewById(R.id.mIconButton3);
        mText14 = (TextView) rootView.findViewById(R.id.mText14);
        mButton7 = (Button) rootView.findViewById(R.id.mButton7);
        mButton6 = (Button) rootView.findViewById(R.id.mButton6);
        mButton5 = (Button) rootView.findViewById(R.id.mButton5);
        mButton4 = (Button) rootView.findViewById(R.id.mButton4);
        mButton = (Button) rootView.findViewById(R.id.mButton);
        mButton2 = (Button) rootView.findViewById(R.id.mButton2);
        mButton3 = (Button) rootView.findViewById(R.id.mButton3);
        mImage = (ThusWeekImageView) rootView.findViewById(R.id.mImage);
        mText6 = (TextView) rootView.findViewById(R.id.mText6);
        mText7 = (TextView) rootView.findViewById(R.id.mText7);
        mText8 = (TextView) rootView.findViewById(R.id.mText8);
        mText = (TextView) rootView.findViewById(R.id.mText);
        mHotspot = (Button) rootView.findViewById(R.id.mHotspot);
        mFixedButton = (Button) rootView.findViewById(R.id.mFixedButton);
        mImage4 = (ThusWeekImage4View) rootView.findViewById(R.id.mImage4);
        mText4 = (TextView) rootView.findViewById(R.id.mText4);
        mText5 = (TextView) rootView.findViewById(R.id.mText5);
        mRectangle2 = (ThusWeekRectangle2View) rootView.findViewById(R.id.mRectangle2);
        mRectangle = (ThusWeekRectangleView) rootView.findViewById(R.id.mRectangle);
        mIconButton2 = (ImageButton) rootView.findViewById(R.id.mIconButton2);
        mIconButton = (ImageButton) rootView.findViewById(R.id.mIconButton);
        mText2 = (TextView) rootView.findViewById(R.id.mText2);
        mText22 = (TextView) rootView.findViewById(R.id.mText22);
        mText3 = (TextView) rootView.findViewById(R.id.mText3);
        final ThusWeekFragment fragment = this;

        final Context context = getActivity().getBaseContext();
        
        
        mField.setBackgroundColor(android.graphics.Color.WHITE);

        
        mIconButton3.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Search1Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                getActivity().startActivity(intent);
        
           }
        });

        

        
        mButton7.setTransformationMethod(null);

        
        mButton6.setTransformationMethod(null);

        
        mButton5.setTransformationMethod(null);

        
        mButton4.setTransformationMethod(null);

        
        mButton.setTransformationMethod(null);
        mButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HOMEActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                getActivity().startActivity(intent);
        
           }
        });

        
        mButton2.setTransformationMethod(null);

        
        mButton3.setTransformationMethod(null);
        mButton3.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RecomendedActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                getActivity().startActivity(intent);
        
           }
        });

        

        

        

        

        
        mHotspot.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OppDetail1Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                getActivity().startActivity(intent);
        
           }
        });

        
        mFixedButton.setTransformationMethod(null);

        

        

        

        
        mIconButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
                Activity activity = getActivity();
                View drawer = activity.findViewById(R.id.drawer_menu);
                ((android.support.v4.widget.DrawerLayout) activity.findViewById(R.id.drawer_layout)).openDrawer(drawer);
        
           }
        });

        

        

        

        mFlowScrollView = (ScrollView) rootView.findViewById(R.id.flowScrollView);
        mFlowScrollView.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
        
            private int m_prevPos = 0;
        
            @Override
            public void onScrollChanged() {
                int scrollPos = mFlowScrollView.getScrollY();
        
                m_prevPos = scrollPos;
            }
        });
        
        rootView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (android.os.Build.VERSION.SDK_INT >= 16) {
                    rootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    rootView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
                repositionElements();
            }
        });
        
        return rootView;
    }

    @Override
    public void onConfigurationChanged(Configuration config) {
        super.onConfigurationChanged(config);
        
        final View rootView = getView();
        if (rootView != null) {
            rootView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                @Override
                public void onGlobalLayout() {
                    if (android.os.Build.VERSION.SDK_INT >= 16) {
                        rootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        rootView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                    repositionElements();
                }
            });
        }
    }

    private HashMap<String, HashMap<String, ArrayList<LayoutDesc>>> mOverrideElementLayoutDescriptors;

    public void setOverrideElementLayoutDescriptors(HashMap<String, HashMap<String, ArrayList<LayoutDesc>>> d)
    {
        mOverrideElementLayoutDescriptors = d;
        repositionElements();
    }

    private static LayoutDesc layoutDescInListForFormat(List<LayoutDesc> layoutDescs, int format) {
        for (LayoutDesc ld : layoutDescs) {
            if (ld.format == format)
                return ld;
        }
        return null;
    }

    private static void applyLayoutToView(View v, DisplayMetrics dm, List<LayoutDesc> layoutDescs, boolean affectW, boolean affectH) {
        int winW = dm.widthPixels;
        int winH = dm.heightPixels;
        int dpi = dm.densityDpi;
        boolean isPortrait = winH > winW;

        LayoutDesc ld = null;
        float scale = 1.0f;
        float verticalScale = 1.0f;
        if (isPortrait) {
            if (winW > 768 && dpi < 320 && (ld = layoutDescInListForFormat(layoutDescs, 12)) != null) {
                // use layout 'large phone FullHD'
                scale = winW / 1080.0f;
                verticalScale = winH / 1920.0f;
            } else if (winW > 480 && (ld = layoutDescInListForFormat(layoutDescs, 10)) != null) {
                // use layout 'mid-size phone 720p'
                scale = winW / 720.0f;
                verticalScale = winH / 1280.0f;
            } else if (winW > 240 && (ld = layoutDescInListForFormat(layoutDescs, 8)) != null) {
                // use layout 'mid-size phone 480p'
                scale = winW / 480.0f;
                verticalScale = winH / 800.0f;
            } else {
                // use layout 'small phone 240p'
                ld = layoutDescInListForFormat(layoutDescs, 2);
                scale = winW / 240.0f;
                verticalScale = winH / 320.0f;
            }
        } else {
            if (winW > 1280 && (ld = layoutDescInListForFormat(layoutDescs, 11)) != null) {
                // use layout 'large phone FullHD'
                scale = winW / 1920.0f;
                verticalScale = winH / 1080.0f;
            } else if (winW > 800.0 && (ld = layoutDescInListForFormat(layoutDescs, 9)) != null) {
                // use layout 'mid-size phone 720p'
                scale = winW / 1280.0f;
                verticalScale = winH / 720.0f;
            } else if (winW > 320.0 && (ld = layoutDescInListForFormat(layoutDescs, 7)) != null) {
                // use layout 'mid-size phone 480p'
                scale = winW / 800.0f;
                verticalScale = winH / 480.0f;
            } else {
                // use layout 'small phone 240p'
                ld = layoutDescInListForFormat(layoutDescs, 1);
                scale = winW / 320.0f;
                verticalScale = winH / 240.0f;
            }
        }
        if (ld == null) {
            Log.d("Fragment", String.format("could not find suitable layout for view %d, window %d*%d", v.getId(), winW, winH));
            return;
        }

        int lx = (int) (ld.x * scale);
        int lt = (ld.t != LayoutDesc.NO_VALUE) ? (int) (ld.t * scale) : -1;
        if (ld.offsetToHorizontalKeylineT != LayoutDesc.NO_VALUE) {
            lt = (int)((ld.t + ld.offsetToHorizontalKeylineT) * verticalScale - ld.offsetToHorizontalKeylineT * scale);
        }
        int lb = (ld.b != LayoutDesc.NO_VALUE) ? (int) (ld.b * scale) : -1;
        if (ld.offsetToHorizontalKeylineB != LayoutDesc.NO_VALUE) {
            lb = (int)((ld.b - ld.offsetToHorizontalKeylineB) * verticalScale + ld.offsetToHorizontalKeylineB * scale);
        }
        int lw = (int) (ld.w * scale);
        // determine height dynamically if it's aligned from both top and bottom
        int lh = (lt != -1 && lb != -1) ? (winH - lb - lt) : (int) (ld.h * scale);

        if (v.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) v.getLayoutParams();
            lp.topMargin = lt;
            lp.bottomMargin = lb;
            lp.leftMargin = lx;
            if (affectW) {
                lp.width = lw;
            }
            if (affectH) {
                lp.height = lh;
            }
            v.setLayoutParams(lp);
        } else if (v.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) v.getLayoutParams();
            lp.topMargin = (int) ld.offsetInFlow;
            lp.leftMargin = lx;
            if (affectW) {
                lp.width = lw;
            }
            if (affectH) {
                lp.height = lh;
            }
            v.setLayoutParams(lp);
        } else if (v.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) v.getLayoutParams();
            lp.topMargin = lt;
            lp.bottomMargin = lb;
            lp.leftMargin = lx;
            if (affectW) {
                lp.width = lw;
            }
            if (affectH) {
                lp.height = lh;
            }
            v.setLayoutParams(lp);
        }

        Method m = null;
        try {
            m = v.getClass().getMethod("applyLayoutAndContentTransform", Integer.TYPE, Integer.TYPE, String.class, Float.TYPE);
        } catch (Exception e) {
            // doesn't implement this method, we can safely ignore this exception
        }
        if (m != null) {
            try {
                m.invoke(v, lw, lh, ld.contentTransformMatricesString, scale);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void repositionElements() {
        DisplayMetrics dm = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(dm);
        
        View rootView = getView();
        if (rootView != null) {
            // use actual layout dimensions if available.
            if (rootView.getWidth() > 0) dm.widthPixels = rootView.getWidth();
            if (rootView.getHeight() > 0) dm.heightPixels = rootView.getHeight();
        }
        
        ArrayList<LayoutDesc> layoutDescs_mBackgroundShape = new ArrayList<LayoutDesc>();
        layoutDescs_mBackgroundShape.add(new LayoutDesc(10, 0.0f, -48.0f, 0.0f, 720.0f, 1328.0f));  // 720*1280 px
        layoutDescs_mBackgroundShape.add(new LayoutDesc(2, 0.0f, -21.0f, 0.0f, 240.0f, 341.0f));  // 240*320 px
        layoutDescs_mBackgroundShape.add(new LayoutDesc(12, 0.0f, -60.0f, 0.0f, 1080.0f, 1980.0f));  // 1080*1920 px
        layoutDescs_mBackgroundShape.add(new LayoutDesc(8, 0.0f, -34.0f, 0.0f, 480.0f, 834.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mBackgroundShape = mOverrideElementLayoutDescriptors.get("backgroundShape");
            if (override_mBackgroundShape != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mBackgroundShape.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mBackgroundShape = layoutDescs;
                }
            }
        }
        applyLayoutToView(mBackgroundShape, dm, layoutDescs_mBackgroundShape, true, true);

        ArrayList<LayoutDesc> layoutDescs_mField = new ArrayList<LayoutDesc>();
        layoutDescs_mField.add(new LayoutDesc(10, 115.0f, 249.0f, LayoutDesc.NO_VALUE, 518.81f, 62.85f));  // 720*1280 px
        layoutDescs_mField.add(new LayoutDesc(2, 50.0f, 103.0f, LayoutDesc.NO_VALUE, 225.50f, 27.32f));  // 240*320 px
        layoutDescs_mField.add(new LayoutDesc(12, 145.0f, 327.0f, LayoutDesc.NO_VALUE, 654.38f, 79.27f));  // 1080*1920 px
        layoutDescs_mField.add(new LayoutDesc(8, 82.0f, 174.0f, LayoutDesc.NO_VALUE, 367.92f, 44.57f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mField = mOverrideElementLayoutDescriptors.get("field");
            if (override_mField != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mField.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mField = layoutDescs;
                }
            }
        }
        layoutDescs_mField.get(0).offsetInFlow = 246.99f;
        layoutDescs_mField.get(1).offsetInFlow = 107.36f;
        layoutDescs_mField.get(2).offsetInFlow = 311.53f;
        layoutDescs_mField.get(3).offsetInFlow = 175.15f;
        applyLayoutToView(mField, dm, layoutDescs_mField, true, false);

        ArrayList<LayoutDesc> layoutDescs_mIconButton3 = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton3.add(new LayoutDesc(10, 570.0f, 254.85f, LayoutDesc.NO_VALUE, 59.50f, 51.0f));  // 720*1280 px
        layoutDescs_mIconButton3.add(new LayoutDesc(2, 248.0f, 105.32f, LayoutDesc.NO_VALUE, 25.86f, 22.17f));  // 240*320 px
        layoutDescs_mIconButton3.add(new LayoutDesc(12, 719.0f, 334.27f, LayoutDesc.NO_VALUE, 75.05f, 64.33f));  // 1080*1920 px
        layoutDescs_mIconButton3.add(new LayoutDesc(8, 404.0f, 178.57f, LayoutDesc.NO_VALUE, 42.20f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mIconButton3 = mOverrideElementLayoutDescriptors.get("iconButton3");
            if (override_mIconButton3 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mIconButton3.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mIconButton3 = layoutDescs;
                }
            }
        }
        layoutDescs_mIconButton3.get(0).offsetInFlow = -56.91f;
        layoutDescs_mIconButton3.get(1).offsetInFlow = -24.74f;
        layoutDescs_mIconButton3.get(2).offsetInFlow = -71.78f;
        layoutDescs_mIconButton3.get(3).offsetInFlow = -40.36f;
        applyLayoutToView(mIconButton3, dm, layoutDescs_mIconButton3, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText14 = new ArrayList<LayoutDesc>();
        layoutDescs_mText14.add(new LayoutDesc(10, -1.0f, 309.85f, LayoutDesc.NO_VALUE, 446.29f, 45.0f));  // 720*1280 px
        layoutDescs_mText14.add(new LayoutDesc(2, 0.0f, 129.49f, LayoutDesc.NO_VALUE, 193.98f, 24.0f));  // 240*320 px
        layoutDescs_mText14.add(new LayoutDesc(12, -1.0f, 403.60f, LayoutDesc.NO_VALUE, 562.90f, 55.0f));  // 1080*1920 px
        layoutDescs_mText14.add(new LayoutDesc(8, -1.0f, 217.74f, LayoutDesc.NO_VALUE, 316.48f, 34.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText14 = mOverrideElementLayoutDescriptors.get("text14");
            if (override_mText14 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText14.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText14 = layoutDescs;
                }
            }
        }
        layoutDescs_mText14.get(0).offsetInFlow = 4.25f;
        layoutDescs_mText14.get(1).offsetInFlow = 1.85f;
        layoutDescs_mText14.get(2).offsetInFlow = 5.36f;
        layoutDescs_mText14.get(3).offsetInFlow = 3.01f;
        applyLayoutToView(mText14, dm, layoutDescs_mText14, true, false);

        ArrayList<LayoutDesc> layoutDescs_mButton7 = new ArrayList<LayoutDesc>();
        layoutDescs_mButton7.add(new LayoutDesc(10, 568.0f, 352.85f, LayoutDesc.NO_VALUE, 148.45f, 63.76f));  // 720*1280 px
        layoutDescs_mButton7.add(new LayoutDesc(2, 247.0f, 149.49f, LayoutDesc.NO_VALUE, 64.52f, 27.71f));  // 240*320 px
        layoutDescs_mButton7.add(new LayoutDesc(12, 717.0f, 457.60f, LayoutDesc.NO_VALUE, 187.24f, 80.41f));  // 1080*1920 px
        layoutDescs_mButton7.add(new LayoutDesc(8, 403.0f, 248.74f, LayoutDesc.NO_VALUE, 105.27f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mButton7 = mOverrideElementLayoutDescriptors.get("button7");
            if (override_mButton7 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mButton7.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mButton7 = layoutDescs;
                }
            }
        }
        layoutDescs_mButton7.get(0).offsetInFlow = 4.25f;
        layoutDescs_mButton7.get(1).offsetInFlow = 1.85f;
        layoutDescs_mButton7.get(2).offsetInFlow = 5.36f;
        layoutDescs_mButton7.get(3).offsetInFlow = 3.01f;
        applyLayoutToView(mButton7, dm, layoutDescs_mButton7, true, true);

        ArrayList<LayoutDesc> layoutDescs_mButton6 = new ArrayList<LayoutDesc>();
        layoutDescs_mButton6.add(new LayoutDesc(10, 358.0f, 352.61f, LayoutDesc.NO_VALUE, 212.52f, 63.76f));  // 720*1280 px
        layoutDescs_mButton6.add(new LayoutDesc(2, 156.0f, 149.20f, LayoutDesc.NO_VALUE, 92.37f, 27.71f));  // 240*320 px
        layoutDescs_mButton6.add(new LayoutDesc(12, 452.0f, 458.02f, LayoutDesc.NO_VALUE, 268.05f, 80.41f));  // 1080*1920 px
        layoutDescs_mButton6.add(new LayoutDesc(8, 254.0f, 248.95f, LayoutDesc.NO_VALUE, 150.71f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mButton6 = mOverrideElementLayoutDescriptors.get("button6");
            if (override_mButton6 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mButton6.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mButton6 = layoutDescs;
                }
            }
        }
        layoutDescs_mButton6.get(0).offsetInFlow = -63.76f;
        layoutDescs_mButton6.get(1).offsetInFlow = -27.71f;
        layoutDescs_mButton6.get(2).offsetInFlow = -80.41f;
        layoutDescs_mButton6.get(3).offsetInFlow = -45.21f;
        applyLayoutToView(mButton6, dm, layoutDescs_mButton6, true, true);

        ArrayList<LayoutDesc> layoutDescs_mButton5 = new ArrayList<LayoutDesc>();
        layoutDescs_mButton5.add(new LayoutDesc(10, 202.0f, 352.36f, LayoutDesc.NO_VALUE, 156.39f, 63.76f));  // 720*1280 px
        layoutDescs_mButton5.add(new LayoutDesc(2, 88.0f, 148.91f, LayoutDesc.NO_VALUE, 67.98f, 27.71f));  // 240*320 px
        layoutDescs_mButton5.add(new LayoutDesc(12, 255.0f, 458.43f, LayoutDesc.NO_VALUE, 197.26f, 80.41f));  // 1080*1920 px
        layoutDescs_mButton5.add(new LayoutDesc(8, 143.0f, 249.16f, LayoutDesc.NO_VALUE, 110.91f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mButton5 = mOverrideElementLayoutDescriptors.get("button5");
            if (override_mButton5 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mButton5.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mButton5 = layoutDescs;
                }
            }
        }
        layoutDescs_mButton5.get(0).offsetInFlow = -63.76f;
        layoutDescs_mButton5.get(1).offsetInFlow = -27.71f;
        layoutDescs_mButton5.get(2).offsetInFlow = -80.41f;
        layoutDescs_mButton5.get(3).offsetInFlow = -45.21f;
        applyLayoutToView(mButton5, dm, layoutDescs_mButton5, true, true);

        ArrayList<LayoutDesc> layoutDescs_mButton4 = new ArrayList<LayoutDesc>();
        layoutDescs_mButton4.add(new LayoutDesc(10, 0.0f, 352.12f, LayoutDesc.NO_VALUE, 204.39f, 63.76f));  // 720*1280 px
        layoutDescs_mButton4.add(new LayoutDesc(2, 0.0f, 148.62f, LayoutDesc.NO_VALUE, 88.84f, 27.71f));  // 240*320 px
        layoutDescs_mButton4.add(new LayoutDesc(12, 0.0f, 458.84f, LayoutDesc.NO_VALUE, 257.80f, 80.41f));  // 1080*1920 px
        layoutDescs_mButton4.add(new LayoutDesc(8, 0.0f, 249.37f, LayoutDesc.NO_VALUE, 144.94f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mButton4 = mOverrideElementLayoutDescriptors.get("button4");
            if (override_mButton4 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mButton4.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mButton4 = layoutDescs;
                }
            }
        }
        layoutDescs_mButton4.get(0).offsetInFlow = -63.76f;
        layoutDescs_mButton4.get(1).offsetInFlow = -27.71f;
        layoutDescs_mButton4.get(2).offsetInFlow = -80.41f;
        layoutDescs_mButton4.get(3).offsetInFlow = -45.21f;
        applyLayoutToView(mButton4, dm, layoutDescs_mButton4, true, true);

        ArrayList<LayoutDesc> layoutDescs_mButton = new ArrayList<LayoutDesc>();
        layoutDescs_mButton.add(new LayoutDesc(10, 0.0f, 432.87f, LayoutDesc.NO_VALUE, 144.65f, 63.76f));  // 720*1280 px
        layoutDescs_mButton.add(new LayoutDesc(2, 0.0f, 183.33f, LayoutDesc.NO_VALUE, 62.87f, 27.71f));  // 240*320 px
        layoutDescs_mButton.add(new LayoutDesc(12, 0.0f, 560.26f, LayoutDesc.NO_VALUE, 182.44f, 80.41f));  // 1080*1920 px
        layoutDescs_mButton.add(new LayoutDesc(8, 0.0f, 306.59f, LayoutDesc.NO_VALUE, 102.57f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mButton = mOverrideElementLayoutDescriptors.get("button");
            if (override_mButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mButton = layoutDescs;
                }
            }
        }
        layoutDescs_mButton.get(0).offsetInFlow = 17.0f;
        layoutDescs_mButton.get(1).offsetInFlow = 7.39f;
        layoutDescs_mButton.get(2).offsetInFlow = 21.44f;
        layoutDescs_mButton.get(3).offsetInFlow = 12.06f;
        applyLayoutToView(mButton, dm, layoutDescs_mButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mButton2 = new ArrayList<LayoutDesc>();
        layoutDescs_mButton2.add(new LayoutDesc(10, 146.0f, 432.63f, LayoutDesc.NO_VALUE, 229.68f, 63.76f));  // 720*1280 px
        layoutDescs_mButton2.add(new LayoutDesc(2, 64.0f, 183.04f, LayoutDesc.NO_VALUE, 99.83f, 27.71f));  // 240*320 px
        layoutDescs_mButton2.add(new LayoutDesc(12, 184.0f, 560.67f, LayoutDesc.NO_VALUE, 289.7f, 80.41f));  // 1080*1920 px
        layoutDescs_mButton2.add(new LayoutDesc(8, 104.0f, 306.80f, LayoutDesc.NO_VALUE, 162.88f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mButton2 = mOverrideElementLayoutDescriptors.get("button2");
            if (override_mButton2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mButton2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mButton2 = layoutDescs;
                }
            }
        }
        layoutDescs_mButton2.get(0).offsetInFlow = -63.76f;
        layoutDescs_mButton2.get(1).offsetInFlow = -27.71f;
        layoutDescs_mButton2.get(2).offsetInFlow = -80.41f;
        layoutDescs_mButton2.get(3).offsetInFlow = -45.21f;
        applyLayoutToView(mButton2, dm, layoutDescs_mButton2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mButton3 = new ArrayList<LayoutDesc>();
        layoutDescs_mButton3.add(new LayoutDesc(10, 375.0f, 432.38f, LayoutDesc.NO_VALUE, 344.99f, 63.76f));  // 720*1280 px
        layoutDescs_mButton3.add(new LayoutDesc(2, 163.0f, 182.75f, LayoutDesc.NO_VALUE, 149.95f, 27.71f));  // 240*320 px
        layoutDescs_mButton3.add(new LayoutDesc(12, 473.0f, 561.08f, LayoutDesc.NO_VALUE, 435.13f, 80.41f));  // 1080*1920 px
        layoutDescs_mButton3.add(new LayoutDesc(8, 266.0f, 307.01f, LayoutDesc.NO_VALUE, 244.65f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mButton3 = mOverrideElementLayoutDescriptors.get("button3");
            if (override_mButton3 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mButton3.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mButton3 = layoutDescs;
                }
            }
        }
        layoutDescs_mButton3.get(0).offsetInFlow = -63.76f;
        layoutDescs_mButton3.get(1).offsetInFlow = -27.71f;
        layoutDescs_mButton3.get(2).offsetInFlow = -80.41f;
        layoutDescs_mButton3.get(3).offsetInFlow = -45.21f;
        applyLayoutToView(mButton3, dm, layoutDescs_mButton3, true, true);

        ArrayList<LayoutDesc> layoutDescs_mImage = new ArrayList<LayoutDesc>();
        layoutDescs_mImage.add(new LayoutDesc(10, 0.0f, 505.14f, LayoutDesc.NO_VALUE, 723.0f, 332.0f));  // 720*1280 px
        layoutDescs_mImage.add(new LayoutDesc(2, 0.0f, 214.46f, LayoutDesc.NO_VALUE, 315.0f, 145.0f));  // 240*320 px
        layoutDescs_mImage.add(new LayoutDesc(12, 0.0f, 652.50f, LayoutDesc.NO_VALUE, 912.0f, 419.0f));  // 1080*1920 px
        layoutDescs_mImage.add(new LayoutDesc(8, 0.0f, 358.22f, LayoutDesc.NO_VALUE, 513.0f, 236.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mImage = mOverrideElementLayoutDescriptors.get("image");
            if (override_mImage != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mImage.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mImage = layoutDescs;
                }
            }
        }
        layoutDescs_mImage.get(0).contentTransformMatricesString = "[0.457931034, 0.0, 0.0, 0.457931034, -86.814482759, 0.0]; [0.457931034, 0.0, 0.0, 0.457931034, -86.814482759, 0.0]";
        layoutDescs_mImage.get(1).contentTransformMatricesString = "[0.2, 0.0, 0.0, 0.2, -38.3, 0.0]; [0.2, 0.0, 0.0, 0.2, -38.3, 0.0]";
        layoutDescs_mImage.get(2).contentTransformMatricesString = "[0.577931034, 0.0, 0.0, 0.577931034, -109.794482759, 0.0]; [0.577931034, 0.0, 0.0, 0.577931034, -109.794482759, 0.0]";
        layoutDescs_mImage.get(3).contentTransformMatricesString = "[0.325517241, 0.0, 0.0, 0.325517241, -62.181379310, 0.0]; [0.325517241, 0.0, 0.0, 0.325517241, -62.181379310, 0.0]";
        layoutDescs_mImage.get(0).offsetInFlow = 8.58f;
        layoutDescs_mImage.get(1).offsetInFlow = 3.73f;
        layoutDescs_mImage.get(2).offsetInFlow = 10.82f;
        layoutDescs_mImage.get(3).offsetInFlow = 6.08f;
        applyLayoutToView(mImage, dm, layoutDescs_mImage, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText6 = new ArrayList<LayoutDesc>();
        layoutDescs_mText6.add(new LayoutDesc(10, 34.0f, 837.14f, LayoutDesc.NO_VALUE, 446.29f, 45.0f));  // 720*1280 px
        layoutDescs_mText6.add(new LayoutDesc(2, 15.0f, 359.46f, LayoutDesc.NO_VALUE, 193.98f, 24.0f));  // 240*320 px
        layoutDescs_mText6.add(new LayoutDesc(12, 43.0f, 1070.50f, LayoutDesc.NO_VALUE, 562.90f, 55.0f));  // 1080*1920 px
        layoutDescs_mText6.add(new LayoutDesc(8, 24.0f, 594.22f, LayoutDesc.NO_VALUE, 316.48f, 34.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText6 = mOverrideElementLayoutDescriptors.get("text6");
            if (override_mText6 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText6.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText6 = layoutDescs;
                }
            }
        }
        layoutDescs_mText6.get(0).offsetInFlow = -0.40f;
        layoutDescs_mText6.get(1).offsetInFlow = -0.18f;
        layoutDescs_mText6.get(2).offsetInFlow = -0.51f;
        layoutDescs_mText6.get(3).offsetInFlow = -0.29f;
        applyLayoutToView(mText6, dm, layoutDescs_mText6, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText7 = new ArrayList<LayoutDesc>();
        layoutDescs_mText7.add(new LayoutDesc(10, 41.0f, 873.14f, LayoutDesc.NO_VALUE, 642.64f, 56.0f));  // 720*1280 px
        layoutDescs_mText7.add(new LayoutDesc(2, 18.0f, 376.46f, LayoutDesc.NO_VALUE, 279.33f, 28.0f));  // 240*320 px
        layoutDescs_mText7.add(new LayoutDesc(12, 52.0f, 1115.50f, LayoutDesc.NO_VALUE, 810.56f, 70.0f));  // 1080*1920 px
        layoutDescs_mText7.add(new LayoutDesc(8, 29.0f, 620.22f, LayoutDesc.NO_VALUE, 455.73f, 41.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText7 = mOverrideElementLayoutDescriptors.get("text7");
            if (override_mText7 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText7.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText7 = layoutDescs;
                }
            }
        }
        layoutDescs_mText7.get(0).offsetInFlow = -3.01f;
        layoutDescs_mText7.get(1).offsetInFlow = -1.31f;
        layoutDescs_mText7.get(2).offsetInFlow = -3.79f;
        layoutDescs_mText7.get(3).offsetInFlow = -2.13f;
        applyLayoutToView(mText7, dm, layoutDescs_mText7, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText8 = new ArrayList<LayoutDesc>();
        layoutDescs_mText8.add(new LayoutDesc(10, 39.0f, 923.14f, LayoutDesc.NO_VALUE, 446.29f, 45.0f));  // 720*1280 px
        layoutDescs_mText8.add(new LayoutDesc(2, 17.0f, 398.46f, LayoutDesc.NO_VALUE, 193.98f, 24.0f));  // 240*320 px
        layoutDescs_mText8.add(new LayoutDesc(12, 49.0f, 1180.50f, LayoutDesc.NO_VALUE, 562.90f, 55.0f));  // 1080*1920 px
        layoutDescs_mText8.add(new LayoutDesc(8, 27.0f, 655.22f, LayoutDesc.NO_VALUE, 316.48f, 34.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText8 = mOverrideElementLayoutDescriptors.get("text8");
            if (override_mText8 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText8.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText8 = layoutDescs;
                }
            }
        }
        layoutDescs_mText8.get(0).offsetInFlow = 0.41f;
        layoutDescs_mText8.get(1).offsetInFlow = 0.18f;
        layoutDescs_mText8.get(2).offsetInFlow = 0.51f;
        layoutDescs_mText8.get(3).offsetInFlow = 0.29f;
        applyLayoutToView(mText8, dm, layoutDescs_mText8, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText = new ArrayList<LayoutDesc>();
        layoutDescs_mText.add(new LayoutDesc(10, 569.0f, 925.14f, LayoutDesc.NO_VALUE, 446.29f, 45.0f));  // 720*1280 px
        layoutDescs_mText.add(new LayoutDesc(2, 247.0f, 400.46f, LayoutDesc.NO_VALUE, 193.98f, 24.0f));  // 240*320 px
        layoutDescs_mText.add(new LayoutDesc(12, 718.0f, 1183.50f, LayoutDesc.NO_VALUE, 562.90f, 55.0f));  // 1080*1920 px
        layoutDescs_mText.add(new LayoutDesc(8, 404.0f, 657.22f, LayoutDesc.NO_VALUE, 316.48f, 34.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText = mOverrideElementLayoutDescriptors.get("text");
            if (override_mText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText = layoutDescs;
                }
            }
        }
        layoutDescs_mText.get(0).offsetInFlow = -36.65f;
        layoutDescs_mText.get(1).offsetInFlow = -15.93f;
        layoutDescs_mText.get(2).offsetInFlow = -46.22f;
        layoutDescs_mText.get(3).offsetInFlow = -25.99f;
        applyLayoutToView(mText, dm, layoutDescs_mText, true, false);

        ArrayList<LayoutDesc> layoutDescs_mHotspot = new ArrayList<LayoutDesc>();
        layoutDescs_mHotspot.add(new LayoutDesc(10, -13.0f, 495.14f, LayoutDesc.NO_VALUE, 753.27f, 481.14f));  // 720*1280 px
        layoutDescs_mHotspot.add(new LayoutDesc(2, -6.0f, 214.46f, LayoutDesc.NO_VALUE, 327.41f, 209.13f));  // 240*320 px
        layoutDescs_mHotspot.add(new LayoutDesc(12, -16.0f, 640.50f, LayoutDesc.NO_VALUE, 950.09f, 606.86f));  // 1080*1920 px
        layoutDescs_mHotspot.add(new LayoutDesc(8, -9.0f, 352.22f, LayoutDesc.NO_VALUE, 534.18f, 341.20f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mHotspot = mOverrideElementLayoutDescriptors.get("hotspot");
            if (override_mHotspot != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mHotspot.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mHotspot = layoutDescs;
                }
            }
        }
        layoutDescs_mHotspot.get(0).offsetInFlow = -469.41f;
        layoutDescs_mHotspot.get(1).offsetInFlow = -204.03f;
        layoutDescs_mHotspot.get(2).offsetInFlow = -592.06f;
        layoutDescs_mHotspot.get(3).offsetInFlow = -332.88f;
        applyLayoutToView(mHotspot, dm, layoutDescs_mHotspot, true, true);

        ArrayList<LayoutDesc> layoutDescs_mFixedButton = new ArrayList<LayoutDesc>();
        layoutDescs_mFixedButton.add(new LayoutDesc(10, 259.0f, 1246.28f, LayoutDesc.NO_VALUE, 212.52f, 63.76f));  // 720*1280 px
        layoutDescs_mFixedButton.add(new LayoutDesc(2, 113.0f, 540.59f, LayoutDesc.NO_VALUE, 92.37f, 27.71f));  // 240*320 px
        layoutDescs_mFixedButton.add(new LayoutDesc(12, 327.0f, 1588.35f, LayoutDesc.NO_VALUE, 268.05f, 80.41f));  // 1080*1920 px
        layoutDescs_mFixedButton.add(new LayoutDesc(8, 184.0f, 885.42f, LayoutDesc.NO_VALUE, 150.71f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mFixedButton = mOverrideElementLayoutDescriptors.get("fixedButton");
            if (override_mFixedButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mFixedButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mFixedButton = layoutDescs;
                }
            }
        }
        layoutDescs_mFixedButton.get(0).offsetInFlow = 270.3f;
        layoutDescs_mFixedButton.get(1).offsetInFlow = 117.49f;
        layoutDescs_mFixedButton.get(2).offsetInFlow = 340.93f;
        layoutDescs_mFixedButton.get(3).offsetInFlow = 191.68f;
        applyLayoutToView(mFixedButton, dm, layoutDescs_mFixedButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mImage4 = new ArrayList<LayoutDesc>();
        layoutDescs_mImage4.add(new LayoutDesc(10, -15.0f, 0.0f, LayoutDesc.NO_VALUE, 736.0f, 242.0f));  // 720*1280 px
        layoutDescs_mImage4.add(new LayoutDesc(2, -7.0f, 0.0f, LayoutDesc.NO_VALUE, 320.0f, 105.0f));  // 240*320 px
        layoutDescs_mImage4.add(new LayoutDesc(12, -19.0f, 0.0f, LayoutDesc.NO_VALUE, 929.0f, 305.0f));  // 1080*1920 px
        layoutDescs_mImage4.add(new LayoutDesc(8, -11.0f, 0.0f, LayoutDesc.NO_VALUE, 522.0f, 172.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mImage4 = mOverrideElementLayoutDescriptors.get("image4");
            if (override_mImage4 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mImage4.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mImage4 = layoutDescs;
                }
            }
        }
        layoutDescs_mImage4.get(0).contentTransformMatricesString = "[0.718750000, 0.0, 0.0, 0.718750000, 0.0, -155.0]; [0.718750000, 0.0, 0.0, 0.718750000, 0.0, -155.0]";
        layoutDescs_mImage4.get(1).contentTransformMatricesString = "[0.312500000, 0.0, 0.0, 0.312500000, 0.0, -67.5]; [0.312500000, 0.0, 0.0, 0.312500000, 0.0, -67.5]";
        layoutDescs_mImage4.get(2).contentTransformMatricesString = "[0.907226562, 0.0, 0.0, 0.907226562, 0.0, -195.875]; [0.907226562, 0.0, 0.0, 0.907226562, 0.0, -195.875]";
        layoutDescs_mImage4.get(3).contentTransformMatricesString = "[0.509765625, 0.0, 0.0, 0.509765625, 0.0, -109.750]; [0.509765625, 0.0, 0.0, 0.509765625, 0.0, -109.750]";
        applyLayoutToView(mImage4, dm, layoutDescs_mImage4, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText4 = new ArrayList<LayoutDesc>();
        layoutDescs_mText4.add(new LayoutDesc(10, 302.0f, 179.0f, LayoutDesc.NO_VALUE, 446.29f, 45.0f));  // 720*1280 px
        layoutDescs_mText4.add(new LayoutDesc(2, 131.0f, 78.0f, LayoutDesc.NO_VALUE, 193.98f, 24.0f));  // 240*320 px
        layoutDescs_mText4.add(new LayoutDesc(12, 380.0f, 226.0f, LayoutDesc.NO_VALUE, 562.90f, 55.0f));  // 1080*1920 px
        layoutDescs_mText4.add(new LayoutDesc(8, 214.0f, 127.0f, LayoutDesc.NO_VALUE, 316.48f, 34.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText4 = mOverrideElementLayoutDescriptors.get("text4");
            if (override_mText4 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText4.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText4 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mText4, dm, layoutDescs_mText4, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText5 = new ArrayList<LayoutDesc>();
        layoutDescs_mText5.add(new LayoutDesc(10, 638.0f, 123.0f, LayoutDesc.NO_VALUE, 446.29f, 51.0f));  // 720*1280 px
        layoutDescs_mText5.add(new LayoutDesc(2, 277.0f, 53.0f, LayoutDesc.NO_VALUE, 193.98f, 25.0f));  // 240*320 px
        layoutDescs_mText5.add(new LayoutDesc(12, 805.0f, 155.0f, LayoutDesc.NO_VALUE, 562.90f, 63.0f));  // 1080*1920 px
        layoutDescs_mText5.add(new LayoutDesc(8, 453.0f, 87.0f, LayoutDesc.NO_VALUE, 316.48f, 38.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText5 = mOverrideElementLayoutDescriptors.get("text5");
            if (override_mText5 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText5.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText5 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mText5, dm, layoutDescs_mText5, true, false);

        ArrayList<LayoutDesc> layoutDescs_mRectangle2 = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangle2.add(new LayoutDesc(10, 307.0f, 117.0f, LayoutDesc.NO_VALUE, 142.0f, 44.74f));  // 720*1280 px
        layoutDescs_mRectangle2.add(new LayoutDesc(2, 134.0f, 51.0f, LayoutDesc.NO_VALUE, 61.72f, 19.44f));  // 240*320 px
        layoutDescs_mRectangle2.add(new LayoutDesc(12, 388.0f, 148.0f, LayoutDesc.NO_VALUE, 179.10f, 56.42f));  // 1080*1920 px
        layoutDescs_mRectangle2.add(new LayoutDesc(8, 218.0f, 83.0f, LayoutDesc.NO_VALUE, 100.70f, 31.72f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRectangle2 = mOverrideElementLayoutDescriptors.get("rectangle2");
            if (override_mRectangle2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRectangle2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRectangle2 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mRectangle2, dm, layoutDescs_mRectangle2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mRectangle = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangle.add(new LayoutDesc(10, 308.0f, 118.0f, LayoutDesc.NO_VALUE, 316.94f, 49.41f));  // 720*1280 px
        layoutDescs_mRectangle.add(new LayoutDesc(2, 134.0f, 51.0f, LayoutDesc.NO_VALUE, 137.76f, 21.48f));  // 240*320 px
        layoutDescs_mRectangle.add(new LayoutDesc(12, 389.0f, 150.0f, LayoutDesc.NO_VALUE, 399.76f, 62.32f));  // 1080*1920 px
        layoutDescs_mRectangle.add(new LayoutDesc(8, 219.0f, 84.0f, LayoutDesc.NO_VALUE, 224.76f, 35.04f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRectangle = mOverrideElementLayoutDescriptors.get("rectangle");
            if (override_mRectangle != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRectangle.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRectangle = layoutDescs;
                }
            }
        }
        applyLayoutToView(mRectangle, dm, layoutDescs_mRectangle, true, true);

        ArrayList<LayoutDesc> layoutDescs_mIconButton2 = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton2.add(new LayoutDesc(10, 580.0f, 75.0f, LayoutDesc.NO_VALUE, 149.44f, 133.85f));  // 720*1280 px
        layoutDescs_mIconButton2.add(new LayoutDesc(2, 252.0f, 32.0f, LayoutDesc.NO_VALUE, 64.96f, 58.18f));  // 240*320 px
        layoutDescs_mIconButton2.add(new LayoutDesc(12, 732.0f, 95.0f, LayoutDesc.NO_VALUE, 188.49f, 168.82f));  // 1080*1920 px
        layoutDescs_mIconButton2.add(new LayoutDesc(8, 412.0f, 53.0f, LayoutDesc.NO_VALUE, 105.98f, 94.92f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mIconButton2 = mOverrideElementLayoutDescriptors.get("iconButton2");
            if (override_mIconButton2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mIconButton2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mIconButton2 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mIconButton2, dm, layoutDescs_mIconButton2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mIconButton = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton.add(new LayoutDesc(10, 23.0f, 19.0f, LayoutDesc.NO_VALUE, 59.50f, 61.07f));  // 720*1280 px
        layoutDescs_mIconButton.add(new LayoutDesc(2, 10.0f, 8.0f, LayoutDesc.NO_VALUE, 25.86f, 26.54f));  // 240*320 px
        layoutDescs_mIconButton.add(new LayoutDesc(12, 29.0f, 25.0f, LayoutDesc.NO_VALUE, 75.05f, 77.02f));  // 1080*1920 px
        layoutDescs_mIconButton.add(new LayoutDesc(8, 16.0f, 14.0f, LayoutDesc.NO_VALUE, 42.20f, 43.31f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mIconButton = mOverrideElementLayoutDescriptors.get("iconButton");
            if (override_mIconButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mIconButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mIconButton = layoutDescs;
                }
            }
        }
        applyLayoutToView(mIconButton, dm, layoutDescs_mIconButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText2 = new ArrayList<LayoutDesc>();
        layoutDescs_mText2.add(new LayoutDesc(10, 85.0f, 22.0f, LayoutDesc.NO_VALUE, 561.04f, 63.0f));  // 720*1280 px
        layoutDescs_mText2.add(new LayoutDesc(2, 37.0f, 9.0f, LayoutDesc.NO_VALUE, 243.85f, 30.0f));  // 240*320 px
        layoutDescs_mText2.add(new LayoutDesc(12, 107.0f, 28.0f, LayoutDesc.NO_VALUE, 707.63f, 77.0f));  // 1080*1920 px
        layoutDescs_mText2.add(new LayoutDesc(8, 60.0f, 16.0f, LayoutDesc.NO_VALUE, 397.86f, 46.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText2 = mOverrideElementLayoutDescriptors.get("text");
            if (override_mText2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText2 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mText2, dm, layoutDescs_mText2, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText22 = new ArrayList<LayoutDesc>();
        layoutDescs_mText22.add(new LayoutDesc(10, 29.0f, 78.0f, LayoutDesc.NO_VALUE, 446.29f, 63.0f));  // 720*1280 px
        layoutDescs_mText22.add(new LayoutDesc(2, 12.0f, 34.0f, LayoutDesc.NO_VALUE, 193.98f, 30.0f));  // 240*320 px
        layoutDescs_mText22.add(new LayoutDesc(12, 36.0f, 99.0f, LayoutDesc.NO_VALUE, 562.90f, 77.0f));  // 1080*1920 px
        layoutDescs_mText22.add(new LayoutDesc(8, 20.0f, 55.0f, LayoutDesc.NO_VALUE, 316.48f, 46.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText22 = mOverrideElementLayoutDescriptors.get("text2");
            if (override_mText22 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText22.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText22 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mText22, dm, layoutDescs_mText22, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText3 = new ArrayList<LayoutDesc>();
        layoutDescs_mText3.add(new LayoutDesc(10, 35.0f, 143.0f, LayoutDesc.NO_VALUE, 446.29f, 63.0f));  // 720*1280 px
        layoutDescs_mText3.add(new LayoutDesc(2, 15.0f, 62.0f, LayoutDesc.NO_VALUE, 193.98f, 30.0f));  // 240*320 px
        layoutDescs_mText3.add(new LayoutDesc(12, 44.0f, 182.0f, LayoutDesc.NO_VALUE, 562.90f, 77.0f));  // 1080*1920 px
        layoutDescs_mText3.add(new LayoutDesc(8, 24.0f, 102.0f, LayoutDesc.NO_VALUE, 316.48f, 46.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText3 = mOverrideElementLayoutDescriptors.get("text3");
            if (override_mText3 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText3.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText3 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mText3, dm, layoutDescs_mText3, true, false);

        ArrayList<LayoutDesc> layoutDescs_mFlowScrollView = new ArrayList<LayoutDesc>();
        layoutDescs_mFlowScrollView.add(new LayoutDesc(10, 0.0f, 0.0f, 0.0f, 720.0f, 1280.0f));  // 720*1280 px
        layoutDescs_mFlowScrollView.add(new LayoutDesc(2, 0.0f, 0.0f, 0.0f, 240.0f, 320.0f));  // 240*320 px
        layoutDescs_mFlowScrollView.add(new LayoutDesc(12, 0.0f, 0.0f, 0.0f, 1080.0f, 1920.0f));  // 1080*1920 px
        layoutDescs_mFlowScrollView.add(new LayoutDesc(8, 0.0f, 0.0f, 0.0f, 480.0f, 800.0f));  // 480*800 px
        applyLayoutToView(mFlowScrollView, dm, layoutDescs_mFlowScrollView, true, true);
    }

}
