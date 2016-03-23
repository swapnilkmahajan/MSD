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

public class OppDetail2Fragment extends Fragment {

    private OppDetail2BackgroundShapeView mBackgroundShape;
    private OppDetail2ImageView mImage;
    private TextView mText2;
    private TextView mText3;
    private TextView mText4;
    private TextView mText5;
    private com.google.android.gms.maps.MapView mMap;
    private TextView mText6;
    private TextView mText7;
    private ImageButton mIconButton3;
    private TextView mText8;
    private ImageButton mIconButton4;
    private TextView mText;
    private ImageButton mIconButton5;
    private TextView mText10;
    private ImageButton mIconButton6;
    private TextView mText11;
    private ImageButton mIconButton7;
    private TextView mText12;
    private TextView mText13;
    private OppDetail2Image3View mImage3;
    private TextView mText15;
    private TextView mText14;
    private TextView mText16;
    private TextView mText17;
    private Button mHotspot;
    private OppDetail2Image4View mImage4;
    private TextView mText18;
    private TextView mText1;
    private TextView mText20;
    private TextView mText21;
    private Button mHotspot2;
    private Button mFixedButton;
    private OppDetail2Image2View mImage2;
    private TextView mText9;
    private ImageButton mIconButton;
    private ImageButton mIconButton2;
    private Button mButton;
    private ScrollView mFlowScrollView;

