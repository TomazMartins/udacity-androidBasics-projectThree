package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


import java.util.List;

public abstract class BaseMultipleResponseQuestion extends BaseQuestion {
    private List<String> mCorrectAnswers;

    BaseMultipleResponseQuestion( String[] data, int qtdAnswers ) {
        super( data );

        setAnswers( data, qtdAnswers );
    }

    public abstract boolean checkAnswer( List<String> chosenOptions );

    protected abstract void setAnswers( String[] data, int qtdAnswers );

    protected List<String> getCorrectAnswers() {
        return this.mCorrectAnswers;
    }

    protected void setCorrectAnswers( List<String> answers ) {
        this.mCorrectAnswers = answers;
    }
}
