package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


import java.util.List;

public abstract class BaseMultipleResponseQuestion extends BaseQuestion {
    private List<String> correctAnswers;

    BaseMultipleResponseQuestion( String[] data ) {
        super( data );

        setCorrectAnswers( data );
    }

    public abstract void checkAnswer( String chosenOption );

    protected abstract void setCorrectAnswers( String[] data );
}
