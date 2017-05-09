package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


import java.util.List;

public abstract class BaseMultipleResponseQuestion extends BaseQuestion {
    private List<String> mCorrectAnswers;
    private int mQtdAnswers;

    BaseMultipleResponseQuestion( int qtdAnswers ) {
        super();

        this.mQtdAnswers = qtdAnswers;
    }

    public abstract boolean checkAnswer( List<String> chosenOptions );

    protected abstract void setAnswers();

    protected int getQtdAnswers() {
        return this.mQtdAnswers;
    }

    protected List<String> getCorrectAnswers() {
        return this.mCorrectAnswers;
    }

    protected void setCorrectAnswers( List<String> answers ) {
        this.mCorrectAnswers = answers;
    }
}
