package com.atuka;

public class TextBox {
    public String text="";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public void clear(){
        text="";
    }
}
