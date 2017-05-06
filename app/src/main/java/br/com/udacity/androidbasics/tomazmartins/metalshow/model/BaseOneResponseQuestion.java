package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


public abstract class BaseOneResponseQuestion extends BaseQuestion {
    private String correctAnswer;

    BaseOneResponseQuestion( String[] data ) {
        super( data );

        setCorrectAnswer( data );
    }

    public abstract boolean checkAnswer( String chosenOption );

    protected String getCorrectAnswer() {
        return this.correctAnswer;
    }

    private void setCorrectAnswer( String[] data ) {
        final int ANSWER = 1;

        this.correctAnswer = data[ ANSWER ];
    }
}
