package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayForTeamA(int scoreA){
        TextView t=(TextView)findViewById(R.id.counterA);
        t.setText(String.valueOf(scoreA));
    }

    public void displayForTeamB(int scoreB){
        TextView t=(TextView)findViewById(R.id.counterB);
        t.setText(String.valueOf(scoreB));
    }

    public void oneA(View view){
        scoreA=scoreA+1;
        displayForTeamA(scoreA);
    }
    public void twoA(View view){
        scoreA=scoreA+2;
        displayForTeamA(scoreA);
    }
    public void threeA(View view){
        scoreA=scoreA+3;
        displayForTeamA(scoreA);
    }
    public void oneB(View view){
        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }
    public void twoB(View view){
        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }
    public void threeB(View view){
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }
    public void reset(View view){
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

}
