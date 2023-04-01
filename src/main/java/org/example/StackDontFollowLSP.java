package org.example;

import java.util.ArrayList;

public class StackDontFollowLSP<T> extends ArrayList<T> {

    /*
    *
    *  doesn't follow LSP principle because I am forced to override all  ArrayList methodes that I don't need so that my app won't break up
    *
    * */

    private int pointer =0;

    public void push(T item){
        add(pointer++,item);
    }
    public T pop(){
        if (pointer==0) return null;
        return remove(--pointer);
    }
}
