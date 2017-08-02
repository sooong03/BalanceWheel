package kr.anima.xd.s.a170802_balancewheel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    ImageView imgFacebook, imgGoogle;
    TextView txtNoAccount, txtForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findID();
    } // on Create

    public void findID(){
        imgFacebook= (ImageView) findViewById(R.id.img_facebook);
        imgGoogle= (ImageView) findViewById(R.id.img_google);
        txtNoAccount= (TextView) findViewById(R.id.txt_noAccount);
        txtForgotPassword= (TextView) findViewById(R.id.txt_forgotPassword);
    } // find View By Id

    public void clickAccount(View v){
        switch (v.getId()){
            case R.id.img_facebook:
                break;
            case R.id.img_google:
                break;
            case R.id.txt_noAccount:
                Intent intent=new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.txt_forgotPassword:
                break;
        }
    } // click SNS

    public void clickPassword(View v){
        // change password
    } // click Password

} // Class Login
