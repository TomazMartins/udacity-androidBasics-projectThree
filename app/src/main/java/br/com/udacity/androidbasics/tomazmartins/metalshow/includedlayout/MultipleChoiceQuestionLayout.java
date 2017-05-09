package br.com.udacity.androidbasics.tomazmartins.metalshow.includedlayout;


import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import br.com.udacity.androidbasics.tomazmartins.metalshow.R;
import butterknife.BindView;

public final class MultipleChoiceQuestionLayout {
    @BindView( R.id.txv_mcq ) public TextView txv_mcq;
    @BindView( R.id.rdg_mcq ) public RadioGroup rdg_mcq;
    @BindView( R.id.mcq_option_1 ) public RadioButton mcq_option_1;
    @BindView( R.id.mcq_option_2 ) public RadioButton mcq_option_2;
    @BindView( R.id.mcq_option_3 ) public RadioButton mcq_option_3;
    @BindView( R.id.mcq_option_4 ) public RadioButton mcq_option_4;


}
