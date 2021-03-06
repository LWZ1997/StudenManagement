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
public class admin_manage_activity extends Activity {

    private Button select;//查询学生信息按钮
    private Button add;//添加学生信息按钮
    private Button order;//查看总成绩排名按钮
//    private TextView forceOffline;//强制下线
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.admin_manage_layout);

        select = (Button) findViewById(R.id.admin_manage_select);
        add = (Button) findViewById(R.id.admin_manage_add);
        order = (Button) findViewById(R.id.admin_manage_order);

        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin_manage_activity.this, studentInfo_activity.class);

                startActivity(intent);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin_manage_activity.this, addStudent_info_activity.class);
                intent.putExtra("haveData","false");
                startActivity(intent);
            }
        });

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin_manage_activity.this, student_total_score.class);
                startActivity(intent);
            }
        });
//        forceOffline.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setAction("com.he.example.OfflineBradcast");
//                sendBroadcast(intent);
//            }
//        });
//
//
//    }
    }
}
