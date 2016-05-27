package com.coupunz.studyjam.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0 , scoreB=0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScoreForTeamA (int score) {
        TextView scoreTV = (TextView) findViewById(R.id.score_text_view);
        scoreTV.setText(String.valueOf(scoreA));
    }
    public void displayScoreForTeamB (int score) {
        TextView scoreTVsec = (TextView) findViewById(R.id.score_text_view2);
        scoreTVsec.setText(String.valueOf(scoreB));
    }

    public void addOneA (View view){
        scoreA += 1;
        displayScoreForTeamA(scoreA);

    }

    public void addTwoA (View view){
        scoreA += 2;
        displayScoreForTeamA(scoreA);

    }
    public void addThreeA (View view){
        scoreA += 3;
        displayScoreForTeamA(scoreA);

    }
    public void addOneB (View view){
        scoreB += 1;
        displayScoreForTeamB(scoreB);

    }
    public void addTwoB (View view) {
        scoreB += 2;
        displayScoreForTeamB(scoreB);

    }
    public void addThreeB (View view){
        scoreB += 3;
        displayScoreForTeamB(scoreB);

    }
    public void resetScore(View view) {
        scoreA=scoreB=0;
        displayScoreForTeamA(scoreA);
        displayScoreForTeamB(scoreB);

    }
}
