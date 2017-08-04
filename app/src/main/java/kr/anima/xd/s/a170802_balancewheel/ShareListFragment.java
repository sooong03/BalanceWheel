package kr.anima.xd.s.a170802_balancewheel;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShareListFragment extends Fragment {

    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private ShareListAdapter adapter;


    public ShareListFragment() {
        // Required empty public constructor
        adapter=new ShareListAdapter();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_share_list, container, false);

        toolbar=view.findViewById(R.id.layout_share_toolbar);
        recyclerView=view.findViewById(R.id.view_share_recycler);
        recyclerView.setAdapter(adapter);

        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ActionBar actionBar=((AppCompatActivity) getActivity()).getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayShowCustomEnabled(true);
        View viewTool=getActivity().getLayoutInflater().inflate(R.layout.toolbar_share_list, null);
        actionBar.setCustomView(viewTool, new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//        toolbar.setNavigationIcon(R.drawable.ic_tracker);
//        toolbar.setNavigationOnClickListener(listener);

        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.share_list, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
} // class Share List Fragment
