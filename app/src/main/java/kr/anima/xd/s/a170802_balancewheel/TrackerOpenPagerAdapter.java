package kr.anima.xd.s.a170802_balancewheel;

import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by alfo6-10 on 8/4/2017.
 */

public class TrackerOpenPagerAdapter extends PagerAdapter {

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }

} // class Tracker Open Pager
