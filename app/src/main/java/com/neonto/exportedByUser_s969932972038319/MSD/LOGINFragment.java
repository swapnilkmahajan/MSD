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

public class LOGINFragment extends Fragment {

    private LOGINBackgroundShapeView mBackgroundShape;
    private TextView mText;
    private TextView mText2;
    private EditText mField;
    private EditText mField2;
    private LOGINLineView mLine;
    private LOGINLineCopyView mLineCopy;
    private Button mButton;
    private TextView mText3;
    private Button mButton2;
    private ImageButton mIconButton;
    private ImageButton mIconButton2;

    public LOGINFragment() {  // fragment must have a constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_l_o_g_i_n, container, false);
                
        mBackgroundShape = (LOGINBackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mText = (TextView) rootView.findViewById(R.id.mText);
        mText2 = (TextView) rootView.findViewById(R.id.mText2);
        mField = (EditText) rootView.findViewById(R.id.mField);
        mField2 = (EditText) rootView.findViewById(R.id.mField2);
        mLine = (LOGINLineView) rootView.findViewById(R.id.mLine);
        mLineCopy = (LOGINLineCopyView) rootView.findViewById(R.id.mLineCopy);
        mButton = (Button) rootView.findViewById(R.id.mButton);
        mText3 = (TextView) rootView.findViewById(R.id.mText3);
        mButton2 = (Button) rootView.findViewById(R.id.mButton2);
        mIconButton = (ImageButton) rootView.findViewById(R.id.mIconButton);
        mIconButton2 = (ImageButton) rootView.findViewById(R.id.mIconButton2);
        final LOGINFragment fragment = this;

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
                Intent intent = new Intent(getActivity(), REGISTERActivity.class);
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
        layoutDescs_mBackgroundShape.add(new LayoutDesc(10, 0.0f, 0.0f, 0.0f, 720.0f, 1280.0f));  // 720*1280 px
        layoutDescs_mBackgroundShape.add(new LayoutDesc(2, 0.0f, 0.0f, 0.0f, 240.0f, 320.0f));  // 240*320 px
        layoutDescs_mBackgroundShape.add(new LayoutDesc(12, 0.0f, 0.0f, 0.0f, 1080.0f, 1920.0f));  // 1080*1920 px
        layoutDescs_mBackgroundShape.add(new LayoutDesc(8, 0.0f, 0.0f, 0.0f, 480.0f, 800.0f));  // 480*800 px
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
        layoutDescs_mText.add(new LayoutDesc(10, 210.0f, 218.0f, LayoutDesc.NO_VALUE, 310.84f, 159.0f));  // 720*1280 px
        layoutDescs_mText.add(new LayoutDesc(2, 91.0f, 95.0f, LayoutDesc.NO_VALUE, 135.11f, 73.0f));  // 240*320 px
        layoutDescs_mText.add(new LayoutDesc(12, 265.0f, 275.0f, LayoutDesc.NO_VALUE, 392.06f, 199.0f));  // 1080*1920 px
        layoutDescs_mText.add(new LayoutDesc(8, 149.0f, 155.0f, LayoutDesc.NO_VALUE, 220.43f, 115.0f));  // 480*800 px
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
        layoutDescs_mText2.add(new LayoutDesc(10, 81.0f, 363.0f, LayoutDesc.NO_VALUE, 568.08f, 49.0f));  // 720*1280 px
        layoutDescs_mText2.add(new LayoutDesc(2, 35.0f, 158.0f, LayoutDesc.NO_VALUE, 246.92f, 25.0f));  // 240*320 px
        layoutDescs_mText2.add(new LayoutDesc(12, 102.0f, 458.0f, LayoutDesc.NO_VALUE, 716.52f, 60.0f));  // 1080*1920 px
        layoutDescs_mText2.add(new LayoutDesc(8, 57.0f, 257.0f, LayoutDesc.NO_VALUE, 402.85f, 37.0f));  // 480*800 px
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
        layoutDescs_mField.add(new LayoutDesc(10, 131.0f, 493.0f, LayoutDesc.NO_VALUE, 528.47f, 81.98f));  // 720*1280 px
        layoutDescs_mField.add(new LayoutDesc(2, 57.0f, 214.0f, LayoutDesc.NO_VALUE, 229.70f, 35.63f));  // 240*320 px
        layoutDescs_mField.add(new LayoutDesc(12, 165.0f, 622.0f, LayoutDesc.NO_VALUE, 666.55f, 103.40f));  // 1080*1920 px
        layoutDescs_mField.add(new LayoutDesc(8, 93.0f, 350.0f, LayoutDesc.NO_VALUE, 374.76f, 58.14f));  // 480*800 px
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
        layoutDescs_mField2.add(new LayoutDesc(10, 130.0f, 660.0f, LayoutDesc.NO_VALUE, 546.30f, 63.76f));  // 720*1280 px
        layoutDescs_mField2.add(new LayoutDesc(2, 57.0f, 287.0f, LayoutDesc.NO_VALUE, 237.45f, 27.71f));  // 240*320 px
        layoutDescs_mField2.add(new LayoutDesc(12, 164.0f, 832.0f, LayoutDesc.NO_VALUE, 689.05f, 80.41f));  // 1080*1920 px
        layoutDescs_mField2.add(new LayoutDesc(8, 92.0f, 468.0f, LayoutDesc.NO_VALUE, 387.41f, 45.21f));  // 480*800 px
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
        layoutDescs_mLine.add(new LayoutDesc(10, 42.0f, 732.0f, LayoutDesc.NO_VALUE, 636.43f, 4.0f));  // 720*1280 px
        layoutDescs_mLine.add(new LayoutDesc(2, 18.0f, 318.0f, LayoutDesc.NO_VALUE, 276.63f, 1.74f));  // 240*320 px
        layoutDescs_mLine.add(new LayoutDesc(12, 52.0f, 923.0f, LayoutDesc.NO_VALUE, 802.73f, 5.05f));  // 1080*1920 px
        layoutDescs_mLine.add(new LayoutDesc(8, 29.0f, 519.0f, LayoutDesc.NO_VALUE, 451.33f, 2.84f));  // 480*800 px
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
        layoutDescs_mLineCopy.add(new LayoutDesc(10, 46.0f, 580.0f, LayoutDesc.NO_VALUE, 636.43f, 4.0f));  // 720*1280 px
        layoutDescs_mLineCopy.add(new LayoutDesc(2, 20.0f, 252.0f, LayoutDesc.NO_VALUE, 276.63f, 1.74f));  // 240*320 px
        layoutDescs_mLineCopy.add(new LayoutDesc(12, 58.0f, 732.0f, LayoutDesc.NO_VALUE, 802.73f, 5.05f));  // 1080*1920 px
        layoutDescs_mLineCopy.add(new LayoutDesc(8, 33.0f, 411.0f, LayoutDesc.NO_VALUE, 451.33f, 2.84f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mButton = new ArrayList<LayoutDesc>();
        layoutDescs_mButton.add(new LayoutDesc(10, 44.0f, 832.0f, LayoutDesc.NO_VALUE, 634.59f, 93.55f));  // 720*1280 px
        layoutDescs_mButton.add(new LayoutDesc(2, 19.0f, 362.0f, LayoutDesc.NO_VALUE, 275.83f, 40.66f));  // 240*320 px
        layoutDescs_mButton.add(new LayoutDesc(12, 55.0f, 1049.0f, LayoutDesc.NO_VALUE, 800.41f, 118.0f));  // 1080*1920 px
        layoutDescs_mButton.add(new LayoutDesc(8, 31.0f, 590.0f, LayoutDesc.NO_VALUE, 450.02f, 66.34f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mText3 = new ArrayList<LayoutDesc>();
        layoutDescs_mText3.add(new LayoutDesc(10, 105.0f, 1004.0f, LayoutDesc.NO_VALUE, 446.29f, 49.0f));  // 720*1280 px
        layoutDescs_mText3.add(new LayoutDesc(2, 46.0f, 436.0f, LayoutDesc.NO_VALUE, 193.98f, 25.0f));  // 240*320 px
        layoutDescs_mText3.add(new LayoutDesc(12, 132.0f, 1266.0f, LayoutDesc.NO_VALUE, 562.90f, 60.0f));  // 1080*1920 px
        layoutDescs_mText3.add(new LayoutDesc(8, 74.0f, 712.0f, LayoutDesc.NO_VALUE, 316.48f, 37.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText3 = mOverrideElementLayoutDescriptors.get("text3");
            if (override_mText3 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText3.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText3 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mText3, dm, layoutDescs_mText3, true, true);

        ArrayList<LayoutDesc> layoutDescs_mButton2 = new ArrayList<LayoutDesc>();
        layoutDescs_mButton2.add(new LayoutDesc(10, 458.0f, 975.0f, LayoutDesc.NO_VALUE, 266.18f, 153.72f));  // 720*1280 px
        layoutDescs_mButton2.add(new LayoutDesc(2, 199.0f, 424.0f, LayoutDesc.NO_VALUE, 115.70f, 66.81f));  // 240*320 px
        layoutDescs_mButton2.add(new LayoutDesc(12, 577.0f, 1230.0f, LayoutDesc.NO_VALUE, 335.73f, 193.88f));  // 1080*1920 px
        layoutDescs_mButton2.add(new LayoutDesc(8, 324.0f, 692.0f, LayoutDesc.NO_VALUE, 188.76f, 109.01f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mIconButton = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton.add(new LayoutDesc(10, 48.0f, 651.0f, LayoutDesc.NO_VALUE, 138.46f, 76.11f));  // 720*1280 px
        layoutDescs_mIconButton.add(new LayoutDesc(2, 21.0f, 283.0f, LayoutDesc.NO_VALUE, 60.18f, 33.08f));  // 240*320 px
        layoutDescs_mIconButton.add(new LayoutDesc(12, 61.0f, 821.0f, LayoutDesc.NO_VALUE, 174.64f, 96.0f));  // 1080*1920 px
        layoutDescs_mIconButton.add(new LayoutDesc(8, 34.0f, 462.0f, LayoutDesc.NO_VALUE, 98.19f, 53.97f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mIconButton2 = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton2.add(new LayoutDesc(10, 50.0f, 506.0f, LayoutDesc.NO_VALUE, 73.83f, 76.80f));  // 720*1280 px
        layoutDescs_mIconButton2.add(new LayoutDesc(2, 22.0f, 220.0f, LayoutDesc.NO_VALUE, 32.09f, 33.38f));  // 240*320 px
        layoutDescs_mIconButton2.add(new LayoutDesc(12, 63.0f, 638.0f, LayoutDesc.NO_VALUE, 93.12f, 96.86f));  // 1080*1920 px
        layoutDescs_mIconButton2.add(new LayoutDesc(8, 35.0f, 359.0f, LayoutDesc.NO_VALUE, 52.36f, 54.46f));  // 480*800 px
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
