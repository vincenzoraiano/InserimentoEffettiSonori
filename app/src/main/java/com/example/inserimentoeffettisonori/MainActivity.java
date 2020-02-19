package com.example.inserimentoeffettisonori;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import static com.example.inserimentoeffettisonori.R.raw.campanellobici;

public class MainActivity extends AppCompatActivity {

    //creazione del mediaplayer
   MediaPlayer mediaPlayer;


   //metodo per il bottone play on click
    public  void playOnClick(View view) {

        //alla reference del mediaplayer gli aggiungo il metodo start
       mediaPlayer.start();

    }
    //creo il metodo per il bottone stop
    public  void  stopOnClick(View view){


        //alla referenza mediaplayer inserisco il metodo stop.
        mediaPlayer.stop();
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //il mediaPlayer deve  essere creato con il metodo create, e come risorsa dobbiamo
        //usare questo contenuto e nelle risorse dobbiamo usare il campanello mp3
        mediaPlayer=MediaPlayer.create(this, campanellobici);
    }
}
