package com.example.dk.profgoethe;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

/**
 * Created by DK on 2016-06-19.
 */
public class A12Activity extends ActionBarActivity {
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerListView;
    private RelativeLayout mDrawerRelativeLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    String[] mDrawerOptionLabels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer_a12);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerListView = (ListView) findViewById(R.id.left_drawer);
        mDrawerRelativeLayout = (RelativeLayout) findViewById(R.id.left_drawer_layout);
        mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        mDrawerToggle = new ActionBarDrawerToggle(
                this,                  /* host Activity */
                mDrawerLayout,         /* DrawerLayout object */
                R.string.drawer_open,  /* "open drawer" description for accessibility */
                R.string.drawer_close  /* "close drawer" description for accessibility */
        );

        mDrawerLayout.setDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();

        Resources resources = getResources();
        mDrawerOptionLabels = resources.getStringArray(R.array.sliding_drawer_array_a12);
        ArrayAdapter<String> drawerAdapter = new ArrayAdapter<String>(this,
                R.layout.drawer_list_item, mDrawerOptionLabels);

        mDrawerListView.setAdapter(drawerAdapter);
        mDrawerListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FragmentManager fragmentManager = getFragmentManager();
                Fragment fragment = new A11Fragment();
                switch (position){ // note this is the order in the TiteList which is constant!
                    case 0:  //A1.1.
                        fragment = new A11Fragment();
                        break;
                    /*case 1: //A1.1. Kapitel 01
                        fragment = new A11Kap01Fragment();
                        break;
                    case 2: //A1.1. Kapitel02
                        fragment = new A11Kap02Fragment();
                        break;
                    case 3: //A1.1. Kapitel03
                        fragment = new A11Kap03Fragment();
                        break;
                    case 4: //A1.1. Kapitel04
                        fragment = new A11Kap04Fragment();
                        break;
                    case 5: //A1.1. Kapitel05
                        fragment = new A11Kap05Fragment();
                        break;
                    case 6: //A1.1. Kapitel06
                        fragment = new A11Kap06Fragment();
                        break;
                    case 7: //A1.1. Kapitel07
                        fragment = new A11Kap07Fragment();
                        break;
                    case 8: //A1.1. Kapitel08
                        fragment = new A11Kap08Fragment();
                        break;
                    case 9: //A1.1. Kapitel09
                        fragment = new A11Kap09Fragment();
                        break;
                    case 10: //A1.1. Kapitel10
                        fragment = new A11Kap10Fragment();
                        break;
                    case 11: //A1.1. Kapitel11
                        fragment = new A11Kap11Fragment();
                        break;
                    case 12: //A1.1. Kapitel12
                        fragment = new A11Kap12Fragment();
                        break;*/
                }
                fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();
                setTitle(mDrawerOptionLabels[position]);
                mDrawerListView.setItemChecked(position, true);
                mDrawerLayout.closeDrawer(mDrawerRelativeLayout);
            }
        });

        if (savedInstanceState == null) {
            FragmentManager fragmentManager = getFragmentManager();
            Fragment fragment = new A11Fragment();
            fragment = new A11Fragment();
            fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();
            setTitle(mDrawerOptionLabels[0]);
        }

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_drawer_navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

