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

public class Screen7Fragment extends Fragment {

    private Screen7BackgroundShapeView mBackgroundShape;
    private Screen7Image2View mImage2;
    private Screen7ImageView mImage;
    private Button mButton;
    private ScrollView mFlowScrollView;

    public Screen7Fragment() {  // fragment must have a constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_screen7, container, false);
                
        mBackgroundShape = (Screen7BackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mImage2 = (Screen7Image2View) rootView.findViewById(R.id.mImage2);
        mImage = (Screen7ImageView) rootView.findViewById(R.id.mImage);
        mButton = (Button) rootView.findViewById(R.id.mButton);
        final Screen7Fragment fragment = this;

        final Context context = getActivity().getBaseContext();
        
        
        mButton.setTransformationMethod(null);
        mButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
                final ActionSequencer actionSequencer = new ActionSequencer();
                actionSequencer.run(getActivity(), new ActionSequencer.Action []{
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // 'Show message popup' action
                                new android.app.AlertDialog.Builder(getActivity())
                                .setMessage("Welcome")
                                .setPositiveButton("Ok", new android.content.DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        actionSequencer.resume();
                                    }
                                })
                                .show();
                                return false;
                            }
                        },
                });
        
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

        ArrayList<LayoutDesc> layoutDescs_mImage2 = new ArrayList<LayoutDesc>();
        layoutDescs_mImage2.add(new LayoutDesc(10, 0.0f, 0.0f, LayoutDesc.NO_VALUE, 256.0f, 145.0f));  // 720*1280 px
        layoutDescs_mImage2.add(new LayoutDesc(2, 0.0f, 0.0f, LayoutDesc.NO_VALUE, 111.0f, 63.0f));  // 240*320 px
        layoutDescs_mImage2.add(new LayoutDesc(12, 0.0f, 0.0f, LayoutDesc.NO_VALUE, 322.0f, 182.0f));  // 1080*1920 px
        layoutDescs_mImage2.add(new LayoutDesc(8, 0.0f, 0.0f, LayoutDesc.NO_VALUE, 181.0f, 103.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mImage2 = mOverrideElementLayoutDescriptors.get("image2");
            if (override_mImage2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mImage2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mImage2 = layoutDescs;
                }
            }
        }
        layoutDescs_mImage2.get(0).contentTransformMatricesString = "[0.137051040, 0.0, 0.0, 0.137051040, -0.827977316, 0.0]; [0.137051040, 0.0, 0.0, 0.137051040, -0.827977316, 0.0]";
        layoutDescs_mImage2.get(1).contentTransformMatricesString = "[0.059546314, 0.0, 0.0, 0.059546314, -0.473534972, 0.0]; [0.059546314, 0.0, 0.0, 0.059546314, -0.473534972, 0.0]";
        layoutDescs_mImage2.get(2).contentTransformMatricesString = "[0.172022684, 0.0, 0.0, 0.172022684, -0.701323251, 0.0]; [0.172022684, 0.0, 0.0, 0.172022684, -0.701323251, 0.0]";
        layoutDescs_mImage2.get(3).contentTransformMatricesString = "[0.097353497, 0.0, 0.0, 0.097353497, -1.012287335, 0.0]; [0.097353497, 0.0, 0.0, 0.097353497, -1.012287335, 0.0]";
        layoutDescs_mImage2.get(0).offsetInFlow = 0.0f;
        layoutDescs_mImage2.get(1).offsetInFlow = 0.0f;
        layoutDescs_mImage2.get(2).offsetInFlow = 0.0f;
        layoutDescs_mImage2.get(3).offsetInFlow = 0.0f;
        applyLayoutToView(mImage2, dm, layoutDescs_mImage2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mImage = new ArrayList<LayoutDesc>();
        layoutDescs_mImage.add(new LayoutDesc(10, 0.0f, 145.0f, LayoutDesc.NO_VALUE, 142.0f, 213.0f));  // 720*1280 px
        layoutDescs_mImage.add(new LayoutDesc(2, 0.0f, 63.0f, LayoutDesc.NO_VALUE, 62.0f, 93.0f));  // 240*320 px
        layoutDescs_mImage.add(new LayoutDesc(12, 0.0f, 182.0f, LayoutDesc.NO_VALUE, 179.0f, 269.0f));  // 1080*1920 px
        layoutDescs_mImage.add(new LayoutDesc(8, 0.0f, 103.0f, LayoutDesc.NO_VALUE, 101.0f, 151.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mImage = mOverrideElementLayoutDescriptors.get("image");
            if (override_mImage != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mImage.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mImage = layoutDescs;
                }
            }
        }
        layoutDescs_mImage.get(0).contentTransformMatricesString = "[0.135238095, 0.0, 0.0, 0.135238095, 0.0, 0.0]; [0.135238095, 0.0, 0.0, 0.135238095, 0.0, 0.0]";
        layoutDescs_mImage.get(1).contentTransformMatricesString = "[0.059047619, 0.0, 0.0, 0.059047619, 0.0, 0.0]; [0.059047619, 0.0, 0.0, 0.059047619, 0.0, 0.0]";
        layoutDescs_mImage.get(2).contentTransformMatricesString = "[0.170793651, 0.0, 0.0, 0.170793651, -0.166666667, 0.0]; [0.170793651, 0.0, 0.0, 0.170793651, -0.166666667, 0.0]";
        layoutDescs_mImage.get(3).contentTransformMatricesString = "[0.096190476, 0.0, 0.0, 0.096190476, 0.0, -0.250]; [0.096190476, 0.0, 0.0, 0.096190476, 0.0, -0.250]";
        layoutDescs_mImage.get(0).offsetInFlow = 0.0f;
        layoutDescs_mImage.get(1).offsetInFlow = 0.0f;
        layoutDescs_mImage.get(2).offsetInFlow = 0.0f;
        layoutDescs_mImage.get(3).offsetInFlow = 0.0f;
        applyLayoutToView(mImage, dm, layoutDescs_mImage, true, true);

        ArrayList<LayoutDesc> layoutDescs_mButton = new ArrayList<LayoutDesc>();
        layoutDescs_mButton.add(new LayoutDesc(10, 306.0f, 630.0f, LayoutDesc.NO_VALUE, 212.52f, 63.76f));  // 720*1280 px
        layoutDescs_mButton.add(new LayoutDesc(2, 133.0f, 274.0f, LayoutDesc.NO_VALUE, 92.37f, 27.71f));  // 240*320 px
        layoutDescs_mButton.add(new LayoutDesc(12, 385.0f, 795.0f, LayoutDesc.NO_VALUE, 268.05f, 80.41f));  // 1080*1920 px
        layoutDescs_mButton.add(new LayoutDesc(8, 217.0f, 447.0f, LayoutDesc.NO_VALUE, 150.71f, 45.21f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mFlowScrollView = new ArrayList<LayoutDesc>();
        layoutDescs_mFlowScrollView.add(new LayoutDesc(10, 0.0f, -48.0f, 0.0f, 720.0f, 1328.0f));  // 720*1280 px
        layoutDescs_mFlowScrollView.add(new LayoutDesc(2, 0.0f, -21.0f, 0.0f, 240.0f, 341.0f));  // 240*320 px
        layoutDescs_mFlowScrollView.add(new LayoutDesc(12, 0.0f, -60.0f, 0.0f, 1080.0f, 1980.0f));  // 1080*1920 px
        layoutDescs_mFlowScrollView.add(new LayoutDesc(8, 0.0f, -34.0f, 0.0f, 480.0f, 834.0f));  // 480*800 px
        applyLayoutToView(mFlowScrollView, dm, layoutDescs_mFlowScrollView, true, true);
    }

}
