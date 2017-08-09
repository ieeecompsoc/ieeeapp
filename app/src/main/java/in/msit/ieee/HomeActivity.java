package in.msit.ieee;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import in.msit.ieee.fragments.AboutIEEEFragment;
import in.msit.ieee.fragments.AboutIEEEMSITFragment;
import in.msit.ieee.fragments.AndroidTeamFragment;
import in.msit.ieee.fragments.BranchAdvisorsFragment;
import in.msit.ieee.fragments.ContactUsFragment;
import in.msit.ieee.fragments.ExecutiveCommitteeFragment;
import in.msit.ieee.fragments.InfoICSFragment;
import in.msit.ieee.fragments.InfoMTTSFragment;
import in.msit.ieee.fragments.InfoPESFragment;
import in.msit.ieee.fragments.InfoWIEFragment;
import in.msit.ieee.fragments.UpcomingEventsFragment;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.nav_view)
    NavigationView navigationView;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.drawer_layout)
    DrawerLayout drawer;

    public static final String BACK_STACK_ROOT_TAG = "root_fragment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_welcome);

        final FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() {
            @Override
            public void onBackStackChanged() {
                int count = fragmentManager.getBackStackEntryCount();
                if(count == 0) {
                    navigationView.setCheckedItem(R.id.nav_welcome);
                }
            }
        });

        setTitle("");
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        displaySelectedPage(id);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

    private void displaySelectedPage(int id) {
        Fragment fragment = null;

        FragmentManager fragmentManager = getSupportFragmentManager();

        if (id == R.id.nav_welcome) {
            fragmentManager.popBackStack(BACK_STACK_ROOT_TAG, FragmentManager.POP_BACK_STACK_INCLUSIVE);
        } else if (id == R.id.nav_about_ieee) {
            fragment = new AboutIEEEFragment();
        } else if (id == R.id.nav_about_ieee_msit) {
            fragment = new AboutIEEEMSITFragment();
        } else if (id == R.id.nav_executive_committee) {
            fragment = new ExecutiveCommitteeFragment();
        } else if (id == R.id.nav_branch_advisors) {
            fragment = new BranchAdvisorsFragment();
        } else if (id == R.id.nav_upcoming_events) {
            fragment = new UpcomingEventsFragment();
        } else if (id == R.id.nav_contact_us) {
            fragment = new ContactUsFragment();
        } else if (id == R.id.nav_android_team) {
            fragment = new AndroidTeamFragment();
        }

        //replacing the fragment
        if (fragment != null) {
            fragmentManager.popBackStack(BACK_STACK_ROOT_TAG, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(R.id.fragment_container, fragment);
            ft.addToBackStack(BACK_STACK_ROOT_TAG);
            ft.commit();
        }
    }

    @OnClick(R.id.ics_logo)
    public void showICSInfo() {
        addFragment(new InfoICSFragment());
    }

    @OnClick(R.id.mtts_logo)
    public void showMTTSInfo() {
        addFragment(new InfoMTTSFragment());
    }

    @OnClick(R.id.pes_logo)
    public void showPESInfo() {
        addFragment(new InfoPESFragment());
    }

    @OnClick(R.id.wie_logo)
    public void showWIEInfo() {
        addFragment(new InfoWIEFragment());
    }

    private void addFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.popBackStack(BACK_STACK_ROOT_TAG, FragmentManager.POP_BACK_STACK_INCLUSIVE);
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.fragment_container, fragment);
        ft.addToBackStack(BACK_STACK_ROOT_TAG);
        ft.commit();
    }


    @OnClick(R.id.join_ieee_button)
    public void joinIeee() {
        Uri uri = Uri.parse("https://goo.gl/q77xGJ");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    @OnClick(R.id.follow_fb_button)
    public void followFb() {
        Uri uri = Uri.parse("https://goo.gl/K9jTCG");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
