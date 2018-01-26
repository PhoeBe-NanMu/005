package com.example.leiyang.dialog58;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity {


    private AlertDialog dialog;
    private Button btn_determine;
    private Button btn_cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 单击按键
     * @param keyCode
     * @param event
     * @return
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK){
            dialog = new AlertDialog.Builder(this).create();
            dialog.show();
            Window window = dialog.getWindow();
            window.setGravity(Gravity.CENTER);
            window.setWindowAnimations(R.style.mystyle);
            window.setContentView(R.layout.dialog_layout);
            btn_determine = (Button) window.findViewById(R.id.btn_determine);
            btn_cancel = (Button) window.findViewById(R.id.btn_cancel);
            initbtn();
        }
        return super.onKeyDown(keyCode, event);
    }

    private void initbtn() {
        btn_determine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                finish();
            }
        });

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

    }
}
