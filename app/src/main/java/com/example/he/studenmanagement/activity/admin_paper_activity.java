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
 * Created by he on 2018/5/21.
 */
public class admin_paper_activity extends Activity {

    private Button select;//添加试卷按钮
    private Button update;//修改试卷按钮
    private Button delete;//删除试卷按钮
    //    private TextView forceOffline;//强制下线
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.admin_paper_layout);

        select = (Button) findViewById(R.id.admin_paper_select);
        update = (Button) findViewById(R.id.admin_paper_update);
        delete = (Button) findViewById(R.id.admin_paper_delete);

        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin_paper_activity.this, paperInfo_activity.class);

                startActivity(intent);
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin_paper_activity.this, updatePaper_Info_activity.class);
                intent.putExtra("haveData","false");
                startActivity(intent);
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin_paper_activity.this, deletePaper_activity.class);
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
