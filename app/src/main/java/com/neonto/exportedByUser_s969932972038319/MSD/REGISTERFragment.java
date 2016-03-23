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

public class REGISTERFragment extends Fragment {

    private REGISTERBackgroundShapeView mBackgroundShape;
    private TextView mText;
    private TextView mText2;
    private EditText mField;
    private EditText mField2;
    private REGISTERLineView mLine;
    private REGISTERLineCopyView mLineCopy;
    private REGISTERLineCopy2View mLineCopy2;
    private REGISTERLineCopy3View mLineCopy3;
    private REGISTERLineCopy4View mLineCopy4;
    private Button mButton;
    private Button mButton2;
    private EditText mField3;
    private EditText mField4;

    public REGISTERFragment() {  // fragment must have a constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_r_e_g_i_s_t_e_r, container, false);
                
        mBackgroundShape = (REGISTERBackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mText = (TextView) rootView.findViewById(R.id.mText);
        mText2 = (TextView) rootView.findViewById(R.id.mText2);
        mField = (EditText) rootView.findViewById(R.id.mField);
        mField2 = (EditText) rootView.findViewById(R.id.mField2);
        mLine = (REGISTERLineView) rootView.findViewById(R.id.mLine);
        mLineCopy = (REGISTERLineCopyView) rootView.findViewById(R.id.mLineCopy);
        mLineCopy2 = (REGISTERLineCopy2View) rootView.findViewById(R.id.mLineCopy2);
        mLineCopy3 = (REGISTERLineCopy3View) rootView.findViewById(R.id.mLineCopy3);
        mLineCopy4 = (REGISTERLineCopy4View) rootView.findViewById(R.id.mLineCopy4);
        mButton = (Button) rootView.findViewById(R.id.mButton);
        mButton2 = (Button) rootView.findViewById(R.id.mButton2);
        mField3 = (EditText) rootView.findViewById(R.id.mField3);
        mField4 = (EditText) rootView.findViewById(R.id.mField4);
        final REGISTERFragment fragment = this;

        final Context context = getActivity().getBaseContext();
        
        

        

        

        

        
        mButton.setTransformationMethod(null);

        
        mButton2.setTransformationMethod(null);
        mButton2.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LOGINActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                getActivity().startActivity(intent);
        
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

        ArrayList<LayoutDesc> layoutDescs_mText = new ArrayList<LayoutDesc>();
        layoutDescs_mText.add(new LayoutDesc(10, 210.0f, 68.0f, LayoutDesc.NO_VALUE, 310.84f, 159.0f));  // 720*1280 px
        layoutDescs_mText.add(new LayoutDesc(2, 91.0f, 30.0f, LayoutDesc.NO_VALUE, 135.11f, 73.0f));  // 240*320 px
        layoutDescs_mText.add(new LayoutDesc(12, 265.0f, 87.0f, LayoutDesc.NO_VALUE, 392.06f, 199.0f));  // 1080*1920 px
        layoutDescs_mText.add(new LayoutDesc(8, 149.0f, 49.0f, LayoutDesc.NO_VALUE, 220.43f, 115.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText = mOverrideElementLayoutDescriptors.get("text");
            if (override_mText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText = layoutDescs;
                }
            }
        }
        applyLayoutToView(mText, dm, layoutDescs_mText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText2 = new ArrayList<LayoutDesc>();
        layoutDescs_mText2.add(new LayoutDesc(10, 81.0f, 213.0f, LayoutDesc.NO_VALUE, 568.08f, 49.0f));  // 720*1280 px
        layoutDescs_mText2.add(new LayoutDesc(2, 35.0f, 92.0f, LayoutDesc.NO_VALUE, 246.92f, 25.0f));  // 240*320 px
        layoutDescs_mText2.add(new LayoutDesc(12, 102.0f, 269.0f, LayoutDesc.NO_VALUE, 716.52f, 60.0f));  // 1080*1920 px
        layoutDescs_mText2.add(new LayoutDesc(8, 57.0f, 151.0f, LayoutDesc.NO_VALUE, 402.85f, 37.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText2 = mOverrideElementLayoutDescriptors.get("text2");
            if (override_mText2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText2 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mText2, dm, layoutDescs_mText2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mField = new ArrayList<LayoutDesc>();
        layoutDescs_mField.add(new LayoutDesc(10, 41.0f, 341.0f, LayoutDesc.NO_VALUE, 639.54f, 81.98f));  // 720*1280 px
        layoutDescs_mField.add(new LayoutDesc(2, 18.0f, 148.0f, LayoutDesc.NO_VALUE, 277.98f, 35.63f));  // 240*320 px
        layoutDescs_mField.add(new LayoutDesc(12, 52.0f, 431.0f, LayoutDesc.NO_VALUE, 806.65f, 103.40f));  // 1080*1920 px
        layoutDescs_mField.add(new LayoutDesc(8, 29.0f, 242.0f, LayoutDesc.NO_VALUE, 453.53f, 58.14f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mField = mOverrideElementLayoutDescriptors.get("field");
            if (override_mField != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mField.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mField = layoutDescs;
                }
            }
        }
        applyLayoutToView(mField, dm, layoutDescs_mField, true, false);

        ArrayList<LayoutDesc> layoutDescs_mField2 = new ArrayList<LayoutDesc>();
        layoutDescs_mField2.add(new LayoutDesc(10, 40.0f, 475.0f, LayoutDesc.NO_VALUE, 640.09f, 63.76f));  // 720*1280 px
        layoutDescs_mField2.add(new LayoutDesc(2, 17.0f, 207.0f, LayoutDesc.NO_VALUE, 278.22f, 27.71f));  // 240*320 px
        layoutDescs_mField2.add(new LayoutDesc(12, 50.0f, 600.0f, LayoutDesc.NO_VALUE, 807.34f, 80.41f));  // 1080*1920 px
        layoutDescs_mField2.add(new LayoutDesc(8, 28.0f, 337.0f, LayoutDesc.NO_VALUE, 453.92f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mField2 = mOverrideElementLayoutDescriptors.get("field2");
            if (override_mField2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mField2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mField2 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mField2, dm, layoutDescs_mField2, true, false);

        ArrayList<LayoutDesc> layoutDescs_mLine = new ArrayList<LayoutDesc>();
        layoutDescs_mLine.add(new LayoutDesc(10, 42.0f, 544.0f, LayoutDesc.NO_VALUE, 636.43f, 4.0f));  // 720*1280 px
        layoutDescs_mLine.add(new LayoutDesc(2, 18.0f, 236.0f, LayoutDesc.NO_VALUE, 276.63f, 1.74f));  // 240*320 px
        layoutDescs_mLine.add(new LayoutDesc(12, 52.0f, 686.0f, LayoutDesc.NO_VALUE, 802.73f, 5.05f));  // 1080*1920 px
        layoutDescs_mLine.add(new LayoutDesc(8, 29.0f, 386.0f, LayoutDesc.NO_VALUE, 451.33f, 2.84f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mLine = mOverrideElementLayoutDescriptors.get("line");
            if (override_mLine != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mLine.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mLine = layoutDescs;
                }
            }
        }
        applyLayoutToView(mLine, dm, layoutDescs_mLine, true, true);

        ArrayList<LayoutDesc> layoutDescs_mLineCopy = new ArrayList<LayoutDesc>();
        layoutDescs_mLineCopy.add(new LayoutDesc(10, 46.0f, 430.0f, LayoutDesc.NO_VALUE, 636.43f, 4.0f));  // 720*1280 px
        layoutDescs_mLineCopy.add(new LayoutDesc(2, 20.0f, 187.0f, LayoutDesc.NO_VALUE, 276.63f, 1.74f));  // 240*320 px
        layoutDescs_mLineCopy.add(new LayoutDesc(12, 58.0f, 543.0f, LayoutDesc.NO_VALUE, 802.73f, 5.05f));  // 1080*1920 px
        layoutDescs_mLineCopy.add(new LayoutDesc(8, 33.0f, 305.0f, LayoutDesc.NO_VALUE, 451.33f, 2.84f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mLineCopy = mOverrideElementLayoutDescriptors.get("lineCopy");
            if (override_mLineCopy != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mLineCopy.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mLineCopy = layoutDescs;
                }
            }
        }
        applyLayoutToView(mLineCopy, dm, layoutDescs_mLineCopy, true, true);

        ArrayList<LayoutDesc> layoutDescs_mLineCopy2 = new ArrayList<LayoutDesc>();
        layoutDescs_mLineCopy2.add(new LayoutDesc(10, 42.0f, 544.0f, LayoutDesc.NO_VALUE, 636.43f, 4.0f));  // 720*1280 px
        layoutDescs_mLineCopy2.add(new LayoutDesc(2, 18.0f, 236.0f, LayoutDesc.NO_VALUE, 276.63f, 1.74f));  // 240*320 px
        layoutDescs_mLineCopy2.add(new LayoutDesc(12, 52.0f, 686.0f, LayoutDesc.NO_VALUE, 802.73f, 5.05f));  // 1080*1920 px
        layoutDescs_mLineCopy2.add(new LayoutDesc(8, 29.0f, 386.0f, LayoutDesc.NO_VALUE, 451.33f, 2.84f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mLineCopy2 = mOverrideElementLayoutDescriptors.get("lineCopy2");
            if (override_mLineCopy2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mLineCopy2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mLineCopy2 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mLineCopy2, dm, layoutDescs_mLineCopy2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mLineCopy3 = new ArrayList<LayoutDesc>();
        layoutDescs_mLineCopy3.add(new LayoutDesc(10, 46.0f, 679.0f, LayoutDesc.NO_VALUE, 636.43f, 4.0f));  // 720*1280 px
        layoutDescs_mLineCopy3.add(new LayoutDesc(2, 20.0f, 295.0f, LayoutDesc.NO_VALUE, 276.63f, 1.74f));  // 240*320 px
        layoutDescs_mLineCopy3.add(new LayoutDesc(12, 58.0f, 857.0f, LayoutDesc.NO_VALUE, 802.73f, 5.05f));  // 1080*1920 px
        layoutDescs_mLineCopy3.add(new LayoutDesc(8, 33.0f, 481.0f, LayoutDesc.NO_VALUE, 451.33f, 2.84f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mLineCopy3 = mOverrideElementLayoutDescriptors.get("lineCopy3");
            if (override_mLineCopy3 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mLineCopy3.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mLineCopy3 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mLineCopy3, dm, layoutDescs_mLineCopy3, true, true);

        ArrayList<LayoutDesc> layoutDescs_mLineCopy4 = new ArrayList<LayoutDesc>();
        layoutDescs_mLineCopy4.add(new LayoutDesc(10, 46.0f, 814.0f, LayoutDesc.NO_VALUE, 636.43f, 4.0f));  // 720*1280 px
        layoutDescs_mLineCopy4.add(new LayoutDesc(2, 20.0f, 354.0f, LayoutDesc.NO_VALUE, 276.63f, 1.74f));  // 240*320 px
        layoutDescs_mLineCopy4.add(new LayoutDesc(12, 58.0f, 1028.0f, LayoutDesc.NO_VALUE, 802.73f, 5.05f));  // 1080*1920 px
        layoutDescs_mLineCopy4.add(new LayoutDesc(8, 33.0f, 578.0f, LayoutDesc.NO_VALUE, 451.33f, 2.84f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mLineCopy4 = mOverrideElementLayoutDescriptors.get("lineCopy4");
            if (override_mLineCopy4 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mLineCopy4.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mLineCopy4 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mLineCopy4, dm, layoutDescs_mLineCopy4, true, true);

        ArrayList<LayoutDesc> layoutDescs_mButton = new ArrayList<LayoutDesc>();
        layoutDescs_mButton.add(new LayoutDesc(10, 190.0f, 906.0f, LayoutDesc.NO_VALUE, 333.63f, 101.52f));  // 720*1280 px
        layoutDescs_mButton.add(new LayoutDesc(2, 82.0f, 393.0f, LayoutDesc.NO_VALUE, 145.01f, 44.12f));  // 240*320 px
        layoutDescs_mButton.add(new LayoutDesc(12, 239.0f, 1143.0f, LayoutDesc.NO_VALUE, 420.81f, 128.04f));  // 1080*1920 px
        layoutDescs_mButton.add(new LayoutDesc(8, 135.0f, 642.0f, LayoutDesc.NO_VALUE, 236.60f, 71.99f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mButton = mOverrideElementLayoutDescriptors.get("button");
            if (override_mButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mButton = layoutDescs;
                }
            }
        }
        applyLayoutToView(mButton, dm, layoutDescs_mButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mButton2 = new ArrayList<LayoutDesc>();
        layoutDescs_mButton2.add(new LayoutDesc(10, 38.0f, 1005.0f, LayoutDesc.NO_VALUE, 641.73f, 94.84f));  // 720*1280 px
        layoutDescs_mButton2.add(new LayoutDesc(2, 17.0f, 437.0f, LayoutDesc.NO_VALUE, 278.93f, 41.22f));  // 240*320 px
        layoutDescs_mButton2.add(new LayoutDesc(12, 48.0f, 1268.0f, LayoutDesc.NO_VALUE, 809.41f, 119.62f));  // 1080*1920 px
        layoutDescs_mButton2.add(new LayoutDesc(8, 27.0f, 712.0f, LayoutDesc.NO_VALUE, 455.08f, 67.26f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mButton2 = mOverrideElementLayoutDescriptors.get("button2");
            if (override_mButton2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mButton2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mButton2 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mButton2, dm, layoutDescs_mButton2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mField3 = new ArrayList<LayoutDesc>();
        layoutDescs_mField3.add(new LayoutDesc(10, 38.0f, 612.0f, LayoutDesc.NO_VALUE, 639.43f, 63.76f));  // 720*1280 px
        layoutDescs_mField3.add(new LayoutDesc(2, 17.0f, 266.0f, LayoutDesc.NO_VALUE, 277.93f, 27.71f));  // 240*320 px
        layoutDescs_mField3.add(new LayoutDesc(12, 48.0f, 773.0f, LayoutDesc.NO_VALUE, 806.51f, 80.41f));  // 1080*1920 px
        layoutDescs_mField3.add(new LayoutDesc(8, 27.0f, 434.0f, LayoutDesc.NO_VALUE, 453.45f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mField3 = mOverrideElementLayoutDescriptors.get("field3");
            if (override_mField3 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mField3.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mField3 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mField3, dm, layoutDescs_mField3, true, false);

        ArrayList<LayoutDesc> layoutDescs_mField4 = new ArrayList<LayoutDesc>();
        layoutDescs_mField4.add(new LayoutDesc(10, 43.0f, 747.0f, LayoutDesc.NO_VALUE, 635.39f, 63.76f));  // 720*1280 px
        layoutDescs_mField4.add(new LayoutDesc(2, 19.0f, 325.0f, LayoutDesc.NO_VALUE, 276.17f, 27.71f));  // 240*320 px
        layoutDescs_mField4.add(new LayoutDesc(12, 54.0f, 943.0f, LayoutDesc.NO_VALUE, 801.41f, 80.41f));  // 1080*1920 px
        layoutDescs_mField4.add(new LayoutDesc(8, 30.0f, 530.0f, LayoutDesc.NO_VALUE, 450.59f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mField4 = mOverrideElementLayoutDescriptors.get("field4");
            if (override_mField4 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mField4.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mField4 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mField4, dm, layoutDescs_mField4, true, false);

    }

    private static void applyFadeMaskToTextView(final TextView textView) {
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (android.os.Build.VERSION.SDK_INT >= 16) {
                    textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    textView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
                
                if (textView.getLineCount() * textView.getLineHeight() > textView.getHeight()) {
                    ViewGroup.LayoutParams lp = textView.getLayoutParams();
                    android.graphics.LinearGradient linearGradient = new android.graphics.LinearGradient(0, lp.height * 0.5f, 0, lp.height,
                            new int[]{textView.getPaint().getColor(), android.graphics.Color.TRANSPARENT},
                            null, android.graphics.Shader.TileMode.CLAMP);
                    textView.getPaint().setShader(linearGradient);
                }
            }
        });
    }

}
