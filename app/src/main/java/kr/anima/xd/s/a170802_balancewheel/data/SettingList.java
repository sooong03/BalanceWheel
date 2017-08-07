package kr.anima.xd.s.a170802_balancewheel.data;

/**
 * Created by alfo6-10 on 8/7/2017.
 */

public class SettingList {

    Boolean hasAccount=false;

    String[] account={"계정관리", "암호설정", "데이터관리"};
    String[] display={"시작요일 설정", "음력 사용", "기기 캘린더 가져오기", "자동저장 사용", "색상"};
    String[] content={"날씨", "일기", "사진"};
    String[] admin={"Q&A", "관리자문의"};

    String setItems[][]=new String[4][];

    int setType[]=new int[3];
    Boolean isApplication=false; //switch
    int isSelect[]; // flapper

    public SettingList() {

        setItems[0]=account;
        setItems[1]=display;
        setItems[2]=content;
        setItems[3]=admin;

    } // Constructor


} // class Setting List
