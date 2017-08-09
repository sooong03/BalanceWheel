package kr.anima.xd.s.a170802_balancewheel.data;

import java.util.ArrayList;

/**
 * Created by alfo6-10 on 8/9/2017.
 */

public class Data {

    String title; // 미션명
    ArrayList<Element> elements=new ArrayList<>(); // 요소와 각 요소의 해당여부

    public Data() {
        elements.add(new Element("건강", true));
        elements.add(new Element("재정", true));
        elements.add(new Element("환경", true));
        elements.add(new Element("감정", true));
        elements.add(new Element("정신", true));
        elements.add(new Element("관계", true));
        elements.add(new Element("교육", true));
        elements.add(new Element("사업", true));
        elements.add(new Element("외면", true));
    }

    class Element{
        String name;
        Boolean included;

        public Element(String name, Boolean included) {
            this.name = name;
            this.included = included;
        }
    } // class Element

}
