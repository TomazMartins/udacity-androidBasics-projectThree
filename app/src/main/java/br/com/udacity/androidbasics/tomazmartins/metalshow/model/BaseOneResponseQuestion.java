package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


public abstract class BaseOneResponseQuestion extends BaseQuestion {
    private String correctAnswer;

    BaseOneResponseQuestion( String[] data ) {
        super( data );

        setCorrectAnswer( data );
    }

    public abstract void checkAnswer( String chosenOption );

    protected void setCorrectAnswer( String[] data ) {
        final int ANSWER = 1;

        this.correctAnswer = data[ ANSWER ];
    }
}
