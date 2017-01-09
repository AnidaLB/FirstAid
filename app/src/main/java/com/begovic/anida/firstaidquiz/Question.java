package com.begovic.anida.firstaidquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Question extends AppCompatActivity {

    TextView question;
    RadioButton a;
    RadioButton b;
    RadioButton c;
    Button button;
    TextView status;
    int counter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        question = (TextView) findViewById(R.id.tvQuestion);
        a = (RadioButton) findViewById(R.id.rbAnswer1);
        b = (RadioButton) findViewById(R.id.rbAnswer2);
        c = (RadioButton) findViewById(R.id.rbAnswer3);
        button = (Button) findViewById(R.id.button2);
        status = (TextView) findViewById(R.id.tvStatus);
        counter = 1;

        status.setVisibility(View.INVISIBLE);

        question.setText(R.string.question1);
        a.setText(R.string.answer1_a);
        b.setText(R.string.answer1_b);
        c.setText(R.string.answer1_c);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                status.setVisibility(View.INVISIBLE);
                switch(counter){
                    case 1: g2(a.isChecked(), b.isChecked(), c.isChecked()); break;
                    case 2: g3(a.isChecked(), b.isChecked(), c.isChecked()); break;
                    case 3: g4(a.isChecked(), b.isChecked(), c.isChecked()); break;
                    case 4: g5(a.isChecked(), b.isChecked(), c.isChecked()); break;
                    case 5: g6(a.isChecked(), b.isChecked(), c.isChecked()); break;
                    case 6: g7(a.isChecked(), b.isChecked(), c.isChecked()); break;
                    case 7: g8(a.isChecked(), b.isChecked(), c.isChecked()); break;
                    case 8: g9(a.isChecked(), b.isChecked(), c.isChecked()); break;
                    case 9: g10(a.isChecked(), b.isChecked(), c.isChecked()); break;
                    case 10: g11(a.isChecked(), b.isChecked(), c.isChecked()); break;
                    case 11: g12(a.isChecked(), b.isChecked(), c.isChecked()); break;
                    default: break;
                }
            }
        });}

    private void g12(boolean checked, boolean checked1, boolean checked2) {
        if(checked==false && checked1==false && checked2==true){

            counter = 1;
            a.setChecked(false);
            b.setChecked(false);
            c.setChecked(false);

            Intent finish = new Intent(Question.this, FinishActivity.class);
            startActivity(finish);
        }
        else{
            status.setVisibility(View.VISIBLE);
        }
    }

    private void g11(boolean checked, boolean checked1, boolean checked2) {
        if(checked==false && checked1==false && checked2==true){
            question.setText(R.string.question11);
            a.setText(R.string.answer11_a);
            b.setText(R.string.answer11_b);
            c.setText(R.string.answer11_c);
            counter++;
            a.setChecked(false);
            b.setChecked(false);
            c.setChecked(false);
        }
        else{
            status.setVisibility(View.VISIBLE);
        }
    }

    private void g10(boolean checked, boolean checked1, boolean checked2) {
        if(checked==true && checked1==false && checked2==false){
            question.setText(R.string.question10);
            a.setText(R.string.answer10_a);
            b.setText(R.string.answer10_b);
            c.setText(R.string.answer10_c);
            counter++;
            a.setChecked(false);
            b.setChecked(false);
            c.setChecked(false);
        }
        else{
            status.setVisibility(View.VISIBLE);
        }
    }

    private void g9(boolean checked, boolean checked1, boolean checked2) {
        if(checked==false && checked1==true && checked2==false){
            question.setText(R.string.question8);
            a.setText(R.string.answer9_a);
            b.setText(R.string.answer9_b);
            c.setText(R.string.answer9_c);
            counter++;
            a.setChecked(false);
            b.setChecked(false);
            c.setChecked(false);
        }
        else{
            status.setVisibility(View.VISIBLE);
        }
    }

    private void g8(boolean checked, boolean checked1, boolean checked2) {
        if(checked==false && checked1==false && checked2==true){
            question.setText(R.string.question8);
            a.setText(R.string.answer8_a);
            b.setText(R.string.answer8_b);
            c.setText(R.string.answer8_c);
            counter++;
            a.setChecked(false);
            b.setChecked(false);
            c.setChecked(false);
        }
        else{
            status.setVisibility(View.VISIBLE);
        }
    }

    private void g7(boolean checked, boolean checked1, boolean checked2) {
        if(checked==false && checked1==false && checked2==true){
            question.setText(R.string.question8);
            a.setText(R.string.answer7_a);
            b.setText(R.string.answer7_b);
            c.setText(R.string.answer7_c);
            counter++;
            a.setChecked(false);
            b.setChecked(false);
            c.setChecked(false);
        }
        else{
            status.setVisibility(View.VISIBLE);
        }
    }
    private void g6(boolean checked, boolean checked1, boolean checked2) {
        if(checked==true && checked1==false && checked2==false){
            question.setText(R.string.question6);
            a.setText(R.string.answer6_a);
            b.setText(R.string.answer6_b);
            c.setText(R.string.answer6_c);
            counter++;
            a.setChecked(false);
            b.setChecked(false);
            c.setChecked(false);
        }
        else{
            status.setVisibility(View.VISIBLE);
        }
    }

    private void g5(boolean checked, boolean checked1, boolean checked2) {
        if(checked==false && checked1==false && checked2==true){
            question.setText(R.string.question5);
            a.setText(R.string.answer5_a);
            b.setText(R.string.answer5_b);
            c.setText(R.string.answer5_c);
            counter++;
            a.setChecked(false);
            b.setChecked(false);
            c.setChecked(false);
        }
        else{
            status.setVisibility(View.VISIBLE);
        }
    }

    private void g4(boolean checked, boolean checked1, boolean checked2) {
        if(checked==false && checked1==true && checked2==false){
            question.setText(R.string.question4);
            a.setText(R.string.answer4_a);
            b.setText(R.string.answer4_b);
            c.setText(R.string.answer4_c);
            counter++;
            a.setChecked(false);
            b.setChecked(false);
            c.setChecked(false);
        }
        else{
            status.setVisibility(View.VISIBLE);
        }
    }

    private void g3(boolean checked, boolean checked1, boolean checked2) {
        if(checked==false && checked1==false && checked2==true){
            question.setText(R.string.question3);
            a.setText(R.string.answer3_a);
            b.setText(R.string.answer3_b);
            c.setText(R.string.answer3_c);
            counter++;
            a.setChecked(false);
            b.setChecked(false);
            c.setChecked(false);
        }
        else{
            status.setVisibility(View.VISIBLE);
        }
    }

    private void g2(boolean checked, boolean checked1, boolean checked2) {
        if(checked==false && checked1==false && checked2==true){
            question.setText(R.string.question2);
            a.setText(R.string.answer2_a);
            b.setText(R.string.answer2_b);
            c.setText(R.string.answer2_c);
            counter++;
            a.setChecked(false);
            b.setChecked(false);
            c.setChecked(false);
        }
        else{
            status.setVisibility(View.VISIBLE);
        }
    }



}



