package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


public abstract class BaseQuestion {
    private String question;

    BaseQuestion( String[] data ) {
        setQuestion( data );
    }

    public String getQuestion() {
        return this.question;
    }

    private void setQuestion( String[] data ) {
        final int QUESTION = 0;

        this.question = data[ QUESTION ];
    }
}

