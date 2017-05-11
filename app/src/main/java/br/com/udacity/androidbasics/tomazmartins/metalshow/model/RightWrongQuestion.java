package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


import android.util.Log;

public class RightWrongQuestion extends BaseOneResponseQuestion {
    public RightWrongQuestion() {
        super();
    }

    @Override
    public boolean checkAnswer( String chosenOption ) {
        this.setCorrectAnswer();

        boolean result = false;

        if( chosenOption != null ) {
            if( getCorrectAnswer().equals( chosenOption ) ) {
                result = true;
            }
        }

        return result;
    }
}
