package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainMenu extends AppCompatActivity implements View.OnClickListener {
    private Button Start;
    private Button Setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Create activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        Start = (Button) findViewById(R.id.Start);
        Start.setOnClickListener(this);

        Setting = (Button) findViewById(R.id.Setting);
        Setting.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) // Gets the id of the button pressed
        {
            case R.id.Start: {
                launchStart();
                break;
            }
            case R.id.Setting: {
                launchSetting();
                break;
            }
        }
    }

    private void launchStart()
    {
        Intent gameSelect = new Intent(MainMenu.this, GameSelect.class); // Creates object intent to launch a new activity
        startActivity(gameSelect); // Launches the new activity
        finish();
    }

    private void launchSetting()
    {
        Intent settingSelect = new Intent(MainMenu.this, SettingSelect.class); // Creates object intent to launch a new activity (game two)
        startActivity(settingSelect); // Launches the new activity
        finish();
    }
}
