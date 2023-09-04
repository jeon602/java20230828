package ch09nested.book.sec06.exam01;

import ch08.book.sec03.C;

public class Button {
    public static interface ClickListener{
    void onclick();}
    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }
    void click(){
        this.clickListener.onclick();
    }
}
