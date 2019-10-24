package com.hly.readcode;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NoEditActiviy extends AppCompatActivity {

    private TextView txt;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.no_edit_activity_layout);
        txt = findViewById(R.id.txt);
    }
    String barcode ="";
    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        if(event.getAction()== KeyEvent.ACTION_DOWN){
            char pressedKey = (char) event.getUnicodeChar();
            barcode += pressedKey;
        }
        if (event.getAction()==KeyEvent.ACTION_DOWN && event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {
            txt.setText(barcode);
            barcode="";
        }
        return super.dispatchKeyEvent(event);
    }

}
