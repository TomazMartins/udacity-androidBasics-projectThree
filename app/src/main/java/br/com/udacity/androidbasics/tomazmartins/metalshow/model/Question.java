package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


public abstract class Question {
    private String question;
    protected String correctAnswer;

    Question( String quiz, String answer ) {
        this.question = quiz;
        this.correctAnswer = answer;
    }

    Question( String quiz ) {
        this.question = quiz;
    }

    public boolean checkAnswer( String chosenOption ) {
        boolean result = false;

        if( this.correctAnswer.equals( chosenOption ) ) {
            result = true;
        }

        return result;
    }

    public String getQuestion() {
        return this.question;
    }
}

