package kr.anima.xd.s.a170802_balancewheel.data;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

import kr.anima.xd.s.a170802_balancewheel.R;

/**
 * Created by alfo6-10 on 8/14/2017.
 */

public class StateEmotion extends AppCompatActivity{

    ArrayList<Item> items=new ArrayList<>();

    public StateEmotion() {
        items.add(new Item("good", R.drawable.ic_emotion_dissatisfied));
        items.add(new Item("good", R.drawable.ic_emotion_neutral));
        items.add(new Item("good", R.drawable.ic_emotion_very_satisfied));
    }

    class Item{
        String state;
        int iconId;

        public Item(String state, int iconId) {
            this.state = state;
            this.iconId = iconId;
        }
    } // class item
}
