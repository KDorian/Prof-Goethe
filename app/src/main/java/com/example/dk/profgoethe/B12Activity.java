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
 * Created by DK on 25.08.2016.
 */
public class B12Activity extends ActionBarActivity {
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerListView;
    private RelativeLayout mDrawerRelativeLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    String[] mDrawerOptionLabels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer_b12);
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
        mDrawerOptionLabels = resources.getStringArray(R.array.sliding_drawer_array_b12);
        ArrayAdapter<String> drawerAdapter = new ArrayAdapter<String>(this,
                R.layout.drawer_list_item, mDrawerOptionLabels);

        mDrawerListView.setAdapter(drawerAdapter);
        mDrawerListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FragmentManager fragmentManager = getFragmentManager();
                Fragment fragment = new B12Fragment();
                switch (position){ // note this is the order in the TiteList which is constant!
                    case 0:  //B1.1.
                        fragment = new B12Fragment();
                        break;
                    case 1:  //B1.1. Kap13
                        fragment = new B12Kap13Fragment();
                        break;
                    case 2:  //B1.1. Kap14
                        fragment = new B12Kap14Fragment();
                        break;
                    case 3:  //B1.1. Kap15
                        fragment = new B12Kap15Fragment();
                        break;
                    case 4:  //B1.1. Kap16
                        fragment = new B12Kap16Fragment();
                        break;
                    case 5:  //B1.1. Kap17
                        fragment = new B12Kap17Fragment();
                        break;
                    case 6:  //B1.1. Kap18
                        fragment = new B12Kap18Fragment();
                        break;
                    case 7:  //B1.1. Kap19
                        fragment = new B12Kap19Fragment();
                        break;
                    case 8:  //B1.1. Kap20
                        fragment = new B12Kap20Fragment();
                        break;
                    case 9:  //B1.1. Kap21
                        fragment = new B12Kap21Fragment();
                        break;
                    case 10:  //B1.1. Kap22
                        fragment = new B12Kap22Fragment();
                        break;
                    case 11:  //B1.1. Kap23
                        fragment = new B12Kap23Fragment();
                        break;
                }
                fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();
                setTitle(mDrawerOptionLabels[position]);
                mDrawerListView.setItemChecked(position, true);
                mDrawerLayout.closeDrawer(mDrawerRelativeLayout);
            }
        });

        if (savedInstanceState == null) {
            FragmentManager fragmentManager = getFragmentManager();
            Fragment fragment = new B12Fragment();
            fragment = new B12Fragment();
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