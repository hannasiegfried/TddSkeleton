package com.oocode;

import java.util.ArrayList;

public class RecentlyUsedList {
    private final ArrayList<String> list = new ArrayList<String>();
    private int maxSize = 100;

    public RecentlyUsedList (int maxSize){
        this.maxSize = maxSize;
    }

    public RecentlyUsedList (){
    }

    public String retrieve(){
        int defaultRetrieved = 0;
        return this.retrieve(defaultRetrieved);
    }

    public void trimSize(){
        if (list.size()>maxSize) {
            list.removeFirst();
        }
    }

    public void add(int numberAsInt){
        String number = Integer.toString(numberAsInt);
        add(number);
    }

    public void add(String number){
        list.remove(number);
        this.list.add(number);
        this.trimSize();
    }

    public String retrieve(int toRetrieve){
        if (toRetrieve + 1> list.size()){
            return "";
        }
        return this.list.get(list.size()-toRetrieve-1);
    }
}
