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
        final ArrayList<Button> listButtons = new ArrayList();
        final TextView textWord = findViewById(R.id.textWord);
        TextView textLife = findViewById(R.id.textLife);
        TextView textLifeNumber = findViewById(R.id.textLifeNumber);

        Button buttonA = findViewById(R.id.buttonA);
        listButtons.add(buttonA);
        Button buttonB = findViewById(R.id.buttonB);
        listButtons.add(buttonB);
        Button buttonC = findViewById(R.id.buttonC);
        listButtons.add(buttonC);
        Button buttonD = findViewById(R.id.buttonD);
        listButtons.add(buttonD);
        Button buttonE = findViewById(R.id.buttonE);
        listButtons.add(buttonE);
        Button buttonF = findViewById(R.id.buttonF);
        listButtons.add(buttonF);
        Button buttonG = findViewById(R.id.buttonG);
        listButtons.add(buttonG);
        Button buttonH = findViewById(R.id.buttonH);
        listButtons.add(buttonH);
        Button buttonI = findViewById(R.id.buttonI);
        listButtons.add(buttonI);
        Button buttonJ = findViewById(R.id.buttonJ);
        listButtons.add(buttonJ);
        Button buttonK = findViewById(R.id.buttonK);
        listButtons.add(buttonK);
        Button buttonL = findViewById(R.id.buttonL);
        listButtons.add(buttonL);
        Button buttonM = findViewById(R.id.buttonM);
        listButtons.add(buttonM);
        Button buttonN = findViewById(R.id.buttonN);
        listButtons.add(buttonN);
        Button buttonO = findViewById(R.id.buttonO);
        listButtons.add(buttonO);
        Button buttonP = findViewById(R.id.buttonP);
        listButtons.add(buttonP);
        Button buttonQ = findViewById(R.id.buttonQ);
        listButtons.add(buttonQ);
        Button buttonR = findViewById(R.id.buttonR);
        listButtons.add(buttonR);
        Button buttonS = findViewById(R.id.buttonS);
        listButtons.add(buttonS);
        Button buttonT = findViewById(R.id.buttonT);
        listButtons.add(buttonT);
        Button buttonU = findViewById(R.id.buttonU);
        listButtons.add(buttonU);
        Button buttonV = findViewById(R.id.buttonV);
        listButtons.add(buttonV);
        Button buttonW = findViewById(R.id.buttonW);
        listButtons.add(buttonW);
        Button buttonX = findViewById(R.id.buttonX);
        listButtons.add(buttonX);
        Button buttonY = findViewById(R.id.buttonY);
        listButtons.add(buttonY);
        Button buttonZ = findViewById(R.id.buttonZ);
        listButtons.add(buttonZ);


        Resources res = getResources();
        String[] hangmanWords = res.getStringArray(R.array.words_array);

        Random random = new Random();
        int randomWordInt = random.nextInt(hangmanWords.length);
        String dashes = new String(new char[hangmanWords[randomWordInt].length()]).replace("\0", "-");
        textWord.setText(dashes);

        Log.d("LIST", listButtons.toString());

        for (int i=0; i < listButtons.size(); i++){
            final int finalI = i;
            listButtons.get(i).setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    textWord.setText(listButtons.get(finalI).getText());
                }
            });
        }





    }



}