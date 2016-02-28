package com.example.pritika.interactivestory.ui.model;

/**
 * Created by Pritika on 16-01-2016.
 */
public class Choice {
    // string that decide the choice
    private String mText;
    //indexes of the pages in  the array to link one to another
    private int mNextPage ;
    public Choice(String Text , int NextPage){
        mText = Text;
        mNextPage = NextPage;
    }

    public String getText() {
        return mText;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }

    public void setText(String text) {
        mText = text;
    }
}


