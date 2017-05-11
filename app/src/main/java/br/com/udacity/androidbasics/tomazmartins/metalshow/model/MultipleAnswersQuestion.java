package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MultipleAnswersQuestion extends BaseMultipleResponseQuestion {
    private List<String> mOptions;

    public MultipleAnswersQuestion() {
        super();
    }

    @Override
    public boolean checkAnswer( List<String> chosenOptions ) {
        this.setAnswers();

        boolean result = false;

        if( chosenOptions.size() == this.getCorrectAnswers().size() ) {
            for( String answer : this.getCorrectAnswers() ) {
                if( chosenOptions.contains( answer ) ) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }

        return result;
    }

    public List<String> getOptions() {
        return this.mOptions;
    }

    public void setOptions() {
        final int FIRST_OPTION = 2;
        final int LAST_OPTION = this.getData().length;

        String[] arrayOptions = Arrays.copyOfRange( this.getData(), FIRST_OPTION, LAST_OPTION );
        this.mOptions = Arrays.asList( arrayOptions );
    }

    public List<String> shuffleOptions() {
        List<String> shuffledOptions = new ArrayList<>();
        shuffledOptions.addAll( this.getOptions() );
        Collections.shuffle( shuffledOptions );

        return shuffledOptions;
    }

    @Override
    protected void setAnswers() {
        final int QTD_ANSWERS = 1;

        int qtdAnswers = Integer.parseInt( this.getData()[ QTD_ANSWERS ] );
        this.setQtdAnswers( qtdAnswers );

        String[] arrayAnswers = Arrays.copyOfRange(
                this.getData(),
                FIRST_RESPONSE,
                this.getPositionOfLastAnswer()
        );

        this.setCorrectAnswers( Arrays.asList( arrayAnswers ) );
    }
}
