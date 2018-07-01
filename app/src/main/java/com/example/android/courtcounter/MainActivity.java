package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        int ScoreTeamA = 0;
        int ScoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * The team A Score
     * @param v
     */
    public void addThreeA(View v){
        ScoreTeamA = ScoreTeamA + 3;
        displayForTeamA(ScoreTeamA);

    }
    public void addTwoA(View v){
        ScoreTeamA = ScoreTeamA + 2;
        displayForTeamA(ScoreTeamA);
    }
    public void addOneA(View v){
        ScoreTeamA = ScoreTeamA + 1;
        displayForTeamA(ScoreTeamA);
    }
    /**
     * The team B Score
     * @param v
     */
    public void addThreeB(View v){
        ScoreTeamB = ScoreTeamB + 3;
        displayForTeamB(ScoreTeamB);

    }
    public void addTwoB(View v){
        ScoreTeamB = ScoreTeamB + 2;
        displayForTeamB(ScoreTeamB);
    }
    public void addOneB(View v){
        ScoreTeamB = ScoreTeamB + 1;
        displayForTeamB(ScoreTeamB);
    }
    public void reset(View v){
        ScoreTeamA = 0;
        ScoreTeamB = 0;
         displayForTeamA(0);
         displayForTeamB(0);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
