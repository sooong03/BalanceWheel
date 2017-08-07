package kr.anima.xd.s.a170802_balancewheel;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kr.anima.xd.s.a170802_balancewheel.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TrackerOpenFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager pager;
    private TrackerOpenPagerAdapter adapter;

    public TrackerOpenFragment() {
        adapter=new TrackerOpenPagerAdapter();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.dashboard_tracker_open, container, false);

        tabLayout=view.findViewById(R.id.layout_tab);
        pager=view.findViewById(R.id.tracker_open_pager);
        pager.setAdapter(adapter);
        tabLayout.setupWithViewPager(pager);

        return view;
    } // on Create View

} // class Tracker Open
