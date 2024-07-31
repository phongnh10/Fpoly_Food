package com.example.du_an_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star);
        TextView textView = findViewById(R.id.txt_terms_and_privacy);
        Button btn_signin = findViewById(R.id.btnSignin);
        Button btn_login = findViewById(R.id.btnLogin);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StarActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });


        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StarActivity.this, SigninActivity.class);
                startActivity(intent);
            }
        });

        String text = "Bằng cách tiếp tục, bạn đồng ý với <b>Điều khoản Dịch vụ</b> của FFood và xác nhận rằng bạn đã đọc <b>Chính sách quyền riêng tư</b> của chúng tôi.";
        textView.setText(Html.fromHtml(text));


    }
}