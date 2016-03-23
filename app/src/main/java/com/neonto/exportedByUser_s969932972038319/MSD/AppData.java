package com.neonto.exportedByUser_s969932972038319.MSD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Log;

public class AppData {
    
    public static IDataSheet getDataSheetByName(String name) throws Exception {
        switch (name) {
        }
        throw new Exception(String.format("No data sheet found with name '%s'.", name));
    }

    public static Drawable getDrawableFromUrl(Context context, String url) {
        if (url.startsWith("asset://")) {
            Resources resources = context.getResources();
            int extLen = 4;  // assume extension is dot + three letters (e.g. ".png")
            String resName = "drawable/"+url.substring("asset://".length(), url.length()-extLen);
            int resId = resources.getIdentifier(resName, null, context.getPackageName());
            return resources.getDrawable(resId);
        }
        else if (url.startsWith("documents://")) {
            String path = context.getExternalFilesDir(null).getPath() + java.io.File.separator + url.substring("documents://".length());
            return Drawable.createFromPath(path);
        }
        return null;
    }

    private static HashMap<String, Typeface> mTypefaces = new HashMap<String, Typeface>();

    public static Typeface getTypeface(String filename, Context context) {
        Typeface typeface = mTypefaces.get(filename);
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(), "fonts/"+filename);
                mTypefaces.put(filename, typeface);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return typeface;
    }

}
