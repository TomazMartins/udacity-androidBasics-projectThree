package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


import java.util.Arrays;
import java.util.List;

import static android.R.attr.data;

public class MultipleAnswersQuestion extends BaseMultipleResponseQuestion {
    private List<String> mOptions;

    public MultipleAnswersQuestion( int qtdAnswers ) {
        super( qtdAnswers );
    }

    @Override
    public boolean checkAnswer( List<String> chosenOptions ) {
        this.setAnswers();

        boolean result = false;

        for( String answer : this.getCorrectAnswers() ) {
            if( chosenOptions.contains( answer ) ) {
                result = true;
            } else {
                result = false;
                break;
            }
        }

        return result;
    }

    public List<String> getOptions() {
        return this.mOptions;
    }

    public void setOptions() {
        final int FIRST_OPTION = 1;
        final int LAST_OPTION = this.getData().length;

        String[] arrayOptions = Arrays.copyOfRange( this.getData(), FIRST_OPTION, LAST_OPTION );
        this.mOptions = Arrays.asList( arrayOptions );
    }

    @Override
    protected void setAnswers() {
        String[] arrayAnswers = Arrays.copyOfRange( this.getData(), 1, this.getQtdAnswers() );

        setCorrectAnswers( Arrays.asList( arrayAnswers ) );
    }
}
