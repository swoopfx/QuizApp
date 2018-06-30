package com.example.android.quizapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class MainActivity extends AppCompatActivity {

    /**
     *
     */
    boolean isAnswer1 = FALSE;

    boolean isAnswer2 = FALSE;

    boolean isAnswer3 = FALSE;

    boolean isAnswer4 = FALSE;

    boolean isAnswer5 = FALSE;

    String errorButton = "";

    String correctButton = "";

    String defaultbutton = "";

//    RadioGroup group = (RadioGroup) findViewById(R.id.radio_group);

    /**
     * @var This is the acctive qustion at the instant
     */
    int activeQ = 0;


    /**
     * @var This correct answer to question 1
     */
    String answer1 ;


    /**
     * @var This correct answer to question 2
     */
    String answer2 = "Temperature";

    /**
     * This correct answer to question 3
     *
     * @var String
     */
    String answer3 = "Whale";

    /**
     * This correct answer to question 4
     *
     * @var answer4
     */
    String answer4 = "Australia";

    /**
     * @var answer5 This correct answer to question 5
     */
    String answer5 = "";


    String sAnswer1 = "";

    String sAnswer2 = "";

    String sAnswer3 = "";

    String sAnswer4 = "";

    String sAnswer5 = "";

    int sAnswerId1 = -1;

    int sAnswerId2 = -1;

    int sAnswerId3 = -1;

    int sAnswerId4 =  -1;

    int sAnswerId5 = -1;

    String greenColor = "#a4c639";

    String redColor = "ff0000";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.answer1 = getString(R.string.answer1text2);
        this.answer2 = getString(R.string.answer2text1);
        this.answer3 = getString(R.string.answer3text4);
        this.answer4 = getString(R.string.answer4text2);
        this.answer5 = getString(R.string.answer5text3);
        RadioGroup group = (RadioGroup) findViewById(R.id.radio_group);
        this.disableRadiobutton(group, FALSE);


    }


    private void showAnswer(int sAnswerId, int answerId){
        if(sAnswerId == answerId){
            RadioButton answerEntity = (RadioButton) findViewById(answerId);
            answerEntity.setBackgroundColor(Color.GREEN);
        }else{
            RadioButton answerEntity = (RadioButton) findViewById(answerId);
            answerEntity.setBackgroundColor(Color.YELLOW);

            RadioButton sAnswerEntity = (RadioButton) findViewById(sAnswerId);
            sAnswerEntity.setBackgroundColor(Color.RED);
        }
    }


    private void showQ(String question, String answer1, String answer2, String answer3, String answer4) {
        TextView questn = (TextView) findViewById(R.id.question);
        questn.setText(String.valueOf(question));


        RadioButton rad1 = (RadioButton) findViewById(R.id.answer1);
        rad1.setText(String.valueOf(answer1));
//        if(this.isAnswer1 == FALSE){
//            rad1.setChecked(FALSE);
//        }

        RadioButton rad2 = (RadioButton) findViewById(R.id.answer2);
        rad2.setText(String.valueOf(answer2));

        RadioButton rad3 = (RadioButton) findViewById(R.id.answer3);
        rad3.setText(String.valueOf(answer3));

        RadioButton rad4 = (RadioButton) findViewById(R.id.answer4);
        rad4.setText(String.valueOf(answer4));


    }

    public void onQuestion1(View view) {
        this.activeQ = 1;
        RadioGroup group = (RadioGroup) findViewById(R.id.radio_group);
        if (this.isAnswer1 == false) {
            // Show only question
            this.showQ(getString(R.string.question1), getString(R.string.answer1text1), getString(R.string.answer1text2), getString(R.string.answer1text3), getString(R.string.answer1text4));
            this.disableRadiobutton(group, TRUE);
            this.resetColor(group);
            group.clearCheck();


        } else {

            this.showQ(getString(R.string.question1), getString(R.string.answer1text1), getString(R.string.answer1text2), getString(R.string.answer1text3), getString(R.string.answer1text4));
            this.resetColor(group);
            group.clearCheck();
            this.disableRadiobutton(group, FALSE);
            this.showAnswer(this.sAnswerId1, R.id.answer2);



        }
    }

    public void onQuestion2(View view) {
        this.activeQ = 2;
        RadioGroup group = (RadioGroup) findViewById(R.id.radio_group);
        if (this.isAnswer2 == false) {
            // Show only question
            this.showQ(getString(R.string.question2), getString(R.string.answer2text1), getString(R.string.answer2text2), getString(R.string.answer2text3), getString(R.string.answer2text4));

//            RadioGroup group = (RadioGroup) findViewById(R.id.radio_group);
            this.disableRadiobutton(group, TRUE);
            this.resetColor(group);
            group.clearCheck();
        } else {

            //disable rabio button selection
            //show both question and answers
            // indicating the correct answer and selected answer
            //use color initcator
           // this.onAnswer1();

            this.showQ(getString(R.string.question2), getString(R.string.answer2text1), getString(R.string.answer2text2), getString(R.string.answer2text3), getString(R.string.answer2text4));
            this.resetColor(group);
            group.clearCheck();
            this.disableRadiobutton(group, FALSE);
            this.showAnswer(this.sAnswerId2, R.id.answer1);


        }
    }

    public void onQuestion3(View view) {

        this.activeQ = 3;
        RadioGroup group = (RadioGroup) findViewById(R.id.radio_group);
        if (this.isAnswer3 == FALSE) {
            // Show only question
            this.showQ(getString(R.string.question3), getString(R.string.answer3text1), getString(R.string.answer3text2), getString(R.string.answer3text3), getString(R.string.answer3text4));
//            RadioGroup group = (RadioGroup) findViewById(R.id.radio_group);
            this.disableRadiobutton(group, TRUE);
            this.resetColor(group);
            group.clearCheck();
        } else {
            //disable rabio button selection
            //show both question and answers
            // indicating the correct answer and selected answer
            //use color initcator
           // this.onAnswer1();
            this.showQ(getString(R.string.question3), getString(R.string.answer3text1), getString(R.string.answer3text2), getString(R.string.answer3text3), getString(R.string.answer3text4));
            this.resetColor(group);
            group.clearCheck();
            this.disableRadiobutton(group, FALSE);
            this.showAnswer(this.sAnswerId3, R.id.answer4);


        }
    }

    public void onQuestion4(View view) {
        this.activeQ = 4;
        RadioGroup group = (RadioGroup) findViewById(R.id.radio_group);
        if (this.isAnswer4 == false) {
            // Show only question
            this.showQ(getString(R.string.question4), getString(R.string.answer4text1), getString(R.string.answer4text2), getString(R.string.answer4text3), getString(R.string.answer4text4));
//            RadioGroup group = (RadioGroup) findViewById(R.id.radio_group);
            this.resetColor(group);
            group.clearCheck();
        } else {
            //disable rabio button selection
            //show both question and answers
            // indicating the correct answer and selected answer
            //use color initcator
            //this.onAnswer1();

            this.showQ(getString(R.string.question4), getString(R.string.answer4text1), getString(R.string.answer4text2), getString(R.string.answer4text3), getString(R.string.answer4text4));
            this.resetColor(group);
            group.clearCheck();
            this.disableRadiobutton(group, FALSE);
            this.showAnswer(this.sAnswerId4, R.id.answer2);

        }
    }

    public void onQuestion5(View view) {

        this.activeQ = 5;
        RadioGroup group = (RadioGroup) findViewById(R.id.radio_group);
        if (this.isAnswer5 == false) {
            // Show only question

            this.showQ(getString(R.string.question5), getString(R.string.answer5text1), getString(R.string.answer5text2), getString(R.string.answer5text3), getString(R.string.answer5text4));
            this.disableRadiobutton(group, TRUE);
            this.resetColor(group);
            group.clearCheck();

        } else {
            //disable rabio button selection
            this.disableRadiobutton(group, FALSE);
            //show both question and answers

            // indicating the correct answer and selected answer
            //use color initcator

            //this.onAnswer1();
            this.showQ(getString(R.string.question5), getString(R.string.answer5text1), getString(R.string.answer5text2), getString(R.string.answer5text3), getString(R.string.answer5text4));
            this.resetColor(group);
            group.clearCheck();
            this.disableRadiobutton(group, FALSE);
            this.showAnswer(this.sAnswerId5, R.id.answer3);
        }
    }

    private void disableRadiobutton(RadioGroup grp, boolean boo) {
        for (int i = 0; i < grp.getChildCount(); i++) {
            ((RadioButton) grp.getChildAt(i)).setEnabled(boo);
        }
    }


    /**
     * This method compares the actual answer and selected answer
     */
    private String getAnswerString(){
        RadioGroup group = (RadioGroup) findViewById(R.id.radio_group);
        int selectedId = group.getCheckedRadioButtonId();
        RadioButton radioBut = (RadioButton) findViewById(selectedId);
        return  radioBut.getText().toString();

    }


    private void resetColor(RadioGroup grp){
        for (int i = 0; i < grp.getChildCount(); i++) {
            ((RadioButton) grp.getChildAt(i)).setBackgroundColor(Color.parseColor("#c6c6c5"));
        }
//
    }

    private int getAnswerId(){
        RadioGroup group = (RadioGroup) findViewById(R.id.radio_group);
        int selectedId = group.getCheckedRadioButtonId();
        return selectedId;
    }

    private void onAnswer1() {
        int selectedId = this.getAnswerId();
        this.sAnswerId1 = selectedId;
        this.sAnswer1 = this.getAnswerString();
        RadioGroup group = (RadioGroup) findViewById(R.id.radio_group);
        Button submitButton = (Button) findViewById(R.id.submit_button);

        Button questionButton1 = (Button) findViewById(R.id.questionButton1);

        if ( this.sAnswer1 == this.answer1) { // meaning the
            RadioButton seletedButton = (RadioButton) findViewById(R.id.answer2);
            seletedButton.setBackgroundColor(Color.GREEN);
            questionButton1.setBackgroundColor(Color.GREEN);
        } else {
            // make the backbround of selected anser red and the actual answer grey
            RadioButton seletedButton = (RadioButton) findViewById(selectedId);
            seletedButton.setBackgroundColor(Color.RED);


            RadioButton realAnswer = (RadioButton) findViewById(R.id.answer2);
            realAnswer.setBackgroundColor(Color.YELLOW);

            questionButton1.setBackgroundColor(Color.RED);


        }

        this.isAnswer1 = TRUE;
    }

    public void onAnswer2() {
        int selectedId = this.getAnswerId();
        this.sAnswerId2 = selectedId;
        this.sAnswer2 = this.getAnswerString();
        RadioGroup group = (RadioGroup) findViewById(R.id.radio_group);
        Button submitButton = (Button) findViewById(R.id.submit_button);

        Button questionButton2 = (Button) findViewById(R.id.questionButton2);

        if ( this.sAnswer2 == this.answer2) { // meaning the
            RadioButton seletedButton = (RadioButton) findViewById(R.id.answer1);
            seletedButton.setBackgroundColor(Color.GREEN);
            questionButton2.setBackgroundColor((Color.GREEN));
        } else {
            // make the backbround of selected anser red and the actual answer grey
            RadioButton seletedButton = (RadioButton) findViewById(selectedId);
            seletedButton.setBackgroundColor(Color.RED);


            RadioButton realAnswer = (RadioButton) findViewById(R.id.answer1);
            realAnswer.setBackgroundColor(Color.YELLOW);
            questionButton2.setBackgroundColor(Color.RED);

        }

        this.isAnswer2 = TRUE;
    }

    public void onAnswer3() {
        int selectedId = this.getAnswerId();
        this.sAnswerId3 = selectedId;
        this.sAnswer3 = this.getAnswerString();
        RadioGroup group = (RadioGroup) findViewById(R.id.radio_group);
        Button submitButton = (Button) findViewById(R.id.submit_button);

        Button questionButton3 = (Button) findViewById(R.id.questionButton3);

        if ( this.sAnswer3 == this.answer3) { // meaning the
            RadioButton seletedButton = (RadioButton) findViewById(R.id.answer4);
            seletedButton.setBackgroundColor(Color.GREEN);
            questionButton3.setBackgroundColor(Color.GREEN);
        } else {
            // make the backbround of selected anser red and the actual answer grey
            RadioButton seletedButton = (RadioButton) findViewById(selectedId);
            seletedButton.setBackgroundColor(Color.RED);


            RadioButton realAnswer = (RadioButton) findViewById(R.id.answer4);
            realAnswer.setBackgroundColor(Color.YELLOW);
            questionButton3.setBackgroundColor(Color.RED);

        }

        this.isAnswer3 = TRUE;
    }

    public void onAnswer4() {
        int selectedId = this.getAnswerId();
        this.sAnswerId4 = selectedId;
        this.sAnswer4 = this.getAnswerString();
        RadioGroup group = (RadioGroup) findViewById(R.id.radio_group);
        Button submitButton = (Button) findViewById(R.id.submit_button);

        Button questionButton4 = (Button) findViewById(R.id.questionButton4);

        if ( this.sAnswer4 == this.answer4) { // meaning the
            RadioButton seletedButton = (RadioButton) findViewById(R.id.answer2);
            seletedButton.setBackgroundColor(Color.GREEN);
            questionButton4.setBackgroundColor(Color.GREEN);
        } else {
            // make the backbround of selected anser red and the actual answer grey
            RadioButton seletedButton = (RadioButton) findViewById(selectedId);
            seletedButton.setBackgroundColor(Color.RED);


            RadioButton realAnswer = (RadioButton) findViewById(R.id.answer2);
            realAnswer.setBackgroundColor(Color.YELLOW);
            questionButton4.setBackgroundColor(Color.RED);

        }

        this.isAnswer4 = TRUE;
    }

    public void onAnswer5() {
        int selectedId = this.getAnswerId();
        this.sAnswerId5 = selectedId;
        this.sAnswer5 = this.getAnswerString();
        RadioGroup group = (RadioGroup) findViewById(R.id.radio_group);
        Button submitButton = (Button) findViewById(R.id.submit_button);

        Button questionButton5 = (Button) findViewById(R.id.questionButton5);

        if ( this.sAnswer5 == this.answer5) { // meaning the
            RadioButton seletedButton = (RadioButton) findViewById(R.id.answer3);
            seletedButton.setBackgroundColor(Color.GREEN);
            questionButton5.setBackgroundColor(Color.GREEN);
        } else {
            // make the backbround of selected anser red and the actual answer grey
            RadioButton seletedButton = (RadioButton) findViewById(selectedId);
            seletedButton.setBackgroundColor(Color.RED);


            RadioButton realAnswer = (RadioButton) findViewById(R.id.answer3);
            realAnswer.setBackgroundColor(Color.YELLOW);
            questionButton5.setBackgroundColor(Color.RED);

        }

        this.isAnswer5 = TRUE;
    }





    /**
     * This method is called whenever a submit button is clicked
     * It Provides a condition that makes decision based on the active question
     *
     * @param view
     */
    public void onSubmit(View view) {

//        this->an
        if (this.activeQ == 1 && this.isAnswer1 == false) {
            // ccall answer 1 method
            // get the answer selected by the user and fix it in sAnswer
            //
            this.onAnswer1();


        } else if (this.activeQ == 2 && this.isAnswer2 == false) {

            this.onAnswer2();
        } else if (this.activeQ == 3 && this.isAnswer3 == false) {

            this.onAnswer3();
        } else if (this.activeQ == 4 && this.isAnswer4 == false) {

            this.onAnswer4();
        } else if (this.activeQ == 5 && this.isAnswer5 == false) {

            this.onAnswer5();
        } else if (this.activeQ != 0 && (this.isAnswer2 == true || this.isAnswer2 == true || this.isAnswer3 == true || this.isAnswer4 == true || this.isAnswer5 == true)) {
            Toast.makeText(getApplication(), "All question answered, please reset", Toast.LENGTH_LONG).show();
        } else {

        }
    }

    public void onReset(View view) {
        this.activeQ = 0;

        this.isAnswer1 = FALSE;
        this.isAnswer2 = FALSE;
        this.isAnswer3 = FALSE;
        this.isAnswer4 = FALSE;
        this.isAnswer5 = FALSE;

        this.sAnswer1 = "";
        this.sAnswer2 ="";
        this.sAnswer3 ="";
        this.sAnswer4 ="";
        this.sAnswer5 ="";

        this.sAnswerId1 = -1;
        this.sAnswerId2 = -1;
        this.sAnswerId3 = -1;
        this.sAnswerId4 = -1;
        this.sAnswerId5 = -1;

        RadioGroup group = findViewById(R.id.radio_group);
        group.clearCheck();
        this.resetColor(group);

        Button b1 = findViewById(R.id.questionButton1);
        Button b2 = findViewById(R.id.questionButton2);
        Button b3 = findViewById(R.id.questionButton3);
        Button b4 = findViewById(R.id.questionButton4);
        Button b5 = findViewById(R.id.questionButton5);

        b1.setBackgroundColor(Color.parseColor("#c6c6c5"));
        b2.setBackgroundColor(Color.parseColor("#c6c6c5"));
        b3.setBackgroundColor(Color.parseColor("#c6c6c5"));
        b4.setBackgroundColor(Color.parseColor("#c6c6c5"));
        b5.setBackgroundColor(Color.parseColor("#c6c6c5"));


    }
}
