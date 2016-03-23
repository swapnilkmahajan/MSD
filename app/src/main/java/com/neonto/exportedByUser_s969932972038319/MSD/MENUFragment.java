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

public class MENUFragment extends Fragment {

    private MENUBackgroundShapeView mBackgroundShape;
    private TextView mText;
    private Button mButton;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;

    public MENUFragment() {  // fragment must have a constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_m_e_n_u, container, false);
                
        mBackgroundShape = (MENUBackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mText = (TextView) rootView.findViewById(R.id.mText);
        mButton = (Button) rootView.findViewById(R.id.mButton);
        mButton2 = (Button) rootView.findViewById(R.id.mButton2);
        mButton3 = (Button) rootView.findViewById(R.id.mButton3);
        mButton4 = (Button) rootView.findViewById(R.id.mButton4);
        final MENUFragment fragment = this;

        final Context context = getActivity().getBaseContext();
        
        

        
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
                Intent intent = new Intent(getActivity(), MyInfoActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                getActivity().startActivity(intent);
        
           }
        });

        
        mButton3.setTransformationMethod(null);
        mButton3.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OppDetail1Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                getActivity().startActivity(intent);
        
           }
        });

        
        mButton4.setTransformationMethod(null);
        mButton4.setOnClickListener(new View.OnClickListener() {
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
        
        ArrayList<LayoutDesc> layoutDescs_mBackgroundShape = new ArrayList<LayoutDesc>();
        layoutDescs_mBackgroundShape.add(new LayoutDesc(10, 0.0f, 0.0f, 0.0f, 390.0f, 1280.0f));  // 720*1280 px
        layoutDescs_mBackgroundShape.add(new LayoutDesc(2, 0.0f, 0.0f, 0.0f, 169.0f, 320.0f));  // 240*320 px
        layoutDescs_mBackgroundShape.add(new LayoutDesc(12, 0.0f, 0.0f, 0.0f, 492.0f, 1920.0f));  // 1080*1920 px
        layoutDescs_mBackgroundShape.add(new LayoutDesc(8, 0.0f, 0.0f, 0.0f, 276.0f, 800.0f));  // 480*800 px
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
        layoutDescs_mText.add(new LayoutDesc(10, -4.0f, 88.0f, LayoutDesc.NO_VALUE, 391.89f, 63.0f));  // 720*1280 px
        layoutDescs_mText.add(new LayoutDesc(2, -2.0f, 38.0f, LayoutDesc.NO_VALUE, 170.34f, 30.0f));  // 240*320 px
        layoutDescs_mText.add(new LayoutDesc(12, -5.0f, 110.0f, LayoutDesc.NO_VALUE, 494.29f, 77.0f));  // 1080*1920 px
        layoutDescs_mText.add(new LayoutDesc(8, -3.0f, 62.0f, LayoutDesc.NO_VALUE, 277.91f, 46.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mButton = new ArrayList<LayoutDesc>();
        layoutDescs_mButton.add(new LayoutDesc(10, -38.0f, 200.0f, LayoutDesc.NO_VALUE, 425.03f, 99.11f));  // 720*1280 px
        layoutDescs_mButton.add(new LayoutDesc(2, -16.0f, 87.0f, LayoutDesc.NO_VALUE, 184.74f, 43.08f));  // 240*320 px
        layoutDescs_mButton.add(new LayoutDesc(12, -48.0f, 252.0f, LayoutDesc.NO_VALUE, 536.09f, 125.01f));  // 1080*1920 px
        layoutDescs_mButton.add(new LayoutDesc(8, -27.0f, 142.0f, LayoutDesc.NO_VALUE, 301.41f, 70.29f));  // 480*800 px
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
        layoutDescs_mButton2.add(new LayoutDesc(10, -37.0f, 298.0f, LayoutDesc.NO_VALUE, 425.03f, 97.48f));  // 720*1280 px
        layoutDescs_mButton2.add(new LayoutDesc(2, -16.0f, 130.0f, LayoutDesc.NO_VALUE, 184.74f, 42.37f));  // 240*320 px
        layoutDescs_mButton2.add(new LayoutDesc(12, -47.0f, 376.0f, LayoutDesc.NO_VALUE, 536.09f, 122.95f));  // 1080*1920 px
        layoutDescs_mButton2.add(new LayoutDesc(8, -26.0f, 212.0f, LayoutDesc.NO_VALUE, 301.41f, 69.13f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mButton3 = new ArrayList<LayoutDesc>();
        layoutDescs_mButton3.add(new LayoutDesc(10, -37.0f, 397.0f, LayoutDesc.NO_VALUE, 425.03f, 97.76f));  // 720*1280 px
        layoutDescs_mButton3.add(new LayoutDesc(2, -16.0f, 172.0f, LayoutDesc.NO_VALUE, 184.74f, 42.49f));  // 240*320 px
        layoutDescs_mButton3.add(new LayoutDesc(12, -47.0f, 500.0f, LayoutDesc.NO_VALUE, 536.09f, 123.30f));  // 1080*1920 px
        layoutDescs_mButton3.add(new LayoutDesc(8, -26.0f, 281.0f, LayoutDesc.NO_VALUE, 301.41f, 69.32f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mButton3 = mOverrideElementLayoutDescriptors.get("button3");
            if (override_mButton3 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mButton3.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mButton3 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mButton3, dm, layoutDescs_mButton3, true, true);

        ArrayList<LayoutDesc> layoutDescs_mButton4 = new ArrayList<LayoutDesc>();
        layoutDescs_mButton4.add(new LayoutDesc(10, -38.0f, 493.0f, LayoutDesc.NO_VALUE, 425.03f, 97.76f));  // 720*1280 px
        layoutDescs_mButton4.add(new LayoutDesc(2, -16.0f, 214.0f, LayoutDesc.NO_VALUE, 184.74f, 42.49f));  // 240*320 px
        layoutDescs_mButton4.add(new LayoutDesc(12, -47.0f, 622.0f, LayoutDesc.NO_VALUE, 536.09f, 123.30f));  // 1080*1920 px
        layoutDescs_mButton4.add(new LayoutDesc(8, -27.0f, 350.0f, LayoutDesc.NO_VALUE, 301.41f, 69.32f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mButton4 = mOverrideElementLayoutDescriptors.get("button4");
            if (override_mButton4 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mButton4.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mButton4 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mButton4, dm, layoutDescs_mButton4, true, true);

    }

}
