package com.oocode;

import java.util.ArrayList;

public class RecentlyUsedList {

    private ArrayList<String> list = new ArrayList<String>();

    public String retrieve(){
        int defaultRetrieved = 0;
        return this.retrieve(defaultRetrieved);
    }

    public void add(String number){
        if(list.contains(number)){
            list.remove(number);
        }
        this.list.add(number);
    }

    public String retrieve(int toRetrieve){
        if (toRetrieve + 1> list.size()){
            return "";
        }
        return this.list.get(list.size()-toRetrieve-1);
    }
}
