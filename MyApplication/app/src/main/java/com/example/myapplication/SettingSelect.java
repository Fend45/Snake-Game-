package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class SettingSelect extends AppCompatActivity implements View.OnClickListener {
    private Button back;
    private Switch gameMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);

        back = (Button) findViewById(R.id.Back);
        back.setOnClickListener(this);
        gameMode = (Switch) findViewById(R.id.GameMode);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.Back) {
            if (gameMode.isChecked()) {
                launchGyroMain();
            } else {
                launchMain();
            }
        }
    }

    private void launchGyroMain()
    {
        Intent gyroMainMenu = new Intent(SettingSelect.this, GyroMainMenu.class);
        startActivity(gyroMainMenu);
        finish();
    }

    private void launchMain()
    {
        Intent mainMenu = new Intent(SettingSelect.this, MainMenu.class);
        startActivity(mainMenu);
        finish();
    }

}
