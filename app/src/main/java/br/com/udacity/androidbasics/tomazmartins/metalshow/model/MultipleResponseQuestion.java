package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


import java.util.List;

public abstract class MultipleResponseQuestion extends Question {
    private List<String> options;

    MultipleResponseQuestion( String quiz, List<String> choices ) {
        super( quiz );

        this.options = choices;
        setCorrectAnswer();
    }

    protected abstract void setCorrectAnswer();
}
