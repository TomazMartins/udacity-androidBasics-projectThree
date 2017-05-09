package br.com.udacity.androidbasics.tomazmartins.metalshow.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.TextView;

import br.com.udacity.androidbasics.tomazmartins.metalshow.R;
import br.com.udacity.androidbasics.tomazmartins.metalshow.includedlayout.MultipleAnswerQuestionLayout;
import br.com.udacity.androidbasics.tomazmartins.metalshow.includedlayout.MultipleChoiceQuestionLayout;
import br.com.udacity.androidbasics.tomazmartins.metalshow.includedlayout.OpenQuestionLayout;
import br.com.udacity.androidbasics.tomazmartins.metalshow.includedlayout.RightWrongLayout;
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

    RightWrongLayout question_1Layout = new RightWrongLayout();
    RightWrongLayout question_2Layout = new RightWrongLayout();
    OpenQuestionLayout question_3Layout = new OpenQuestionLayout();
    MultipleAnswerQuestionLayout question_4Layout = new MultipleAnswerQuestionLayout();
    MultipleChoiceQuestionLayout question_5Layout = new MultipleChoiceQuestionLayout();
    MultipleChoiceQuestionLayout question_6Layout = new MultipleChoiceQuestionLayout();

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        ButterKnife.bind( this );
        bindComponentsIncludedLayouts();
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
