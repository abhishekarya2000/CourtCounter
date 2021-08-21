package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamA = 0;
    public void Button3PressedA(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void Button2PressedA(View view) {
        scoreTeamA +=2;
        displayForTeamA(scoreTeamA);
    }

    public void Button1PressedA(View view){
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }

    int scoreTeamB = 0;
    public void Button3PressedB(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void Button2PressedB(View view) {
        scoreTeamB +=2;
        displayForTeamB(scoreTeamB);
    }

    public void Button1PressedB(View view){
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }

    public void ButtonReset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}