package kr.anima.xd.s.a170802_balancewheel;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Set;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFragment extends Fragment {

    Context context;

    private RecyclerView recyclerView;
    private DashboardAdapter adapter;

    public DashboardFragment() {
        // Required empty public constructor

    } // Constructor

    public DashboardFragment(Context context) {
        this.context = context;
        adapter=new DashboardAdapter(); //TODO : Dashboard SET 필요

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_dashboard, container, false);
        recyclerView=view.findViewById(R.id.view_dash_recycler);
        recyclerView.setAdapter(adapter);

        return view;
    } // on CreateView



} // class Dashboard Fragment
