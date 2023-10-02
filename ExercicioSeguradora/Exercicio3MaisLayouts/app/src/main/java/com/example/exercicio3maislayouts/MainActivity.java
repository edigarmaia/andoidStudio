package com.example.exercicio3maislayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        abrirPrincipal(null);
    }
    public void abrirPrincipal(View view){
        setContentView(R.layout.activity_main);

        findViewById(R.id.imgPrincipal).setBackgroundColor(Color.rgb(51,181,229));//azul
        findViewById(R.id.imgAuto).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgPortateis).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgEmpresarial).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgResidencial).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgViajem).setBackgroundColor(Color.rgb(220,220,220));

        ((TextView)findViewById(R.id.txtRgm)).setText(R.string.rgm);
        ((TextView)findViewById(R.id.txtNome)).setText(R.string.nome);
    }
    public void abrirAuto(View view){
        setContentView(R.layout.activity_main);

        findViewById(R.id.imgPrincipal).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgAuto).setBackgroundColor(Color.rgb(51,181,229));//azul
        findViewById(R.id.imgPortateis).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgEmpresarial).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgResidencial).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgViajem).setBackgroundColor(Color.rgb(220,220,220));

        ((TextView)findViewById(R.id.txtNome)).setText(R.string.auto);
        ((TextView)findViewById(R.id.txtRgm)).setText("");

    }
    public void abrirPortateis(View view){
        setContentView(R.layout.activity_main);

        findViewById(R.id.imgPrincipal).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgPortateis).setBackgroundColor(Color.rgb(51,181,229));//azul
        findViewById(R.id.imgAuto).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgEmpresarial).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgResidencial).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgViajem).setBackgroundColor(Color.rgb(220,220,220));

        ((TextView)findViewById(R.id.txtNome)).setText(R.string.portateis);
        ((TextView)findViewById(R.id.txtRgm)).setText("");
    }
    public void abrirEmpresarial(View view){
        setContentView(R.layout.activity_main);

        findViewById(R.id.imgPrincipal).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgAuto).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgPortateis).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgEmpresarial).setBackgroundColor(Color.rgb(51,181,229));//azul
        findViewById(R.id.imgResidencial).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgViajem).setBackgroundColor(Color.rgb(220,220,220));

        ((TextView)findViewById(R.id.txtNome)).setText(R.string.empresarial);
        ((TextView)findViewById(R.id.txtRgm)).setText("");
    }
    public void abrirResidencial(View view){
        setContentView(R.layout.activity_main);

        findViewById(R.id.imgPrincipal).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgAuto).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgPortateis).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgEmpresarial).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgResidencial).setBackgroundColor(Color.rgb(51,181,229));//azul
        findViewById(R.id.imgViajem).setBackgroundColor(Color.rgb(220,220,220));

        ((TextView)findViewById(R.id.txtNome)).setText(R.string.residencial);
        ((TextView)findViewById(R.id.txtRgm)).setText("");
    }
    public void abrirViagem(View view){
        setContentView(R.layout.activity_main);

        findViewById(R.id.imgPrincipal).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgAuto).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgPortateis).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgEmpresarial).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgResidencial).setBackgroundColor(Color.rgb(220,220,220));
        findViewById(R.id.imgViajem).setBackgroundColor(Color.rgb(51,181,229));//azul

        ((TextView)findViewById(R.id.txtNome)).setText(R.string.viagem);
        ((TextView)findViewById(R.id.txtRgm)).setText("");
    }
}