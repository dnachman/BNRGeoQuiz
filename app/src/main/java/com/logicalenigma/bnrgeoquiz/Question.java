package com.logicalenigma.bnrgeoquiz;

/**
 * Copyright 2015 Logical Enigma
 * Created by dnachman on 8/9/15.
 */
public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public Question(int textResId, boolean answerTrue) {

        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }
}
