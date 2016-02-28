package com.example.pritika.interactivestory.ui.model;

/**
 * Created by Pritika on 16-01-2016.
 */
public class Page {
    private int mImageId;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean mIsFinal = false;

    public  Page(int ImageId ,  String Text ,  Choice Choice1,Choice Choice2){
        mImageId = ImageId;
        mText = Text;
        mChoice1 = Choice1;
        mChoice2 = Choice2;
    }
public Page(int ImageId , String Text){
mImageId = ImageId;
    mText = Text;
    mChoice1 = null;
    mChoice2 = null;
    mIsFinal = true;
}
    public Choice getChoice2() {
        return mChoice2;
    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setIsFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }

    public Choice getChoice1() {

        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public String getText() {

        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getImageId() {

        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }
}
