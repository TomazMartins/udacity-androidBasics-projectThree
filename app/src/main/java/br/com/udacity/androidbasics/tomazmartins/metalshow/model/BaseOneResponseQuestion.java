package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


public abstract class BaseOneResponseQuestion extends BaseQuestion {
    private String mCorrectAnswer;

    BaseOneResponseQuestion() {
        super();
    }

    public abstract boolean checkAnswer( String chosenOption );

    protected String getCorrectAnswer() {
        return this.mCorrectAnswer;
    }

    protected void setCorrectAnswer() {
        final int ANSWER = 1;

        this.mCorrectAnswer = this.getData()[ ANSWER ];
    }
}
