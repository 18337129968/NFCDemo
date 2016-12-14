package com.isoftstone.nfcdemo;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv_show);

    }

    public void ocClickRead(View v) {
        switch (v.getId()) {
            case R.id.btn_read:
                startActivity(new Intent(this, ReadNFCActivity.class));
                break;
            case R.id.btn_blue:
                startActivity(new Intent(this, BluetoothActivity.class));
                break;
        }

    }

    @Override
    protected void onDestroy() {
        BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        mBluetoothAdapter.disable();
        super.onDestroy();
    }
}
