package com.example.paolo.lottolucky;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.generate);
        final TextView textView1 = findViewById(R.id.text_1);
        final TextView textView2 = findViewById(R.id.text_2);
        final TextView textView3 = findViewById(R.id.text_3);
        final TextView textView4 = findViewById(R.id.text_4);
        final TextView textView5 = findViewById(R.id.text_5);
        final TextView textView6 = findViewById(R.id.text_6);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int lotterynum[] = new int[6];
                for (int x = 0; x < 6; x++){
                    int randomNum = (random.nextInt(58)+ 1);
                    for(int i = 0; i < x; i++){
                        if(lotterynum[i] == randomNum){
                            randomNum = (random.nextInt(58)+ 1);
                            i = -1;
                        }
                    }
                    lotterynum[x] = randomNum;
                }
                textView1.setText(Integer.toString(lotterynum[0]));
                textView2.setText(Integer.toString(lotterynum[1]));
                textView3.setText(Integer.toString(lotterynum[2]));
                textView4.setText(Integer.toString(lotterynum[3]));
                textView5.setText(Integer.toString(lotterynum[4]));
                textView6.setText(Integer.toString(lotterynum[5]));
            }
        });
    }
    //Hahahaha ito comment
}
