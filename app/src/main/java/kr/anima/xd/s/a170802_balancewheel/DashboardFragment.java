package kr.anima.xd.s.a170802_balancewheel;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFragment extends Fragment {

    private Context context;

    private RelativeLayout layout;
    private Toolbar toolbar;
    private Fragment[] dashboard=new Fragment[3];

    private View.OnClickListener listener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            getChildFragmentManager().beginTransaction().replace(R.id.view_dash, dashboard[0]).commit();
    }
    };

    public DashboardFragment() {
        // Required empty public constructor
    } // Constructor

    public DashboardFragment(Context context) {
        this.context = context;
        dashboard[0]=new TrackerOpenFragment();
        dashboard[1]=new DashboardListFragment();
        dashboard[2]=new CalendarFragment();
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.dashboard, menu);
        super.onCreateOptionsMenu(menu, inflater);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getChildFragmentManager().beginTransaction().replace(R.id.view_dash, dashboard[1]).commit();
        View view=inflater.inflate(R.layout.fragment_dashboard, container, false);

        layout=view.findViewById(R.id.view_root_dash);
        // TODO : View Transition
        toolbar=view.findViewById(R.id.layout_dash_toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationOnClickListener(listener);
        toolbar.setTitle(""); //TODO : DATE

        return view;
    } // on CreateView

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_calendar:
                getChildFragmentManager().beginTransaction().replace(R.id.view_dash, dashboard[2]).commit();
                break;
        }
        return super.onOptionsItemSelected(item);
    }


} // class Dashboard Fragment
