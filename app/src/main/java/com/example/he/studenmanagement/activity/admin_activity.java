package com.example.he.studenmanagement.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.example.he.studenmanagement.R;

/**
 * 管理员的管理界面
 * Created by he on 2016/9/30.
 */
public class admin_activity extends Activity {

    private Button bank;//
    private Button paper;//
    private Button stu;//
    private TextView forceOffline;//强制下线

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.admin_layout);

        bank = (Button) findViewById(R.id.admin_activity_bank);
        paper = (Button) findViewById(R.id.admin_activity_paper);
        stu = (Button) findViewById(R.id.admin_activity_stu);
        forceOffline = (TextView) findViewById(R.id.admin_activity_forceOffline);

        bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(admin_activity.this, admin_bank_activity.class);
                startActivity(intent);

            }
        });

        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(admin_activity.this, admin_paper_activity.class);

                startActivity(intent);
            }
        });


        stu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(admin_activity.this,admin_manage_activity.class);
                startActivity(intent);
            }
        });


        forceOffline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("com.he.example.OfflineBradcast");
                sendBroadcast(intent);
            }
        });


    }
}
