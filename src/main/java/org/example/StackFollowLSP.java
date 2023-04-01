package org.example;

import java.util.ArrayList;

public class StackFollowLSP<T> {
    // making the relationship betwee, Stack and Array list as contain
    private ArrayList<T>  arrayList = new ArrayList<>();
    private int pointer ;
    public void push(T item){
        arrayList.add(pointer++ , item);
    } // delegation principle
    public T pop(){
        if (pointer==0) return null;
        return arrayList.remove(--pointer);
    }
}
