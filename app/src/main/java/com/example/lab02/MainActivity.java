package com.example.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //tworzy/uruchammia aplikację
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Funkcja Log.d() tworzy logi aplikacji w oknie debug AndroidStudio. Przyjmuje 2 parametry:
        //- TAG – pozwalający na identyfikację logu spośród innych (dowolny ciąg znaków)
        //- Wiadomość
        Log.d("Lab2", "metoda OnCreate");

        //Metoda Toast pozwala wyświetlać krótkie wiadomości tekstowe na ekranie. Parametry:
        //- Aktualną activity (Context)
        //- Tekst do wyświetlenia
        //- Długość wyświetlania komunikatu (Toast.LENGTH_SHORT, lub Toast.LENGTH_LONG)
        Toast.makeText(this, "Metoda onCreate", Toast.LENGTH_SHORT).show(); //Następnie należy na utworzonym obiekcie uruchomić metodę show() by wyświetlić komunikat.
    }

    @Override
    protected void onStart() { //startuje aplikację
        super.onStart();

        Toast.makeText(this, "Metoda onStart", Toast.LENGTH_SHORT).show();
    }

    @Override //przeciażanie istniejącej metody
    protected void onResume() { //wznawiania aplikację
        super.onResume(); //odwołanie do metody rodzicielskiej

        Log.d("Lab2", "metoda onResume");
        //lub
        Toast.makeText(this, "Metoda onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() { //pauzuje aplikację - activity zostaje przykryte
        super.onPause();

        Toast.makeText(this, "Metoda onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() { //zatrzymuje aplikację - activity zostaje wstrzymane/zatrzymane
        super.onStop();

        Toast.makeText(this, "Metoda onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() { //uruchamia aplikację ponownie - activity zostaje przywrócone po wstrzymaniu
        super.onRestart();

        Toast.makeText(this, "Metoda onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() { //niszczy aplikację - activity zostaje zamknięte
        super.onDestroy();

        Toast.makeText(this, "Metoda onDestroy", Toast.LENGTH_SHORT).show();
    }


}
