package fr.isep.ii3510.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
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

    String _hangmanWordGenerated;
    int nbLife = 10;
    Button buttonA,buttonB,buttonC,buttonD,buttonE,buttonF,buttonG,buttonH,buttonI,buttonJ,buttonK,buttonL,buttonM,buttonN,buttonO,buttonP,buttonQ,buttonR,buttonS,buttonT,buttonU,buttonV,buttonW,buttonX,buttonY,buttonZ,restartButton;
    TextView textWord;
    TextView textLife;
    TextView textLifeNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textLife = findViewById(R.id.textLife);
        textLifeNumber = findViewById(R.id.textLifeNumber);
        textWord = findViewById(R.id.textWord);

        buttonA = findViewById(R.id.buttonA);
        buttonB = findViewById(R.id.buttonB);
        buttonC = findViewById(R.id.buttonC);
        buttonD = findViewById(R.id.buttonD);
        buttonE = findViewById(R.id.buttonE);
        buttonF = findViewById(R.id.buttonF);
        buttonG = findViewById(R.id.buttonG);
        buttonH = findViewById(R.id.buttonH);
        buttonI = findViewById(R.id.buttonI);
        buttonJ = findViewById(R.id.buttonJ);
        buttonK = findViewById(R.id.buttonK);
        buttonL = findViewById(R.id.buttonL);
        buttonM = findViewById(R.id.buttonM);
        buttonN = findViewById(R.id.buttonN);
        buttonO = findViewById(R.id.buttonO);
        buttonP = findViewById(R.id.buttonP);
        buttonQ = findViewById(R.id.buttonQ);
        buttonR = findViewById(R.id.buttonR);
        buttonS = findViewById(R.id.buttonS);
        buttonT = findViewById(R.id.buttonT);
        buttonU = findViewById(R.id.buttonU);
        buttonV = findViewById(R.id.buttonV);
        buttonW = findViewById(R.id.buttonW);
        buttonX = findViewById(R.id.buttonX);
        buttonY = findViewById(R.id.buttonY);
        buttonZ = findViewById(R.id.buttonZ);

        restartButton = findViewById(R.id.restartButton);


        _hangmanWordGenerated = generateWord();

        textLifeNumber.setText(String.valueOf(nbLife));


    }



    public boolean checkLetter(String letter) {
        boolean buttonColor = false;
        char[] hangmanWordCurrChar = textWord.getText().toString().toCharArray();
        for (int i = 0; i < _hangmanWordGenerated.length(); i++) {
            if (_hangmanWordGenerated.charAt(i) == letter.charAt(0)) {
                hangmanWordCurrChar[i] = letter.charAt(0);
                buttonColor = true;
            }
        }
        String updateString = new String(hangmanWordCurrChar);
        textWord.setText(updateString);
        return buttonColor;
    }

    public String generateWord(){

        Resources res = getResources();
        String[] hangmanWords = res.getStringArray(R.array.words_array);

        Random random = new Random();
        int randomWordInt = random.nextInt(hangmanWords.length);
        String hangmanWordGenerated = hangmanWords[randomWordInt];
        String dashes = new String(new char[hangmanWordGenerated.length()]).replace("\0", "-");
        textWord.setText(dashes);
        return hangmanWordGenerated;

    }

    public void onClick(View view) {
        String value = ((Button) view).getText().toString();
        boolean b = checkLetter(value);
        if(b == false) {
            ((Button) view).setBackgroundColor(Color.RED);
            nbLife = nbLife -1;
            updateLife(nbLife);

            if (nbLife <= 0){
                gameOver(view);
            }

        } else {
            ((Button) view).setBackgroundColor(Color.GREEN);
            boolean w = WordFound();
            if (w == true){
                gameWin(view);
            }


        } ((Button) view).setEnabled(false);

    }

    public void gameOver(View view){
        textLife.setText("GAME OVER");
        textLife.setTextSize(25);
        textLife.setTextColor(Color.RED);
        textLifeNumber.setText("");
        restartButton.setVisibility(view.VISIBLE);
    }

    public void gameWin(View view){
        textLife.setText("YOU WON GG NO RE");
        textLife.setTextSize(25);
        textLife.setTextColor(Color.GREEN);
        textLifeNumber.setText("");
        restartButton.setVisibility(view.VISIBLE);

    }

    public void updateLife(int nbLife){
        textLifeNumber.setText(String.valueOf(nbLife));
    }


    public void onClickRestart(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public boolean WordFound(){
        return _hangmanWordGenerated.contentEquals(textWord.getText());
    }
}