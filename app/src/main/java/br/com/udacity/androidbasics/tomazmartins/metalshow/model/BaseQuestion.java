package br.com.udacity.androidbasics.tomazmartins.metalshow.model;


public abstract class BaseQuestion {
    private String mQuestion;
    private String[] mData;

    BaseQuestion() {
    }

    public String getQuestion() {
        return this.mQuestion;
    }

    public void setData( String[] data ) {
        this.mData = data;

        setQuestion();
    }

    protected String[] getData() {
        return mData;
    }

    private void setQuestion() {
        final int QUESTION = 0;

        this.mQuestion = this.getData()[ QUESTION ];
    }
}

