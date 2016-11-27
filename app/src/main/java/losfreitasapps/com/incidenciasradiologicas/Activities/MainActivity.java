package losfreitasapps.com.incidenciasradiologicas.Activities;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import losfreitasapps.com.incidenciasradiologicas.Fragments.Abreviaturas;
import losfreitasapps.com.incidenciasradiologicas.Fragments.FCranio;
import losfreitasapps.com.incidenciasradiologicas.Fragments.FMI;
import losfreitasapps.com.incidenciasradiologicas.Fragments.FMS;
import losfreitasapps.com.incidenciasradiologicas.Fragments.FReferencias;
import losfreitasapps.com.incidenciasradiologicas.Fragments.FTronco;
import losfreitasapps.com.incidenciasradiologicas.MainActivity2;
import losfreitasapps.com.incidenciasradiologicas.R;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    FragmentManager FM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FM = getFragmentManager();
        if (getIntent().hasExtra("cranio")) {
            FM.beginTransaction().replace(R.id.content_principal, new FCranio()).commit();
        }
        if (getIntent().hasExtra("tronco")) {
            FM.beginTransaction().replace(R.id.content_principal, new FTronco()).commit();
        }
        if (getIntent().hasExtra("ms")) {
            FM.beginTransaction().replace(R.id.content_principal, new FMS()).commit();
        }
        if (getIntent().hasExtra("mi")) {
            FM.beginTransaction().replace(R.id.content_principal, new FMI()).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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

        if (id == R.id.nav_cranio) {
            FM.beginTransaction().replace(R.id.content_principal, new FCranio()).commit();
        } else if (id == R.id.nav_tronco) {
            FM.beginTransaction().replace(R.id.content_principal, new FTronco()).commit();
        } else if (id == R.id.nav_ms) {
            FM.beginTransaction().replace(R.id.content_principal, new FMS()).commit();
        } else if (id == R.id.nav_mi) {
            FM.beginTransaction().replace(R.id.content_principal, new FMI()).commit();
        } else if (id == R.id.nav_referencias) {
            FM.beginTransaction().replace(R.id.content_principal, new FReferencias()).commit();
        } else if (id == R.id.nav_abreviaturas) {
            FM.beginTransaction().replace(R.id.content_principal, new Abreviaturas()).commit();
        } else if (id == R.id.nav_share) {
            Intent share = new Intent();
            share.setAction(Intent.ACTION_SEND);
            share.putExtra(Intent.EXTRA_SUBJECT, "Compartilhar");
            share.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=losfreitasapps.com.incidenciasradiologicas");
            share.setType("text/plain");
            startActivity(share);
        } else if (id == R.id.nav_chat) {
            Intent i = new Intent(this, MainActivity2.class);
            startActivity(i);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}