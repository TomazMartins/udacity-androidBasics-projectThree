package br.com.udacity.androidbasics.tomazmartins.metalshow.includedlayout;


import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import br.com.udacity.androidbasics.tomazmartins.metalshow.R;
import butterknife.BindView;

public final class RightWrongLayout implements IncludedLayout {
    @BindView( R.id.txv_rwq ) public TextView txv_rwq;
    @BindView( R.id.rdg_rwq ) public RadioGroup rdg_rwq;
    @BindView( R.id.rwq_option_1 ) public RadioButton rwq_option_1;
    @BindView( R.id.rwq_option_2 ) public RadioButton rwq_option_2;
}
