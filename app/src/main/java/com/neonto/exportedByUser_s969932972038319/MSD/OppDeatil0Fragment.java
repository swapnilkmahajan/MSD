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

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.MarkerOptions;
import android.location.Geocoder;
import android.location.Address;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.CameraUpdate;

import com.neonto.exportedByUser_s969932972038319.MSD.R;

public class OppDeatil0Fragment extends Fragment {

    private OppDeatil0BackgroundShapeView mBackgroundShape;
    private OppDeatil0ImageView mImage;
    private TextView mText2;
    private TextView mText3;
    private TextView mText4;
    private TextView mText5;
    private com.google.android.gms.maps.MapView mMap;
    private TextView mText6;
    private TextView mText7;
    private ImageButton mIconButton8;
    private TextView mText8;
    private ImageButton mIconButton7;
    private TextView mText;
    private ImageButton mIconButton6;
    private TextView mText10;
    private ImageButton mIconButton5;
    private TextView mText11;
    private ImageButton mIconButton4;
    private TextView mText12;
    private Button mFixedButton;
    private OppDeatil0Image2View mImage2;
    private TextView mText9;
    private ImageButton mIconButton;
    private ImageButton mIconButton2;
    private Button mButton;
    private ScrollView mFlowScrollView;

    public OppDeatil0Fragment() {  // fragment must have a constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_opp_deatil0, container, false);
                
        mBackgroundShape = (OppDeatil0BackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mImage = (OppDeatil0ImageView) rootView.findViewById(R.id.mImage);
        mText2 = (TextView) rootView.findViewById(R.id.mText2);
        mText3 = (TextView) rootView.findViewById(R.id.mText3);
        mText4 = (TextView) rootView.findViewById(R.id.mText4);
        mText5 = (TextView) rootView.findViewById(R.id.mText5);
        mMap = (com.google.android.gms.maps.MapView) rootView.findViewById(R.id.mMap);
        mText6 = (TextView) rootView.findViewById(R.id.mText6);
        mText7 = (TextView) rootView.findViewById(R.id.mText7);
        mIconButton8 = (ImageButton) rootView.findViewById(R.id.mIconButton8);
        mText8 = (TextView) rootView.findViewById(R.id.mText8);
        mIconButton7 = (ImageButton) rootView.findViewById(R.id.mIconButton7);
        mText = (TextView) rootView.findViewById(R.id.mText);
        mIconButton6 = (ImageButton) rootView.findViewById(R.id.mIconButton6);
        mText10 = (TextView) rootView.findViewById(R.id.mText10);
        mIconButton5 = (ImageButton) rootView.findViewById(R.id.mIconButton5);
        mText11 = (TextView) rootView.findViewById(R.id.mText11);
        mIconButton4 = (ImageButton) rootView.findViewById(R.id.mIconButton4);
        mText12 = (TextView) rootView.findViewById(R.id.mText12);
        mFixedButton = (Button) rootView.findViewById(R.id.mFixedButton);
        mImage2 = (OppDeatil0Image2View) rootView.findViewById(R.id.mImage2);
        mText9 = (TextView) rootView.findViewById(R.id.mText9);
        mIconButton = (ImageButton) rootView.findViewById(R.id.mIconButton);
        mIconButton2 = (ImageButton) rootView.findViewById(R.id.mIconButton2);
        mButton = (Button) rootView.findViewById(R.id.mButton);
        final OppDeatil0Fragment fragment = this;

        final Context context = getActivity().getBaseContext();
        
        

        

        

        

        
        mMap.onCreate(savedInstanceState);
        {
            GoogleMap map = mMap.getMap();
            map.setMyLocationEnabled(true);
            
            MapsInitializer.initialize(this.getActivity());
            CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(new LatLng(60.170689, 24.942556), 13);
            map.animateCamera(cameraUpdate);
        }

        

        

        

        

        

        

        

        

        

        

        

        

        
        mFixedButton.setTransformationMethod(null);

        

        
        mIconButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
                Activity activity = getActivity();
                View drawer = activity.findViewById(R.id.drawer_menu);
                ((android.support.v4.widget.DrawerLayout) activity.findViewById(R.id.drawer_layout)).openDrawer(drawer);
        
           }
        });

        

        
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
                                .setMessage("Completed successfully! You gained 100 pts. Level up! Unlock Level2.")
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
    public void onDestroy() {
        super.onDestroy();
        
        mMap.onDestroy();
        
    }

    @Override
    public void onPause() {
        super.onPause();
        
        mMap.onPause();
        
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        
        mMap.onLowMemory();
        
    }

    @Override
    public void onResume() {
        super.onResume();
        
        mMap.onResume();
        
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
        layoutDescs_mImage.add(new LayoutDesc(10, 0.0f, 154.0f, LayoutDesc.NO_VALUE, 722.0f, 332.0f));  // 720*1280 px
        layoutDescs_mImage.add(new LayoutDesc(2, 0.0f, 67.0f, LayoutDesc.NO_VALUE, 314.0f, 145.0f));  // 240*320 px
        layoutDescs_mImage.add(new LayoutDesc(12, 0.0f, 194.0f, LayoutDesc.NO_VALUE, 911.0f, 419.0f));  // 1080*1920 px
        layoutDescs_mImage.add(new LayoutDesc(8, 0.0f, 109.0f, LayoutDesc.NO_VALUE, 512.0f, 236.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mImage = mOverrideElementLayoutDescriptors.get("image");
            if (override_mImage != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mImage.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mImage = layoutDescs;
                }
            }
        }
        layoutDescs_mImage.get(0).contentTransformMatricesString = "[0.288800000, 0.0, 0.0, 0.288800000, 0.0, -195.0]; [0.288800000, 0.0, 0.0, 0.288800000, 0.0, -195.0]";
        layoutDescs_mImage.get(1).contentTransformMatricesString = "[0.125600000, 0.0, 0.0, 0.125600000, 0.0, -84.5]; [0.125600000, 0.0, 0.0, 0.125600000, 0.0, -84.5]";
        layoutDescs_mImage.get(2).contentTransformMatricesString = "[0.364400000, 0.0, 0.0, 0.364400000, 0.0, -246.0]; [0.364400000, 0.0, 0.0, 0.364400000, 0.0, -246.0]";
        layoutDescs_mImage.get(3).contentTransformMatricesString = "[0.204800000, 0.0, 0.0, 0.204800000, 0.0, -138.0]; [0.204800000, 0.0, 0.0, 0.204800000, 0.0, -138.0]";
        layoutDescs_mImage.get(0).offsetInFlow = 153.91f;
        layoutDescs_mImage.get(1).offsetInFlow = 66.90f;
        layoutDescs_mImage.get(2).offsetInFlow = 194.12f;
        layoutDescs_mImage.get(3).offsetInFlow = 109.14f;
        applyLayoutToView(mImage, dm, layoutDescs_mImage, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText2 = new ArrayList<LayoutDesc>();
        layoutDescs_mText2.add(new LayoutDesc(10, 39.0f, 495.0f, LayoutDesc.NO_VALUE, 446.29f, 51.0f));  // 720*1280 px
        layoutDescs_mText2.add(new LayoutDesc(2, 17.0f, 216.0f, LayoutDesc.NO_VALUE, 193.98f, 25.0f));  // 240*320 px
        layoutDescs_mText2.add(new LayoutDesc(12, 49.0f, 624.0f, LayoutDesc.NO_VALUE, 562.90f, 63.0f));  // 1080*1920 px
        layoutDescs_mText2.add(new LayoutDesc(8, 27.0f, 351.0f, LayoutDesc.NO_VALUE, 316.48f, 38.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText2 = mOverrideElementLayoutDescriptors.get("text2");
            if (override_mText2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText2 = layoutDescs;
                }
            }
        }
        layoutDescs_mText2.get(0).offsetInFlow = 8.50f;
        layoutDescs_mText2.get(1).offsetInFlow = 3.69f;
        layoutDescs_mText2.get(2).offsetInFlow = 10.72f;
        layoutDescs_mText2.get(3).offsetInFlow = 6.03f;
        applyLayoutToView(mText2, dm, layoutDescs_mText2, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText3 = new ArrayList<LayoutDesc>();
        layoutDescs_mText3.add(new LayoutDesc(10, 37.0f, 549.0f, LayoutDesc.NO_VALUE, 446.29f, 63.0f));  // 720*1280 px
        layoutDescs_mText3.add(new LayoutDesc(2, 16.0f, 239.0f, LayoutDesc.NO_VALUE, 193.98f, 30.0f));  // 240*320 px
        layoutDescs_mText3.add(new LayoutDesc(12, 47.0f, 692.0f, LayoutDesc.NO_VALUE, 562.90f, 77.0f));  // 1080*1920 px
        layoutDescs_mText3.add(new LayoutDesc(8, 27.0f, 389.0f, LayoutDesc.NO_VALUE, 316.48f, 46.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText3 = mOverrideElementLayoutDescriptors.get("text3");
            if (override_mText3 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText3.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText3 = layoutDescs;
                }
            }
        }
        layoutDescs_mText3.get(0).offsetInFlow = 8.50f;
        layoutDescs_mText3.get(1).offsetInFlow = 3.69f;
        layoutDescs_mText3.get(2).offsetInFlow = 10.72f;
        layoutDescs_mText3.get(3).offsetInFlow = 6.03f;
        applyLayoutToView(mText3, dm, layoutDescs_mText3, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText4 = new ArrayList<LayoutDesc>();
        layoutDescs_mText4.add(new LayoutDesc(10, 42.0f, 615.0f, LayoutDesc.NO_VALUE, 635.05f, 231.0f));  // 720*1280 px
        layoutDescs_mText4.add(new LayoutDesc(2, 18.0f, 267.0f, LayoutDesc.NO_VALUE, 276.02f, 101.0f));  // 240*320 px
        layoutDescs_mText4.add(new LayoutDesc(12, 53.0f, 774.0f, LayoutDesc.NO_VALUE, 800.98f, 291.0f));  // 1080*1920 px
        layoutDescs_mText4.add(new LayoutDesc(8, 30.0f, 435.0f, LayoutDesc.NO_VALUE, 450.34f, 166.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText4 = mOverrideElementLayoutDescriptors.get("text4");
            if (override_mText4 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText4.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText4 = layoutDescs;
                }
            }
        }
        layoutDescs_mText4.get(0).offsetInFlow = 8.50f;
        layoutDescs_mText4.get(1).offsetInFlow = 3.69f;
        layoutDescs_mText4.get(2).offsetInFlow = 10.72f;
        layoutDescs_mText4.get(3).offsetInFlow = 6.03f;
        applyLayoutToView(mText4, dm, layoutDescs_mText4, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText5 = new ArrayList<LayoutDesc>();
        layoutDescs_mText5.add(new LayoutDesc(10, 39.0f, 849.0f, LayoutDesc.NO_VALUE, 633.45f, 96.0f));  // 720*1280 px
        layoutDescs_mText5.add(new LayoutDesc(2, 17.0f, 366.0f, LayoutDesc.NO_VALUE, 275.33f, 44.0f));  // 240*320 px
        layoutDescs_mText5.add(new LayoutDesc(12, 49.0f, 1070.0f, LayoutDesc.NO_VALUE, 798.97f, 120.0f));  // 1080*1920 px
        layoutDescs_mText5.add(new LayoutDesc(8, 28.0f, 601.0f, LayoutDesc.NO_VALUE, 449.21f, 70.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText5 = mOverrideElementLayoutDescriptors.get("text5");
            if (override_mText5 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText5.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText5 = layoutDescs;
                }
            }
        }
        layoutDescs_mText5.get(0).offsetInFlow = 8.50f;
        layoutDescs_mText5.get(1).offsetInFlow = 3.69f;
        layoutDescs_mText5.get(2).offsetInFlow = 10.72f;
        layoutDescs_mText5.get(3).offsetInFlow = 6.03f;
        applyLayoutToView(mText5, dm, layoutDescs_mText5, true, false);

        ArrayList<LayoutDesc> layoutDescs_mMap = new ArrayList<LayoutDesc>();
        layoutDescs_mMap.add(new LayoutDesc(10, 164.0f, 958.0f, LayoutDesc.NO_VALUE, 392.30f, 323.19f));  // 720*1280 px
        layoutDescs_mMap.add(new LayoutDesc(2, 71.0f, 412.0f, LayoutDesc.NO_VALUE, 170.51f, 140.48f));  // 240*320 px
        layoutDescs_mMap.add(new LayoutDesc(12, 206.0f, 1209.0f, LayoutDesc.NO_VALUE, 494.80f, 407.64f));  // 1080*1920 px
        layoutDescs_mMap.add(new LayoutDesc(8, 116.0f, 679.0f, LayoutDesc.NO_VALUE, 278.20f, 229.19f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mMap = mOverrideElementLayoutDescriptors.get("map");
            if (override_mMap != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mMap.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mMap = layoutDescs;
                }
            }
        }
        layoutDescs_mMap.get(0).offsetInFlow = 19.49f;
        layoutDescs_mMap.get(1).offsetInFlow = 8.47f;
        layoutDescs_mMap.get(2).offsetInFlow = 24.58f;
        layoutDescs_mMap.get(3).offsetInFlow = 13.82f;
        applyLayoutToView(mMap, dm, layoutDescs_mMap, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText6 = new ArrayList<LayoutDesc>();
        layoutDescs_mText6.add(new LayoutDesc(10, 41.0f, 1290.19f, LayoutDesc.NO_VALUE, 637.54f, 141.0f));  // 720*1280 px
        layoutDescs_mText6.add(new LayoutDesc(2, 18.0f, 556.48f, LayoutDesc.NO_VALUE, 277.10f, 63.0f));  // 240*320 px
        layoutDescs_mText6.add(new LayoutDesc(12, 52.0f, 1627.64f, LayoutDesc.NO_VALUE, 804.12f, 177.0f));  // 1080*1920 px
        layoutDescs_mText6.add(new LayoutDesc(8, 29.0f, 914.19f, LayoutDesc.NO_VALUE, 452.11f, 102.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText6 = mOverrideElementLayoutDescriptors.get("text6");
            if (override_mText6 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText6.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText6 = layoutDescs;
                }
            }
        }
        layoutDescs_mText6.get(0).offsetInFlow = 8.50f;
        layoutDescs_mText6.get(1).offsetInFlow = 3.69f;
        layoutDescs_mText6.get(2).offsetInFlow = 10.72f;
        layoutDescs_mText6.get(3).offsetInFlow = 6.03f;
        applyLayoutToView(mText6, dm, layoutDescs_mText6, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText7 = new ArrayList<LayoutDesc>();
        layoutDescs_mText7.add(new LayoutDesc(10, 37.0f, 1434.19f, LayoutDesc.NO_VALUE, 446.29f, 51.0f));  // 720*1280 px
        layoutDescs_mText7.add(new LayoutDesc(2, 16.0f, 617.48f, LayoutDesc.NO_VALUE, 193.98f, 25.0f));  // 240*320 px
        layoutDescs_mText7.add(new LayoutDesc(12, 47.0f, 1809.64f, LayoutDesc.NO_VALUE, 562.90f, 63.0f));  // 1080*1920 px
        layoutDescs_mText7.add(new LayoutDesc(8, 27.0f, 1016.19f, LayoutDesc.NO_VALUE, 316.48f, 38.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText7 = mOverrideElementLayoutDescriptors.get("text7");
            if (override_mText7 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText7.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText7 = layoutDescs;
                }
            }
        }
        layoutDescs_mText7.get(0).offsetInFlow = 8.50f;
        layoutDescs_mText7.get(1).offsetInFlow = 3.69f;
        layoutDescs_mText7.get(2).offsetInFlow = 10.72f;
        layoutDescs_mText7.get(3).offsetInFlow = 6.03f;
        applyLayoutToView(mText7, dm, layoutDescs_mText7, true, false);

        ArrayList<LayoutDesc> layoutDescs_mIconButton8 = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton8.add(new LayoutDesc(10, 47.0f, 1499.19f, LayoutDesc.NO_VALUE, 59.50f, 51.0f));  // 720*1280 px
        layoutDescs_mIconButton8.add(new LayoutDesc(2, 20.0f, 645.48f, LayoutDesc.NO_VALUE, 25.86f, 22.17f));  // 240*320 px
        layoutDescs_mIconButton8.add(new LayoutDesc(12, 59.0f, 1891.64f, LayoutDesc.NO_VALUE, 75.05f, 64.33f));  // 1080*1920 px
        layoutDescs_mIconButton8.add(new LayoutDesc(8, 33.0f, 1062.19f, LayoutDesc.NO_VALUE, 42.20f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mIconButton8 = mOverrideElementLayoutDescriptors.get("iconButton8");
            if (override_mIconButton8 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mIconButton8.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mIconButton8 = layoutDescs;
                }
            }
        }
        layoutDescs_mIconButton8.get(0).offsetInFlow = 19.81f;
        layoutDescs_mIconButton8.get(1).offsetInFlow = 8.61f;
        layoutDescs_mIconButton8.get(2).offsetInFlow = 24.99f;
        layoutDescs_mIconButton8.get(3).offsetInFlow = 14.05f;
        applyLayoutToView(mIconButton8, dm, layoutDescs_mIconButton8, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText8 = new ArrayList<LayoutDesc>();
        layoutDescs_mText8.add(new LayoutDesc(10, 43.0f, 1560.20f, LayoutDesc.NO_VALUE, 108.55f, 45.0f));  // 720*1280 px
        layoutDescs_mText8.add(new LayoutDesc(2, 18.0f, 671.64f, LayoutDesc.NO_VALUE, 47.18f, 24.0f));  // 240*320 px
        layoutDescs_mText8.add(new LayoutDesc(12, 54.0f, 1967.97f, LayoutDesc.NO_VALUE, 136.92f, 55.0f));  // 1080*1920 px
        layoutDescs_mText8.add(new LayoutDesc(8, 30.0f, 1105.36f, LayoutDesc.NO_VALUE, 76.98f, 34.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText8 = mOverrideElementLayoutDescriptors.get("text8");
            if (override_mText8 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText8.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText8 = layoutDescs;
                }
            }
        }
        layoutDescs_mText8.get(0).offsetInFlow = 9.78f;
        layoutDescs_mText8.get(1).offsetInFlow = 4.25f;
        layoutDescs_mText8.get(2).offsetInFlow = 12.33f;
        layoutDescs_mText8.get(3).offsetInFlow = 6.93f;
        applyLayoutToView(mText8, dm, layoutDescs_mText8, true, false);

        ArrayList<LayoutDesc> layoutDescs_mIconButton7 = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton7.add(new LayoutDesc(10, 185.0f, 1498.20f, LayoutDesc.NO_VALUE, 59.50f, 51.0f));  // 720*1280 px
        layoutDescs_mIconButton7.add(new LayoutDesc(2, 80.0f, 645.64f, LayoutDesc.NO_VALUE, 25.86f, 22.17f));  // 240*320 px
        layoutDescs_mIconButton7.add(new LayoutDesc(12, 234.0f, 1888.97f, LayoutDesc.NO_VALUE, 75.05f, 64.33f));  // 1080*1920 px
        layoutDescs_mIconButton7.add(new LayoutDesc(8, 131.0f, 1061.36f, LayoutDesc.NO_VALUE, 42.20f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mIconButton7 = mOverrideElementLayoutDescriptors.get("iconButton7");
            if (override_mIconButton7 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mIconButton7.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mIconButton7 = layoutDescs;
                }
            }
        }
        layoutDescs_mIconButton7.get(0).offsetInFlow = -101.12f;
        layoutDescs_mIconButton7.get(1).offsetInFlow = -43.95f;
        layoutDescs_mIconButton7.get(2).offsetInFlow = -127.54f;
        layoutDescs_mIconButton7.get(3).offsetInFlow = -71.71f;
        applyLayoutToView(mIconButton7, dm, layoutDescs_mIconButton7, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText = new ArrayList<LayoutDesc>();
        layoutDescs_mText.add(new LayoutDesc(10, 157.0f, 1558.2f, LayoutDesc.NO_VALUE, 145.34f, 45.0f));  // 720*1280 px
        layoutDescs_mText.add(new LayoutDesc(2, 68.0f, 671.81f, LayoutDesc.NO_VALUE, 63.17f, 42.0f));  // 240*320 px
        layoutDescs_mText.add(new LayoutDesc(12, 198.0f, 1965.30f, LayoutDesc.NO_VALUE, 183.32f, 55.0f));  // 1080*1920 px
        layoutDescs_mText.add(new LayoutDesc(8, 111.0f, 1104.53f, LayoutDesc.NO_VALUE, 103.07f, 34.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText = mOverrideElementLayoutDescriptors.get("text");
            if (override_mText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText = layoutDescs;
                }
            }
        }
        layoutDescs_mText.get(0).offsetInFlow = 9.25f;
        layoutDescs_mText.get(1).offsetInFlow = 4.02f;
        layoutDescs_mText.get(2).offsetInFlow = 11.67f;
        layoutDescs_mText.get(3).offsetInFlow = 6.56f;
        applyLayoutToView(mText, dm, layoutDescs_mText, true, false);

        ArrayList<LayoutDesc> layoutDescs_mIconButton6 = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton6.add(new LayoutDesc(10, 327.0f, 1500.2f, LayoutDesc.NO_VALUE, 59.50f, 51.0f));  // 720*1280 px
        layoutDescs_mIconButton6.add(new LayoutDesc(2, 142.0f, 665.81f, LayoutDesc.NO_VALUE, 25.86f, 22.17f));  // 240*320 px
        layoutDescs_mIconButton6.add(new LayoutDesc(12, 412.0f, 1892.30f, LayoutDesc.NO_VALUE, 75.05f, 64.33f));  // 1080*1920 px
        layoutDescs_mIconButton6.add(new LayoutDesc(8, 232.0f, 1063.53f, LayoutDesc.NO_VALUE, 42.20f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mIconButton6 = mOverrideElementLayoutDescriptors.get("iconButton6");
            if (override_mIconButton6 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mIconButton6.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mIconButton6 = layoutDescs;
                }
            }
        }
        layoutDescs_mIconButton6.get(0).offsetInFlow = -96.75f;
        layoutDescs_mIconButton6.get(1).offsetInFlow = -42.05f;
        layoutDescs_mIconButton6.get(2).offsetInFlow = -122.03f;
        layoutDescs_mIconButton6.get(3).offsetInFlow = -68.61f;
        applyLayoutToView(mIconButton6, dm, layoutDescs_mIconButton6, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText10 = new ArrayList<LayoutDesc>();
        layoutDescs_mText10.add(new LayoutDesc(10, 306.0f, 1560.20f, LayoutDesc.NO_VALUE, 446.29f, 45.0f));  // 720*1280 px
        layoutDescs_mText10.add(new LayoutDesc(2, 133.0f, 691.98f, LayoutDesc.NO_VALUE, 193.98f, 24.0f));  // 240*320 px
        layoutDescs_mText10.add(new LayoutDesc(12, 387.0f, 1967.63f, LayoutDesc.NO_VALUE, 562.90f, 55.0f));  // 1080*1920 px
        layoutDescs_mText10.add(new LayoutDesc(8, 217.0f, 1105.7f, LayoutDesc.NO_VALUE, 316.48f, 34.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText10 = mOverrideElementLayoutDescriptors.get("text10");
            if (override_mText10 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText10.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText10 = layoutDescs;
                }
            }
        }
        layoutDescs_mText10.get(0).offsetInFlow = 8.50f;
        layoutDescs_mText10.get(1).offsetInFlow = 3.69f;
        layoutDescs_mText10.get(2).offsetInFlow = 10.72f;
        layoutDescs_mText10.get(3).offsetInFlow = 6.03f;
        applyLayoutToView(mText10, dm, layoutDescs_mText10, true, false);

        ArrayList<LayoutDesc> layoutDescs_mIconButton5 = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton5.add(new LayoutDesc(10, 458.0f, 1501.20f, LayoutDesc.NO_VALUE, 59.50f, 51.0f));  // 720*1280 px
        layoutDescs_mIconButton5.add(new LayoutDesc(2, 199.0f, 666.98f, LayoutDesc.NO_VALUE, 25.86f, 22.17f));  // 240*320 px
        layoutDescs_mIconButton5.add(new LayoutDesc(12, 577.0f, 1892.63f, LayoutDesc.NO_VALUE, 75.05f, 64.33f));  // 1080*1920 px
        layoutDescs_mIconButton5.add(new LayoutDesc(8, 324.0f, 1063.7f, LayoutDesc.NO_VALUE, 42.20f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mIconButton5 = mOverrideElementLayoutDescriptors.get("iconButton5");
            if (override_mIconButton5 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mIconButton5.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mIconButton5 = layoutDescs;
                }
            }
        }
        layoutDescs_mIconButton5.get(0).offsetInFlow = -98.39f;
        layoutDescs_mIconButton5.get(1).offsetInFlow = -42.77f;
        layoutDescs_mIconButton5.get(2).offsetInFlow = -124.1f;
        layoutDescs_mIconButton5.get(3).offsetInFlow = -69.77f;
        applyLayoutToView(mIconButton5, dm, layoutDescs_mIconButton5, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText11 = new ArrayList<LayoutDesc>();
        layoutDescs_mText11.add(new LayoutDesc(10, 435.0f, 1560.21f, LayoutDesc.NO_VALUE, 446.29f, 45.0f));  // 720*1280 px
        layoutDescs_mText11.add(new LayoutDesc(2, 189.0f, 693.15f, LayoutDesc.NO_VALUE, 193.98f, 24.0f));  // 240*320 px
        layoutDescs_mText11.add(new LayoutDesc(12, 549.0f, 1966.96f, LayoutDesc.NO_VALUE, 562.90f, 55.0f));  // 1080*1920 px
        layoutDescs_mText11.add(new LayoutDesc(8, 309.0f, 1105.87f, LayoutDesc.NO_VALUE, 316.48f, 34.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText11 = mOverrideElementLayoutDescriptors.get("text11");
            if (override_mText11 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText11.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText11 = layoutDescs;
                }
            }
        }
        layoutDescs_mText11.get(0).offsetInFlow = 8.31f;
        layoutDescs_mText11.get(1).offsetInFlow = 3.61f;
        layoutDescs_mText11.get(2).offsetInFlow = 10.48f;
        layoutDescs_mText11.get(3).offsetInFlow = 5.89f;
        applyLayoutToView(mText11, dm, layoutDescs_mText11, true, false);

        ArrayList<LayoutDesc> layoutDescs_mIconButton4 = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton4.add(new LayoutDesc(10, 579.0f, 1499.21f, LayoutDesc.NO_VALUE, 59.50f, 51.0f));  // 720*1280 px
        layoutDescs_mIconButton4.add(new LayoutDesc(2, 251.0f, 668.15f, LayoutDesc.NO_VALUE, 25.86f, 22.17f));  // 240*320 px
        layoutDescs_mIconButton4.add(new LayoutDesc(12, 730.0f, 1889.96f, LayoutDesc.NO_VALUE, 75.05f, 64.33f));  // 1080*1920 px
        layoutDescs_mIconButton4.add(new LayoutDesc(8, 410.0f, 1062.87f, LayoutDesc.NO_VALUE, 42.20f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mIconButton4 = mOverrideElementLayoutDescriptors.get("iconButton4");
            if (override_mIconButton4 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mIconButton4.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mIconButton4 = layoutDescs;
                }
            }
        }
        layoutDescs_mIconButton4.get(0).offsetInFlow = -99.75f;
        layoutDescs_mIconButton4.get(1).offsetInFlow = -43.36f;
        layoutDescs_mIconButton4.get(2).offsetInFlow = -125.81f;
        layoutDescs_mIconButton4.get(3).offsetInFlow = -70.74f;
        applyLayoutToView(mIconButton4, dm, layoutDescs_mIconButton4, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText12 = new ArrayList<LayoutDesc>();
        layoutDescs_mText12.add(new LayoutDesc(10, 557.0f, 1560.21f, LayoutDesc.NO_VALUE, 446.29f, 45.0f));  // 720*1280 px
        layoutDescs_mText12.add(new LayoutDesc(2, 242.0f, 694.32f, LayoutDesc.NO_VALUE, 193.98f, 24.0f));  // 240*320 px
        layoutDescs_mText12.add(new LayoutDesc(12, 703.0f, 1966.29f, LayoutDesc.NO_VALUE, 562.90f, 55.0f));  // 1080*1920 px
        layoutDescs_mText12.add(new LayoutDesc(8, 395.0f, 1106.04f, LayoutDesc.NO_VALUE, 316.48f, 34.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText12 = mOverrideElementLayoutDescriptors.get("text12");
            if (override_mText12 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText12.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText12 = layoutDescs;
                }
            }
        }
        layoutDescs_mText12.get(0).offsetInFlow = 9.64f;
        layoutDescs_mText12.get(1).offsetInFlow = 4.19f;
        layoutDescs_mText12.get(2).offsetInFlow = 12.16f;
        layoutDescs_mText12.get(3).offsetInFlow = 6.84f;
        applyLayoutToView(mText12, dm, layoutDescs_mText12, true, false);

        ArrayList<LayoutDesc> layoutDescs_mFixedButton = new ArrayList<LayoutDesc>();
        layoutDescs_mFixedButton.add(new LayoutDesc(10, 265.0f, 1649.21f, LayoutDesc.NO_VALUE, 212.52f, 63.76f));  // 720*1280 px
        layoutDescs_mFixedButton.add(new LayoutDesc(2, 115.0f, 734.32f, LayoutDesc.NO_VALUE, 92.37f, 27.71f));  // 240*320 px
        layoutDescs_mFixedButton.add(new LayoutDesc(12, 335.0f, 2078.29f, LayoutDesc.NO_VALUE, 268.05f, 80.41f));  // 1080*1920 px
        layoutDescs_mFixedButton.add(new LayoutDesc(8, 188.0f, 1169.04f, LayoutDesc.NO_VALUE, 150.71f, 45.21f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mText9 = new ArrayList<LayoutDesc>();
        layoutDescs_mText9.add(new LayoutDesc(10, 1.0f, 37.0f, LayoutDesc.NO_VALUE, 714.98f, 63.0f));  // 720*1280 px
        layoutDescs_mText9.add(new LayoutDesc(2, 1.0f, 16.0f, LayoutDesc.NO_VALUE, 310.76f, 30.0f));  // 240*320 px
        layoutDescs_mText9.add(new LayoutDesc(12, 2.0f, 48.0f, LayoutDesc.NO_VALUE, 901.79f, 77.0f));  // 1080*1920 px
        layoutDescs_mText9.add(new LayoutDesc(8, 1.0f, 26.0f, LayoutDesc.NO_VALUE, 507.02f, 46.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mIconButton2 = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton2.add(new LayoutDesc(10, 566.0f, 134.0f, LayoutDesc.NO_VALUE, 59.50f, 51.0f));  // 720*1280 px
        layoutDescs_mIconButton2.add(new LayoutDesc(2, 246.0f, 58.0f, LayoutDesc.NO_VALUE, 25.86f, 22.17f));  // 240*320 px
        layoutDescs_mIconButton2.add(new LayoutDesc(12, 713.0f, 170.0f, LayoutDesc.NO_VALUE, 75.05f, 64.33f));  // 1080*1920 px
        layoutDescs_mIconButton2.add(new LayoutDesc(8, 401.0f, 95.0f, LayoutDesc.NO_VALUE, 42.20f, 36.17f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mButton = new ArrayList<LayoutDesc>();
        layoutDescs_mButton.add(new LayoutDesc(10, 0.0f, 1070.0f, LayoutDesc.NO_VALUE, 722.56f, 119.01f));  // 720*1280 px
        layoutDescs_mButton.add(new LayoutDesc(2, 0.0f, 465.0f, LayoutDesc.NO_VALUE, 314.06f, 51.73f));  // 240*320 px
        layoutDescs_mButton.add(new LayoutDesc(12, 0.0f, 1350.0f, LayoutDesc.NO_VALUE, 911.36f, 150.11f));  // 1080*1920 px
        layoutDescs_mButton.add(new LayoutDesc(8, 0.0f, 759.0f, LayoutDesc.NO_VALUE, 512.40f, 84.40f));  // 480*800 px
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
