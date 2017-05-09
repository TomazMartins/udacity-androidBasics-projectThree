package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


import android.util.Log;

import java.util.Arrays;
import java.util.List;

import static android.R.attr.data;

public class OpenQuestion extends BaseMultipleResponseQuestion {
    public OpenQuestion( int qtdAnswers ) {
        super( qtdAnswers );
    }

    @Override
    public boolean checkAnswer( List<String> chosenOptions ) {
        this.setAnswers();

        boolean result = false;

        for( String keyword : this.getCorrectAnswers() ) {
            Log.i( "LOG", String.valueOf( getCorrectAnswers() ) );
            if( chosenOptions.contains( keyword ) ) {
                Log.i( "LOG", "IF" );
                result = true;
            } else {
                Log.i( "LOG", "ELSE" );
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
        final int LAST_KEYWORD = this.getData().length;

        String[] arrayKeywords = Arrays.copyOfRange( this.getData(), FIRST_KEYWORD, LAST_KEYWORD );

        this.setCorrectAnswers( Arrays.asList( arrayKeywords ) );
    }
}
