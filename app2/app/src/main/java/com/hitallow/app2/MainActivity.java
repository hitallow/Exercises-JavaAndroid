package com.hitallow.app2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt_intent ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // chama nossa classe mãe
        super.onCreate(savedInstanceState);
        // Seleciona nosso layout
        setContentView(R.layout.activity_main);
        // seleciono o botão
        bt_intent = (Button) findViewById(R.id.bt_gotoview2);
        // crio o evento de click
        bt_intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSecoundActivity(v);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.sendMenssage("onPause 1");
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.sendMenssage("onStart 1");
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.sendMenssage("onResume 1");

    }
    private void sendMenssage(String mensagem){
        Toast t = Toast.makeText(getApplicationContext(), mensagem, Toast.LENGTH_LONG);
        t.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.sendMenssage("onDestroy 1");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        this.sendMenssage("onRestart 1");
    }
    // método que chama nossa segunda activity

    public void startSecoundActivity(View v){
        Intent secoundActivity = new Intent(this, SecoundActivity.class);
        startActivity(secoundActivity);

    }
}
