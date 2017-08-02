package kr.anima.xd.s.a170802_balancewheel;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ActionBar actionBar;
    private Intent intent;

    private DashboardFragment dashboard;

    private TabLayout tabLayout;
    private TabLayout.OnTabSelectedListener listener=new TabLayout.OnTabSelectedListener() {
        @Override
        public void onTabSelected(TabLayout.Tab tab) {
            switch (tab.getPosition()){
                case 0:
                    getSupportFragmentManager().beginTransaction().show(dashboard).commit();
                    break;
                case 1:
                    break;
                case 2:
                    startActivity(intent);
                    break;
                case 3:
                    break;
                case 4:
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
        dashboard=new DashboardFragment();

        findID();
    } // on Create

    public void findID(){
        tabLayout= (TabLayout) findViewById(R.id.layout_tab);
        tabLayout.addOnTabSelectedListener(listener);
    } // find ID

} // class Main
