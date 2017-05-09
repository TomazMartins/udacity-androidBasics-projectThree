package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


import static android.R.attr.data;

public class RightWrongQuestion extends BaseOneResponseQuestion {
    public RightWrongQuestion() {
        super();
    }

    @Override
    public boolean checkAnswer( String chosenOption ) {
        this.setCorrectAnswer();

        boolean result = false;

        if( getCorrectAnswer().equals( chosenOption ) ) {
            result = true;
        }

        return result;
    }
}
