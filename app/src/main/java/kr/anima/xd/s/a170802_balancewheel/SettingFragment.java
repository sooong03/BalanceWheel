package kr.anima.xd.s.a170802_balancewheel;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SettingFragment extends Fragment {

    private Context context;

//    private RecyclerView recyclerView;
//    private SettingListAdapter_R adapter;
//    private SettingListAdapter adapter;
    private ListView listView;


    public SettingFragment(Context context) {
        this.context=context;
        // Required empty public constructor
//        adapter=new SettingListAdapter_R();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_setting, container, false);
        listView=view.findViewById(R.id.list_setting);
        listView.setItemsCanFocus(true);
        listView.setFocusable(false);
        listView.setClickable(false);
//        recyclerView=view.findViewById(R.id.view_setting_recycler);
//        recyclerView.setAdapter(adapter);

        return view;
    }

} // class Setting Fragment
