package com.hitallow.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecoundActivity extends AppCompatActivity {
    Button bt_voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);
        bt_voltar = findViewById(R.id.voltar);
        bt_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.sendMessage("Iniciando método onStart activity 2");
    }

    private void sendMessage(String mensagem){
        Toast t = Toast.makeText(getApplicationContext(), mensagem, Toast.LENGTH_LONG);
        t.setGravity(Gravity.TOP|Gravity.CENTER , 0, 0);
        t.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.sendMessage("Você está voltando para primeira activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.sendMessage("Iniciando método onDestroy activity 2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.sendMessage("onResume 2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        this.sendMessage("onRestart 2");
    }

}
