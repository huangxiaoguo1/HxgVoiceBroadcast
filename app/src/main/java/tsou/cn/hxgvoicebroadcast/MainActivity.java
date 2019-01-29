package tsou.cn.hxgvoicebroadcast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.example.lib_hxgvoicebroadcast.VoicePlay;

import java.util.ArrayList;
import java.util.List;

import tsou.cn.hxgvoicebroadcast.constant.Constants;

public class MainActivity extends AppCompatActivity {

    private EditText etText;
    private String trim;
    List<String> result = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etText = (EditText) findViewById(R.id.et_text);

        result.add(Constants.START_SOUND);
        result.add(Constants.END_SOUND);
        result.add(Constants.START_SOUND);


        // 默认播放
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trim = etText.getText().toString().trim();
                if (TextUtils.isEmpty(trim)){
                    trim = "收到付款1999.99元";
                }
                VoicePlay.with(MainActivity.this).play(trim);
            }
        });
        // 设置只报金额数字
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trim = etText.getText().toString().trim();
                if (TextUtils.isEmpty(trim)){
                    trim = "收到付款1999.99元";
                }
                VoicePlay.with(MainActivity.this).play(trim, true);
            }
        });
        // 设置前部语音
        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trim = etText.getText().toString().trim();
                if (TextUtils.isEmpty(trim)){
                    trim = "收到付款1999.99元";
                }
                VoicePlay.with(MainActivity.this).play(trim, false, Constants.START_SOUND);
            }
        });
        // 设置末尾语音
        findViewById(R.id.btn4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trim = etText.getText().toString().trim();
                if (TextUtils.isEmpty(trim)){
                    trim = "收到付款1999.99元";
                }
                VoicePlay.with(MainActivity.this).play(trim, false, Constants.START_SOUND, Constants.END_SOUND);
            }
        });
        // 直播放传入的语音
        findViewById(R.id.btn5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trim = etText.getText().toString().trim();
                if (TextUtils.isEmpty(trim)){
                    trim = "收到付款1999.99元";
                }
                VoicePlay.with(MainActivity.this).play(result);
            }
        });
    }
}
