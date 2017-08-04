package kr.anima.xd.s.a170802_balancewheel;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Intent intent;

    private DashboardFragment dashboard;
    private ShareListFragment shareList;
    private InventoryFragment inventory;
    private SettingFragment setting;

    private TabLayout tabLayout;
    private TabLayout.OnTabSelectedListener listener=new TabLayout.OnTabSelectedListener() {
        @Override
        public void onTabSelected(TabLayout.Tab tab) {
            switch (tab.getPosition()){
                case 0:
                    getSupportFragmentManager().beginTransaction().replace(R.id.view_main, dashboard).commit();
                    break;
                case 1:
                    getSupportFragmentManager().beginTransaction().replace(R.id.view_main, shareList).commit();
                    break;
                case 2:
                    startActivity(intent);
                    break;
                case 3:
                    getSupportFragmentManager().beginTransaction().replace(R.id.view_main, inventory).commit();
                    break;
                case 4:
                    getSupportFragmentManager().beginTransaction().replace(R.id.view_main, setting).commit();
                    break;
            }
        }

        @Override
        public void onTabUnselected(TabLayout.Tab tab) {

        }

        @Override
        public void onTabReselected(TabLayout.Tab tab) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent=new Intent();
        dashboard=new DashboardFragment(this);
        shareList=new ShareListFragment();
        inventory=new InventoryFragment();
        setting=new SettingFragment();

        findID();
        getSupportFragmentManager().beginTransaction()
                .add(dashboard, "dashboard").add(shareList, "sharelist").add(inventory, "inventory").add(setting, "setting")
                .replace(R.id.view_main, dashboard)
                .commit();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    } // on Create

    public void findID(){
        tabLayout= (TabLayout) findViewById(R.id.layout_tab);
        tabLayout.addOnTabSelectedListener(listener);
    } // find ID

} // class Main
