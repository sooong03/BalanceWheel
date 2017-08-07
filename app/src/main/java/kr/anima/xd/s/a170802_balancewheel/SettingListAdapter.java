package kr.anima.xd.s.a170802_balancewheel;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import kr.anima.xd.s.a170802_balancewheel.data.SettingList;

/**
 * Created by alfo6-10 on 8/7/2017.
 */

public class SettingListAdapter extends RecyclerView.Adapter {

    private Context context;
    private ArrayList<SettingList> lists=new ArrayList<>();

    public SettingListAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {
        int viewType;
        if(position==0) viewType=0;
        else viewType=1;

        return viewType;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        switch (viewType){
            case 0:
                view= LayoutInflater.from(context).inflate(R.layout.setting_headline, parent, false);
                HeadlineViewHolder headHolder=new HeadlineViewHolder(view);
                return headHolder;
            case 1:
                view=LayoutInflater.from(context).inflate(R.layout.setting_switch, parent, false);
                ViewHolder holder=new ViewHolder(view);
                return holder;
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        if(position==0){ //headline
            ((HeadlineViewHolder) holder).txt.setText("");
        }


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class HeadlineViewHolder extends RecyclerView.ViewHolder{
        TextView txt;
        public HeadlineViewHolder(View itemView) {
            super(itemView);
            txt=itemView.findViewById(R.id.txt);
        }
    } // class Headline View Holder

    class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(View itemView) {
            super(itemView);
        }
    } // class list ViewHolder

} // class Setting List Adapter
