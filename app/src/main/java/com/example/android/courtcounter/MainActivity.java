package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int Score_TeamA = 0;

    int Score_TeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addThreeToTeamA(View view) {
        Score_TeamA = Score_TeamA + 3;
        displayForTeamA(Score_TeamA);
    }

    public void addTwoToTeamA(View view) {
        Score_TeamA = Score_TeamA + 2;
        displayForTeamA(Score_TeamA);
    }

    public void addOneToTeamA(View view) {
        Score_TeamA = Score_TeamA + 1;
        displayForTeamA(Score_TeamA);
    }

    public void ResetTeamA(View view) {
        Score_TeamA = 0;
        displayForTeamA(Score_TeamA);
    }

    public void addThreeToTeamB(View view) {
        Score_TeamB = Score_TeamB + 3;
        displayForTeamB(Score_TeamB);
    }

    public void addTwoToTeamB(View view) {
        Score_TeamB = Score_TeamB + 2;
        displayForTeamB(Score_TeamB);
    }

    public void addOneToTeamB(View view) {
        Score_TeamB = Score_TeamB + 1;
        displayForTeamB(Score_TeamB);
    }

    public void ResetTeamB(View view) {
        Score_TeamB = 0;
        displayForTeamB(Score_TeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}