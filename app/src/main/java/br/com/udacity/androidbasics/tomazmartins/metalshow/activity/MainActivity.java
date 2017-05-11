package br.com.udacity.androidbasics.tomazmartins.metalshow.activity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import br.com.udacity.androidbasics.tomazmartins.metalshow.R;
import br.com.udacity.androidbasics.tomazmartins.metalshow.includedlayout.MultipleAnswerQuestionLayout;
import br.com.udacity.androidbasics.tomazmartins.metalshow.includedlayout.MultipleChoiceQuestionLayout;
import br.com.udacity.androidbasics.tomazmartins.metalshow.includedlayout.OpenQuestionLayout;
import br.com.udacity.androidbasics.tomazmartins.metalshow.includedlayout.RightWrongLayout;
import br.com.udacity.androidbasics.tomazmartins.metalshow.model.MultipleAnswersQuestion;
import br.com.udacity.androidbasics.tomazmartins.metalshow.model.MultipleChoiceQuestion;
import br.com.udacity.androidbasics.tomazmartins.metalshow.model.OpenQuestion;
import br.com.udacity.androidbasics.tomazmartins.metalshow.model.RightWrongQuestion;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static br.com.udacity.androidbasics.tomazmartins.metalshow.R.string.score;

public class MainActivity extends AppCompatActivity {
    @BindView( R.id.txv_total_score ) TextView txv_totalScore;
    @BindView( R.id.btn_submit ) AppCompatButton btn_submit;
    @BindView( R.id.btn_reset ) TextView btn_reset;

    @BindView( R.id.question_1 ) View question_1;
    @BindView( R.id.question_2 ) View question_2;
    @BindView( R.id.question_3 ) View question_3;
    @BindView( R.id.question_4 ) View question_4;
    @BindView( R.id.question_5 ) View question_5;
    @BindView( R.id.question_6 ) View question_6;

    private RightWrongLayout question_1Layout = new RightWrongLayout();
    private RightWrongLayout question_2Layout = new RightWrongLayout();
    private OpenQuestionLayout question_3Layout = new OpenQuestionLayout();
    private MultipleAnswerQuestionLayout question_4Layout = new MultipleAnswerQuestionLayout();
    private MultipleChoiceQuestionLayout question_5Layout = new MultipleChoiceQuestionLayout();
    private MultipleChoiceQuestionLayout question_6Layout = new MultipleChoiceQuestionLayout();

    private RightWrongQuestion rightWrongQuestion_1 = new RightWrongQuestion();
    private RightWrongQuestion rightWrongQuestion_2 = new RightWrongQuestion();
    private OpenQuestion openQuestion = new OpenQuestion( 4 );
    private MultipleAnswersQuestion multipleAnswersQuestion = new MultipleAnswersQuestion( 5 );
    private MultipleChoiceQuestion multipleChoiceQuestion_1 = new MultipleChoiceQuestion();
    private MultipleChoiceQuestion multipleChoiceQuestion_2 = new MultipleChoiceQuestion();

    private int score;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        ButterKnife.bind( this );
        bindComponentsIncludedLayouts();

