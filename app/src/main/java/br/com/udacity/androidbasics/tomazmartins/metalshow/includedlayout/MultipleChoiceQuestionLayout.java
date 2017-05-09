package br.com.udacity.androidbasics.tomazmartins.metalshow.includedlayout;


import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.List;

import br.com.udacity.androidbasics.tomazmartins.metalshow.R;
import butterknife.BindView;
import butterknife.BindViews;

public final class MultipleChoiceQuestionLayout implements IncludedLayout {
    @BindView( R.id.txv_mcq ) public TextView txv_mcq;
    @BindView( R.id.rdg_mcq ) public RadioGroup rdg_mcq;
    @BindView( R.id.mcq_option_1 ) public RadioButton mcq_option;

    @BindViews( {R.id.mcq_option_1, R.id.mcq_option_2, R.id.mcq_option_3, R.id.mcq_option_4} )
    public List<RadioButton> options;


}
