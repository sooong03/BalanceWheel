package kr.anima.xd.s.a170802_balancewheel;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class CalendarFragment extends Fragment {



    public CalendarFragment() {
        // Required empty public constructor
    }

    public CalendarFragment(Context context) {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.dashboard_calendar, container, false);
    }

}
