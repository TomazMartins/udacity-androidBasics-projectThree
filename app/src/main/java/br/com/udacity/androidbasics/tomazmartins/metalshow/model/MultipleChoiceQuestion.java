package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


import java.util.Arrays;
import java.util.List;

public class MultipleChoiceQuestion extends BaseOneResponseQuestion {
    private List<String> mOptions;

    public MultipleChoiceQuestion( String[] data ) {
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
        return this.mOptions;
    }

    private void setOptions( String[] data ) {
        final int FIRST_OPTION = 1;
        final int LAST_OPTION = data.length;

        String[] arrayOptions = Arrays.copyOfRange( data, FIRST_OPTION, LAST_OPTION );

        this.mOptions = Arrays.asList( arrayOptions );
    }
}
