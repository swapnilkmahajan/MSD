/*
 * This package name is autogenerated by Neonto Studio
 * when using 'Open in Android Studio'.
 * 
 * To change the package name, use 'Export' instead.
 */

package com.neonto.exportedByUser_s969932972038319.MSD;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.neonto.exportedByUser_s969932972038319.MSD.R;

public class PublicProfileActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_public_profile);
        if (savedInstanceState == null) {
            FragmentManager fm = getFragmentManager();

            fm.beginTransaction()
                    .add(R.id.container, new PublicProfileFragment())
                    .commit();
            
            fm.beginTransaction()
                    .replace(R.id.drawer_menu, new MENUFragment())
                    .commit();

        }
    }

}
