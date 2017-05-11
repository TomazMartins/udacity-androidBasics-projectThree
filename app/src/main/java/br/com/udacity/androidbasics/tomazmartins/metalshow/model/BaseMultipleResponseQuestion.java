package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


import java.util.List;

public abstract class BaseMultipleResponseQuestion extends BaseQuestion {
    protected final int FIRST_RESPONSE = 2;

    private List<String> mCorrectAnswers;
    private int mQtdAnswers;

    BaseMultipleResponseQuestion() {
        super();
    }

    public abstract boolean checkAnswer( List<String> chosenOptions );

    protected abstract void setAnswers();

    protected void setQtdAnswers( int qtd ) {
        this.mQtdAnswers = qtd;
    }

    protected int getPositionOfLastAnswer() {
        return (this.mQtdAnswers + 2);
    }

    protected List<String> getCorrectAnswers() {
        return this.mCorrectAnswers;
    }

    protected void setCorrectAnswers( List<String> answers ) {
        this.mCorrectAnswers = answers;
    }
}
