package com.oracle;

public class Question {

    private int id;
    private String QuestionClassification;
    private String QuestionTitle;
    private int QuestionAnswer;
    private int QuestionAnswerExpected;
    private String QuestionAnswerText;

    // getters and setters

    // id
    public int getId() {
        return id;
    }
    public void setId(int i) {
        this.id = i;
    }

    // QuestionClassification
    public String getQuestionClassification() {
        return QuestionClassification;
    }
    public void setQuestionClassification(String QuestionClassification) {
        this.QuestionClassification = QuestionClassification;
    }

    // QuestionTitle
    public String getQuestionTitle() {
        return QuestionTitle;
    }
    public void setQuestionTitle(String QuestionTitle) {
        this.QuestionTitle = QuestionTitle;
    }

    // QuestionAnswer
    public int getQuestionAnswer() {
        return QuestionAnswer;
    }
    public void setQuestionAnswer(int i) {
        this.QuestionAnswer = i;
    }

    // QuestionAnswerExpected
    public int getQuestionAnswerExpected() {
        return QuestionAnswerExpected;
    }
    public void setQuestionAnswerExpected(int i) {
        this.QuestionAnswerExpected = i;
    }

    // QuestionAnswerText
    public String getQuestionAnswerText() {
        return QuestionAnswerText;
    }
    public void setQuestionAnswerText(String QuestionAnswerText) {
        this.QuestionAnswerText = QuestionAnswerText;
    }

    @Override
    public String toString() {
        return "Question [id=" + id + ", QuestionClassification=" + QuestionClassification + ", QuestionTitle=" + QuestionTitle + ", QuestionAnswer=" + QuestionAnswer + ", QuestionAnswerExpected=" +
                QuestionAnswerExpected + ", QuestionAnswerText=" + QuestionAnswerText + "]";
    }
}
