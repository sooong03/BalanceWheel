package kr.anima.xd.s.a170802_balancewheel;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InventoryFragment extends Fragment {

    private ListView listView;
    private MissionListAdapter adapter;

    public InventoryFragment() {
        // Required empty public constructor
        adapter=new MissionListAdapter();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_inventory, container, false);

        listView=view.findViewById(R.id.list_mission);
        listView.setAdapter(adapter);

        return view;
    }

}
