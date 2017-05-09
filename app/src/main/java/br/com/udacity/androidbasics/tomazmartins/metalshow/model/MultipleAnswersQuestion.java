package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


import java.util.Arrays;
import java.util.List;

public class MultipleAnswersQuestion extends BaseMultipleResponseQuestion {
    private List<String> mOptions;

    public MultipleAnswersQuestion( String[] data, int qtdAnswers ) {
        super( data, qtdAnswers );

        setOptions( data );
    }

    @Override
    public boolean checkAnswer( List<String> chosenOptions ) {
        boolean result = false;

        for( String answer : this.getCorrectAnswers() ) {
            if( chosenOptions.contains( answer ) ) {
                result = true;
            } else {
                result = false;
                break;
            }
        }

        return false;
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

    @Override
    protected void setAnswers( String[] data, int qtdAnswers ) {
        String[] arrayAnswers = Arrays.copyOfRange( data, 1, qtdAnswers );

        setCorrectAnswers( Arrays.asList( arrayAnswers ) );
    }
}
