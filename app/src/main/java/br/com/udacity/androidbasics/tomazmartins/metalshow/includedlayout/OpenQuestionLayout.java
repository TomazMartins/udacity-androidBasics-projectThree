package br.com.udacity.androidbasics.tomazmartins.metalshow.includedlayout;


import android.widget.EditText;
import android.widget.TextView;

import br.com.udacity.androidbasics.tomazmartins.metalshow.R;
import butterknife.BindView;

public final class OpenQuestionLayout {
    @BindView( R.id.txv_oq ) public TextView txv_oq;
    @BindView( R.id.edt_oq ) public EditText edt_oq;
}
