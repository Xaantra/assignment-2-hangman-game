package fr.isep.ii3510.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textWord = findViewById(R.id.textWord);
        TextView textLife = findViewById(R.id.textLife);
        TextView textLifeNumber = findViewById(R.id.textLifeNumber);

        Button buttonA = findViewById(R.id.buttonA);
        Button buttonB = findViewById(R.id.buttonB);
        Button buttonC = findViewById(R.id.buttonC);
        Button buttonD = findViewById(R.id.buttonD);
        Button buttonE = findViewById(R.id.buttonE);
        Button buttonF = findViewById(R.id.buttonF);
        Button buttonG = findViewById(R.id.buttonG);
        Button buttonH = findViewById(R.id.buttonH);
        Button buttonI = findViewById(R.id.buttonI);
        Button buttonJ = findViewById(R.id.buttonJ);
        Button buttonK = findViewById(R.id.buttonK);
        Button buttonL = findViewById(R.id.buttonL);
        Button buttonM = findViewById(R.id.buttonM);
        Button buttonN = findViewById(R.id.buttonN);
        Button buttonO = findViewById(R.id.buttonO);
        Button buttonP = findViewById(R.id.buttonP);
        Button buttonQ = findViewById(R.id.buttonQ);
        Button buttonR = findViewById(R.id.buttonR);
        Button buttonS = findViewById(R.id.buttonS);
        Button buttonT = findViewById(R.id.buttonT);
        Button buttonU = findViewById(R.id.buttonU);
        Button buttonV = findViewById(R.id.buttonV);
        Button buttonW = findViewById(R.id.buttonW);
        Button buttonX = findViewById(R.id.buttonX);
        Button buttonY = findViewById(R.id.buttonY);
        Button buttonZ = findViewById(R.id.buttonZ);


        Resources res = getResources();
        String[] hangmanWords = res.getStringArray(R.array.words_array);

        Random random = new Random();
        int randomWordInt = random.nextInt(hangmanWords.length);
        String dashes = new String(new char[hangmanWords[randomWordInt].length()]).replace("\0", "-");
        textWord.setText(dashes);




    }

}