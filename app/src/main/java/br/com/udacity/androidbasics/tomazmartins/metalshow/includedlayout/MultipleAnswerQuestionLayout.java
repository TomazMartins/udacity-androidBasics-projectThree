package br.com.udacity.androidbasics.tomazmartins.metalshow.includedlayout;


import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

import br.com.udacity.androidbasics.tomazmartins.metalshow.R;
import butterknife.BindView;
import butterknife.BindViews;

public final class MultipleAnswerQuestionLayout {
    @BindView( R.id.txv_maq ) public TextView txv_maq;

    @BindViews( {R.id.maq_option_1, R.id.maq_option_2, R.id.maq_option_3, R.id.maq_option_4,
                R.id.maq_option_5, R.id.maq_option_6, R.id.maq_option_7, R.id.maq_option_8} )
    public List<CheckBox> options;
}
