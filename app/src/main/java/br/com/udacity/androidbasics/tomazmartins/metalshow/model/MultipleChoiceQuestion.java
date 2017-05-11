package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static android.R.attr.data;

public class MultipleChoiceQuestion extends BaseOneResponseQuestion {
    private List<String> mOptions;

    public MultipleChoiceQuestion() {
        super();
    }

    @Override
    public boolean checkAnswer( String chosenOption ) {
        this.setCorrectAnswer();

        boolean result = false;

        if( chosenOption != null ) {
            if( getCorrectAnswer().equals( chosenOption ) ) {
                result = true;
            }
        }

        return result;
    }

    public List<String> getOptions() {
        return this.mOptions;
    }

    public void setOptions() {
        final int FIRST_OPTION = 1;
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
}
