package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


import java.util.Arrays;
import java.util.List;

public class OpenQuestion extends BaseMultipleResponseQuestion {
    public OpenQuestion() {
        super();
    }

    @Override
    public boolean checkAnswer( List<String> chosenOptions ) {
        this.setAnswers();

        boolean result = false;

        for( String keyword : this.getCorrectAnswers() ) {
            if( chosenOptions.contains( keyword ) ) {
                result = true;
            } else {
                result = false;
                break;
            }
        }

        return result;
    }

    @Override
    protected void setAnswers() {
        setKeywords();
    }

    private void setKeywords() {
        final int QTD_ANSWERS = 1;

        int qtdAnswers = Integer.parseInt( this.getData()[ QTD_ANSWERS ] );
        this.setQtdAnswers( qtdAnswers );

        String[] arrayKeywords = Arrays.copyOfRange(
                this.getData(),
                FIRST_RESPONSE,
                this.getPositionOfLastAnswer()
        );

        this.setCorrectAnswers( Arrays.asList( arrayKeywords ) );
    }
}
