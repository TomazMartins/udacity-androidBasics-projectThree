package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


public class RightWrongQuestion extends BaseOneResponseQuestion {
    RightWrongQuestion( String[] data ) {
        super( data );
    }

    @Override
    public boolean checkAnswer( String chosenOption ) {
        boolean result = false;

        if( getCorrectAnswer().equals( chosenOption ) ) {
            result = true;
        }

        return result;
    }
}
