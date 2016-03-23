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

public class MyInfoFragment extends Fragment {

    private MyInfoBackgroundShapeView mBackgroundShape;
    private MyInfoImageView mImage;
    private MyInfoImage3View mImage3;
    private TextView mText2;
    private TextView mText3;
    private Button mButton;
    private MyInfoRectangleView mRectangle;
    private MyInfoRectangle2View mRectangle2;
    private TextView mText4;
    private TextView mText5;
    private TextView mText6;
    private MyInfoRectangle3View mRectangle3;
    private TextView mText7;
    private MyInfoRectangle4View mRectangle4;
    private TextView mText8;
    private MyInfoRectangleCopyView mRectangleCopy;
    private TextView mText;
    private MyInfoRectangleCopy2View mRectangleCopy2;
    private TextView mText10;
    private MyInfoRectangleCopy3View mRectangleCopy3;
    private TextView mText11;
    private MyInfoRectangleCopy4View mRectangleCopy4;
    private TextView mText12;
    private MyInfoImageCopyView mImageCopy;
    private TextView mText15;
    private TextView mText14;
    private TextView mText16;
    private TextView mText17;
    private Button mHotspot;
    private MyInfoImage4View mImage4;
    private TextView mText18;
    private TextView mText1;
    private TextView mText20;
    private TextView mText21;
    private Button mHotspot2;
    private MyInfoImage2View mImage2;
    private ImageButton mIconButton;
    private TextView mText9;
    private ScrollView mFlowScrollView;

