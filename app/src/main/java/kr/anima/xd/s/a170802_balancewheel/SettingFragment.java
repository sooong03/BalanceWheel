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

    private RecyclerView recyclerView;
//    private SettingListAdapter_R adapter;
    private SettingListAdapter adapter;
    private ListView listView;

    private AdapterView.OnItemClickListener listener=new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            TextView txt=view.findViewById(R.id.txt_set_title);
            txt.setText(context.getResources().getStringArray(R.array.set_account)[position]);
        }
    };

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
        listView.setAdapter(ArrayAdapter.createFromResource(context, R.array.set_account, R.layout.item_setting_switch));
        listView.setOnItemClickListener(listener);
//        recyclerView=view.findViewById(R.id.view_setting_recycler);
//        recyclerView.setAdapter(adapter);

        return view;
    }

} // class Setting Fragment
