package br.com.udacity.androidbasics.tomazmartins.metalshow.includedlayout;


import android.widget.CheckBox;
import android.widget.TextView;

import br.com.udacity.androidbasics.tomazmartins.metalshow.R;
import butterknife.BindView;

public final class MultipleAnswerQuestionLayout {
    @BindView( R.id.txv_maq ) TextView txv_maq;
    @BindView( R.id.maq_option_1 ) public CheckBox maq_option_1;
    @BindView( R.id.maq_option_2 ) public CheckBox maq_option_2;
    @BindView( R.id.maq_option_3 ) public CheckBox maq_option_3;
    @BindView( R.id.maq_option_4 ) public CheckBox maq_option_4;
    @BindView( R.id.maq_option_5 ) public CheckBox maq_option_5;
    @BindView( R.id.maq_option_6 ) public CheckBox maq_option_6;
    @BindView( R.id.maq_option_7 ) public CheckBox maq_option_7;
    @BindView( R.id.maq_option_8 ) public CheckBox maq_option_8;
}
