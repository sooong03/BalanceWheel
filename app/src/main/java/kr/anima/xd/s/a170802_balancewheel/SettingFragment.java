package kr.anima.xd.s.a170802_balancewheel;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SettingFragment extends Fragment {

    private RecyclerView recyclerView;
    private SettingListAdapter adapter;

    public SettingFragment() {
        // Required empty public constructor
        adapter=new SettingListAdapter(getContext());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_setting, container, false);
        recyclerView=view.findViewById(R.id.view_setting_recycler);
        recyclerView.setAdapter(adapter);

        return view;
    }

} // class Setting Fragment
