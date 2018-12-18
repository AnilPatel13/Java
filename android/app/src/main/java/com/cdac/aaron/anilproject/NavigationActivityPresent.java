package com.cdac.aaron.anilproject;


import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class NavigationActivityPresent extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_present);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentsLayout,new TableFragmentPresent()).commit();
    }



    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        Fragment fragment = null;

        if (id == R.id.nav_result) {
            fragment = new ResultPresentFragment();
        } else if (id == R.id.nav_graph_balance) {
            fragment = new GraphBalancePresentFragment();
        } else if (id == R.id.nav_graph_principal) {
            fragment = new GraphPrincipalPresentFragment();
        } else if (id == R.id.nav_graph_interest) {
            fragment = new GraphInterestPresentFragment();
        } else if (id == R.id.nav_chart_breakdown) {
            fragment = new ChartPresentFragment();
        } else if (id == R.id.nav_table_view) {
            fragment = new TableFragmentPresent();
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentsLayout,fragment).commit();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
