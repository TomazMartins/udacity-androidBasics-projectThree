package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


import java.util.Arrays;
import java.util.List;

public class OpenQuestion extends BaseMultipleResponseQuestion {
    OpenQuestion( String[] data, int qtdAnswers ) {
        super( data, qtdAnswers );
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
    protected void setAnswers( String[] data, int qtdAnswers ) {
        setKeywords( data );
    }

    private void setKeywords( String[] data ) {
        final int FIRST_KEYWORD = 1;
        final int LAST_KEYWORD = data.length - 1;

        String[] arrayKeywords = Arrays.copyOfRange( data, FIRST_KEYWORD, LAST_KEYWORD );

        this.setCorrectAnswers( Arrays.asList( arrayKeywords ) );
    }
}
