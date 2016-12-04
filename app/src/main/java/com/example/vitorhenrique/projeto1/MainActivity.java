package com.example.vitorhenrique.projeto1;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Sair (View View)
    {
        System.exit(0);
    }
    public void Next (View View)
    {
        setContentView(R.layout.tela2);
    }
    public void Sim (View View)
    {
        Toast.makeText(this, "Parabéns, você conhece uma das melhores expêriencias que podem ser vividas em um game.", Toast.LENGTH_LONG).show();
    }
    public void Nao (View View)
    {
        setContentView(R.layout.tela3);
    }
    public void Proxima (View View)
    {
        setContentView(R.layout.tela4);
    }
    public void Anterior (View View)
    {
        setContentView(R.layout.tela3);
    }
    public void Proxima2 (View View)
    {
        setContentView(R.layout.tela5);
    }
    public void Facebook (View View)
    {
        String url = "https://www.facebook.com/bioshock/?fref=ts";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void Site (View View)
    {
        String url = "https://www.2kgames.com/bioshock/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void Sair2 (View View)
    {
        new AlertDialog.Builder(this).setMessage("Deseja sair do aplicativo?")
                .setPositiveButton("sim", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        finish();
                    }
                }).setNegativeButton("não", null).show();
    }
    public void Sobre (View View)
    {
        AlertDialog AlertDialog;
        AlertDialog = new AlertDialog.Builder(this).create();
        AlertDialog.setTitle("Bioshock");
        AlertDialog.setMessage("Aplicativo com informações sobre a história de Bioshock. Desenvolvido por: Vitor Henrique");
        AlertDialog.show();
    }
    public void Voltar (View View)
    {
        setContentView(R.layout.activity_main);
    }
}