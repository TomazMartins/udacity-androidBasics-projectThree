package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


import java.util.Arrays;
import java.util.List;

public class MultipleChoiceQuestion extends BaseOneResponseQuestion {
    private List<String> options;

    MultipleChoiceQuestion( String[] data ) {
        super( data );

        setOptions( data );
    }

    @Override
    public boolean checkAnswer( String chosenOption ) {
        boolean result = false;

        if( getCorrectAnswer().equals( chosenOption ) ) {
            result = true;
        }

        return result;
    }

    public List<String> getOptions() {
        return this.options;
    }

    private void setOptions( String[] data ) {
        final int FIRST_OPTION = 2;
        final int LAST_OPTION = data.length - 1;

        String[] arrayOptions = Arrays.copyOfRange( data, FIRST_OPTION, LAST_OPTION );

        this.options = Arrays.asList( arrayOptions );
    }
}
