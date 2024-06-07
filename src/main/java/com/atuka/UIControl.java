package com.atuka;

public class UIControl {
    boolean isEnable=true;

    public void enabled(){
        isEnable=true;
    }
    public void disabled(){
        isEnable=false;
    }
    public boolean isEnable(){
        return isEnable;
    }
}
