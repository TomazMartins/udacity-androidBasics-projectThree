package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


import java.util.Arrays;
import java.util.List;

import static android.R.attr.data;

public class OpenQuestion extends BaseMultipleResponseQuestion {
    public OpenQuestion( int qtdAnswers ) {
        super( qtdAnswers );
    }

    @Override
    public boolean checkAnswer( List<String> chosenOptions ) {
        final int FIRST = 0;

        boolean result = false;

        for( String keyword : this.getCorrectAnswers() ) {
            if( chosenOptions.get( FIRST ).contains( keyword ) ) {
                result = true;
            } else {
                result = false;
                break;
            }
        }

        return result;
    }

    @Override
    protected void setAnswers() {
        setKeywords();
    }

    private void setKeywords() {
        final int FIRST_KEYWORD = 1;
        final int LAST_KEYWORD = this.getData().length - 1;

        String[] arrayKeywords = Arrays.copyOfRange( this.getData(), FIRST_KEYWORD, LAST_KEYWORD );

        this.setCorrectAnswers( Arrays.asList( arrayKeywords ) );
    }
}