    public OppDetail2Fragment() {  // fragment must have a constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_opp_detail2, container, false);
                
        mBackgroundShape = (OppDetail2BackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mImage = (OppDetail2ImageView) rootView.findViewById(R.id.mImage);
        mText2 = (TextView) rootView.findViewById(R.id.mText2);
        mText3 = (TextView) rootView.findViewById(R.id.mText3);
        mText4 = (TextView) rootView.findViewById(R.id.mText4);
        mText5 = (TextView) rootView.findViewById(R.id.mText5);
        mMap = (com.google.android.gms.maps.MapView) rootView.findViewById(R.id.mMap);
        mText6 = (TextView) rootView.findViewById(R.id.mText6);
        mText7 = (TextView) rootView.findViewById(R.id.mText7);
        mIconButton3 = (ImageButton) rootView.findViewById(R.id.mIconButton3);
        mText8 = (TextView) rootView.findViewById(R.id.mText8);
        mIconButton4 = (ImageButton) rootView.findViewById(R.id.mIconButton4);
        mText = (TextView) rootView.findViewById(R.id.mText);
        mIconButton5 = (ImageButton) rootView.findViewById(R.id.mIconButton5);
        mText10 = (TextView) rootView.findViewById(R.id.mText10);
        mIconButton6 = (ImageButton) rootView.findViewById(R.id.mIconButton6);
        mText11 = (TextView) rootView.findViewById(R.id.mText11);
        mIconButton7 = (ImageButton) rootView.findViewById(R.id.mIconButton7);
        mText12 = (TextView) rootView.findViewById(R.id.mText12);
        mText13 = (TextView) rootView.findViewById(R.id.mText13);
        mImage3 = (OppDetail2Image3View) rootView.findViewById(R.id.mImage3);
        mText15 = (TextView) rootView.findViewById(R.id.mText15);
        mText14 = (TextView) rootView.findViewById(R.id.mText14);
        mText16 = (TextView) rootView.findViewById(R.id.mText16);
        mText17 = (TextView) rootView.findViewById(R.id.mText17);
        mHotspot = (Button) rootView.findViewById(R.id.mHotspot);
        mImage4 = (OppDetail2Image4View) rootView.findViewById(R.id.mImage4);
        mText18 = (TextView) rootView.findViewById(R.id.mText18);
        mText1 = (TextView) rootView.findViewById(R.id.mText1);
        mText20 = (TextView) rootView.findViewById(R.id.mText20);
        mText21 = (TextView) rootView.findViewById(R.id.mText21);
        mHotspot2 = (Button) rootView.findViewById(R.id.mHotspot2);
        mFixedButton = (Button) rootView.findViewById(R.id.mFixedButton);
        mImage2 = (OppDetail2Image2View) rootView.findViewById(R.id.mImage2);
        mText9 = (TextView) rootView.findViewById(R.id.mText9);
        mIconButton = (ImageButton) rootView.findViewById(R.id.mIconButton);
        mIconButton2 = (ImageButton) rootView.findViewById(R.id.mIconButton2);
        mButton = (Button) rootView.findViewById(R.id.mButton);
        final OppDetail2Fragment fragment = this;

        final Context context = getActivity().getBaseContext();
        
        

        

        
        mText4.setTypeface(AppData.getTypeface("Roboto-Regular.ttf", context));

        

        
        mMap.onCreate(savedInstanceState);
        {
            GoogleMap map = mMap.getMap();
            map.setMyLocationEnabled(true);
            
            MapsInitializer.initialize(this.getActivity());
            CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(new LatLng(60.170689, 24.942556), 13);
            map.animateCamera(cameraUpdate);
        }

        

        

        

        

        

        

        

        

        

        

        

        

        

        

        

        

        

        
        mHotspot.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OppDetail1Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                getActivity().startActivity(intent);
        
           }
        });

        

        

        

        

        
        mHotspot2.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OppDetail3Activity.class);
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
                                .setMessage("Registered this event successfully.")
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
        layoutDescs_mImage.add(new LayoutDesc(10, 0.0f, 159.0f, LayoutDesc.NO_VALUE, 725.0f, 332.0f));  // 720*1280 px
        layoutDescs_mImage.add(new LayoutDesc(2, 0.0f, 69.0f, LayoutDesc.NO_VALUE, 315.0f, 145.0f));  // 240*320 px
        layoutDescs_mImage.add(new LayoutDesc(12, 0.0f, 200.0f, LayoutDesc.NO_VALUE, 914.0f, 419.0f));  // 1080*1920 px
        layoutDescs_mImage.add(new LayoutDesc(8, 0.0f, 113.0f, LayoutDesc.NO_VALUE, 514.0f, 236.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mImage = mOverrideElementLayoutDescriptors.get("image");
            if (override_mImage != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mImage.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mImage = layoutDescs;
                }
            }
        }
        layoutDescs_mImage.get(0).contentTransformMatricesString = "[0.385638298, 0.0, 0.0, 0.385638298, 0.0, -38.002659574]; [0.385638298, 0.0, 0.0, 0.385638298, 0.0, -38.002659574]";
        layoutDescs_mImage.get(1).contentTransformMatricesString = "[0.167553191, 0.0, 0.0, 0.167553191, 0.0, -16.135638298]; [0.167553191, 0.0, 0.0, 0.167553191, 0.0, -16.135638298]";
        layoutDescs_mImage.get(2).contentTransformMatricesString = "[0.486170213, 0.0, 0.0, 0.486170213, 0.0, -47.684042553]; [0.486170213, 0.0, 0.0, 0.486170213, 0.0, -47.684042553]";
        layoutDescs_mImage.get(3).contentTransformMatricesString = "[0.273404255, 0.0, 0.0, 0.273404255, 0.0, -26.630851064]; [0.273404255, 0.0, 0.0, 0.273404255, 0.0, -26.630851064]";
        layoutDescs_mImage.get(0).offsetInFlow = 158.96f;
        layoutDescs_mImage.get(1).offsetInFlow = 69.09f;
        layoutDescs_mImage.get(2).offsetInFlow = 200.50f;
        layoutDescs_mImage.get(3).offsetInFlow = 112.73f;
        applyLayoutToView(mImage, dm, layoutDescs_mImage, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText2 = new ArrayList<LayoutDesc>();
        layoutDescs_mText2.add(new LayoutDesc(10, 38.0f, 491.0f, LayoutDesc.NO_VALUE, 446.29f, 51.0f));  // 720*1280 px
        layoutDescs_mText2.add(new LayoutDesc(2, 16.0f, 214.0f, LayoutDesc.NO_VALUE, 193.98f, 25.0f));  // 240*320 px
        layoutDescs_mText2.add(new LayoutDesc(12, 48.0f, 619.0f, LayoutDesc.NO_VALUE, 562.90f, 63.0f));  // 1080*1920 px
        layoutDescs_mText2.add(new LayoutDesc(8, 27.0f, 349.0f, LayoutDesc.NO_VALUE, 316.48f, 38.0f));  // 480*800 px
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
        layoutDescs_mText3.add(new LayoutDesc(10, 40.0f, 536.0f, LayoutDesc.NO_VALUE, 639.17f, 63.0f));  // 720*1280 px
        layoutDescs_mText3.add(new LayoutDesc(2, 17.0f, 233.0f, LayoutDesc.NO_VALUE, 277.82f, 30.0f));  // 240*320 px
        layoutDescs_mText3.add(new LayoutDesc(12, 50.0f, 676.0f, LayoutDesc.NO_VALUE, 806.18f, 77.0f));  // 1080*1920 px
        layoutDescs_mText3.add(new LayoutDesc(8, 28.0f, 381.0f, LayoutDesc.NO_VALUE, 453.27f, 46.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mText4 = new ArrayList<LayoutDesc>();
        layoutDescs_mText4.add(new LayoutDesc(10, 39.0f, 593.0f, LayoutDesc.NO_VALUE, 638.74f, 186.0f));  // 720*1280 px
        layoutDescs_mText4.add(new LayoutDesc(2, 17.0f, 257.0f, LayoutDesc.NO_VALUE, 277.63f, 82.0f));  // 240*320 px
        layoutDescs_mText4.add(new LayoutDesc(12, 49.0f, 747.0f, LayoutDesc.NO_VALUE, 805.63f, 234.0f));  // 1080*1920 px
        layoutDescs_mText4.add(new LayoutDesc(8, 28.0f, 421.0f, LayoutDesc.NO_VALUE, 452.96f, 134.0f));  // 480*800 px
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
        layoutDescs_mText5.add(new LayoutDesc(10, 41.0f, 773.0f, LayoutDesc.NO_VALUE, 639.97f, 96.0f));  // 720*1280 px
        layoutDescs_mText5.add(new LayoutDesc(2, 18.0f, 333.0f, LayoutDesc.NO_VALUE, 278.16f, 44.0f));  // 240*320 px
        layoutDescs_mText5.add(new LayoutDesc(12, 51.0f, 975.0f, LayoutDesc.NO_VALUE, 807.19f, 120.0f));  // 1080*1920 px
        layoutDescs_mText5.add(new LayoutDesc(8, 29.0f, 549.0f, LayoutDesc.NO_VALUE, 453.84f, 70.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText5 = mOverrideElementLayoutDescriptors.get("text5");
            if (override_mText5 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText5.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText5 = layoutDescs;
                }
            }
        }
        layoutDescs_mText5.get(0).offsetInFlow = 0.0f;
        layoutDescs_mText5.get(1).offsetInFlow = 0.0f;
        layoutDescs_mText5.get(2).offsetInFlow = 0.0f;
        layoutDescs_mText5.get(3).offsetInFlow = 0.0f;
        applyLayoutToView(mText5, dm, layoutDescs_mText5, true, false);

        ArrayList<LayoutDesc> layoutDescs_mMap = new ArrayList<LayoutDesc>();
        layoutDescs_mMap.add(new LayoutDesc(10, 173.0f, 862.0f, LayoutDesc.NO_VALUE, 369.78f, 348.53f));  // 720*1280 px
        layoutDescs_mMap.add(new LayoutDesc(2, 75.0f, 371.0f, LayoutDesc.NO_VALUE, 160.72f, 151.49f));  // 240*320 px
        layoutDescs_mMap.add(new LayoutDesc(12, 218.0f, 1088.0f, LayoutDesc.NO_VALUE, 466.40f, 439.59f));  // 1080*1920 px
        layoutDescs_mMap.add(new LayoutDesc(8, 123.0f, 612.0f, LayoutDesc.NO_VALUE, 262.23f, 247.16f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mMap = mOverrideElementLayoutDescriptors.get("map");
            if (override_mMap != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mMap.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mMap = layoutDescs;
                }
            }
        }
        layoutDescs_mMap.get(0).offsetInFlow = -0.90f;
        layoutDescs_mMap.get(1).offsetInFlow = -0.39f;
        layoutDescs_mMap.get(2).offsetInFlow = -1.14f;
        layoutDescs_mMap.get(3).offsetInFlow = -0.64f;
        applyLayoutToView(mMap, dm, layoutDescs_mMap, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText6 = new ArrayList<LayoutDesc>();
        layoutDescs_mText6.add(new LayoutDesc(10, 41.0f, 1222.53f, LayoutDesc.NO_VALUE, 640.43f, 186.0f));  // 720*1280 px
        layoutDescs_mText6.add(new LayoutDesc(2, 18.0f, 527.49f, LayoutDesc.NO_VALUE, 278.36f, 82.0f));  // 240*320 px
        layoutDescs_mText6.add(new LayoutDesc(12, 52.0f, 1542.59f, LayoutDesc.NO_VALUE, 807.77f, 234.0f));  // 1080*1920 px
        layoutDescs_mText6.add(new LayoutDesc(8, 29.0f, 867.16f, LayoutDesc.NO_VALUE, 454.16f, 134.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText6 = mOverrideElementLayoutDescriptors.get("text6");
            if (override_mText6 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText6.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText6 = layoutDescs;
                }
            }
        }
        layoutDescs_mText6.get(0).offsetInFlow = 11.52f;
        layoutDescs_mText6.get(1).offsetInFlow = 5.01f;
        layoutDescs_mText6.get(2).offsetInFlow = 14.52f;
        layoutDescs_mText6.get(3).offsetInFlow = 8.17f;
        applyLayoutToView(mText6, dm, layoutDescs_mText6, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText7 = new ArrayList<LayoutDesc>();
        layoutDescs_mText7.add(new LayoutDesc(10, 39.0f, 1420.53f, LayoutDesc.NO_VALUE, 446.29f, 51.0f));  // 720*1280 px
        layoutDescs_mText7.add(new LayoutDesc(2, 17.0f, 611.49f, LayoutDesc.NO_VALUE, 193.98f, 25.0f));  // 240*320 px
        layoutDescs_mText7.add(new LayoutDesc(12, 50.0f, 1793.59f, LayoutDesc.NO_VALUE, 562.90f, 63.0f));  // 1080*1920 px
        layoutDescs_mText7.add(new LayoutDesc(8, 28.0f, 1008.16f, LayoutDesc.NO_VALUE, 316.48f, 38.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText7 = mOverrideElementLayoutDescriptors.get("text7");
            if (override_mText7 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText7.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText7 = layoutDescs;
                }
            }
        }
        layoutDescs_mText7.get(0).offsetInFlow = 18.46f;
        layoutDescs_mText7.get(1).offsetInFlow = 8.02f;
        layoutDescs_mText7.get(2).offsetInFlow = 23.28f;
        layoutDescs_mText7.get(3).offsetInFlow = 13.09f;
        applyLayoutToView(mText7, dm, layoutDescs_mText7, true, false);

        ArrayList<LayoutDesc> layoutDescs_mIconButton3 = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton3.add(new LayoutDesc(10, 9.0f, 1484.53f, LayoutDesc.NO_VALUE, 59.50f, 51.0f));  // 720*1280 px
        layoutDescs_mIconButton3.add(new LayoutDesc(2, 4.0f, 638.49f, LayoutDesc.NO_VALUE, 25.86f, 22.17f));  // 240*320 px
        layoutDescs_mIconButton3.add(new LayoutDesc(12, 11.0f, 1874.59f, LayoutDesc.NO_VALUE, 75.05f, 64.33f));  // 1080*1920 px
        layoutDescs_mIconButton3.add(new LayoutDesc(8, 6.0f, 1053.16f, LayoutDesc.NO_VALUE, 42.20f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mIconButton3 = mOverrideElementLayoutDescriptors.get("iconButton3");
            if (override_mIconButton3 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mIconButton3.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mIconButton3 = layoutDescs;
                }
            }
        }
        layoutDescs_mIconButton3.get(0).offsetInFlow = 18.66f;
        layoutDescs_mIconButton3.get(1).offsetInFlow = 8.11f;
        layoutDescs_mIconButton3.get(2).offsetInFlow = 23.54f;
        layoutDescs_mIconButton3.get(3).offsetInFlow = 13.23f;
        applyLayoutToView(mIconButton3, dm, layoutDescs_mIconButton3, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText8 = new ArrayList<LayoutDesc>();
        layoutDescs_mText8.add(new LayoutDesc(10, 0.0f, 1535.53f, LayoutDesc.NO_VALUE, 446.29f, 34.0f));  // 720*1280 px
        layoutDescs_mText8.add(new LayoutDesc(2, 0.0f, 660.66f, LayoutDesc.NO_VALUE, 193.98f, 19.0f));  // 240*320 px
        layoutDescs_mText8.add(new LayoutDesc(12, 0.0f, 1938.93f, LayoutDesc.NO_VALUE, 562.90f, 41.0f));  // 1080*1920 px
        layoutDescs_mText8.add(new LayoutDesc(8, 0.0f, 1089.33f, LayoutDesc.NO_VALUE, 316.48f, 26.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText8 = mOverrideElementLayoutDescriptors.get("text8");
            if (override_mText8 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText8.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText8 = layoutDescs;
                }
            }
        }
        layoutDescs_mText8.get(0).offsetInFlow = 0.0f;
        layoutDescs_mText8.get(1).offsetInFlow = 0.0f;
        layoutDescs_mText8.get(2).offsetInFlow = 0.0f;
        layoutDescs_mText8.get(3).offsetInFlow = 0.0f;
        applyLayoutToView(mText8, dm, layoutDescs_mText8, true, false);

        ArrayList<LayoutDesc> layoutDescs_mIconButton4 = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton4.add(new LayoutDesc(10, 157.0f, 1489.53f, LayoutDesc.NO_VALUE, 59.50f, 51.0f));  // 720*1280 px
        layoutDescs_mIconButton4.add(new LayoutDesc(2, 68.0f, 641.66f, LayoutDesc.NO_VALUE, 25.86f, 22.17f));  // 240*320 px
        layoutDescs_mIconButton4.add(new LayoutDesc(12, 198.0f, 1880.93f, LayoutDesc.NO_VALUE, 75.05f, 64.33f));  // 1080*1920 px
        layoutDescs_mIconButton4.add(new LayoutDesc(8, 111.0f, 1057.33f, LayoutDesc.NO_VALUE, 42.20f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mIconButton4 = mOverrideElementLayoutDescriptors.get("iconButton4");
            if (override_mIconButton4 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mIconButton4.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mIconButton4 = layoutDescs;
                }
            }
        }
        layoutDescs_mIconButton4.get(0).offsetInFlow = -73.85f;
        layoutDescs_mIconButton4.get(1).offsetInFlow = -32.10f;
        layoutDescs_mIconButton4.get(2).offsetInFlow = -93.14f;
        layoutDescs_mIconButton4.get(3).offsetInFlow = -52.37f;
        applyLayoutToView(mIconButton4, dm, layoutDescs_mIconButton4, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText = new ArrayList<LayoutDesc>();
        layoutDescs_mText.add(new LayoutDesc(10, 156.0f, 1540.54f, LayoutDesc.NO_VALUE, 446.29f, 34.0f));  // 720*1280 px
        layoutDescs_mText.add(new LayoutDesc(2, 68.0f, 663.83f, LayoutDesc.NO_VALUE, 193.98f, 19.0f));  // 240*320 px
        layoutDescs_mText.add(new LayoutDesc(12, 197.0f, 1945.26f, LayoutDesc.NO_VALUE, 562.90f, 41.0f));  // 1080*1920 px
        layoutDescs_mText.add(new LayoutDesc(8, 111.0f, 1093.50f, LayoutDesc.NO_VALUE, 316.48f, 26.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText = mOverrideElementLayoutDescriptors.get("text");
            if (override_mText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText = layoutDescs;
                }
            }
        }
        layoutDescs_mText.get(0).offsetInFlow = 0.0f;
        layoutDescs_mText.get(1).offsetInFlow = 0.0f;
        layoutDescs_mText.get(2).offsetInFlow = 0.0f;
        layoutDescs_mText.get(3).offsetInFlow = 0.0f;
        applyLayoutToView(mText, dm, layoutDescs_mText, true, false);

        ArrayList<LayoutDesc> layoutDescs_mIconButton5 = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton5.add(new LayoutDesc(10, 276.0f, 1487.54f, LayoutDesc.NO_VALUE, 59.50f, 51.0f));  // 720*1280 px
        layoutDescs_mIconButton5.add(new LayoutDesc(2, 120.0f, 641.83f, LayoutDesc.NO_VALUE, 25.86f, 22.17f));  // 240*320 px
        layoutDescs_mIconButton5.add(new LayoutDesc(12, 348.0f, 1878.26f, LayoutDesc.NO_VALUE, 75.05f, 64.33f));  // 1080*1920 px
        layoutDescs_mIconButton5.add(new LayoutDesc(8, 196.0f, 1056.50f, LayoutDesc.NO_VALUE, 42.20f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mIconButton5 = mOverrideElementLayoutDescriptors.get("iconButton5");
            if (override_mIconButton5 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mIconButton5.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mIconButton5 = layoutDescs;
                }
            }
        }
        layoutDescs_mIconButton5.get(0).offsetInFlow = -80.76f;
        layoutDescs_mIconButton5.get(1).offsetInFlow = -35.10f;
        layoutDescs_mIconButton5.get(2).offsetInFlow = -101.86f;
        layoutDescs_mIconButton5.get(3).offsetInFlow = -57.27f;
        applyLayoutToView(mIconButton5, dm, layoutDescs_mIconButton5, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText10 = new ArrayList<LayoutDesc>();
        layoutDescs_mText10.add(new LayoutDesc(10, 270.0f, 1538.54f, LayoutDesc.NO_VALUE, 446.29f, 34.0f));  // 720*1280 px
        layoutDescs_mText10.add(new LayoutDesc(2, 117.0f, 663.99f, LayoutDesc.NO_VALUE, 193.98f, 19.0f));  // 240*320 px
        layoutDescs_mText10.add(new LayoutDesc(12, 341.0f, 1942.59f, LayoutDesc.NO_VALUE, 562.90f, 41.0f));  // 1080*1920 px
        layoutDescs_mText10.add(new LayoutDesc(8, 192.0f, 1092.67f, LayoutDesc.NO_VALUE, 316.48f, 26.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mIconButton6 = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton6.add(new LayoutDesc(10, 399.0f, 1489.54f, LayoutDesc.NO_VALUE, 59.50f, 51.0f));  // 720*1280 px
        layoutDescs_mIconButton6.add(new LayoutDesc(2, 174.0f, 643.99f, LayoutDesc.NO_VALUE, 25.86f, 22.17f));  // 240*320 px
        layoutDescs_mIconButton6.add(new LayoutDesc(12, 504.0f, 1881.59f, LayoutDesc.NO_VALUE, 75.05f, 64.33f));  // 1080*1920 px
        layoutDescs_mIconButton6.add(new LayoutDesc(8, 283.0f, 1058.67f, LayoutDesc.NO_VALUE, 42.20f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mIconButton6 = mOverrideElementLayoutDescriptors.get("iconButton6");
            if (override_mIconButton6 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mIconButton6.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mIconButton6 = layoutDescs;
                }
            }
        }
        layoutDescs_mIconButton6.get(0).offsetInFlow = -76.51f;
        layoutDescs_mIconButton6.get(1).offsetInFlow = -33.25f;
        layoutDescs_mIconButton6.get(2).offsetInFlow = -96.50f;
        layoutDescs_mIconButton6.get(3).offsetInFlow = -54.25f;
        applyLayoutToView(mIconButton6, dm, layoutDescs_mIconButton6, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText11 = new ArrayList<LayoutDesc>();
        layoutDescs_mText11.add(new LayoutDesc(10, 396.0f, 1540.54f, LayoutDesc.NO_VALUE, 446.29f, 34.0f));  // 720*1280 px
        layoutDescs_mText11.add(new LayoutDesc(2, 172.0f, 666.16f, LayoutDesc.NO_VALUE, 193.98f, 19.0f));  // 240*320 px
        layoutDescs_mText11.add(new LayoutDesc(12, 500.0f, 1945.92f, LayoutDesc.NO_VALUE, 562.90f, 41.0f));  // 1080*1920 px
        layoutDescs_mText11.add(new LayoutDesc(8, 281.0f, 1094.84f, LayoutDesc.NO_VALUE, 316.48f, 26.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText11 = mOverrideElementLayoutDescriptors.get("text11");
            if (override_mText11 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText11.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText11 = layoutDescs;
                }
            }
        }
        layoutDescs_mText11.get(0).offsetInFlow = 0.0f;
        layoutDescs_mText11.get(1).offsetInFlow = 0.0f;
        layoutDescs_mText11.get(2).offsetInFlow = 0.0f;
        layoutDescs_mText11.get(3).offsetInFlow = 0.0f;
        applyLayoutToView(mText11, dm, layoutDescs_mText11, true, false);

        ArrayList<LayoutDesc> layoutDescs_mIconButton7 = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton7.add(new LayoutDesc(10, 529.0f, 1487.54f, LayoutDesc.NO_VALUE, 59.50f, 51.0f));  // 720*1280 px
        layoutDescs_mIconButton7.add(new LayoutDesc(2, 230.0f, 644.16f, LayoutDesc.NO_VALUE, 25.86f, 22.17f));  // 240*320 px
        layoutDescs_mIconButton7.add(new LayoutDesc(12, 667.0f, 1878.92f, LayoutDesc.NO_VALUE, 75.05f, 64.33f));  // 1080*1920 px
        layoutDescs_mIconButton7.add(new LayoutDesc(8, 375.0f, 1057.84f, LayoutDesc.NO_VALUE, 42.20f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mIconButton7 = mOverrideElementLayoutDescriptors.get("iconButton7");
            if (override_mIconButton7 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mIconButton7.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mIconButton7 = layoutDescs;
                }
            }
        }
        layoutDescs_mIconButton7.get(0).offsetInFlow = -80.76f;
        layoutDescs_mIconButton7.get(1).offsetInFlow = -35.10f;
        layoutDescs_mIconButton7.get(2).offsetInFlow = -101.86f;
        layoutDescs_mIconButton7.get(3).offsetInFlow = -57.27f;
        applyLayoutToView(mIconButton7, dm, layoutDescs_mIconButton7, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText12 = new ArrayList<LayoutDesc>();
        layoutDescs_mText12.add(new LayoutDesc(10, 518.0f, 1538.55f, LayoutDesc.NO_VALUE, 446.29f, 34.0f));  // 720*1280 px
        layoutDescs_mText12.add(new LayoutDesc(2, 225.0f, 666.33f, LayoutDesc.NO_VALUE, 193.98f, 19.0f));  // 240*320 px
        layoutDescs_mText12.add(new LayoutDesc(12, 654.0f, 1943.25f, LayoutDesc.NO_VALUE, 562.90f, 41.0f));  // 1080*1920 px
        layoutDescs_mText12.add(new LayoutDesc(8, 367.0f, 1094.01f, LayoutDesc.NO_VALUE, 316.48f, 26.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText12 = mOverrideElementLayoutDescriptors.get("text12");
            if (override_mText12 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText12.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText12 = layoutDescs;
                }
            }
        }
        layoutDescs_mText12.get(0).offsetInFlow = 0.0f;
        layoutDescs_mText12.get(1).offsetInFlow = 0.0f;
        layoutDescs_mText12.get(2).offsetInFlow = 0.0f;
        layoutDescs_mText12.get(3).offsetInFlow = 0.0f;
        applyLayoutToView(mText12, dm, layoutDescs_mText12, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText13 = new ArrayList<LayoutDesc>();
        layoutDescs_mText13.add(new LayoutDesc(10, 37.0f, 1583.55f, LayoutDesc.NO_VALUE, 446.29f, 51.0f));  // 720*1280 px
        layoutDescs_mText13.add(new LayoutDesc(2, 16.0f, 686.33f, LayoutDesc.NO_VALUE, 193.98f, 25.0f));  // 240*320 px
        layoutDescs_mText13.add(new LayoutDesc(12, 46.0f, 1999.25f, LayoutDesc.NO_VALUE, 562.90f, 63.0f));  // 1080*1920 px
        layoutDescs_mText13.add(new LayoutDesc(8, 26.0f, 1126.01f, LayoutDesc.NO_VALUE, 316.48f, 38.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText13 = mOverrideElementLayoutDescriptors.get("text13");
            if (override_mText13 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText13.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText13 = layoutDescs;
                }
            }
        }
        layoutDescs_mText13.get(0).offsetInFlow = 17.0f;
        layoutDescs_mText13.get(1).offsetInFlow = 7.39f;
        layoutDescs_mText13.get(2).offsetInFlow = 21.44f;
        layoutDescs_mText13.get(3).offsetInFlow = 12.06f;
        applyLayoutToView(mText13, dm, layoutDescs_mText13, true, false);

        ArrayList<LayoutDesc> layoutDescs_mImage3 = new ArrayList<LayoutDesc>();
        layoutDescs_mImage3.add(new LayoutDesc(10, 41.0f, 1650.55f, LayoutDesc.NO_VALUE, 256.0f, 145.0f));  // 720*1280 px
        layoutDescs_mImage3.add(new LayoutDesc(2, 18.0f, 715.33f, LayoutDesc.NO_VALUE, 111.0f, 63.0f));  // 240*320 px
        layoutDescs_mImage3.add(new LayoutDesc(12, 52.0f, 2084.25f, LayoutDesc.NO_VALUE, 322.0f, 182.0f));  // 1080*1920 px
        layoutDescs_mImage3.add(new LayoutDesc(8, 29.0f, 1174.01f, LayoutDesc.NO_VALUE, 181.0f, 103.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mImage3 = mOverrideElementLayoutDescriptors.get("image3");
            if (override_mImage3 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mImage3.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mImage3 = layoutDescs;
                }
            }
        }
        layoutDescs_mImage3.get(0).contentTransformMatricesString = "[0.2, 0.0, 0.0, 0.2, -67.8, 0.0]; [0.2, 0.0, 0.0, 0.2, -67.8, 0.0]";
        layoutDescs_mImage3.get(1).contentTransformMatricesString = "[0.086896552, 0.0, 0.0, 0.086896552, -29.571724138, 0.0]; [0.086896552, 0.0, 0.0, 0.086896552, -29.571724138, 0.0]";
        layoutDescs_mImage3.get(2).contentTransformMatricesString = "[0.251034483, 0.0, 0.0, 0.251034483, -84.762758621, 0.0]; [0.251034483, 0.0, 0.0, 0.251034483, -84.762758621, 0.0]";
        layoutDescs_mImage3.get(3).contentTransformMatricesString = "[0.142068966, 0.0, 0.0, 0.142068966, -48.585517241, 0.0]; [0.142068966, 0.0, 0.0, 0.142068966, -48.585517241, 0.0]";
        layoutDescs_mImage3.get(0).offsetInFlow = 22.14f;
        layoutDescs_mImage3.get(1).offsetInFlow = 9.62f;
        layoutDescs_mImage3.get(2).offsetInFlow = 27.92f;
        layoutDescs_mImage3.get(3).offsetInFlow = 15.7f;
        applyLayoutToView(mImage3, dm, layoutDescs_mImage3, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText15 = new ArrayList<LayoutDesc>();
        layoutDescs_mText15.add(new LayoutDesc(10, 42.0f, 1795.55f, LayoutDesc.NO_VALUE, 446.29f, 40.0f));  // 720*1280 px
        layoutDescs_mText15.add(new LayoutDesc(2, 18.0f, 778.33f, LayoutDesc.NO_VALUE, 193.98f, 21.0f));  // 240*320 px
        layoutDescs_mText15.add(new LayoutDesc(12, 53.0f, 2266.25f, LayoutDesc.NO_VALUE, 562.90f, 49.0f));  // 1080*1920 px
        layoutDescs_mText15.add(new LayoutDesc(8, 30.0f, 1277.01f, LayoutDesc.NO_VALUE, 316.48f, 30.0f));  // 480*800 px
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
        layoutDescs_mText14.add(new LayoutDesc(10, 44.0f, 1829.55f, LayoutDesc.NO_VALUE, 252.86f, 84.0f));  // 720*1280 px
        layoutDescs_mText14.add(new LayoutDesc(2, 19.0f, 793.33f, LayoutDesc.NO_VALUE, 109.91f, 60.0f));  // 240*320 px
        layoutDescs_mText14.add(new LayoutDesc(12, 55.0f, 2309.25f, LayoutDesc.NO_VALUE, 318.93f, 104.0f));  // 1080*1920 px
        layoutDescs_mText14.add(new LayoutDesc(8, 31.0f, 1301.01f, LayoutDesc.NO_VALUE, 179.32f, 90.0f));  // 480*800 px
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
        layoutDescs_mText16.add(new LayoutDesc(10, 40.0f, 1907.55f, LayoutDesc.NO_VALUE, 446.29f, 40.0f));  // 720*1280 px
        layoutDescs_mText16.add(new LayoutDesc(2, 17.0f, 847.33f, LayoutDesc.NO_VALUE, 193.98f, 21.0f));  // 240*320 px
        layoutDescs_mText16.add(new LayoutDesc(12, 50.0f, 2407.25f, LayoutDesc.NO_VALUE, 562.90f, 49.0f));  // 1080*1920 px
        layoutDescs_mText16.add(new LayoutDesc(8, 28.0f, 1385.01f, LayoutDesc.NO_VALUE, 316.48f, 30.0f));  // 480*800 px
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
        layoutDescs_mText17.add(new LayoutDesc(10, 39.0f, 1939.55f, LayoutDesc.NO_VALUE, 258.78f, 40.0f));  // 720*1280 px
        layoutDescs_mText17.add(new LayoutDesc(2, 17.0f, 861.33f, LayoutDesc.NO_VALUE, 112.48f, 21.0f));  // 240*320 px
        layoutDescs_mText17.add(new LayoutDesc(12, 50.0f, 2447.25f, LayoutDesc.NO_VALUE, 326.39f, 49.0f));  // 1080*1920 px
        layoutDescs_mText17.add(new LayoutDesc(8, 28.0f, 1407.01f, LayoutDesc.NO_VALUE, 183.51f, 30.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText17 = mOverrideElementLayoutDescriptors.get("text17");
            if (override_mText17 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText17.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText17 = layoutDescs;
                }
            }
        }
        layoutDescs_mText17.get(0).offsetInFlow = -2.33f;
        layoutDescs_mText17.get(1).offsetInFlow = -1.01f;
        layoutDescs_mText17.get(2).offsetInFlow = -2.93f;
        layoutDescs_mText17.get(3).offsetInFlow = -1.65f;
        applyLayoutToView(mText17, dm, layoutDescs_mText17, true, false);

        ArrayList<LayoutDesc> layoutDescs_mHotspot = new ArrayList<LayoutDesc>();
        layoutDescs_mHotspot.add(new LayoutDesc(10, 24.0f, 1641.55f, LayoutDesc.NO_VALUE, 278.03f, 358.76f));  // 720*1280 px
        layoutDescs_mHotspot.add(new LayoutDesc(2, 11.0f, 732.33f, LayoutDesc.NO_VALUE, 120.85f, 155.93f));  // 240*320 px
        layoutDescs_mHotspot.add(new LayoutDesc(12, 31.0f, 2072.25f, LayoutDesc.NO_VALUE, 350.68f, 452.49f));  // 1080*1920 px
        layoutDescs_mHotspot.add(new LayoutDesc(8, 17.0f, 1196.01f, LayoutDesc.NO_VALUE, 197.16f, 254.41f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mHotspot = mOverrideElementLayoutDescriptors.get("hotspot");
            if (override_mHotspot != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mHotspot.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mHotspot = layoutDescs;
                }
            }
        }
        layoutDescs_mHotspot.get(0).offsetInFlow = -331.60f;
        layoutDescs_mHotspot.get(1).offsetInFlow = -144.13f;
        layoutDescs_mHotspot.get(2).offsetInFlow = -418.25f;
        layoutDescs_mHotspot.get(3).offsetInFlow = -235.16f;
        applyLayoutToView(mHotspot, dm, layoutDescs_mHotspot, true, true);

        ArrayList<LayoutDesc> layoutDescs_mImage4 = new ArrayList<LayoutDesc>();
        layoutDescs_mImage4.add(new LayoutDesc(10, 379.0f, 1650.30f, LayoutDesc.NO_VALUE, 256.0f, 145.0f));  // 720*1280 px
        layoutDescs_mImage4.add(new LayoutDesc(2, 165.0f, 736.26f, LayoutDesc.NO_VALUE, 111.0f, 63.0f));  // 240*320 px
        layoutDescs_mImage4.add(new LayoutDesc(12, 478.0f, 2082.74f, LayoutDesc.NO_VALUE, 322.0f, 182.0f));  // 1080*1920 px
        layoutDescs_mImage4.add(new LayoutDesc(8, 269.0f, 1201.42f, LayoutDesc.NO_VALUE, 181.0f, 103.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mImage4 = mOverrideElementLayoutDescriptors.get("image4");
            if (override_mImage4 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mImage4.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mImage4 = layoutDescs;
                }
            }
        }
        layoutDescs_mImage4.get(0).contentTransformMatricesString = "[0.345945946, 0.0, 0.0, 0.345945946, 0.0, -12.775675676]; [0.345945946, 0.0, 0.0, 0.345945946, 0.0, -12.775675676]";
        layoutDescs_mImage4.get(1).contentTransformMatricesString = "[0.150, 0.0, 0.0, 0.150, 0.0, -5.475]; [0.150, 0.0, 0.0, 0.150, 0.0, -5.475]";
        layoutDescs_mImage4.get(2).contentTransformMatricesString = "[0.435135135, 0.0, 0.0, 0.435135135, 0.0, -16.260810811]; [0.435135135, 0.0, 0.0, 0.435135135, 0.0, -16.260810811]";
        layoutDescs_mImage4.get(3).contentTransformMatricesString = "[0.244594595, 0.0, 0.0, 0.244594595, 0.0, -8.792567568]; [0.244594595, 0.0, 0.0, 0.244594595, 0.0, -8.792567568]";
        layoutDescs_mImage4.get(0).offsetInFlow = -350.44f;
        layoutDescs_mImage4.get(1).offsetInFlow = -152.32f;
        layoutDescs_mImage4.get(2).offsetInFlow = -442.01f;
        layoutDescs_mImage4.get(3).offsetInFlow = -248.52f;
        applyLayoutToView(mImage4, dm, layoutDescs_mImage4, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText18 = new ArrayList<LayoutDesc>();
        layoutDescs_mText18.add(new LayoutDesc(10, 379.0f, 1794.30f, LayoutDesc.NO_VALUE, 257.39f, 40.0f));  // 720*1280 px
        layoutDescs_mText18.add(new LayoutDesc(2, 165.0f, 799.26f, LayoutDesc.NO_VALUE, 111.87f, 21.0f));  // 240*320 px
        layoutDescs_mText18.add(new LayoutDesc(12, 478.0f, 2263.74f, LayoutDesc.NO_VALUE, 324.64f, 49.0f));  // 1080*1920 px
        layoutDescs_mText18.add(new LayoutDesc(8, 269.0f, 1303.42f, LayoutDesc.NO_VALUE, 182.53f, 30.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText18 = mOverrideElementLayoutDescriptors.get("text18");
            if (override_mText18 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText18.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText18 = layoutDescs;
                }
            }
        }
        layoutDescs_mText18.get(0).offsetInFlow = -1.05f;
        layoutDescs_mText18.get(1).offsetInFlow = -0.46f;
        layoutDescs_mText18.get(2).offsetInFlow = -1.32f;
        layoutDescs_mText18.get(3).offsetInFlow = -0.74f;
        applyLayoutToView(mText18, dm, layoutDescs_mText18, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText1 = new ArrayList<LayoutDesc>();
        layoutDescs_mText1.add(new LayoutDesc(10, 379.0f, 1829.30f, LayoutDesc.NO_VALUE, 254.80f, 201.0f));  // 720*1280 px
        layoutDescs_mText1.add(new LayoutDesc(2, 165.0f, 814.26f, LayoutDesc.NO_VALUE, 110.75f, 114.0f));  // 240*320 px
        layoutDescs_mText1.add(new LayoutDesc(12, 479.0f, 2307.74f, LayoutDesc.NO_VALUE, 321.37f, 251.0f));  // 1080*1920 px
        layoutDescs_mText1.add(new LayoutDesc(8, 269.0f, 1328.42f, LayoutDesc.NO_VALUE, 180.69f, 146.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText1 = mOverrideElementLayoutDescriptors.get("text1");
            if (override_mText1 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText1.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText1 = layoutDescs;
                }
            }
        }
        layoutDescs_mText1.get(0).offsetInFlow = 0.93f;
        layoutDescs_mText1.get(1).offsetInFlow = 0.40f;
        layoutDescs_mText1.get(2).offsetInFlow = 1.17f;
        layoutDescs_mText1.get(3).offsetInFlow = 0.66f;
        applyLayoutToView(mText1, dm, layoutDescs_mText1, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText20 = new ArrayList<LayoutDesc>();
        layoutDescs_mText20.add(new LayoutDesc(10, 381.0f, 2020.30f, LayoutDesc.NO_VALUE, 446.29f, 40.0f));  // 720*1280 px
        layoutDescs_mText20.add(new LayoutDesc(2, 165.0f, 920.26f, LayoutDesc.NO_VALUE, 193.98f, 21.0f));  // 240*320 px
        layoutDescs_mText20.add(new LayoutDesc(12, 480.0f, 2547.74f, LayoutDesc.NO_VALUE, 562.90f, 49.0f));  // 1080*1920 px
        layoutDescs_mText20.add(new LayoutDesc(8, 270.0f, 1465.42f, LayoutDesc.NO_VALUE, 316.48f, 30.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText20 = mOverrideElementLayoutDescriptors.get("text20");
            if (override_mText20 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText20.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText20 = layoutDescs;
                }
            }
        }
        layoutDescs_mText20.get(0).offsetInFlow = -3.92f;
        layoutDescs_mText20.get(1).offsetInFlow = -1.71f;
        layoutDescs_mText20.get(2).offsetInFlow = -4.95f;
        layoutDescs_mText20.get(3).offsetInFlow = -2.78f;
        applyLayoutToView(mText20, dm, layoutDescs_mText20, true, false);

        ArrayList<LayoutDesc> layoutDescs_mText21 = new ArrayList<LayoutDesc>();
        layoutDescs_mText21.add(new LayoutDesc(10, 381.0f, 2054.30f, LayoutDesc.NO_VALUE, 260.01f, 40.0f));  // 720*1280 px
        layoutDescs_mText21.add(new LayoutDesc(2, 166.0f, 935.26f, LayoutDesc.NO_VALUE, 113.01f, 21.0f));  // 240*320 px
        layoutDescs_mText21.add(new LayoutDesc(12, 481.0f, 2590.74f, LayoutDesc.NO_VALUE, 327.95f, 49.0f));  // 1080*1920 px
        layoutDescs_mText21.add(new LayoutDesc(8, 270.0f, 1489.42f, LayoutDesc.NO_VALUE, 184.39f, 30.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText21 = mOverrideElementLayoutDescriptors.get("text21");
            if (override_mText21 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText21.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText21 = layoutDescs;
                }
            }
        }
        layoutDescs_mText21.get(0).offsetInFlow = 0.03f;
        layoutDescs_mText21.get(1).offsetInFlow = 0.01f;
        layoutDescs_mText21.get(2).offsetInFlow = 0.03f;
        layoutDescs_mText21.get(3).offsetInFlow = 0.02f;
        applyLayoutToView(mText21, dm, layoutDescs_mText21, true, false);

        ArrayList<LayoutDesc> layoutDescs_mHotspot2 = new ArrayList<LayoutDesc>();
        layoutDescs_mHotspot2.add(new LayoutDesc(10, 372.0f, 1643.30f, LayoutDesc.NO_VALUE, 270.36f, 464.77f));  // 720*1280 px
        layoutDescs_mHotspot2.add(new LayoutDesc(2, 162.0f, 757.26f, LayoutDesc.NO_VALUE, 117.51f, 202.01f));  // 240*320 px
        layoutDescs_mHotspot2.add(new LayoutDesc(12, 469.0f, 2072.74f, LayoutDesc.NO_VALUE, 341.0f, 586.21f));  // 1080*1920 px
        layoutDescs_mHotspot2.add(new LayoutDesc(8, 264.0f, 1197.42f, LayoutDesc.NO_VALUE, 191.72f, 329.59f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mHotspot2 = mOverrideElementLayoutDescriptors.get("hotspot2");
            if (override_mHotspot2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mHotspot2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mHotspot2 = layoutDescs;
                }
            }
        }
        layoutDescs_mHotspot2.get(0).offsetInFlow = -445.10f;
        layoutDescs_mHotspot2.get(1).offsetInFlow = -193.46f;
        layoutDescs_mHotspot2.get(2).offsetInFlow = -561.40f;
        layoutDescs_mHotspot2.get(3).offsetInFlow = -315.64f;
        applyLayoutToView(mHotspot2, dm, layoutDescs_mHotspot2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mFixedButton = new ArrayList<LayoutDesc>();
        layoutDescs_mFixedButton.add(new LayoutDesc(10, 252.0f, 2124.07f, LayoutDesc.NO_VALUE, 212.52f, 63.76f));  // 720*1280 px
        layoutDescs_mFixedButton.add(new LayoutDesc(2, 110.0f, 966.28f, LayoutDesc.NO_VALUE, 92.37f, 27.71f));  // 240*320 px
        layoutDescs_mFixedButton.add(new LayoutDesc(12, 318.0f, 2679.95f, LayoutDesc.NO_VALUE, 268.05f, 80.41f));  // 1080*1920 px
        layoutDescs_mFixedButton.add(new LayoutDesc(8, 179.0f, 1539.01f, LayoutDesc.NO_VALUE, 150.71f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mFixedButton = mOverrideElementLayoutDescriptors.get("fixedButton");
            if (override_mFixedButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mFixedButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mFixedButton = layoutDescs;
                }
            }
        }
        layoutDescs_mFixedButton.get(0).offsetInFlow = 16.29f;
        layoutDescs_mFixedButton.get(1).offsetInFlow = 7.08f;
        layoutDescs_mFixedButton.get(2).offsetInFlow = 20.54f;
        layoutDescs_mFixedButton.get(3).offsetInFlow = 11.55f;
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