    public MyInfoFragment() {  // fragment must have a constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_my_info, container, false);
                
        mBackgroundShape = (MyInfoBackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mImage = (MyInfoImageView) rootView.findViewById(R.id.mImage);
        mImage3 = (MyInfoImage3View) rootView.findViewById(R.id.mImage3);
        mText2 = (TextView) rootView.findViewById(R.id.mText2);
        mText3 = (TextView) rootView.findViewById(R.id.mText3);
        mButton = (Button) rootView.findViewById(R.id.mButton);
        mRectangle = (MyInfoRectangleView) rootView.findViewById(R.id.mRectangle);
        mRectangle2 = (MyInfoRectangle2View) rootView.findViewById(R.id.mRectangle2);
        mText4 = (TextView) rootView.findViewById(R.id.mText4);
        mText5 = (TextView) rootView.findViewById(R.id.mText5);
        mText6 = (TextView) rootView.findViewById(R.id.mText6);
        mRectangle3 = (MyInfoRectangle3View) rootView.findViewById(R.id.mRectangle3);
        mText7 = (TextView) rootView.findViewById(R.id.mText7);
        mRectangle4 = (MyInfoRectangle4View) rootView.findViewById(R.id.mRectangle4);
        mText8 = (TextView) rootView.findViewById(R.id.mText8);
        mRectangleCopy = (MyInfoRectangleCopyView) rootView.findViewById(R.id.mRectangleCopy);
        mText = (TextView) rootView.findViewById(R.id.mText);
        mRectangleCopy2 = (MyInfoRectangleCopy2View) rootView.findViewById(R.id.mRectangleCopy2);
        mText10 = (TextView) rootView.findViewById(R.id.mText10);
        mRectangleCopy3 = (MyInfoRectangleCopy3View) rootView.findViewById(R.id.mRectangleCopy3);
        mText11 = (TextView) rootView.findViewById(R.id.mText11);
        mRectangleCopy4 = (MyInfoRectangleCopy4View) rootView.findViewById(R.id.mRectangleCopy4);
        mText12 = (TextView) rootView.findViewById(R.id.mText12);
        mImageCopy = (MyInfoImageCopyView) rootView.findViewById(R.id.mImageCopy);
        mText15 = (TextView) rootView.findViewById(R.id.mText15);
        mText14 = (TextView) rootView.findViewById(R.id.mText14);
        mText16 = (TextView) rootView.findViewById(R.id.mText16);
        mText17 = (TextView) rootView.findViewById(R.id.mText17);
        mHotspot = (Button) rootView.findViewById(R.id.mHotspot);
        mImage4 = (MyInfoImage4View) rootView.findViewById(R.id.mImage4);
        mText18 = (TextView) rootView.findViewById(R.id.mText18);
        mText1 = (TextView) rootView.findViewById(R.id.mText1);
        mText20 = (TextView) rootView.findViewById(R.id.mText20);
        mText21 = (TextView) rootView.findViewById(R.id.mText21);
        mHotspot2 = (Button) rootView.findViewById(R.id.mHotspot2);
        mImage2 = (MyInfoImage2View) rootView.findViewById(R.id.mImage2);
        mIconButton = (ImageButton) rootView.findViewById(R.id.mIconButton);
        mText9 = (TextView) rootView.findViewById(R.id.mText9);
        final MyInfoFragment fragment = this;

        final Context context = getActivity().getBaseContext();
        
        

        

        
        mButton.setTransformationMethod(null);

        

        

        

        

        

        

        

        

        

        

        

        

        

        
        mHotspot.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OppDetail1Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                getActivity().startActivity(intent);
        
           }
        });

        

        

        

        

        
        mHotspot2.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OppDetail2Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                getActivity().startActivity(intent);
        
           }
        });

        
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

        ArrayList<LayoutDesc> layoutDescs_mImage = new ArrayList<LayoutDesc>();
        layoutDescs_mImage.add(new LayoutDesc(10, 0.0f, 155.0f, LayoutDesc.NO_VALUE, 737.0f, 432.0f));  // 720*1280 px
        layoutDescs_mImage.add(new LayoutDesc(2, 0.0f, 67.0f, LayoutDesc.NO_VALUE, 320.0f, 188.0f));  // 240*320 px
        layoutDescs_mImage.add(new LayoutDesc(12, 0.0f, 195.0f, LayoutDesc.NO_VALUE, 929.0f, 544.0f));  // 1080*1920 px
        layoutDescs_mImage.add(new LayoutDesc(8, 0.0f, 110.0f, LayoutDesc.NO_VALUE, 523.0f, 306.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mImage = mOverrideElementLayoutDescriptors.get("image");
            if (override_mImage != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mImage.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mImage = layoutDescs;
                }
            }
        }
        layoutDescs_mImage.get(0).contentTransformMatricesString = "[0.719726562, 0.0, 0.0, 0.719726562, 0.0, -60.375]; [0.719726562, 0.0, 0.0, 0.719726562, 0.0, -60.375]";
        layoutDescs_mImage.get(1).contentTransformMatricesString = "[0.312500000, 0.0, 0.0, 0.312500000, 0.0, -26.0]; [0.312500000, 0.0, 0.0, 0.312500000, 0.0, -26.0]";
        layoutDescs_mImage.get(2).contentTransformMatricesString = "[0.907226562, 0.0, 0.0, 0.907226562, 0.0, -76.375]; [0.907226562, 0.0, 0.0, 0.907226562, 0.0, -76.375]";
        layoutDescs_mImage.get(3).contentTransformMatricesString = "[0.510742188, 0.0, 0.0, 0.510742188, 0.0, -43.125]; [0.510742188, 0.0, 0.0, 0.510742188, 0.0, -43.125]";
        layoutDescs_mImage.get(0).offsetInFlow = 154.90f;
        layoutDescs_mImage.get(1).offsetInFlow = 67.33f;
        layoutDescs_mImage.get(2).offsetInFlow = 195.37f;
        layoutDescs_mImage.get(3).offsetInFlow = 109.84f;
        applyLayoutToView(mImage, dm, layoutDescs_mImage, true, true);

        ArrayList<LayoutDesc> layoutDescs_mImage3 = new ArrayList<LayoutDesc>();
        layoutDescs_mImage3.add(new LayoutDesc(10, 0.0f, 177.0f, LayoutDesc.NO_VALUE, 260.0f, 248.0f));  // 720*1280 px
        layoutDescs_mImage3.add(new LayoutDesc(2, 0.0f, 77.0f, LayoutDesc.NO_VALUE, 113.0f, 108.0f));  // 240*320 px
        layoutDescs_mImage3.add(new LayoutDesc(12, 0.0f, 222.0f, LayoutDesc.NO_VALUE, 328.0f, 313.0f));  // 1080*1920 px
        layoutDescs_mImage3.add(new LayoutDesc(8, 0.0f, 125.0f, LayoutDesc.NO_VALUE, 185.0f, 176.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mImage3 = mOverrideElementLayoutDescriptors.get("image3");
            if (override_mImage3 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mImage3.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mImage3 = layoutDescs;
                }
            }
        }
        layoutDescs_mImage3.get(0).contentTransformMatricesString = "[0.911764706, 0.0, 0.0, 0.911764706, -35.029411765, 0.0]; [0.911764706, 0.0, 0.0, 0.911764706, -35.029411765, 0.0]";
        layoutDescs_mImage3.get(1).contentTransformMatricesString = "[0.397058824, 0.0, 0.0, 0.397058824, -15.367647059, 0.0]; [0.397058824, 0.0, 0.0, 0.397058824, -15.367647059, 0.0]";
        layoutDescs_mImage3.get(2).contentTransformMatricesString = "[1.150735294, 0.0, 0.0, 1.150735294, -44.283088235, 0.0]; [1.150735294, 0.0, 0.0, 1.150735294, -44.283088235, 0.0]";
        layoutDescs_mImage3.get(3).contentTransformMatricesString = "[0.647058824, 0.0, 0.0, 0.647058824, -24.617647059, 0.0]; [0.647058824, 0.0, 0.0, 0.647058824, -24.617647059, 0.0]";
        layoutDescs_mImage3.get(0).offsetInFlow = -410.12f;
        layoutDescs_mImage3.get(1).offsetInFlow = -178.26f;
        layoutDescs_mImage3.get(2).offsetInFlow = -517.28f;
        layoutDescs_mImage3.get(3).offsetInFlow = -290.84f;
        applyLayoutToView(mImage3, dm, layoutDescs_mImage3, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText2 = new ArrayList<LayoutDesc>();
        layoutDescs_mText2.add(new LayoutDesc(10, 0.0f, 425.0f, LayoutDesc.NO_VALUE, 714.82f, 63.0f));  // 720*1280 px
        layoutDescs_mText2.add(new LayoutDesc(2, 0.0f, 185.0f, LayoutDesc.NO_VALUE, 310.70f, 30.0f));  // 240*320 px
        layoutDescs_mText2.add(new LayoutDesc(12, 0.0f, 535.0f, LayoutDesc.NO_VALUE, 901.6f, 77.0f));  // 1080*1920 px
        layoutDescs_mText2.add(new LayoutDesc(8, 0.0f, 301.0f, LayoutDesc.NO_VALUE, 506.92f, 46.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText2 = mOverrideElementLayoutDescriptors.get("text2");
            if (override_mText2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText2 = layoutDescs;
                }
            }
        }
        layoutDescs_mText2.get(0).offsetInFlow = 0.0f;
        layoutDescs_mText2.get(1).offsetInFlow = 0.0f;
        layoutDescs_mText2.get(2).offsetInFlow = 0.0f;
        layoutDescs_mText2.get(3).offsetInFlow = 0.0f;
        applyLayoutToView(mText2, dm, layoutDescs_mText2, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText3 = new ArrayList<LayoutDesc>();
        layoutDescs_mText3.add(new LayoutDesc(10, 0.0f, 482.0f, LayoutDesc.NO_VALUE, 721.17f, 45.0f));  // 720*1280 px
        layoutDescs_mText3.add(new LayoutDesc(2, 0.0f, 209.0f, LayoutDesc.NO_VALUE, 313.46f, 24.0f));  // 240*320 px
        layoutDescs_mText3.add(new LayoutDesc(12, 0.0f, 606.0f, LayoutDesc.NO_VALUE, 909.61f, 55.0f));  // 1080*1920 px
        layoutDescs_mText3.add(new LayoutDesc(8, 0.0f, 341.0f, LayoutDesc.NO_VALUE, 511.42f, 34.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText3 = mOverrideElementLayoutDescriptors.get("text3");
            if (override_mText3 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText3.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText3 = layoutDescs;
                }
            }
        }
        layoutDescs_mText3.get(0).offsetInFlow = 0.0f;
        layoutDescs_mText3.get(1).offsetInFlow = 0.0f;
        layoutDescs_mText3.get(2).offsetInFlow = 0.0f;
        layoutDescs_mText3.get(3).offsetInFlow = 0.0f;
        applyLayoutToView(mText3, dm, layoutDescs_mText3, true, false);

        ArrayList<LayoutDesc> layoutDescs_mButton = new ArrayList<LayoutDesc>();
        layoutDescs_mButton.add(new LayoutDesc(10, 0.0f, 525.0f, LayoutDesc.NO_VALUE, 105.72f, 39.04f));  // 720*1280 px
        layoutDescs_mButton.add(new LayoutDesc(2, 0.0f, 229.0f, LayoutDesc.NO_VALUE, 45.95f, 16.97f));  // 240*320 px
        layoutDescs_mButton.add(new LayoutDesc(12, 0.0f, 660.0f, LayoutDesc.NO_VALUE, 133.34f, 49.24f));  // 1080*1920 px
        layoutDescs_mButton.add(new LayoutDesc(8, 0.0f, 372.0f, LayoutDesc.NO_VALUE, 74.97f, 27.69f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mButton = mOverrideElementLayoutDescriptors.get("button");
            if (override_mButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mButton = layoutDescs;
                }
            }
        }
        layoutDescs_mButton.get(0).offsetInFlow = 4.25f;
        layoutDescs_mButton.get(1).offsetInFlow = 1.85f;
        layoutDescs_mButton.get(2).offsetInFlow = 5.36f;
        layoutDescs_mButton.get(3).offsetInFlow = 3.01f;
        applyLayoutToView(mButton, dm, layoutDescs_mButton, false, true);

        ArrayList<LayoutDesc> layoutDescs_mRectangle = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangle.add(new LayoutDesc(10, 0.0f, 585.04f, LayoutDesc.NO_VALUE, 643.0f, 91.0f));  // 720*1280 px
        layoutDescs_mRectangle.add(new LayoutDesc(2, 0.0f, 254.97f, LayoutDesc.NO_VALUE, 279.48f, 39.55f));  // 240*320 px
        layoutDescs_mRectangle.add(new LayoutDesc(12, 0.0f, 736.24f, LayoutDesc.NO_VALUE, 811.01f, 114.78f));  // 1080*1920 px
        layoutDescs_mRectangle.add(new LayoutDesc(8, 0.0f, 414.69f, LayoutDesc.NO_VALUE, 455.98f, 64.53f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRectangle = mOverrideElementLayoutDescriptors.get("rectangle");
            if (override_mRectangle != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRectangle.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRectangle = layoutDescs;
                }
            }
        }
        layoutDescs_mRectangle.get(0).offsetInFlow = 21.25f;
        layoutDescs_mRectangle.get(1).offsetInFlow = 9.24f;
        layoutDescs_mRectangle.get(2).offsetInFlow = 26.81f;
        layoutDescs_mRectangle.get(3).offsetInFlow = 15.07f;
        applyLayoutToView(mRectangle, dm, layoutDescs_mRectangle, true, true);

        ArrayList<LayoutDesc> layoutDescs_mRectangle2 = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangle2.add(new LayoutDesc(10, 0.0f, 587.04f, LayoutDesc.NO_VALUE, 213.0f, 84.86f));  // 720*1280 px
        layoutDescs_mRectangle2.add(new LayoutDesc(2, 0.0f, 255.52f, LayoutDesc.NO_VALUE, 92.58f, 36.88f));  // 240*320 px
        layoutDescs_mRectangle2.add(new LayoutDesc(12, 0.0f, 738.02f, LayoutDesc.NO_VALUE, 268.66f, 107.03f));  // 1080*1920 px
        layoutDescs_mRectangle2.add(new LayoutDesc(8, 0.0f, 416.22f, LayoutDesc.NO_VALUE, 151.05f, 60.18f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRectangle2 = mOverrideElementLayoutDescriptors.get("rectangle2");
            if (override_mRectangle2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRectangle2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRectangle2 = layoutDescs;
                }
            }
        }
        layoutDescs_mRectangle2.get(0).offsetInFlow = -89.26f;
        layoutDescs_mRectangle2.get(1).offsetInFlow = -38.80f;
        layoutDescs_mRectangle2.get(2).offsetInFlow = -112.58f;
        layoutDescs_mRectangle2.get(3).offsetInFlow = -63.30f;
        applyLayoutToView(mRectangle2, dm, layoutDescs_mRectangle2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText4 = new ArrayList<LayoutDesc>();
        layoutDescs_mText4.add(new LayoutDesc(10, 0.0f, 671.90f, LayoutDesc.NO_VALUE, 246.15f, 56.0f));  // 720*1280 px
        layoutDescs_mText4.add(new LayoutDesc(2, 0.0f, 292.41f, LayoutDesc.NO_VALUE, 106.99f, 28.0f));  // 240*320 px
        layoutDescs_mText4.add(new LayoutDesc(12, 0.0f, 845.05f, LayoutDesc.NO_VALUE, 310.47f, 70.0f));  // 1080*1920 px
        layoutDescs_mText4.add(new LayoutDesc(8, 0.0f, 476.40f, LayoutDesc.NO_VALUE, 174.56f, 41.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText4 = mOverrideElementLayoutDescriptors.get("text4");
            if (override_mText4 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText4.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText4 = layoutDescs;
                }
            }
        }
        layoutDescs_mText4.get(0).offsetInFlow = 0.0f;
        layoutDescs_mText4.get(1).offsetInFlow = 0.0f;
        layoutDescs_mText4.get(2).offsetInFlow = 0.0f;
        layoutDescs_mText4.get(3).offsetInFlow = 0.0f;
        applyLayoutToView(mText4, dm, layoutDescs_mText4, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText5 = new ArrayList<LayoutDesc>();
        layoutDescs_mText5.add(new LayoutDesc(10, 0.0f, 672.90f, LayoutDesc.NO_VALUE, 296.80f, 56.0f));  // 720*1280 px
        layoutDescs_mText5.add(new LayoutDesc(2, 0.0f, 293.41f, LayoutDesc.NO_VALUE, 129.01f, 28.0f));  // 240*320 px
        layoutDescs_mText5.add(new LayoutDesc(12, 0.0f, 847.05f, LayoutDesc.NO_VALUE, 374.36f, 70.0f));  // 1080*1920 px
        layoutDescs_mText5.add(new LayoutDesc(8, 0.0f, 476.40f, LayoutDesc.NO_VALUE, 210.48f, 41.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText5 = mOverrideElementLayoutDescriptors.get("text5");
            if (override_mText5 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText5.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText5 = layoutDescs;
                }
            }
        }
        layoutDescs_mText5.get(0).offsetInFlow = -49.46f;
        layoutDescs_mText5.get(1).offsetInFlow = -21.50f;
        layoutDescs_mText5.get(2).offsetInFlow = -62.38f;
        layoutDescs_mText5.get(3).offsetInFlow = -35.07f;
        applyLayoutToView(mText5, dm, layoutDescs_mText5, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText6 = new ArrayList<LayoutDesc>();
        layoutDescs_mText6.add(new LayoutDesc(10, 0.0f, 734.90f, LayoutDesc.NO_VALUE, 718.52f, 63.0f));  // 720*1280 px
        layoutDescs_mText6.add(new LayoutDesc(2, 0.0f, 320.41f, LayoutDesc.NO_VALUE, 312.31f, 30.0f));  // 240*320 px
        layoutDescs_mText6.add(new LayoutDesc(12, 0.0f, 926.05f, LayoutDesc.NO_VALUE, 906.27f, 77.0f));  // 1080*1920 px
        layoutDescs_mText6.add(new LayoutDesc(8, 0.0f, 519.40f, LayoutDesc.NO_VALUE, 509.54f, 46.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText6 = mOverrideElementLayoutDescriptors.get("text6");
            if (override_mText6 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText6.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText6 = layoutDescs;
                }
            }
        }
        layoutDescs_mText6.get(0).offsetInFlow = 11.68f;
        layoutDescs_mText6.get(1).offsetInFlow = 5.07f;
        layoutDescs_mText6.get(2).offsetInFlow = 14.73f;
        layoutDescs_mText6.get(3).offsetInFlow = 8.28f;
        applyLayoutToView(mText6, dm, layoutDescs_mText6, true, false);

        ArrayList<LayoutDesc> layoutDescs_mRectangle3 = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangle3.add(new LayoutDesc(10, 0.0f, 791.90f, LayoutDesc.NO_VALUE, 638.41f, 506.23f));  // 720*1280 px
        layoutDescs_mRectangle3.add(new LayoutDesc(2, 0.0f, 344.41f, LayoutDesc.NO_VALUE, 277.49f, 220.03f));  // 240*320 px
        layoutDescs_mRectangle3.add(new LayoutDesc(12, 0.0f, 997.05f, LayoutDesc.NO_VALUE, 805.23f, 638.50f));  // 1080*1920 px
        layoutDescs_mRectangle3.add(new LayoutDesc(8, 0.0f, 559.40f, LayoutDesc.NO_VALUE, 452.73f, 358.99f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRectangle3 = mOverrideElementLayoutDescriptors.get("rectangle3");
            if (override_mRectangle3 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRectangle3.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRectangle3 = layoutDescs;
                }
            }
        }
        layoutDescs_mRectangle3.get(0).offsetInFlow = -0.03f;
        layoutDescs_mRectangle3.get(1).offsetInFlow = -0.01f;
        layoutDescs_mRectangle3.get(2).offsetInFlow = -0.03f;
        layoutDescs_mRectangle3.get(3).offsetInFlow = -0.02f;
        applyLayoutToView(mRectangle3, dm, layoutDescs_mRectangle3, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText7 = new ArrayList<LayoutDesc>();
        layoutDescs_mText7.add(new LayoutDesc(10, 0.0f, 793.13f, LayoutDesc.NO_VALUE, 446.29f, 45.0f));  // 720*1280 px
        layoutDescs_mText7.add(new LayoutDesc(2, 0.0f, 345.44f, LayoutDesc.NO_VALUE, 193.98f, 24.0f));  // 240*320 px
        layoutDescs_mText7.add(new LayoutDesc(12, 0.0f, 998.55f, LayoutDesc.NO_VALUE, 562.90f, 55.0f));  // 1080*1920 px
        layoutDescs_mText7.add(new LayoutDesc(8, 0.0f, 560.39f, LayoutDesc.NO_VALUE, 316.48f, 34.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText7 = mOverrideElementLayoutDescriptors.get("text7");
            if (override_mText7 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText7.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText7 = layoutDescs;
                }
            }
        }
        layoutDescs_mText7.get(0).offsetInFlow = -504.81f;
        layoutDescs_mText7.get(1).offsetInFlow = -219.42f;
        layoutDescs_mText7.get(2).offsetInFlow = -636.71f;
        layoutDescs_mText7.get(3).offsetInFlow = -357.99f;
        applyLayoutToView(mText7, dm, layoutDescs_mText7, true, false);

        ArrayList<LayoutDesc> layoutDescs_mRectangle4 = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangle4.add(new LayoutDesc(10, 0.0f, 836.13f, LayoutDesc.NO_VALUE, 295.0f, 37.0f));  // 720*1280 px
        layoutDescs_mRectangle4.add(new LayoutDesc(2, 0.0f, 365.44f, LayoutDesc.NO_VALUE, 128.22f, 16.08f));  // 240*320 px
        layoutDescs_mRectangle4.add(new LayoutDesc(12, 0.0f, 1052.55f, LayoutDesc.NO_VALUE, 372.08f, 46.67f));  // 1080*1920 px
        layoutDescs_mRectangle4.add(new LayoutDesc(8, 0.0f, 591.39f, LayoutDesc.NO_VALUE, 209.20f, 26.24f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRectangle4 = mOverrideElementLayoutDescriptors.get("rectangle4");
            if (override_mRectangle4 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRectangle4.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRectangle4 = layoutDescs;
                }
            }
        }
        layoutDescs_mRectangle4.get(0).offsetInFlow = 4.25f;
        layoutDescs_mRectangle4.get(1).offsetInFlow = 1.85f;
        layoutDescs_mRectangle4.get(2).offsetInFlow = 5.36f;
        layoutDescs_mRectangle4.get(3).offsetInFlow = 3.01f;
        applyLayoutToView(mRectangle4, dm, layoutDescs_mRectangle4, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText8 = new ArrayList<LayoutDesc>();
        layoutDescs_mText8.add(new LayoutDesc(10, 0.0f, 877.13f, LayoutDesc.NO_VALUE, 446.29f, 45.0f));  // 720*1280 px
        layoutDescs_mText8.add(new LayoutDesc(2, 0.0f, 383.52f, LayoutDesc.NO_VALUE, 193.98f, 24.0f));  // 240*320 px
        layoutDescs_mText8.add(new LayoutDesc(12, 0.0f, 1104.22f, LayoutDesc.NO_VALUE, 562.90f, 55.0f));  // 1080*1920 px
        layoutDescs_mText8.add(new LayoutDesc(8, 0.0f, 620.63f, LayoutDesc.NO_VALUE, 316.48f, 34.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText8 = mOverrideElementLayoutDescriptors.get("text8");
            if (override_mText8 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText8.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText8 = layoutDescs;
                }
            }
        }
        layoutDescs_mText8.get(0).offsetInFlow = 4.25f;
        layoutDescs_mText8.get(1).offsetInFlow = 1.85f;
        layoutDescs_mText8.get(2).offsetInFlow = 5.36f;
        layoutDescs_mText8.get(3).offsetInFlow = 3.01f;
        applyLayoutToView(mText8, dm, layoutDescs_mText8, true, false);

        ArrayList<LayoutDesc> layoutDescs_mRectangleCopy = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangleCopy.add(new LayoutDesc(10, 0.0f, 920.13f, LayoutDesc.NO_VALUE, 130.85f, 37.0f));  // 720*1280 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(2, 0.0f, 403.52f, LayoutDesc.NO_VALUE, 56.87f, 16.08f));  // 240*320 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(12, 0.0f, 1158.22f, LayoutDesc.NO_VALUE, 165.04f, 46.67f));  // 1080*1920 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(8, 0.0f, 651.63f, LayoutDesc.NO_VALUE, 92.79f, 26.24f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRectangleCopy = mOverrideElementLayoutDescriptors.get("rectangleCopy");
            if (override_mRectangleCopy != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRectangleCopy.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRectangleCopy = layoutDescs;
                }
            }
        }
        layoutDescs_mRectangleCopy.get(0).offsetInFlow = 4.25f;
        layoutDescs_mRectangleCopy.get(1).offsetInFlow = 1.85f;
        layoutDescs_mRectangleCopy.get(2).offsetInFlow = 5.36f;
        layoutDescs_mRectangleCopy.get(3).offsetInFlow = 3.01f;
        applyLayoutToView(mRectangleCopy, dm, layoutDescs_mRectangleCopy, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText = new ArrayList<LayoutDesc>();
        layoutDescs_mText.add(new LayoutDesc(10, 0.0f, 961.13f, LayoutDesc.NO_VALUE, 406.97f, 84.0f));  // 720*1280 px
        layoutDescs_mText.add(new LayoutDesc(2, 0.0f, 421.60f, LayoutDesc.NO_VALUE, 176.89f, 42.0f));  // 240*320 px
        layoutDescs_mText.add(new LayoutDesc(12, 0.0f, 1209.89f, LayoutDesc.NO_VALUE, 513.31f, 104.0f));  // 1080*1920 px
        layoutDescs_mText.add(new LayoutDesc(8, 0.0f, 680.86f, LayoutDesc.NO_VALUE, 288.60f, 62.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText = mOverrideElementLayoutDescriptors.get("text");
            if (override_mText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText = layoutDescs;
                }
            }
        }
        layoutDescs_mText.get(0).offsetInFlow = 4.25f;
        layoutDescs_mText.get(1).offsetInFlow = 1.85f;
        layoutDescs_mText.get(2).offsetInFlow = 5.36f;
        layoutDescs_mText.get(3).offsetInFlow = 3.01f;
        applyLayoutToView(mText, dm, layoutDescs_mText, true, false);

        ArrayList<LayoutDesc> layoutDescs_mRectangleCopy2 = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(10, 0.0f, 1043.13f, LayoutDesc.NO_VALUE, 192.47f, 37.0f));  // 720*1280 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(2, 0.0f, 459.60f, LayoutDesc.NO_VALUE, 83.66f, 16.08f));  // 240*320 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(12, 0.0f, 1312.89f, LayoutDesc.NO_VALUE, 242.76f, 46.67f));  // 1080*1920 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(8, 0.0f, 739.86f, LayoutDesc.NO_VALUE, 136.49f, 26.24f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRectangleCopy2 = mOverrideElementLayoutDescriptors.get("rectangleCopy2");
            if (override_mRectangleCopy2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRectangleCopy2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRectangleCopy2 = layoutDescs;
                }
            }
        }
        layoutDescs_mRectangleCopy2.get(0).offsetInFlow = 4.25f;
        layoutDescs_mRectangleCopy2.get(1).offsetInFlow = 1.85f;
        layoutDescs_mRectangleCopy2.get(2).offsetInFlow = 5.36f;
        layoutDescs_mRectangleCopy2.get(3).offsetInFlow = 3.01f;
        applyLayoutToView(mRectangleCopy2, dm, layoutDescs_mRectangleCopy2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText10 = new ArrayList<LayoutDesc>();
        layoutDescs_mText10.add(new LayoutDesc(10, 0.0f, 1084.13f, LayoutDesc.NO_VALUE, 446.29f, 84.0f));  // 720*1280 px
        layoutDescs_mText10.add(new LayoutDesc(2, 0.0f, 477.68f, LayoutDesc.NO_VALUE, 193.98f, 42.0f));  // 240*320 px
        layoutDescs_mText10.add(new LayoutDesc(12, 0.0f, 1364.56f, LayoutDesc.NO_VALUE, 562.90f, 104.0f));  // 1080*1920 px
        layoutDescs_mText10.add(new LayoutDesc(8, 0.0f, 769.10f, LayoutDesc.NO_VALUE, 316.48f, 62.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText10 = mOverrideElementLayoutDescriptors.get("text10");
            if (override_mText10 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText10.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText10 = layoutDescs;
                }
            }
        }
        layoutDescs_mText10.get(0).offsetInFlow = 4.25f;
        layoutDescs_mText10.get(1).offsetInFlow = 1.85f;
        layoutDescs_mText10.get(2).offsetInFlow = 5.36f;
        layoutDescs_mText10.get(3).offsetInFlow = 3.01f;
        applyLayoutToView(mText10, dm, layoutDescs_mText10, true, false);

        ArrayList<LayoutDesc> layoutDescs_mRectangleCopy3 = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(10, 0.0f, 1166.13f, LayoutDesc.NO_VALUE, 236.02f, 37.0f));  // 720*1280 px
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(2, 0.0f, 515.68f, LayoutDesc.NO_VALUE, 102.58f, 16.08f));  // 240*320 px
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(12, 0.0f, 1467.56f, LayoutDesc.NO_VALUE, 297.69f, 46.67f));  // 1080*1920 px
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(8, 0.0f, 828.10f, LayoutDesc.NO_VALUE, 167.37f, 26.24f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRectangleCopy3 = mOverrideElementLayoutDescriptors.get("rectangleCopy3");
            if (override_mRectangleCopy3 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRectangleCopy3.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRectangleCopy3 = layoutDescs;
                }
            }
        }
        layoutDescs_mRectangleCopy3.get(0).offsetInFlow = 4.25f;
        layoutDescs_mRectangleCopy3.get(1).offsetInFlow = 1.85f;
        layoutDescs_mRectangleCopy3.get(2).offsetInFlow = 5.36f;
        layoutDescs_mRectangleCopy3.get(3).offsetInFlow = 3.01f;
        applyLayoutToView(mRectangleCopy3, dm, layoutDescs_mRectangleCopy3, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText11 = new ArrayList<LayoutDesc>();
        layoutDescs_mText11.add(new LayoutDesc(10, 0.0f, 1207.13f, LayoutDesc.NO_VALUE, 446.29f, 45.0f));  // 720*1280 px
        layoutDescs_mText11.add(new LayoutDesc(2, 0.0f, 533.77f, LayoutDesc.NO_VALUE, 193.98f, 24.0f));  // 240*320 px
        layoutDescs_mText11.add(new LayoutDesc(12, 0.0f, 1519.22f, LayoutDesc.NO_VALUE, 562.90f, 55.0f));  // 1080*1920 px
        layoutDescs_mText11.add(new LayoutDesc(8, 0.0f, 857.34f, LayoutDesc.NO_VALUE, 316.48f, 34.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText11 = mOverrideElementLayoutDescriptors.get("text11");
            if (override_mText11 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText11.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText11 = layoutDescs;
                }
            }
        }
        layoutDescs_mText11.get(0).offsetInFlow = 4.25f;
        layoutDescs_mText11.get(1).offsetInFlow = 1.85f;
        layoutDescs_mText11.get(2).offsetInFlow = 5.36f;
        layoutDescs_mText11.get(3).offsetInFlow = 3.01f;
        applyLayoutToView(mText11, dm, layoutDescs_mText11, true, false);

        ArrayList<LayoutDesc> layoutDescs_mRectangleCopy4 = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(10, 0.0f, 1250.13f, LayoutDesc.NO_VALUE, 71.07f, 37.0f));  // 720*1280 px
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(2, 0.0f, 553.77f, LayoutDesc.NO_VALUE, 30.89f, 16.08f));  // 240*320 px
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(12, 0.0f, 1573.22f, LayoutDesc.NO_VALUE, 89.64f, 46.67f));  // 1080*1920 px
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(8, 0.0f, 888.34f, LayoutDesc.NO_VALUE, 50.4f, 26.24f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRectangleCopy4 = mOverrideElementLayoutDescriptors.get("rectangleCopy4");
            if (override_mRectangleCopy4 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRectangleCopy4.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRectangleCopy4 = layoutDescs;
                }
            }
        }
        layoutDescs_mRectangleCopy4.get(0).offsetInFlow = 4.25f;
        layoutDescs_mRectangleCopy4.get(1).offsetInFlow = 1.85f;
        layoutDescs_mRectangleCopy4.get(2).offsetInFlow = 5.36f;
        layoutDescs_mRectangleCopy4.get(3).offsetInFlow = 3.01f;
        applyLayoutToView(mRectangleCopy4, dm, layoutDescs_mRectangleCopy4, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText12 = new ArrayList<LayoutDesc>();
        layoutDescs_mText12.add(new LayoutDesc(10, 4.0f, 1312.13f, LayoutDesc.NO_VALUE, 717.44f, 51.0f));  // 720*1280 px
        layoutDescs_mText12.add(new LayoutDesc(2, 2.0f, 580.85f, LayoutDesc.NO_VALUE, 311.83f, 25.0f));  // 240*320 px
        layoutDescs_mText12.add(new LayoutDesc(12, 5.0f, 1650.89f, LayoutDesc.NO_VALUE, 904.90f, 63.0f));  // 1080*1920 px
        layoutDescs_mText12.add(new LayoutDesc(8, 3.0f, 931.58f, LayoutDesc.NO_VALUE, 508.77f, 38.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText12 = mOverrideElementLayoutDescriptors.get("text12");
            if (override_mText12 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText12.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText12 = layoutDescs;
                }
            }
        }
        layoutDescs_mText12.get(0).offsetInFlow = 24.5f;
        layoutDescs_mText12.get(1).offsetInFlow = 10.65f;
        layoutDescs_mText12.get(2).offsetInFlow = 30.90f;
        layoutDescs_mText12.get(3).offsetInFlow = 17.37f;
        applyLayoutToView(mText12, dm, layoutDescs_mText12, true, false);

        ArrayList<LayoutDesc> layoutDescs_mImageCopy = new ArrayList<LayoutDesc>();
        layoutDescs_mImageCopy.add(new LayoutDesc(10, 64.0f, 1384.13f, LayoutDesc.NO_VALUE, 256.0f, 145.0f));  // 720*1280 px
        layoutDescs_mImageCopy.add(new LayoutDesc(2, 28.0f, 611.85f, LayoutDesc.NO_VALUE, 111.0f, 63.0f));  // 240*320 px
        layoutDescs_mImageCopy.add(new LayoutDesc(12, 81.0f, 1741.89f, LayoutDesc.NO_VALUE, 322.0f, 182.0f));  // 1080*1920 px
        layoutDescs_mImageCopy.add(new LayoutDesc(8, 45.0f, 982.58f, LayoutDesc.NO_VALUE, 181.0f, 103.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mImageCopy = mOverrideElementLayoutDescriptors.get("imageCopy");
            if (override_mImageCopy != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mImageCopy.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mImageCopy = layoutDescs;
                }
            }
        }
        layoutDescs_mImageCopy.get(0).contentTransformMatricesString = "[0.2, 0.0, 0.0, 0.2, -67.8, 0.0]; [0.2, 0.0, 0.0, 0.2, -67.8, 0.0]";
        layoutDescs_mImageCopy.get(1).contentTransformMatricesString = "[0.086896552, 0.0, 0.0, 0.086896552, -29.571724138, 0.0]; [0.086896552, 0.0, 0.0, 0.086896552, -29.571724138, 0.0]";
        layoutDescs_mImageCopy.get(2).contentTransformMatricesString = "[0.251034483, 0.0, 0.0, 0.251034483, -84.762758621, 0.0]; [0.251034483, 0.0, 0.0, 0.251034483, -84.762758621, 0.0]";
        layoutDescs_mImageCopy.get(3).contentTransformMatricesString = "[0.142068966, 0.0, 0.0, 0.142068966, -48.585517241, 0.0]; [0.142068966, 0.0, 0.0, 0.142068966, -48.585517241, 0.0]";
        layoutDescs_mImageCopy.get(0).offsetInFlow = 27.22f;
        layoutDescs_mImageCopy.get(1).offsetInFlow = 11.83f;
        layoutDescs_mImageCopy.get(2).offsetInFlow = 34.33f;
        layoutDescs_mImageCopy.get(3).offsetInFlow = 19.30f;
        applyLayoutToView(mImageCopy, dm, layoutDescs_mImageCopy, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText15 = new ArrayList<LayoutDesc>();
        layoutDescs_mText15.add(new LayoutDesc(10, 64.0f, 1529.13f, LayoutDesc.NO_VALUE, 446.29f, 40.0f));  // 720*1280 px
        layoutDescs_mText15.add(new LayoutDesc(2, 28.0f, 674.85f, LayoutDesc.NO_VALUE, 193.98f, 21.0f));  // 240*320 px
        layoutDescs_mText15.add(new LayoutDesc(12, 80.0f, 1923.89f, LayoutDesc.NO_VALUE, 562.90f, 49.0f));  // 1080*1920 px
        layoutDescs_mText15.add(new LayoutDesc(8, 45.0f, 1085.58f, LayoutDesc.NO_VALUE, 316.48f, 30.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText15 = mOverrideElementLayoutDescriptors.get("text15");
            if (override_mText15 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText15.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText15 = layoutDescs;
                }
            }
        }
        layoutDescs_mText15.get(0).offsetInFlow = 0.0f;
        layoutDescs_mText15.get(1).offsetInFlow = 0.0f;
        layoutDescs_mText15.get(2).offsetInFlow = 0.0f;
        layoutDescs_mText15.get(3).offsetInFlow = 0.0f;
        applyLayoutToView(mText15, dm, layoutDescs_mText15, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText14 = new ArrayList<LayoutDesc>();
        layoutDescs_mText14.add(new LayoutDesc(10, 72.0f, 1563.13f, LayoutDesc.NO_VALUE, 252.86f, 84.0f));  // 720*1280 px
        layoutDescs_mText14.add(new LayoutDesc(2, 31.0f, 689.85f, LayoutDesc.NO_VALUE, 109.91f, 60.0f));  // 240*320 px
        layoutDescs_mText14.add(new LayoutDesc(12, 90.0f, 1966.89f, LayoutDesc.NO_VALUE, 318.93f, 104.0f));  // 1080*1920 px
        layoutDescs_mText14.add(new LayoutDesc(8, 51.0f, 1109.58f, LayoutDesc.NO_VALUE, 179.32f, 90.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText14 = mOverrideElementLayoutDescriptors.get("text14");
            if (override_mText14 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText14.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText14 = layoutDescs;
                }
            }
        }
        layoutDescs_mText14.get(0).offsetInFlow = 0.0f;
        layoutDescs_mText14.get(1).offsetInFlow = 0.0f;
        layoutDescs_mText14.get(2).offsetInFlow = 0.0f;
        layoutDescs_mText14.get(3).offsetInFlow = 0.0f;
        applyLayoutToView(mText14, dm, layoutDescs_mText14, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText16 = new ArrayList<LayoutDesc>();
        layoutDescs_mText16.add(new LayoutDesc(10, 74.0f, 1641.13f, LayoutDesc.NO_VALUE, 446.29f, 40.0f));  // 720*1280 px
        layoutDescs_mText16.add(new LayoutDesc(2, 32.0f, 743.85f, LayoutDesc.NO_VALUE, 193.98f, 21.0f));  // 240*320 px
        layoutDescs_mText16.add(new LayoutDesc(12, 94.0f, 2064.89f, LayoutDesc.NO_VALUE, 562.90f, 49.0f));  // 1080*1920 px
        layoutDescs_mText16.add(new LayoutDesc(8, 53.0f, 1193.58f, LayoutDesc.NO_VALUE, 316.48f, 30.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText16 = mOverrideElementLayoutDescriptors.get("text16");
            if (override_mText16 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText16.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText16 = layoutDescs;
                }
            }
        }
        layoutDescs_mText16.get(0).offsetInFlow = 0.0f;
        layoutDescs_mText16.get(1).offsetInFlow = 0.0f;
        layoutDescs_mText16.get(2).offsetInFlow = 0.0f;
        layoutDescs_mText16.get(3).offsetInFlow = 0.0f;
        applyLayoutToView(mText16, dm, layoutDescs_mText16, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText17 = new ArrayList<LayoutDesc>();
        layoutDescs_mText17.add(new LayoutDesc(10, 72.0f, 1675.13f, LayoutDesc.NO_VALUE, 258.78f, 40.0f));  // 720*1280 px
        layoutDescs_mText17.add(new LayoutDesc(2, 31.0f, 758.85f, LayoutDesc.NO_VALUE, 112.48f, 21.0f));  // 240*320 px
        layoutDescs_mText17.add(new LayoutDesc(12, 90.0f, 2107.89f, LayoutDesc.NO_VALUE, 326.39f, 49.0f));  // 1080*1920 px
        layoutDescs_mText17.add(new LayoutDesc(8, 51.0f, 1217.58f, LayoutDesc.NO_VALUE, 183.51f, 30.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText17 = mOverrideElementLayoutDescriptors.get("text17");
            if (override_mText17 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText17.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText17 = layoutDescs;
                }
            }
        }
        layoutDescs_mText17.get(0).offsetInFlow = 0.07f;
        layoutDescs_mText17.get(1).offsetInFlow = 0.03f;
        layoutDescs_mText17.get(2).offsetInFlow = 0.08f;
        layoutDescs_mText17.get(3).offsetInFlow = 0.05f;
        applyLayoutToView(mText17, dm, layoutDescs_mText17, true, false);

        ArrayList<LayoutDesc> layoutDescs_mHotspot = new ArrayList<LayoutDesc>();
        layoutDescs_mHotspot.add(new LayoutDesc(10, 51.0f, 1384.13f, LayoutDesc.NO_VALUE, 278.03f, 358.76f));  // 720*1280 px
        layoutDescs_mHotspot.add(new LayoutDesc(2, 22.0f, 632.85f, LayoutDesc.NO_VALUE, 120.85f, 155.93f));  // 240*320 px
        layoutDescs_mHotspot.add(new LayoutDesc(12, 64.0f, 1740.89f, LayoutDesc.NO_VALUE, 350.68f, 452.49f));  // 1080*1920 px
        layoutDescs_mHotspot.add(new LayoutDesc(8, 36.0f, 1011.58f, LayoutDesc.NO_VALUE, 197.16f, 254.41f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mHotspot = mOverrideElementLayoutDescriptors.get("hotspot");
            if (override_mHotspot != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mHotspot.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mHotspot = layoutDescs;
                }
            }
        }
        layoutDescs_mHotspot.get(0).offsetInFlow = -325.0f;
        layoutDescs_mHotspot.get(1).offsetInFlow = -141.26f;
        layoutDescs_mHotspot.get(2).offsetInFlow = -409.92f;
        layoutDescs_mHotspot.get(3).offsetInFlow = -230.48f;
        applyLayoutToView(mHotspot, dm, layoutDescs_mHotspot, true, true);

        ArrayList<LayoutDesc> layoutDescs_mImage4 = new ArrayList<LayoutDesc>();
        layoutDescs_mImage4.add(new LayoutDesc(10, 370.0f, 1384.88f, LayoutDesc.NO_VALUE, 256.0f, 145.0f));  // 720*1280 px
        layoutDescs_mImage4.add(new LayoutDesc(2, 161.0f, 632.78f, LayoutDesc.NO_VALUE, 111.0f, 63.0f));  // 240*320 px
        layoutDescs_mImage4.add(new LayoutDesc(12, 467.0f, 1741.39f, LayoutDesc.NO_VALUE, 322.0f, 182.0f));  // 1080*1920 px
        layoutDescs_mImage4.add(new LayoutDesc(8, 263.0f, 1011.99f, LayoutDesc.NO_VALUE, 181.0f, 103.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mImage4 = mOverrideElementLayoutDescriptors.get("image4");
            if (override_mImage4 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mImage4.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mImage4 = layoutDescs;
                }
            }
        }
        layoutDescs_mImage4.get(0).contentTransformMatricesString = "[0.137051040, 0.0, 0.0, 0.137051040, -0.827977316, 0.0]; [0.137051040, 0.0, 0.0, 0.137051040, -0.827977316, 0.0]";
        layoutDescs_mImage4.get(1).contentTransformMatricesString = "[0.059546314, 0.0, 0.0, 0.059546314, -0.473534972, 0.0]; [0.059546314, 0.0, 0.0, 0.059546314, -0.473534972, 0.0]";
        layoutDescs_mImage4.get(2).contentTransformMatricesString = "[0.172022684, 0.0, 0.0, 0.172022684, -0.701323251, 0.0]; [0.172022684, 0.0, 0.0, 0.172022684, -0.701323251, 0.0]";
        layoutDescs_mImage4.get(3).contentTransformMatricesString = "[0.097353497, 0.0, 0.0, 0.097353497, -1.012287335, 0.0]; [0.097353497, 0.0, 0.0, 0.097353497, -1.012287335, 0.0]";
        layoutDescs_mImage4.get(0).offsetInFlow = -358.29f;
        layoutDescs_mImage4.get(1).offsetInFlow = -155.73f;
        layoutDescs_mImage4.get(2).offsetInFlow = -451.90f;
        layoutDescs_mImage4.get(3).offsetInFlow = -254.08f;
        applyLayoutToView(mImage4, dm, layoutDescs_mImage4, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText18 = new ArrayList<LayoutDesc>();
        layoutDescs_mText18.add(new LayoutDesc(10, 367.0f, 1531.88f, LayoutDesc.NO_VALUE, 257.39f, 40.0f));  // 720*1280 px
        layoutDescs_mText18.add(new LayoutDesc(2, 160.0f, 696.78f, LayoutDesc.NO_VALUE, 111.87f, 21.0f));  // 240*320 px
        layoutDescs_mText18.add(new LayoutDesc(12, 463.0f, 1926.39f, LayoutDesc.NO_VALUE, 324.64f, 49.0f));  // 1080*1920 px
        layoutDescs_mText18.add(new LayoutDesc(8, 260.0f, 1116.99f, LayoutDesc.NO_VALUE, 182.53f, 30.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText18 = mOverrideElementLayoutDescriptors.get("text18");
            if (override_mText18 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText18.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText18 = layoutDescs;
                }
            }
        }
        layoutDescs_mText18.get(0).offsetInFlow = 2.20f;
        layoutDescs_mText18.get(1).offsetInFlow = 0.95f;
        layoutDescs_mText18.get(2).offsetInFlow = 2.77f;
        layoutDescs_mText18.get(3).offsetInFlow = 1.56f;
        applyLayoutToView(mText18, dm, layoutDescs_mText18, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText1 = new ArrayList<LayoutDesc>();
        layoutDescs_mText1.add(new LayoutDesc(10, 370.0f, 1565.88f, LayoutDesc.NO_VALUE, 254.80f, 84.0f));  // 720*1280 px
        layoutDescs_mText1.add(new LayoutDesc(2, 161.0f, 711.78f, LayoutDesc.NO_VALUE, 110.75f, 42.0f));  // 240*320 px
        layoutDescs_mText1.add(new LayoutDesc(12, 467.0f, 1969.39f, LayoutDesc.NO_VALUE, 321.37f, 104.0f));  // 1080*1920 px
        layoutDescs_mText1.add(new LayoutDesc(8, 262.0f, 1140.99f, LayoutDesc.NO_VALUE, 180.69f, 62.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText1 = mOverrideElementLayoutDescriptors.get("text1");
            if (override_mText1 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText1.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText1 = layoutDescs;
                }
            }
        }
        layoutDescs_mText1.get(0).offsetInFlow = 0.37f;
        layoutDescs_mText1.get(1).offsetInFlow = 0.16f;
        layoutDescs_mText1.get(2).offsetInFlow = 0.47f;
        layoutDescs_mText1.get(3).offsetInFlow = 0.27f;
        applyLayoutToView(mText1, dm, layoutDescs_mText1, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText20 = new ArrayList<LayoutDesc>();
        layoutDescs_mText20.add(new LayoutDesc(10, 373.0f, 1643.88f, LayoutDesc.NO_VALUE, 446.29f, 40.0f));  // 720*1280 px
        layoutDescs_mText20.add(new LayoutDesc(2, 162.0f, 747.78f, LayoutDesc.NO_VALUE, 193.98f, 21.0f));  // 240*320 px
        layoutDescs_mText20.add(new LayoutDesc(12, 470.0f, 2066.39f, LayoutDesc.NO_VALUE, 562.90f, 49.0f));  // 1080*1920 px
        layoutDescs_mText20.add(new LayoutDesc(8, 265.0f, 1196.99f, LayoutDesc.NO_VALUE, 316.48f, 30.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText20 = mOverrideElementLayoutDescriptors.get("text20");
            if (override_mText20 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText20.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText20 = layoutDescs;
                }
            }
        }
        layoutDescs_mText20.get(0).offsetInFlow = -0.46f;
        layoutDescs_mText20.get(1).offsetInFlow = -0.20f;
        layoutDescs_mText20.get(2).offsetInFlow = -0.59f;
        layoutDescs_mText20.get(3).offsetInFlow = -0.33f;
        applyLayoutToView(mText20, dm, layoutDescs_mText20, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText21 = new ArrayList<LayoutDesc>();
        layoutDescs_mText21.add(new LayoutDesc(10, 375.0f, 1682.88f, LayoutDesc.NO_VALUE, 260.01f, 40.0f));  // 720*1280 px
        layoutDescs_mText21.add(new LayoutDesc(2, 163.0f, 764.78f, LayoutDesc.NO_VALUE, 113.01f, 21.0f));  // 240*320 px
        layoutDescs_mText21.add(new LayoutDesc(12, 473.0f, 2116.39f, LayoutDesc.NO_VALUE, 327.95f, 49.0f));  // 1080*1920 px
        layoutDescs_mText21.add(new LayoutDesc(8, 266.0f, 1224.99f, LayoutDesc.NO_VALUE, 184.39f, 30.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText21 = mOverrideElementLayoutDescriptors.get("text21");
            if (override_mText21 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText21.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText21 = layoutDescs;
                }
            }
        }
        layoutDescs_mText21.get(0).offsetInFlow = 5.22f;
        layoutDescs_mText21.get(1).offsetInFlow = 2.27f;
        layoutDescs_mText21.get(2).offsetInFlow = 6.58f;
        layoutDescs_mText21.get(3).offsetInFlow = 3.70f;
        applyLayoutToView(mText21, dm, layoutDescs_mText21, true, false);

        ArrayList<LayoutDesc> layoutDescs_mHotspot2 = new ArrayList<LayoutDesc>();
        layoutDescs_mHotspot2.add(new LayoutDesc(10, 360.0f, 1381.88f, LayoutDesc.NO_VALUE, 267.12f, 349.76f));  // 720*1280 px
        layoutDescs_mHotspot2.add(new LayoutDesc(2, 156.0f, 633.78f, LayoutDesc.NO_VALUE, 116.10f, 152.02f));  // 240*320 px
        layoutDescs_mHotspot2.add(new LayoutDesc(12, 454.0f, 1736.39f, LayoutDesc.NO_VALUE, 336.92f, 441.14f));  // 1080*1920 px
        layoutDescs_mHotspot2.add(new LayoutDesc(8, 255.0f, 1010.99f, LayoutDesc.NO_VALUE, 189.43f, 248.03f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mHotspot2 = mOverrideElementLayoutDescriptors.get("hotspot2");
            if (override_mHotspot2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mHotspot2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mHotspot2 = layoutDescs;
                }
            }
        }
        layoutDescs_mHotspot2.get(0).offsetInFlow = -335.44f;
        layoutDescs_mHotspot2.get(1).offsetInFlow = -145.80f;
        layoutDescs_mHotspot2.get(2).offsetInFlow = -423.09f;
        layoutDescs_mHotspot2.get(3).offsetInFlow = -237.88f;
        applyLayoutToView(mHotspot2, dm, layoutDescs_mHotspot2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mImage2 = new ArrayList<LayoutDesc>();
        layoutDescs_mImage2.add(new LayoutDesc(10, 0.0f, -37.0f, LayoutDesc.NO_VALUE, 719.0f, 144.0f));  // 720*1280 px
        layoutDescs_mImage2.add(new LayoutDesc(2, 0.0f, -16.0f, LayoutDesc.NO_VALUE, 313.0f, 63.0f));  // 240*320 px
        layoutDescs_mImage2.add(new LayoutDesc(12, 0.0f, -47.0f, LayoutDesc.NO_VALUE, 906.0f, 182.0f));  // 1080*1920 px
        layoutDescs_mImage2.add(new LayoutDesc(8, 0.0f, -26.0f, LayoutDesc.NO_VALUE, 510.0f, 102.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mImage2 = mOverrideElementLayoutDescriptors.get("image2");
            if (override_mImage2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mImage2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mImage2 = layoutDescs;
                }
            }
        }
        layoutDescs_mImage2.get(0).contentTransformMatricesString = "[0.220281863, 0.0, 0.0, 0.220281863, 0.0, -197.625]; [0.220281863, 0.0, 0.0, 0.220281863, 0.0, -197.625]";
        layoutDescs_mImage2.get(1).contentTransformMatricesString = "[0.095894608, 0.0, 0.0, 0.095894608, 0.0, -85.875]; [0.095894608, 0.0, 0.0, 0.095894608, 0.0, -85.875]";
        layoutDescs_mImage2.get(2).contentTransformMatricesString = "[0.277573529, 0.0, 0.0, 0.277573529, 0.0, -248.750]; [0.277573529, 0.0, 0.0, 0.277573529, 0.0, -248.750]";
        layoutDescs_mImage2.get(3).contentTransformMatricesString = "[0.156250000, 0.0, 0.0, 0.156250000, 0.0, -140.250]; [0.156250000, 0.0, 0.0, 0.156250000, 0.0, -140.250]";
        applyLayoutToView(mImage2, dm, layoutDescs_mImage2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mIconButton = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton.add(new LayoutDesc(10, 10.0f, 30.0f, LayoutDesc.NO_VALUE, 59.50f, 72.55f));  // 720*1280 px
        layoutDescs_mIconButton.add(new LayoutDesc(2, 4.0f, 13.0f, LayoutDesc.NO_VALUE, 25.86f, 31.53f));  // 240*320 px
        layoutDescs_mIconButton.add(new LayoutDesc(12, 12.0f, 38.0f, LayoutDesc.NO_VALUE, 75.05f, 91.50f));  // 1080*1920 px
        layoutDescs_mIconButton.add(new LayoutDesc(8, 7.0f, 21.0f, LayoutDesc.NO_VALUE, 42.20f, 51.45f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mText9 = new ArrayList<LayoutDesc>();
        layoutDescs_mText9.add(new LayoutDesc(10, 271.0f, 37.0f, LayoutDesc.NO_VALUE, 445.74f, 63.0f));  // 720*1280 px
        layoutDescs_mText9.add(new LayoutDesc(2, 118.0f, 16.0f, LayoutDesc.NO_VALUE, 193.74f, 30.0f));  // 240*320 px
        layoutDescs_mText9.add(new LayoutDesc(12, 341.0f, 48.0f, LayoutDesc.NO_VALUE, 562.21f, 77.0f));  // 1080*1920 px
        layoutDescs_mText9.add(new LayoutDesc(8, 192.0f, 26.0f, LayoutDesc.NO_VALUE, 316.10f, 46.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText9 = mOverrideElementLayoutDescriptors.get("text");
            if (override_mText9 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText9.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText9 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mText9, dm, layoutDescs_mText9, true, false);

        ArrayList<LayoutDesc> layoutDescs_mFlowScrollView = new ArrayList<LayoutDesc>();
        layoutDescs_mFlowScrollView.add(new LayoutDesc(10, 0.0f, -48.0f, 0.0f, 720.0f, 1328.0f));  // 720*1280 px
        layoutDescs_mFlowScrollView.add(new LayoutDesc(2, 0.0f, -21.0f, 0.0f, 240.0f, 341.0f));  // 240*320 px
        layoutDescs_mFlowScrollView.add(new LayoutDesc(12, 0.0f, -60.0f, 0.0f, 1080.0f, 1980.0f));  // 1080*1920 px
        layoutDescs_mFlowScrollView.add(new LayoutDesc(8, 0.0f, -34.0f, 0.0f, 480.0f, 834.0f));  // 480*800 px
        applyLayoutToView(mFlowScrollView, dm, layoutDescs_mFlowScrollView, true, true);
    }

}
