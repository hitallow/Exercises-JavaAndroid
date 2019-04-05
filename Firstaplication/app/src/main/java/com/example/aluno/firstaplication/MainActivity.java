package com.example.aluno.firstaplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView tv_oneValue ;
    private TextView tv_secoundValue ;
    private EditText et_resposta;
    private Button bt_corrigir;
    private  TextView tv_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random gerador = new Random();
        bt_corrigir = (Button) findViewById(R.id.bt_corrigir);
        tv_oneValue = (TextView) findViewById(R.id.tv_oneValue);
        tv_secoundValue = (TextView) findViewById(R.id.tv_secoundValue);
        et_resposta = (EditText) findViewById(R.id.et_resposta);
        tv_result = (TextView) findViewById(R.id.tv_result);

        //this.inserirValor();
        inserValue();

        bt_corrigir.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v){

                int n1 = Integer.parseInt(tv_oneValue.getText().toString());
                int n2 = Integer.parseInt(tv_secoundValue.getText().toString());
                int result = Integer.parseInt(et_resposta.getText().toString());
                if (n1+n2 == result){
                    tv_result.setText("Parabéns, você acertou!");
                    inserValue();
                }
                else{
                    tv_result.setText("Você é muito burro irmão!");
                }
            }
        });

    }
    public void inserValue(){
        Random gerador = new Random();
        tv_oneValue.setText(""+gerador.nextInt(10));
        tv_secoundValue.setText(""+gerador.nextInt(10));
    }



}
