package com.gohool.gameto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private int player1 = 0, player2 = 1, activePlayer;
    private int[][] win = {{1, 2, 3}, {3, 6, 9}, {7, 8, 9}, {1, 4, 7}, {1, 5, 9}, {3, 5, 7}, {2, 5, 8}, {4, 5, 6}};
    private boolean game_is_active = true;
    private int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0;
    List<Integer> p1 = new ArrayList<Integer>(), p2 = new ArrayList<Integer>();
    ConstraintLayout pop;
    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @SuppressLint("ResourceAsColor")
    public void buClick(View view) {
        //Toast.makeText(this, "Button " +  view.getId(), Toast.LENGTH_LONG).show();

        b1 = (Button) findViewById(R.id.bu1);
        b2 = (Button) findViewById(R.id.bu2);
        b3 = (Button) findViewById(R.id.bu3);
        b4 = (Button) findViewById(R.id.bu4);
        b5 = (Button) findViewById(R.id.bu5);
        b6 = (Button) findViewById(R.id.bu6);
        b7 = (Button) findViewById(R.id.bu7);
        b8 = (Button) findViewById(R.id.bu8);
        b9 = (Button) findViewById(R.id.bu9);

        activePlayer = play();

        if(game_is_active) {

            switch (view.getId()) {
                case R.id.bu1: {
                    if (activePlayer == 1 && c1 != 1) {
                        b1.setBackground(getResources().getDrawable(R.drawable.changed_a));
                        b1.setTextColor(R.color.colorAccent);
                        b1.setText("X");
                        p1.add(1);
                        c1 = 1;
                    } else if (c1 != 1){
                        b1.setBackground(getResources().getDrawable(R.drawable.changed_b));
                        b1.setTextColor(R.color.colorPrimaryDark);
                        b1.setText("O");
                        p2.add(1);
                        c1 = 1;
                    }
                    else
                        play();
                }
                break;
                case R.id.bu2: {
                    if (activePlayer == 1 && c2 != 1) {
                        b2.setBackground(getResources().getDrawable(R.drawable.changed_a));
                        b2.setTextColor(R.color.colorAccent);
                        b2.setText("X");
                        p1.add(2);
                        c2 = 1;
                    } else if(c2 != 1) {
                        b2.setBackground(getResources().getDrawable(R.drawable.changed_b));
                        b2.setTextColor(R.color.colorPrimaryDark);
                        b2.setText("O");
                        p2.add(2);
                        c2 = 1;
                    }
                    else
                        play();
                }
                break;
                case R.id.bu3: {
                    if (activePlayer == 1 && c3 != 1) {
                        b3.setBackground(getResources().getDrawable(R.drawable.changed_a));
                        b3.setTextColor(R.color.colorAccent);
                        b3.setText("X");
                        p1.add(3);
                        c3 = 1;
                    } else if(c3 != 1){
                        b3.setBackground(getResources().getDrawable(R.drawable.changed_b));
                        b3.setTextColor(R.color.colorPrimaryDark);
                        b3.setText("O");
                        p2.add(3);
                        c3 = 1;
                    }
                    else
                        play();
                }
                break;
                case R.id.bu4: {
                    if (activePlayer == 1 && c4 != 1) {
                        b4.setBackground(getResources().getDrawable(R.drawable.changed_a));
                        b4.setTextColor(R.color.colorAccent);
                        b4.setText("X");
                        p1.add(4);
                        c4 = 1;
                    } else if(c4 != 1){
                        b4.setBackground(getResources().getDrawable(R.drawable.changed_b));
                        b4.setTextColor(R.color.colorPrimaryDark);
                        b4.setText("O");
                        p2.add(4);
                        c4 = 1;
                    }
                    else
                        play();
                }
                break;
                case R.id.bu5: {
                    if (activePlayer == 1 && c5 != 1) {
                        b5.setBackground(getResources().getDrawable(R.drawable.changed_a));
                        b5.setTextColor(R.color.colorAccent);
                        b5.setText("X");
                        p1.add(5);
                        c5 = 1;
                    } else if(c5 != 1) {
                        b5.setBackground(getResources().getDrawable(R.drawable.changed_b));
                        b5.setTextColor(R.color.colorPrimaryDark);
                        b5.setText("O");
                        p2.add(5);
                        c5 = 1;
                    }
                    else
                        play();
                }
                break;
                case R.id.bu6: {
                    if (activePlayer == 1 && c6 != 1) {
                        b6.setBackground(getResources().getDrawable(R.drawable.changed_a));
                        b6.setTextColor(R.color.colorAccent);
                        b6.setText("X");
                        p1.add(6);
                        c6 = 1;
                    } else if(c6 != 1){
                        b6.setBackground(getResources().getDrawable(R.drawable.changed_b));
                        b6.setTextColor(R.color.colorPrimaryDark);
                        b6.setText("O");
                        p2.add(6);
                        c6 = 1;
                    }
                    else
                        play();
                }
                break;
                case R.id.bu7: {
                    if (activePlayer == 1 && c7 != 1) {
                        b7.setBackground(getResources().getDrawable(R.drawable.changed_a));
                        b7.setTextColor(R.color.colorAccent);
                        b7.setText("X");
                        p1.add(7);
                        c7 = 1;
                    } else if(c7 != 1){
                        b7.setBackground(getResources().getDrawable(R.drawable.changed_b));
                        b7.setTextColor(R.color.colorPrimaryDark);
                        b7.setText("O");
                        p2.add(7);
                        c7 = 1;
                    }
                    else
                        play();
                }
                break;
                case R.id.bu8: {
                    if (activePlayer == 1 && c8 != 1) {
                        b8.setBackground(getResources().getDrawable(R.drawable.changed_a));
                        b8.setTextColor(R.color.colorAccent);
                        b8.setText("X");
                        p1.add(8);
                        c8 = 1;
                    } else if(c8 != 1){
                        b8.setBackground(getResources().getDrawable(R.drawable.changed_b));
                        b8.setTextColor(R.color.colorPrimaryDark);
                        b8.setText("O");
                        p2.add(8);
                        c8 = 1;
                    }
                    else
                        play();
                }
                break;
                case R.id.bu9: {
                    if (activePlayer == 1 && c9 != 1) {
                        b9.setBackground(getResources().getDrawable(R.drawable.changed_a));
                        b9.setTextColor(R.color.colorAccent);
                        b9.setText("X");
                        p1.add(9);
                        c9 = 1;
                    } else if(c9 != 1) {
                        b9.setBackground(getResources().getDrawable(R.drawable.changed_b));
                        b9.setTextColor(R.color.colorPrimaryDark);
                        b9.setText("O");
                        p2.add(9);
                        c9 = 1;
                    }
                    else
                        play();
                }
                break;
            }
            if (checkWin() == 1) {
                game_is_active = false;
                popup(1);
            }
            else if (checkWin() == 2){
                game_is_active = false;
                popup(2);
            }
            else if (checkDraw()) {
                game_is_active = false;
                popup(-1);
            }
        }
    }

    public int play() {
        if(player1 == 1) {
            player2 = 1;
            player1 = 0;
            return 2;
        }
        else {
            player1 = 1;
            player2 = 0;
            return 1;
        }
    }

    public int checkWin() {
        int a, b;
        for(int[] i: win) {
            a = 1;
            b = 1;
            for(int j: i) {
                if(!p1.contains(j)) {
                    a = 0;
                }
                if(!p2.contains(j)) {
                    b = 0;
                }
            }
            if(a == 1)
                return 1;
            else if(b == 1)
                return 2;
        }
        return -1;
    }

    public boolean checkDraw() {
        if(p1.size() + p2.size() == 9)
            return true;
        else
            return false;
    }

    public void popup(int n) {
        pop = (ConstraintLayout) findViewById(R.id.popUp);
        message = (TextView) findViewById(R.id.textView);
        if(n == 1)
            message.setText("Player 1 has Won");
        else if(n == 2)
            message.setText("Player 2 has Won");
        else if(n == -1)
            message.setText("Match Draw");
        pop.setVisibility(View.VISIBLE);
    }

    public void newGame(View view) {
        p1.clear();
        p2.clear();

        game_is_active = true;
        player1 = 0;
        player2 = 1;
        c1 = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;
        c5 = 0;
        c6 = 0;
        c7 = 0;
        c8 = 0;
        c9 = 0;

        b1 = (Button) findViewById(R.id.bu1);
        b2 = (Button) findViewById(R.id.bu2);
        b3 = (Button) findViewById(R.id.bu3);
        b4 = (Button) findViewById(R.id.bu4);
        b5 = (Button) findViewById(R.id.bu5);
        b6 = (Button) findViewById(R.id.bu6);
        b7 = (Button) findViewById(R.id.bu7);
        b8 = (Button) findViewById(R.id.bu8);
        b9 = (Button) findViewById(R.id.bu9);

        b1.setBackground(getResources().getDrawable(R.drawable.rounded_squares));
        b2.setBackground(getResources().getDrawable(R.drawable.rounded_squares));
        b3.setBackground(getResources().getDrawable(R.drawable.rounded_squares));
        b4.setBackground(getResources().getDrawable(R.drawable.rounded_squares));
        b5.setBackground(getResources().getDrawable(R.drawable.rounded_squares));
        b6.setBackground(getResources().getDrawable(R.drawable.rounded_squares));
        b7.setBackground(getResources().getDrawable(R.drawable.rounded_squares));
        b8.setBackground(getResources().getDrawable(R.drawable.rounded_squares));
        b9.setBackground(getResources().getDrawable(R.drawable.rounded_squares));

        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");

        pop = (ConstraintLayout) findViewById(R.id.popUp);
        pop.setVisibility(View.INVISIBLE);
    }

    public void exit() {
        finish();
        System.exit(0);
    }
}
