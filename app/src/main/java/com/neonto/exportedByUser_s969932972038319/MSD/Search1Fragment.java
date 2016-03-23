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

public class Search1Fragment extends Fragment {

    private Search1BackgroundShapeView mBackgroundShape;
    private EditText mField2;
    private ImageButton mIconButton2;
    private TextView mText2;
    private Button mButton;
    private Button mButton2;
    private Button mButton3;
    private Search1ImageCopyView mImageCopy;
    private TextView mText10;
    private TextView mText11;
    private TextView mText12;
    private TextView mText13;
    private Button mHotspot2;
    private Button mFixedButton;
    private Search1Image2View mImage2;
    private ImageButton mIconButton;
    private TextView mText;
    private ScrollView mFlowScrollView;

    public Search1Fragment() {  // fragment must have a constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_search1, container, false);
                
        mBackgroundShape = (Search1BackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mField2 = (EditText) rootView.findViewById(R.id.mField2);
        mIconButton2 = (ImageButton) rootView.findViewById(R.id.mIconButton2);
        mText2 = (TextView) rootView.findViewById(R.id.mText2);
        mButton = (Button) rootView.findViewById(R.id.mButton);
        mButton2 = (Button) rootView.findViewById(R.id.mButton2);
        mButton3 = (Button) rootView.findViewById(R.id.mButton3);
        mImageCopy = (Search1ImageCopyView) rootView.findViewById(R.id.mImageCopy);
        mText10 = (TextView) rootView.findViewById(R.id.mText10);
        mText11 = (TextView) rootView.findViewById(R.id.mText11);
        mText12 = (TextView) rootView.findViewById(R.id.mText12);
        mText13 = (TextView) rootView.findViewById(R.id.mText13);
        mHotspot2 = (Button) rootView.findViewById(R.id.mHotspot2);
        mFixedButton = (Button) rootView.findViewById(R.id.mFixedButton);
        mImage2 = (Search1Image2View) rootView.findViewById(R.id.mImage2);
        mIconButton = (ImageButton) rootView.findViewById(R.id.mIconButton);
        mText = (TextView) rootView.findViewById(R.id.mText);
        final Search1Fragment fragment = this;

        final Context context = getActivity().getBaseContext();
        
        
        mField2.setBackgroundColor(android.graphics.Color.WHITE);

        

        

        
        mButton.setTransformationMethod(null);
        mButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HOMEActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                getActivity().startActivity(intent);
        
           }
        });

        
        mButton2.setTransformationMethod(null);
        mButton2.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ThusWeekActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                getActivity().startActivity(intent);
        
           }
        });

        
        mButton3.setTransformationMethod(null);

        

        

        

        

        
        mHotspot2.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OppDetail2Activity.class);
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

        ArrayList<LayoutDesc> layoutDescs_mField2 = new ArrayList<LayoutDesc>();
        layoutDescs_mField2.add(new LayoutDesc(10, 118.0f, 135.0f, LayoutDesc.NO_VALUE, 513.10f, 63.76f));  // 720*1280 px
        layoutDescs_mField2.add(new LayoutDesc(2, 51.0f, 54.0f, LayoutDesc.NO_VALUE, 223.02f, 27.71f));  // 240*320 px
        layoutDescs_mField2.add(new LayoutDesc(12, 149.0f, 182.0f, LayoutDesc.NO_VALUE, 647.17f, 80.41f));  // 1080*1920 px
        layoutDescs_mField2.add(new LayoutDesc(8, 84.0f, 93.0f, LayoutDesc.NO_VALUE, 363.87f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mField2 = mOverrideElementLayoutDescriptors.get("field2");
            if (override_mField2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mField2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mField2 = layoutDescs;
                }
            }
        }
        layoutDescs_mField2.get(0).offsetInFlow = 132.6f;
        layoutDescs_mField2.get(1).offsetInFlow = 57.63f;
        layoutDescs_mField2.get(2).offsetInFlow = 167.25f;
        layoutDescs_mField2.get(3).offsetInFlow = 94.03f;
        applyLayoutToView(mField2, dm, layoutDescs_mField2, true, false);

        ArrayList<LayoutDesc> layoutDescs_mIconButton2 = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton2.add(new LayoutDesc(10, 568.0f, 143.76f, LayoutDesc.NO_VALUE, 59.50f, 51.0f));  // 720*1280 px
        layoutDescs_mIconButton2.add(new LayoutDesc(2, 247.0f, 57.71f, LayoutDesc.NO_VALUE, 25.86f, 22.17f));  // 240*320 px
        layoutDescs_mIconButton2.add(new LayoutDesc(12, 717.0f, 193.41f, LayoutDesc.NO_VALUE, 75.05f, 64.33f));  // 1080*1920 px
        layoutDescs_mIconButton2.add(new LayoutDesc(8, 403.0f, 99.21f, LayoutDesc.NO_VALUE, 42.20f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mIconButton2 = mOverrideElementLayoutDescriptors.get("iconButton2");
            if (override_mIconButton2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mIconButton2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mIconButton2 = layoutDescs;
                }
            }
        }
        layoutDescs_mIconButton2.get(0).offsetInFlow = -55.09f;
        layoutDescs_mIconButton2.get(1).offsetInFlow = -23.94f;
        layoutDescs_mIconButton2.get(2).offsetInFlow = -69.48f;
        layoutDescs_mIconButton2.get(3).offsetInFlow = -39.07f;
        applyLayoutToView(mIconButton2, dm, layoutDescs_mIconButton2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText2 = new ArrayList<LayoutDesc>();
        layoutDescs_mText2.add(new LayoutDesc(10, -3.0f, 196.76f, LayoutDesc.NO_VALUE, 722.03f, 51.0f));  // 720*1280 px
        layoutDescs_mText2.add(new LayoutDesc(2, -1.0f, 80.88f, LayoutDesc.NO_VALUE, 313.83f, 25.0f));  // 240*320 px
        layoutDescs_mText2.add(new LayoutDesc(12, -4.0f, 260.74f, LayoutDesc.NO_VALUE, 910.69f, 63.0f));  // 1080*1920 px
        layoutDescs_mText2.add(new LayoutDesc(8, -2.0f, 136.38f, LayoutDesc.NO_VALUE, 512.03f, 38.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText2 = mOverrideElementLayoutDescriptors.get("text2");
            if (override_mText2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText2 = layoutDescs;
                }
            }
        }
        layoutDescs_mText2.get(0).offsetInFlow = 2.10f;
        layoutDescs_mText2.get(1).offsetInFlow = 0.91f;
        layoutDescs_mText2.get(2).offsetInFlow = 2.65f;
        layoutDescs_mText2.get(3).offsetInFlow = 1.49f;
        applyLayoutToView(mText2, dm, layoutDescs_mText2, true, false);

        ArrayList<LayoutDesc> layoutDescs_mButton = new ArrayList<LayoutDesc>();
        layoutDescs_mButton.add(new LayoutDesc(10, 0.0f, 258.76f, LayoutDesc.NO_VALUE, 144.65f, 63.76f));  // 720*1280 px
        layoutDescs_mButton.add(new LayoutDesc(2, 0.0f, 106.88f, LayoutDesc.NO_VALUE, 62.87f, 27.71f));  // 240*320 px
        layoutDescs_mButton.add(new LayoutDesc(12, 0.0f, 338.74f, LayoutDesc.NO_VALUE, 182.44f, 80.41f));  // 1080*1920 px
        layoutDescs_mButton.add(new LayoutDesc(8, 0.0f, 180.38f, LayoutDesc.NO_VALUE, 102.57f, 45.21f));  // 480*800 px
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
        layoutDescs_mButton2.add(new LayoutDesc(10, 146.0f, 258.51f, LayoutDesc.NO_VALUE, 229.68f, 63.76f));  // 720*1280 px
        layoutDescs_mButton2.add(new LayoutDesc(2, 64.0f, 106.59f, LayoutDesc.NO_VALUE, 99.83f, 27.71f));  // 240*320 px
        layoutDescs_mButton2.add(new LayoutDesc(12, 184.0f, 339.16f, LayoutDesc.NO_VALUE, 289.7f, 80.41f));  // 1080*1920 px
        layoutDescs_mButton2.add(new LayoutDesc(8, 104.0f, 180.59f, LayoutDesc.NO_VALUE, 162.88f, 45.21f));  // 480*800 px
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
        layoutDescs_mButton3.add(new LayoutDesc(10, 375.0f, 258.27f, LayoutDesc.NO_VALUE, 344.99f, 63.76f));  // 720*1280 px
        layoutDescs_mButton3.add(new LayoutDesc(2, 163.0f, 106.30f, LayoutDesc.NO_VALUE, 149.95f, 27.71f));  // 240*320 px
        layoutDescs_mButton3.add(new LayoutDesc(12, 473.0f, 339.57f, LayoutDesc.NO_VALUE, 435.13f, 80.41f));  // 1080*1920 px
        layoutDescs_mButton3.add(new LayoutDesc(8, 266.0f, 180.80f, LayoutDesc.NO_VALUE, 244.65f, 45.21f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mImageCopy = new ArrayList<LayoutDesc>();
        layoutDescs_mImageCopy.add(new LayoutDesc(10, 0.0f, 346.02f, LayoutDesc.NO_VALUE, 719.0f, 332.0f));  // 720*1280 px
        layoutDescs_mImageCopy.add(new LayoutDesc(2, 0.0f, 144.01f, LayoutDesc.NO_VALUE, 313.0f, 145.0f));  // 240*320 px
        layoutDescs_mImageCopy.add(new LayoutDesc(12, 0.0f, 449.99f, LayoutDesc.NO_VALUE, 906.0f, 419.0f));  // 1080*1920 px
        layoutDescs_mImageCopy.add(new LayoutDesc(8, 0.0f, 243.02f, LayoutDesc.NO_VALUE, 510.0f, 236.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mImageCopy = mOverrideElementLayoutDescriptors.get("imageCopy");
            if (override_mImageCopy != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mImageCopy.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mImageCopy = layoutDescs;
                }
            }
        }
        layoutDescs_mImageCopy.get(0).contentTransformMatricesString = "[0.382446809, 0.0, 0.0, 0.382446809, 0.0, -36.314361702]; [0.382446809, 0.0, 0.0, 0.382446809, 0.0, -36.314361702]";
        layoutDescs_mImageCopy.get(1).contentTransformMatricesString = "[0.166489362, 0.0, 0.0, 0.166489362, 0.0, -15.572872340]; [0.166489362, 0.0, 0.0, 0.166489362, 0.0, -15.572872340]";
        layoutDescs_mImageCopy.get(2).contentTransformMatricesString = "[0.481914894, 0.0, 0.0, 0.481914894, 0.0, -45.432978723]; [0.481914894, 0.0, 0.0, 0.481914894, 0.0, -45.432978723]";
        layoutDescs_mImageCopy.get(3).contentTransformMatricesString = "[0.271276596, 0.0, 0.0, 0.271276596, 0.0, -25.505319149]; [0.271276596, 0.0, 0.0, 0.271276596, 0.0, -25.505319149]";
        layoutDescs_mImageCopy.get(0).offsetInFlow = 23.51f;
        layoutDescs_mImageCopy.get(1).offsetInFlow = 10.22f;
        layoutDescs_mImageCopy.get(2).offsetInFlow = 29.66f;
        layoutDescs_mImageCopy.get(3).offsetInFlow = 16.67f;
        applyLayoutToView(mImageCopy, dm, layoutDescs_mImageCopy, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText10 = new ArrayList<LayoutDesc>();
        layoutDescs_mText10.add(new LayoutDesc(10, 35.0f, 678.02f, LayoutDesc.NO_VALUE, 446.29f, 45.0f));  // 720*1280 px
        layoutDescs_mText10.add(new LayoutDesc(2, 15.0f, 289.01f, LayoutDesc.NO_VALUE, 193.98f, 24.0f));  // 240*320 px
        layoutDescs_mText10.add(new LayoutDesc(12, 45.0f, 868.99f, LayoutDesc.NO_VALUE, 562.90f, 55.0f));  // 1080*1920 px
        layoutDescs_mText10.add(new LayoutDesc(8, 25.0f, 479.02f, LayoutDesc.NO_VALUE, 316.48f, 34.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText10 = mOverrideElementLayoutDescriptors.get("text10");
            if (override_mText10 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText10.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText10 = layoutDescs;
                }
            }
        }
        layoutDescs_mText10.get(0).offsetInFlow = 0.0f;
        layoutDescs_mText10.get(1).offsetInFlow = 0.0f;
        layoutDescs_mText10.get(2).offsetInFlow = 0.0f;
        layoutDescs_mText10.get(3).offsetInFlow = 0.0f;
        applyLayoutToView(mText10, dm, layoutDescs_mText10, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText11 = new ArrayList<LayoutDesc>();
        layoutDescs_mText11.add(new LayoutDesc(10, 37.0f, 713.02f, LayoutDesc.NO_VALUE, 637.73f, 56.0f));  // 720*1280 px
        layoutDescs_mText11.add(new LayoutDesc(2, 16.0f, 305.01f, LayoutDesc.NO_VALUE, 277.19f, 28.0f));  // 240*320 px
        layoutDescs_mText11.add(new LayoutDesc(12, 47.0f, 912.99f, LayoutDesc.NO_VALUE, 804.37f, 70.0f));  // 1080*1920 px
        layoutDescs_mText11.add(new LayoutDesc(8, 26.0f, 504.02f, LayoutDesc.NO_VALUE, 452.25f, 41.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText11 = mOverrideElementLayoutDescriptors.get("text11");
            if (override_mText11 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText11.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText11 = layoutDescs;
                }
            }
        }
        layoutDescs_mText11.get(0).offsetInFlow = -4.25f;
        layoutDescs_mText11.get(1).offsetInFlow = -1.85f;
        layoutDescs_mText11.get(2).offsetInFlow = -5.36f;
        layoutDescs_mText11.get(3).offsetInFlow = -3.01f;
        applyLayoutToView(mText11, dm, layoutDescs_mText11, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText12 = new ArrayList<LayoutDesc>();
        layoutDescs_mText12.add(new LayoutDesc(10, 39.0f, 759.02f, LayoutDesc.NO_VALUE, 446.29f, 45.0f));  // 720*1280 px
        layoutDescs_mText12.add(new LayoutDesc(2, 17.0f, 325.01f, LayoutDesc.NO_VALUE, 193.98f, 24.0f));  // 240*320 px
        layoutDescs_mText12.add(new LayoutDesc(12, 50.0f, 971.99f, LayoutDesc.NO_VALUE, 562.90f, 55.0f));  // 1080*1920 px
        layoutDescs_mText12.add(new LayoutDesc(8, 28.0f, 536.02f, LayoutDesc.NO_VALUE, 316.48f, 34.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText12 = mOverrideElementLayoutDescriptors.get("text12");
            if (override_mText12 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText12.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText12 = layoutDescs;
                }
            }
        }
        layoutDescs_mText12.get(0).offsetInFlow = -4.25f;
        layoutDescs_mText12.get(1).offsetInFlow = -1.85f;
        layoutDescs_mText12.get(2).offsetInFlow = -5.36f;
        layoutDescs_mText12.get(3).offsetInFlow = -3.01f;
        applyLayoutToView(mText12, dm, layoutDescs_mText12, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText13 = new ArrayList<LayoutDesc>();
        layoutDescs_mText13.add(new LayoutDesc(10, 564.0f, 764.02f, LayoutDesc.NO_VALUE, 446.29f, 45.0f));  // 720*1280 px
        layoutDescs_mText13.add(new LayoutDesc(2, 245.0f, 328.01f, LayoutDesc.NO_VALUE, 193.98f, 24.0f));  // 240*320 px
        layoutDescs_mText13.add(new LayoutDesc(12, 712.0f, 977.99f, LayoutDesc.NO_VALUE, 562.90f, 55.0f));  // 1080*1920 px
        layoutDescs_mText13.add(new LayoutDesc(8, 400.0f, 540.02f, LayoutDesc.NO_VALUE, 316.48f, 34.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText13 = mOverrideElementLayoutDescriptors.get("text13");
            if (override_mText13 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText13.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText13 = layoutDescs;
                }
            }
        }
        layoutDescs_mText13.get(0).offsetInFlow = -34.0f;
        layoutDescs_mText13.get(1).offsetInFlow = -14.78f;
        layoutDescs_mText13.get(2).offsetInFlow = -42.89f;
        layoutDescs_mText13.get(3).offsetInFlow = -24.11f;
        applyLayoutToView(mText13, dm, layoutDescs_mText13, true, false);

        ArrayList<LayoutDesc> layoutDescs_mHotspot2 = new ArrayList<LayoutDesc>();
        layoutDescs_mHotspot2.add(new LayoutDesc(10, -24.0f, 331.02f, LayoutDesc.NO_VALUE, 760.44f, 481.01f));  // 720*1280 px
        layoutDescs_mHotspot2.add(new LayoutDesc(2, -11.0f, 141.01f, LayoutDesc.NO_VALUE, 330.52f, 209.07f));  // 240*320 px
        layoutDescs_mHotspot2.add(new LayoutDesc(12, -31.0f, 430.99f, LayoutDesc.NO_VALUE, 959.13f, 606.70f));  // 1080*1920 px
        layoutDescs_mHotspot2.add(new LayoutDesc(8, -17.0f, 233.02f, LayoutDesc.NO_VALUE, 539.26f, 341.11f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mHotspot2 = mOverrideElementLayoutDescriptors.get("hotspot2");
            if (override_mHotspot2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mHotspot2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mHotspot2 = layoutDescs;
                }
            }
        }
        layoutDescs_mHotspot2.get(0).offsetInFlow = -472.35f;
        layoutDescs_mHotspot2.get(1).offsetInFlow = -205.31f;
        layoutDescs_mHotspot2.get(2).offsetInFlow = -595.77f;
        layoutDescs_mHotspot2.get(3).offsetInFlow = -334.97f;
        applyLayoutToView(mHotspot2, dm, layoutDescs_mHotspot2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mFixedButton = new ArrayList<LayoutDesc>();
        layoutDescs_mFixedButton.add(new LayoutDesc(10, 258.0f, 1769.04f, LayoutDesc.NO_VALUE, 212.52f, 63.76f));  // 720*1280 px
        layoutDescs_mFixedButton.add(new LayoutDesc(2, 112.0f, 766.09f, LayoutDesc.NO_VALUE, 92.37f, 27.71f));  // 240*320 px
        layoutDescs_mFixedButton.add(new LayoutDesc(12, 326.0f, 2244.68f, LayoutDesc.NO_VALUE, 268.05f, 80.41f));  // 1080*1920 px
        layoutDescs_mFixedButton.add(new LayoutDesc(8, 183.0f, 1253.13f, LayoutDesc.NO_VALUE, 150.71f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mFixedButton = mOverrideElementLayoutDescriptors.get("fixedButton");
            if (override_mFixedButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mFixedButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mFixedButton = layoutDescs;
                }
            }
        }
        layoutDescs_mFixedButton.get(0).offsetInFlow = 957.31f;
        layoutDescs_mFixedButton.get(1).offsetInFlow = 416.09f;
        layoutDescs_mFixedButton.get(2).offsetInFlow = 1207.45f;
        layoutDescs_mFixedButton.get(3).offsetInFlow = 678.87f;
        applyLayoutToView(mFixedButton, dm, layoutDescs_mFixedButton, true, true);

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

        ArrayList<LayoutDesc> layoutDescs_mText = new ArrayList<LayoutDesc>();
        layoutDescs_mText.add(new LayoutDesc(10, 233.0f, 33.0f, LayoutDesc.NO_VALUE, 488.04f, 63.0f));  // 720*1280 px
        layoutDescs_mText.add(new LayoutDesc(2, 101.0f, 14.0f, LayoutDesc.NO_VALUE, 212.13f, 30.0f));  // 240*320 px
        layoutDescs_mText.add(new LayoutDesc(12, 293.0f, 42.0f, LayoutDesc.NO_VALUE, 615.56f, 77.0f));  // 1080*1920 px
        layoutDescs_mText.add(new LayoutDesc(8, 165.0f, 23.0f, LayoutDesc.NO_VALUE, 346.09f, 46.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText = mOverrideElementLayoutDescriptors.get("text");
            if (override_mText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText = layoutDescs;
                }
            }
        }
        applyLayoutToView(mText, dm, layoutDescs_mText, true, false);

        ArrayList<LayoutDesc> layoutDescs_mFlowScrollView = new ArrayList<LayoutDesc>();
        layoutDescs_mFlowScrollView.add(new LayoutDesc(10, 0.0f, 0.0f, 0.0f, 720.0f, 1280.0f));  // 720*1280 px
        layoutDescs_mFlowScrollView.add(new LayoutDesc(2, 0.0f, 0.0f, 0.0f, 240.0f, 320.0f));  // 240*320 px
        layoutDescs_mFlowScrollView.add(new LayoutDesc(12, 0.0f, 0.0f, 0.0f, 1080.0f, 1920.0f));  // 1080*1920 px
        layoutDescs_mFlowScrollView.add(new LayoutDesc(8, 0.0f, 0.0f, 0.0f, 480.0f, 800.0f));  // 480*800 px
        applyLayoutToView(mFlowScrollView, dm, layoutDescs_mFlowScrollView, true, true);
    }

}
