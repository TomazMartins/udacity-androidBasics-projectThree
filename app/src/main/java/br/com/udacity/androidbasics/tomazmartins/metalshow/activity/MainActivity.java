package br.com.udacity.androidbasics.tomazmartins.metalshow.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

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

    private int score;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        ButterKnife.bind( this );
        bindComponentsIncludedLayouts();

        fillQuestions();
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
        String[] data = getResources().getStringArray( R.array.rwq_001 );

        RightWrongQuestion question = new RightWrongQuestion( data );

        question_1Layout.txv_rwq.setText( question.getQuestion() );
    }

    private void fillQuestion_2() {
        String[] data = getResources().getStringArray( R.array.rwq_002 );

        RightWrongQuestion question = new RightWrongQuestion( data );

        question_2Layout.txv_rwq.setText( question.getQuestion() );
    }

    private void fillQuestion_3() {
        String[] data = getResources().getStringArray( R.array.oq_001 );

        OpenQuestion question = new OpenQuestion( data, 4 );

        question_3Layout.txv_oq.setText( question.getQuestion() );
    }

    private void fillQuestion_4() {
        String[] data = getResources().getStringArray( R.array.maq_001 );

        MultipleAnswersQuestion question = new MultipleAnswersQuestion( data, 4 );

        question_4Layout.txv_maq.setText( question.getQuestion() );

        int size = question.getOptions().size();

        for( int i = 0; i < size; ++i ) {
            String text = question.getOptions().get( i );
            question_4Layout.options.get( i ).setText( text );
        }
    }

    private void fillQuestion_5() {
        String[] data = getResources().getStringArray( R.array.mcq_001 );

        MultipleChoiceQuestion question = new MultipleChoiceQuestion( data );

        question_5Layout.txv_mcq.setText( question.getQuestion() );

        int size = question.getOptions().size();

        for( int i = 0; i < size; ++i ) {
            String text = question.getOptions().get( i );
            question_5Layout.options.get( i ).setText( text );
        }
    }

    private void fillQuestion_6() {
        String[] data = getResources().getStringArray( R.array.mcq_002 );

        MultipleChoiceQuestion question = new MultipleChoiceQuestion( data );

        question_6Layout.txv_mcq.setText( question.getQuestion() );

        int size = question.getOptions().size();

        for( int i = 0; i < size; ++i ) {
            String text = question.getOptions().get( i );
            question_6Layout.options.get( i ).setText( text );
        }
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
