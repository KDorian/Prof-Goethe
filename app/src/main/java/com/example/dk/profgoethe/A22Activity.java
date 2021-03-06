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
 * Created by DK on 30.07.2016.
 */
public class A22Activity extends ActionBarActivity {
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerListView;
    private RelativeLayout mDrawerRelativeLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    String[] mDrawerOptionLabels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer_a22);
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
        mDrawerOptionLabels = resources.getStringArray(R.array.sliding_drawer_array_a22);
        ArrayAdapter<String> drawerAdapter = new ArrayAdapter<String>(this,
                R.layout.drawer_list_item, mDrawerOptionLabels);

        mDrawerListView.setAdapter(drawerAdapter);
        mDrawerListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FragmentManager fragmentManager = getFragmentManager();
                Fragment fragment = new A22Fragment();
                switch (position){ // note this is the order in the TiteList which is constant!
                    case 0:  //A2.2.
                        fragment = new A22Fragment();
                        break;
                    case 1:  //A2.2. Kapitel13
                        fragment = new A22Kap13Fragment();
                        break;
                    case 2:  //A2.2. Kapitel14
                        fragment = new A22Kap14Fragment();
                        break;
                    case 3:  //A2.2. Kapitel15
                        fragment = new A22Kap15Fragment();
                        break;
                    case 4:  //A2.2. Kapitel16
                        fragment = new A22Kap16Fragment();
                        break;
                    case 5:  //A2.2. Kapitel17
                        fragment = new A22Kap17Fragment();
                        break;
                    case 6:  //A2.2. Kapitel18
                        fragment = new A22Kap18Fragment();
                        break;
                    case 7:  //A2.2. Kapitel19
                        fragment = new A22Kap19Fragment();
                        break;
                    case 8:  //A2.2. Kapitel20
                        fragment = new A22Kap20Fragment();
                        break;
                    case 9:  //A2.2. Kapitel21
                        fragment = new A22Kap21Fragment();
                        break;
                    case 10:  //A2.2. Kapitel22
                        fragment = new A22Kap22Fragment();
                        break;
                    case 11:  //A2.2. Kapitel23
                        fragment = new A22Kap23Fragment();
                        break;
                    case 12:  //A2.2. Kapitel24
                        fragment = new A22Kap24Fragment();
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
            Fragment fragment = new A22Fragment();
            fragment = new A22Fragment();
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