        fillQuestions();
    }

    @OnClick( R.id.btn_submit )
    public void onSubmit() {
        int qtdCorrectAnswers = checkAnswers();
        score += calculateScore( qtdCorrectAnswers );
        updateScore( score );
    }

    private void updateScore( int score ) {
        txv_totalScore.setText( String.valueOf( score ) );
    }

    private int calculateScore( int qtdCorrectAnswers ) {
        return qtdCorrectAnswers * 10;
    }

    private int checkAnswers() {
        List<Boolean> checksOfCorrectAnswers = new ArrayList<>();

        boolean isCorrectQuestion_1 = checkQuestion_1();
        checksOfCorrectAnswers.add( isCorrectQuestion_1 );

        boolean isCorrectQuestion_2 = checkQuestion_2();
        checksOfCorrectAnswers.add( isCorrectQuestion_2 );

        boolean isCorrectQuestion_3 = checkQuestion_3();
        checksOfCorrectAnswers.add( isCorrectQuestion_3 );

        boolean isCorrectQuestion_4 = checkQuestion_4();
        checksOfCorrectAnswers.add( isCorrectQuestion_4 );

        boolean isCorrectQuestion_5 = checkQuestion_5();
        checksOfCorrectAnswers.add( isCorrectQuestion_5 );

        boolean isCorrectQuestion_6 = checkQuestion_6();
        checksOfCorrectAnswers.add( isCorrectQuestion_6 );

        int qtdCorrectAnswers = 0;

        for( Boolean isCorrect : checksOfCorrectAnswers ) {
            if( isCorrect ) {
                ++qtdCorrectAnswers;
            }
        }

        Toast.makeText( this, ""+isCorrectQuestion_1+
                " "+isCorrectQuestion_2+
                " "+isCorrectQuestion_3+
                " "+isCorrectQuestion_4+
                " "+isCorrectQuestion_5+
                " "+isCorrectQuestion_6, Toast.LENGTH_SHORT ).show();

        return qtdCorrectAnswers;
    }

    private boolean checkQuestion_1() {
        int radioButtonIdQuestion_1 = question_1Layout.rdg_rwq.getCheckedRadioButtonId();

        question_1Layout.rwq_option_1 = ButterKnife.findById( question_1, radioButtonIdQuestion_1 );

        String resultQuestion_1 = question_1Layout.rwq_option_1.getText().toString().toUpperCase();

        return rightWrongQuestion_1.checkAnswer( resultQuestion_1 );
    }

    private boolean checkQuestion_2() {
        int radioButtonIdQuestion_2 = question_2Layout.rdg_rwq.getCheckedRadioButtonId();

        question_1Layout.rwq_option_2 = ButterKnife.findById( question_2, radioButtonIdQuestion_2 );

        String resultQuestion_2 = question_2Layout.rwq_option_2.getText().toString().toUpperCase();

        return rightWrongQuestion_2.checkAnswer( resultQuestion_2 );
    }

    private boolean checkQuestion_3() {
        String resultQuestion_3 = question_3Layout.edt_oq.getText().toString();
        return openQuestion.checkAnswer( Arrays.asList( resultQuestion_3.split( " " ) ) );
    }

    private boolean checkQuestion_4() {
        boolean ckb_1 = question_4Layout.options.get( 0 ).isChecked();
        boolean ckb_2 = question_4Layout.options.get( 1 ).isChecked();
        boolean ckb_3 = question_4Layout.options.get( 2 ).isChecked();
        boolean ckb_4 = question_4Layout.options.get( 3 ).isChecked();
        boolean ckb_5 = question_4Layout.options.get( 4 ).isChecked();
        boolean ckb_6 = question_4Layout.options.get( 5 ).isChecked();
        boolean ckb_7 = question_4Layout.options.get( 6 ).isChecked();
        boolean ckb_8 = question_4Layout.options.get( 7 ).isChecked();
        List<Boolean> checkboxes = new ArrayList<>();
        checkboxes.add( ckb_1 );
        checkboxes.add( ckb_2 );
        checkboxes.add( ckb_3 );
        checkboxes.add( ckb_4 );
        checkboxes.add( ckb_5 );
        checkboxes.add( ckb_6 );
        checkboxes.add( ckb_7 );
        checkboxes.add( ckb_8 );
        List<String> resultQuestion_4 = new ArrayList<>();
        for( int i = 0; i < checkboxes.size(); ++i ) {
            if( checkboxes.get( i ) ) {
                resultQuestion_4.add( question_4Layout.options.get( i ).getText().toString() );
            }
        }
        return multipleAnswersQuestion.checkAnswer( resultQuestion_4 );
    }

    private  boolean checkQuestion_5() {
        int radioButtonIdQuestion_5 = question_5Layout.rdg_mcq.getCheckedRadioButtonId();

        question_5Layout.mcq_option = ButterKnife.findById( question_5, radioButtonIdQuestion_5 );

        String resultQuestion_5 = question_5Layout.mcq_option.getText().toString();

        return multipleChoiceQuestion_1.checkAnswer( resultQuestion_5 );
    }

    private boolean checkQuestion_6() {
        int radioButtonIdQuestion_6 = question_6Layout.rdg_mcq.getCheckedRadioButtonId();
        question_6Layout.mcq_option = ButterKnife.findById( question_6, radioButtonIdQuestion_6 );
        String resultQuestion_6 = question_6Layout.mcq_option.getText().toString();
        return multipleChoiceQuestion_2.checkAnswer( resultQuestion_6 );
    }

    private void fillQuestions() {
        fillQuestion_1();
        fillQuestion_2();
        fillQuestion_3();
        fillQuestion_4();
        fillQuestion_5();
        fillQuestion_6();
    }

    private void fillQuestion_1() {
        String[] data = getSomeQuestion( R.array.right_wrong_questions );

        rightWrongQuestion_1.setData( data );

        question_1Layout.txv_rwq.setText( rightWrongQuestion_1.getQuestion() );
    }

    private void fillQuestion_2() {
        String[] data = getSomeQuestion( R.array.right_wrong_questions );

        rightWrongQuestion_2.setData( data );

        question_2Layout.txv_rwq.setText( rightWrongQuestion_2.getQuestion() );
    }

    private void fillQuestion_3() {
        String[] data = getSomeQuestion( R.array.open_questions );

        openQuestion.setData( data );

        question_3Layout.txv_oq.setText( openQuestion.getQuestion() );
    }

    private void fillQuestion_4() {
        String[] data = getSomeQuestion( R.array.multiple_answer_questions );

        multipleAnswersQuestion.setData( data );
        multipleAnswersQuestion.setOptions();

        question_4Layout.txv_maq.setText( multipleAnswersQuestion.getQuestion() );

        int size = multipleAnswersQuestion.getOptions().size();

        for( int i = 0; i < size; ++i ) {
            String text = multipleAnswersQuestion.getOptions().get( i );
            question_4Layout.options.get( i ).setText( text );
        }
    }

    private void fillQuestion_5() {
        String[] data = getSomeQuestion( R.array.multiple_choice_questions );

        multipleChoiceQuestion_1.setData( data );
        multipleChoiceQuestion_1.setOptions();

        question_5Layout.txv_mcq.setText( multipleChoiceQuestion_1.getQuestion() );

        int size = multipleChoiceQuestion_1.getOptions().size();

        for( int i = 0; i < size; ++i ) {
            String text = multipleChoiceQuestion_1.getOptions().get( i );
            question_5Layout.options.get( i ).setText( text );
        }
    }

    private void fillQuestion_6() {
        String[] data = getSomeQuestion( R.array.multiple_choice_questions );

        multipleChoiceQuestion_2.setData( data );
        multipleChoiceQuestion_2.setOptions();

        question_6Layout.txv_mcq.setText( multipleChoiceQuestion_2.getQuestion() );

        int size = multipleChoiceQuestion_2.getOptions().size();

        for( int i = 0; i < size; ++i ) {
            String text = multipleChoiceQuestion_2.getOptions().get( i );
            question_6Layout.options.get( i ).setText( text );
        }
    }

    private String[] getSomeQuestion( int resourceId ) {
        TypedArray resultArray = getResources()
                .obtainTypedArray( resourceId );

        int size = resultArray.length();

        String[][] questions = new String [ size ][];

        for( int i = 0; i < size; ++i ) {
            int id = resultArray.getResourceId( i, 0 );

            if( id > 0 ) {
                questions[ i ] = getResources().getStringArray( id );
            }
        }

        resultArray.recycle();

        Random random = new Random();

        return questions[ random.nextInt( size ) ];
    }

    private void bindComponentsIncludedLayouts() {
        ButterKnife.bind( question_1Layout, question_1 );
        ButterKnife.bind( question_2Layout, question_2 );
        ButterKnife.bind( question_3Layout, question_3 );
        ButterKnife.bind( question_4Layout, question_4 );
        ButterKnife.bind( question_5Layout, question_5 );
        ButterKnife.bind( question_6Layout, question_6 );
    }
}
