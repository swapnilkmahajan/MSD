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

public class EditInfoFragment extends Fragment {

    private EditInfoBackgroundShapeView mBackgroundShape;
    private TextView mText2;
    private EditInfoImageView mImage;
    private EditInfoImage3View mImage3;
    private Button mButton;
    private TextView mText3;
    private EditText mField;
    private ImageButton mIconButton2;
    private TextView mText4;
    private EditText mField2;
    private ImageButton mIconButton3;
    private TextView mText5;
    private EditText mTextarea;
    private ImageButton mIconButton4;
    private TextView mText6;
    private Button mButton4;
    private Button mButton2;
    private Button mButton3;
    private Button mFixedButton;
    private EditInfoImage2View mImage2;
    private ImageButton mIconButton;
    private TextView mText;
    private ScrollView mFlowScrollView;

    public EditInfoFragment() {  // fragment must have a constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_edit_info, container, false);
                
        mBackgroundShape = (EditInfoBackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mText2 = (TextView) rootView.findViewById(R.id.mText2);
        mImage = (EditInfoImageView) rootView.findViewById(R.id.mImage);
        mImage3 = (EditInfoImage3View) rootView.findViewById(R.id.mImage3);
        mButton = (Button) rootView.findViewById(R.id.mButton);
        mText3 = (TextView) rootView.findViewById(R.id.mText3);
        mField = (EditText) rootView.findViewById(R.id.mField);
        mIconButton2 = (ImageButton) rootView.findViewById(R.id.mIconButton2);
        mText4 = (TextView) rootView.findViewById(R.id.mText4);
        mField2 = (EditText) rootView.findViewById(R.id.mField2);
        mIconButton3 = (ImageButton) rootView.findViewById(R.id.mIconButton3);
        mText5 = (TextView) rootView.findViewById(R.id.mText5);
        mTextarea = (EditText) rootView.findViewById(R.id.mTextarea);
        mIconButton4 = (ImageButton) rootView.findViewById(R.id.mIconButton4);
        mText6 = (TextView) rootView.findViewById(R.id.mText6);
        mButton4 = (Button) rootView.findViewById(R.id.mButton4);
        mButton2 = (Button) rootView.findViewById(R.id.mButton2);
        mButton3 = (Button) rootView.findViewById(R.id.mButton3);
        mFixedButton = (Button) rootView.findViewById(R.id.mFixedButton);
        mImage2 = (EditInfoImage2View) rootView.findViewById(R.id.mImage2);
        mIconButton = (ImageButton) rootView.findViewById(R.id.mIconButton);
        mText = (TextView) rootView.findViewById(R.id.mText);
        final EditInfoFragment fragment = this;

        final Context context = getActivity().getBaseContext();
        
        

        
        mButton.setTransformationMethod(null);
        mButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EditInfoActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                getActivity().startActivity(intent);
        
           }
        });

        

        
        mField.setBackgroundColor(android.graphics.Color.WHITE);

        

        

        
        mField2.setBackgroundColor(android.graphics.Color.WHITE);

        

        

        
        mTextarea.setBackgroundColor(android.graphics.Color.WHITE);

        

        

        
        mButton4.setTransformationMethod(null);

        
        mButton2.setTransformationMethod(null);
        mButton2.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
                final ActionSequencer actionSequencer = new ActionSequencer();
                actionSequencer.run(getActivity(), new ActionSequencer.Action []{
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // 'Show message popup' action
                                new android.app.AlertDialog.Builder(getActivity())
                                .setMessage("Congratulations!  Changes saved.")
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

        
        mButton3.setTransformationMethod(null);

        
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

        ArrayList<LayoutDesc> layoutDescs_mText2 = new ArrayList<LayoutDesc>();
        layoutDescs_mText2.add(new LayoutDesc(10, 0.0f, 130.0f, LayoutDesc.NO_VALUE, 714.45f, 63.0f));  // 720*1280 px
        layoutDescs_mText2.add(new LayoutDesc(2, 0.0f, 52.0f, LayoutDesc.NO_VALUE, 310.54f, 30.0f));  // 240*320 px
        layoutDescs_mText2.add(new LayoutDesc(12, 0.0f, 176.0f, LayoutDesc.NO_VALUE, 901.14f, 77.0f));  // 1080*1920 px
        layoutDescs_mText2.add(new LayoutDesc(8, 0.0f, 90.0f, LayoutDesc.NO_VALUE, 506.66f, 46.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText2 = mOverrideElementLayoutDescriptors.get("text2");
            if (override_mText2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText2 = layoutDescs;
                }
            }
        }
        layoutDescs_mText2.get(0).offsetInFlow = 127.76f;
        layoutDescs_mText2.get(1).offsetInFlow = 55.53f;
        layoutDescs_mText2.get(2).offsetInFlow = 161.14f;
        layoutDescs_mText2.get(3).offsetInFlow = 90.60f;
        applyLayoutToView(mText2, dm, layoutDescs_mText2, true, false);

        ArrayList<LayoutDesc> layoutDescs_mImage = new ArrayList<LayoutDesc>();
        layoutDescs_mImage.add(new LayoutDesc(10, -2.0f, 193.0f, LayoutDesc.NO_VALUE, 737.0f, 432.0f));  // 720*1280 px
        layoutDescs_mImage.add(new LayoutDesc(2, -1.0f, 78.0f, LayoutDesc.NO_VALUE, 320.0f, 188.0f));  // 240*320 px
        layoutDescs_mImage.add(new LayoutDesc(12, -3.0f, 254.0f, LayoutDesc.NO_VALUE, 929.0f, 544.0f));  // 1080*1920 px
        layoutDescs_mImage.add(new LayoutDesc(8, -2.0f, 134.0f, LayoutDesc.NO_VALUE, 523.0f, 306.0f));  // 480*800 px
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
        layoutDescs_mImage.get(0).offsetInFlow = 5.61f;
        layoutDescs_mImage.get(1).offsetInFlow = 2.44f;
        layoutDescs_mImage.get(2).offsetInFlow = 7.08f;
        layoutDescs_mImage.get(3).offsetInFlow = 3.98f;
        applyLayoutToView(mImage, dm, layoutDescs_mImage, true, true);

        ArrayList<LayoutDesc> layoutDescs_mImage3 = new ArrayList<LayoutDesc>();
        layoutDescs_mImage3.add(new LayoutDesc(10, 245.0f, 230.0f, LayoutDesc.NO_VALUE, 260.0f, 248.0f));  // 720*1280 px
        layoutDescs_mImage3.add(new LayoutDesc(2, 107.0f, 94.0f, LayoutDesc.NO_VALUE, 113.0f, 108.0f));  // 240*320 px
        layoutDescs_mImage3.add(new LayoutDesc(12, 309.0f, 299.0f, LayoutDesc.NO_VALUE, 328.0f, 313.0f));  // 1080*1920 px
        layoutDescs_mImage3.add(new LayoutDesc(8, 174.0f, 160.0f, LayoutDesc.NO_VALUE, 185.0f, 176.0f));  // 480*800 px
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
        layoutDescs_mImage3.get(0).offsetInFlow = -395.30f;
        layoutDescs_mImage3.get(1).offsetInFlow = -171.82f;
        layoutDescs_mImage3.get(2).offsetInFlow = -498.59f;
        layoutDescs_mImage3.get(3).offsetInFlow = -280.33f;
        applyLayoutToView(mImage3, dm, layoutDescs_mImage3, true, true);

        ArrayList<LayoutDesc> layoutDescs_mButton = new ArrayList<LayoutDesc>();
        layoutDescs_mButton.add(new LayoutDesc(10, 247.0f, 523.0f, LayoutDesc.NO_VALUE, 248.24f, 39.04f));  // 720*1280 px
        layoutDescs_mButton.add(new LayoutDesc(2, 107.0f, 221.0f, LayoutDesc.NO_VALUE, 107.90f, 16.97f));  // 240*320 px
        layoutDescs_mButton.add(new LayoutDesc(12, 311.0f, 668.0f, LayoutDesc.NO_VALUE, 313.11f, 49.24f));  // 1080*1920 px
        layoutDescs_mButton.add(new LayoutDesc(8, 175.0f, 368.0f, LayoutDesc.NO_VALUE, 176.04f, 27.69f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mButton = mOverrideElementLayoutDescriptors.get("button");
            if (override_mButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mButton = layoutDescs;
                }
            }
        }
        layoutDescs_mButton.get(0).offsetInFlow = 44.65f;
        layoutDescs_mButton.get(1).offsetInFlow = 19.41f;
        layoutDescs_mButton.get(2).offsetInFlow = 56.32f;
        layoutDescs_mButton.get(3).offsetInFlow = 31.67f;
        applyLayoutToView(mButton, dm, layoutDescs_mButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText3 = new ArrayList<LayoutDesc>();
        layoutDescs_mText3.add(new LayoutDesc(10, 37.0f, 666.04f, LayoutDesc.NO_VALUE, 236.30f, 63.0f));  // 720*1280 px
        layoutDescs_mText3.add(new LayoutDesc(2, 16.0f, 282.97f, LayoutDesc.NO_VALUE, 102.71f, 54.0f));  // 240*320 px
        layoutDescs_mText3.add(new LayoutDesc(12, 47.0f, 848.24f, LayoutDesc.NO_VALUE, 298.04f, 77.0f));  // 1080*1920 px
        layoutDescs_mText3.add(new LayoutDesc(8, 26.0f, 469.69f, LayoutDesc.NO_VALUE, 167.57f, 46.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText3 = mOverrideElementLayoutDescriptors.get("text3");
            if (override_mText3 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText3.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText3 = layoutDescs;
                }
            }
        }
        layoutDescs_mText3.get(0).offsetInFlow = 103.84f;
        layoutDescs_mText3.get(1).offsetInFlow = 45.13f;
        layoutDescs_mText3.get(2).offsetInFlow = 130.97f;
        layoutDescs_mText3.get(3).offsetInFlow = 73.64f;
        applyLayoutToView(mText3, dm, layoutDescs_mText3, true, false);

        ArrayList<LayoutDesc> layoutDescs_mField = new ArrayList<LayoutDesc>();
        layoutDescs_mField.add(new LayoutDesc(10, 282.0f, 668.04f, LayoutDesc.NO_VALUE, 397.03f, 63.76f));  // 720*1280 px
        layoutDescs_mField.add(new LayoutDesc(2, 123.0f, 306.97f, LayoutDesc.NO_VALUE, 172.57f, 27.71f));  // 240*320 px
        layoutDescs_mField.add(new LayoutDesc(12, 356.0f, 849.24f, LayoutDesc.NO_VALUE, 500.77f, 80.41f));  // 1080*1920 px
        layoutDescs_mField.add(new LayoutDesc(8, 200.0f, 470.69f, LayoutDesc.NO_VALUE, 281.55f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mField = mOverrideElementLayoutDescriptors.get("field");
            if (override_mField != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mField.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mField = layoutDescs;
                }
            }
        }
        layoutDescs_mField.get(0).offsetInFlow = -55.25f;
        layoutDescs_mField.get(1).offsetInFlow = -24.02f;
        layoutDescs_mField.get(2).offsetInFlow = -69.69f;
        layoutDescs_mField.get(3).offsetInFlow = -39.18f;
        applyLayoutToView(mField, dm, layoutDescs_mField, true, false);

        ArrayList<LayoutDesc> layoutDescs_mIconButton2 = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton2.add(new LayoutDesc(10, 616.0f, 680.79f, LayoutDesc.NO_VALUE, 59.50f, 51.0f));  // 720*1280 px
        layoutDescs_mIconButton2.add(new LayoutDesc(2, 268.0f, 312.68f, LayoutDesc.NO_VALUE, 25.86f, 22.17f));  // 240*320 px
        layoutDescs_mIconButton2.add(new LayoutDesc(12, 777.0f, 865.65f, LayoutDesc.NO_VALUE, 75.05f, 64.33f));  // 1080*1920 px
        layoutDescs_mIconButton2.add(new LayoutDesc(8, 437.0f, 479.90f, LayoutDesc.NO_VALUE, 42.20f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mIconButton2 = mOverrideElementLayoutDescriptors.get("iconButton2");
            if (override_mIconButton2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mIconButton2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mIconButton2 = layoutDescs;
                }
            }
        }
        layoutDescs_mIconButton2.get(0).offsetInFlow = -51.0f;
        layoutDescs_mIconButton2.get(1).offsetInFlow = -22.17f;
        layoutDescs_mIconButton2.get(2).offsetInFlow = -64.33f;
        layoutDescs_mIconButton2.get(3).offsetInFlow = -36.17f;
        applyLayoutToView(mIconButton2, dm, layoutDescs_mIconButton2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText4 = new ArrayList<LayoutDesc>();
        layoutDescs_mText4.add(new LayoutDesc(10, 40.0f, 765.80f, LayoutDesc.NO_VALUE, 247.2f, 63.0f));  // 720*1280 px
        layoutDescs_mText4.add(new LayoutDesc(2, 17.0f, 349.85f, LayoutDesc.NO_VALUE, 107.45f, 30.0f));  // 240*320 px
        layoutDescs_mText4.add(new LayoutDesc(12, 50.0f, 972.99f, LayoutDesc.NO_VALUE, 311.79f, 77.0f));  // 1080*1920 px
        layoutDescs_mText4.add(new LayoutDesc(8, 28.0f, 540.07f, LayoutDesc.NO_VALUE, 175.30f, 46.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText4 = mOverrideElementLayoutDescriptors.get("text4");
            if (override_mText4 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText4.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText4 = layoutDescs;
                }
            }
        }
        layoutDescs_mText4.get(0).offsetInFlow = 34.0f;
        layoutDescs_mText4.get(1).offsetInFlow = 14.78f;
        layoutDescs_mText4.get(2).offsetInFlow = 42.89f;
        layoutDescs_mText4.get(3).offsetInFlow = 24.11f;
        applyLayoutToView(mText4, dm, layoutDescs_mText4, true, false);

        ArrayList<LayoutDesc> layoutDescs_mField2 = new ArrayList<LayoutDesc>();
        layoutDescs_mField2.add(new LayoutDesc(10, 282.0f, 769.80f, LayoutDesc.NO_VALUE, 395.39f, 63.76f));  // 720*1280 px
        layoutDescs_mField2.add(new LayoutDesc(2, 123.0f, 350.85f, LayoutDesc.NO_VALUE, 171.86f, 27.71f));  // 240*320 px
        layoutDescs_mField2.add(new LayoutDesc(12, 356.0f, 976.99f, LayoutDesc.NO_VALUE, 498.70f, 80.41f));  // 1080*1920 px
        layoutDescs_mField2.add(new LayoutDesc(8, 200.0f, 542.07f, LayoutDesc.NO_VALUE, 280.39f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mField2 = mOverrideElementLayoutDescriptors.get("field2");
            if (override_mField2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mField2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mField2 = layoutDescs;
                }
            }
        }
        layoutDescs_mField2.get(0).offsetInFlow = -53.46f;
        layoutDescs_mField2.get(1).offsetInFlow = -23.24f;
        layoutDescs_mField2.get(2).offsetInFlow = -67.43f;
        layoutDescs_mField2.get(3).offsetInFlow = -37.91f;
        applyLayoutToView(mField2, dm, layoutDescs_mField2, true, false);

        ArrayList<LayoutDesc> layoutDescs_mIconButton3 = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton3.add(new LayoutDesc(10, 611.0f, 777.55f, LayoutDesc.NO_VALUE, 59.50f, 51.0f));  // 720*1280 px
        layoutDescs_mIconButton3.add(new LayoutDesc(2, 265.0f, 353.56f, LayoutDesc.NO_VALUE, 25.86f, 22.17f));  // 240*320 px
        layoutDescs_mIconButton3.add(new LayoutDesc(12, 770.0f, 986.40f, LayoutDesc.NO_VALUE, 75.05f, 64.33f));  // 1080*1920 px
        layoutDescs_mIconButton3.add(new LayoutDesc(8, 433.0f, 547.28f, LayoutDesc.NO_VALUE, 42.20f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mIconButton3 = mOverrideElementLayoutDescriptors.get("iconButton3");
            if (override_mIconButton3 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mIconButton3.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mIconButton3 = layoutDescs;
                }
            }
        }
        layoutDescs_mIconButton3.get(0).offsetInFlow = -56.43f;
        layoutDescs_mIconButton3.get(1).offsetInFlow = -24.53f;
        layoutDescs_mIconButton3.get(2).offsetInFlow = -71.17f;
        layoutDescs_mIconButton3.get(3).offsetInFlow = -40.02f;
        applyLayoutToView(mIconButton3, dm, layoutDescs_mIconButton3, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText5 = new ArrayList<LayoutDesc>();
        layoutDescs_mText5.add(new LayoutDesc(10, 41.0f, 893.56f, LayoutDesc.NO_VALUE, 226.61f, 63.0f));  // 720*1280 px
        layoutDescs_mText5.add(new LayoutDesc(2, 18.0f, 403.73f, LayoutDesc.NO_VALUE, 98.50f, 30.0f));  // 240*320 px
        layoutDescs_mText5.add(new LayoutDesc(12, 52.0f, 1132.73f, LayoutDesc.NO_VALUE, 285.82f, 77.0f));  // 1080*1920 px
        layoutDescs_mText5.add(new LayoutDesc(8, 29.0f, 629.45f, LayoutDesc.NO_VALUE, 160.70f, 46.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText5 = mOverrideElementLayoutDescriptors.get("text5");
            if (override_mText5 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText5.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText5 = layoutDescs;
                }
            }
        }
        layoutDescs_mText5.get(0).offsetInFlow = 65.25f;
        layoutDescs_mText5.get(1).offsetInFlow = 28.36f;
        layoutDescs_mText5.get(2).offsetInFlow = 82.29f;
        layoutDescs_mText5.get(3).offsetInFlow = 46.27f;
        applyLayoutToView(mText5, dm, layoutDescs_mText5, true, false);

        ArrayList<LayoutDesc> layoutDescs_mTextarea = new ArrayList<LayoutDesc>();
        layoutDescs_mTextarea.add(new LayoutDesc(10, 283.0f, 889.56f, LayoutDesc.NO_VALUE, 396.26f, 103.33f));  // 720*1280 px
        layoutDescs_mTextarea.add(new LayoutDesc(2, 123.0f, 401.73f, LayoutDesc.NO_VALUE, 172.23f, 44.91f));  // 240*320 px
        layoutDescs_mTextarea.add(new LayoutDesc(12, 357.0f, 1127.73f, LayoutDesc.NO_VALUE, 499.80f, 130.33f));  // 1080*1920 px
        layoutDescs_mTextarea.add(new LayoutDesc(8, 200.0f, 626.45f, LayoutDesc.NO_VALUE, 281.01f, 73.28f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mTextarea = mOverrideElementLayoutDescriptors.get("textarea");
            if (override_mTextarea != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mTextarea.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mTextarea = layoutDescs;
                }
            }
        }
        layoutDescs_mTextarea.get(0).offsetInFlow = -60.52f;
        layoutDescs_mTextarea.get(1).offsetInFlow = -26.31f;
        layoutDescs_mTextarea.get(2).offsetInFlow = -76.34f;
        layoutDescs_mTextarea.get(3).offsetInFlow = -42.92f;
        applyLayoutToView(mTextarea, dm, layoutDescs_mTextarea, true, true);

        ArrayList<LayoutDesc> layoutDescs_mIconButton4 = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton4.add(new LayoutDesc(10, 620.0f, 943.89f, LayoutDesc.NO_VALUE, 59.50f, 51.0f));  // 720*1280 px
        layoutDescs_mIconButton4.add(new LayoutDesc(2, 270.0f, 425.64f, LayoutDesc.NO_VALUE, 25.86f, 22.17f));  // 240*320 px
        layoutDescs_mIconButton4.add(new LayoutDesc(12, 782.0f, 1197.06f, LayoutDesc.NO_VALUE, 75.05f, 64.33f));  // 1080*1920 px
        layoutDescs_mIconButton4.add(new LayoutDesc(8, 440.0f, 665.72f, LayoutDesc.NO_VALUE, 42.20f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mIconButton4 = mOverrideElementLayoutDescriptors.get("iconButton4");
            if (override_mIconButton4 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mIconButton4.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mIconButton4 = layoutDescs;
                }
            }
        }
        layoutDescs_mIconButton4.get(0).offsetInFlow = -48.62f;
        layoutDescs_mIconButton4.get(1).offsetInFlow = -21.13f;
        layoutDescs_mIconButton4.get(2).offsetInFlow = -61.32f;
        layoutDescs_mIconButton4.get(3).offsetInFlow = -34.48f;
        applyLayoutToView(mIconButton4, dm, layoutDescs_mIconButton4, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText6 = new ArrayList<LayoutDesc>();
        layoutDescs_mText6.add(new LayoutDesc(10, 35.0f, 1056.89f, LayoutDesc.NO_VALUE, 446.29f, 63.0f));  // 720*1280 px
        layoutDescs_mText6.add(new LayoutDesc(2, 15.0f, 474.81f, LayoutDesc.NO_VALUE, 193.98f, 30.0f));  // 240*320 px
        layoutDescs_mText6.add(new LayoutDesc(12, 44.0f, 1339.39f, LayoutDesc.NO_VALUE, 562.90f, 77.0f));  // 1080*1920 px
        layoutDescs_mText6.add(new LayoutDesc(8, 25.0f, 745.89f, LayoutDesc.NO_VALUE, 316.48f, 46.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText6 = mOverrideElementLayoutDescriptors.get("text6");
            if (override_mText6 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText6.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText6 = layoutDescs;
                }
            }
        }
        layoutDescs_mText6.get(0).offsetInFlow = 62.03f;
        layoutDescs_mText6.get(1).offsetInFlow = 26.96f;
        layoutDescs_mText6.get(2).offsetInFlow = 78.24f;
        layoutDescs_mText6.get(3).offsetInFlow = 43.99f;
        applyLayoutToView(mText6, dm, layoutDescs_mText6, true, false);

        ArrayList<LayoutDesc> layoutDescs_mButton4 = new ArrayList<LayoutDesc>();
        layoutDescs_mButton4.add(new LayoutDesc(10, 287.0f, 1062.89f, LayoutDesc.NO_VALUE, 292.89f, 63.76f));  // 720*1280 px
        layoutDescs_mButton4.add(new LayoutDesc(2, 125.0f, 476.81f, LayoutDesc.NO_VALUE, 127.30f, 27.71f));  // 240*320 px
        layoutDescs_mButton4.add(new LayoutDesc(12, 362.0f, 1346.39f, LayoutDesc.NO_VALUE, 369.41f, 80.41f));  // 1080*1920 px
        layoutDescs_mButton4.add(new LayoutDesc(8, 203.0f, 749.89f, LayoutDesc.NO_VALUE, 207.70f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mButton4 = mOverrideElementLayoutDescriptors.get("button4");
            if (override_mButton4 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mButton4.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mButton4 = layoutDescs;
                }
            }
        }
        layoutDescs_mButton4.get(0).offsetInFlow = -51.0f;
        layoutDescs_mButton4.get(1).offsetInFlow = -22.17f;
        layoutDescs_mButton4.get(2).offsetInFlow = -64.33f;
        layoutDescs_mButton4.get(3).offsetInFlow = -36.17f;
        applyLayoutToView(mButton4, dm, layoutDescs_mButton4, true, true);

        ArrayList<LayoutDesc> layoutDescs_mButton2 = new ArrayList<LayoutDesc>();
        layoutDescs_mButton2.add(new LayoutDesc(10, 86.0f, 1186.65f, LayoutDesc.NO_VALUE, 212.52f, 63.76f));  // 720*1280 px
        layoutDescs_mButton2.add(new LayoutDesc(2, 37.0f, 530.52f, LayoutDesc.NO_VALUE, 92.37f, 27.71f));  // 240*320 px
        layoutDescs_mButton2.add(new LayoutDesc(12, 108.0f, 1502.80f, LayoutDesc.NO_VALUE, 268.05f, 80.41f));  // 1080*1920 px
        layoutDescs_mButton2.add(new LayoutDesc(8, 61.0f, 838.11f, LayoutDesc.NO_VALUE, 150.71f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mButton2 = mOverrideElementLayoutDescriptors.get("button2");
            if (override_mButton2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mButton2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mButton2 = layoutDescs;
                }
            }
        }
        layoutDescs_mButton2.get(0).offsetInFlow = 60.39f;
        layoutDescs_mButton2.get(1).offsetInFlow = 26.25f;
        layoutDescs_mButton2.get(2).offsetInFlow = 76.17f;
        layoutDescs_mButton2.get(3).offsetInFlow = 42.82f;
        applyLayoutToView(mButton2, dm, layoutDescs_mButton2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mButton3 = new ArrayList<LayoutDesc>();
        layoutDescs_mButton3.add(new LayoutDesc(10, 418.0f, 1184.40f, LayoutDesc.NO_VALUE, 212.52f, 63.76f));  // 720*1280 px
        layoutDescs_mButton3.add(new LayoutDesc(2, 182.0f, 529.23f, LayoutDesc.NO_VALUE, 92.37f, 27.71f));  // 240*320 px
        layoutDescs_mButton3.add(new LayoutDesc(12, 527.0f, 1500.22f, LayoutDesc.NO_VALUE, 268.05f, 80.41f));  // 1080*1920 px
        layoutDescs_mButton3.add(new LayoutDesc(8, 296.0f, 836.32f, LayoutDesc.NO_VALUE, 150.71f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mButton3 = mOverrideElementLayoutDescriptors.get("button3");
            if (override_mButton3 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mButton3.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mButton3 = layoutDescs;
                }
            }
        }
        layoutDescs_mButton3.get(0).offsetInFlow = -65.73f;
        layoutDescs_mButton3.get(1).offsetInFlow = -28.57f;
        layoutDescs_mButton3.get(2).offsetInFlow = -82.90f;
        layoutDescs_mButton3.get(3).offsetInFlow = -46.61f;
        applyLayoutToView(mButton3, dm, layoutDescs_mButton3, true, true);

        ArrayList<LayoutDesc> layoutDescs_mFixedButton = new ArrayList<LayoutDesc>();
        layoutDescs_mFixedButton.add(new LayoutDesc(10, 265.0f, 1298.16f, LayoutDesc.NO_VALUE, 212.52f, 63.76f));  // 720*1280 px
        layoutDescs_mFixedButton.add(new LayoutDesc(2, 115.0f, 578.94f, LayoutDesc.NO_VALUE, 92.37f, 27.71f));  // 240*320 px
        layoutDescs_mFixedButton.add(new LayoutDesc(12, 335.0f, 1643.63f, LayoutDesc.NO_VALUE, 268.05f, 80.41f));  // 1080*1920 px
        layoutDescs_mFixedButton.add(new LayoutDesc(8, 188.0f, 916.53f, LayoutDesc.NO_VALUE, 150.71f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mFixedButton = mOverrideElementLayoutDescriptors.get("fixedButton");
            if (override_mFixedButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mFixedButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mFixedButton = layoutDescs;
                }
            }
        }
        layoutDescs_mFixedButton.get(0).offsetInFlow = 50.03f;
        layoutDescs_mFixedButton.get(1).offsetInFlow = 21.75f;
        layoutDescs_mFixedButton.get(2).offsetInFlow = 63.10f;
        layoutDescs_mFixedButton.get(3).offsetInFlow = 35.48f;
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
        layoutDescs_mText.add(new LayoutDesc(10, 271.0f, 37.0f, LayoutDesc.NO_VALUE, 445.74f, 63.0f));  // 720*1280 px
        layoutDescs_mText.add(new LayoutDesc(2, 118.0f, 16.0f, LayoutDesc.NO_VALUE, 193.74f, 30.0f));  // 240*320 px
        layoutDescs_mText.add(new LayoutDesc(12, 341.0f, 48.0f, LayoutDesc.NO_VALUE, 562.21f, 77.0f));  // 1080*1920 px
        layoutDescs_mText.add(new LayoutDesc(8, 192.0f, 26.0f, LayoutDesc.NO_VALUE, 316.10f, 46.0f));  // 480*800 px
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
