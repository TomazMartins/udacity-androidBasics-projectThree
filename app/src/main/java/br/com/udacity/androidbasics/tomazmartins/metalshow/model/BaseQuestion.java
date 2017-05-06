package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


public abstract class BaseQuestion {
    private String mQuestion;

    BaseQuestion( String[] data ) {
        setQuestion( data );
    }

    public String getQuestion() {
        return this.mQuestion;
    }

    private void setQuestion( String[] data ) {
        final int QUESTION = 0;

        this.mQuestion = data[ QUESTION ];
    }
}

