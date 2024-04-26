package com.oocode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ExampleTest {
    @Test
    public void retrieveEmptyList() {

        assertThat(new RecentlyUsedList().retrieve(), equalTo(""));
    }
    @Test
    public void retrieveOneNumberStored() {
        String number = "12345";
        RecentlyUsedList myList = new RecentlyUsedList();
        myList.add(number);

        assertThat(myList.retrieve(), equalTo(number));
    }

    @Test
    public void retrieveEmptySecondNumberStored() {
        String number = "12345";
        RecentlyUsedList myList = new RecentlyUsedList();
        myList.add(number);

        assertThat(myList.retrieve(1), equalTo(""));
    }

    @Test
    public void addItemsInOrder() {
        String number = "12345";
        String number1 = "6789";
        String number2 = "101112";
        RecentlyUsedList myList = new RecentlyUsedList();
        myList.add(number);
        myList.add(number1);
        myList.add(number2);

        assertThat(myList.retrieve(0), equalTo("101112"));
        assertThat(myList.retrieve(1), equalTo("6789"));
        assertThat(myList.retrieve(2), equalTo("12345"));
    }

    @Test
    public void addItemsInOrderAndReplaceNonUnique() {
        String number = "12345";
        String number1 = "6789";
        String number2 = "12345";
        RecentlyUsedList myList = new RecentlyUsedList();
        myList.add(number);
        myList.add(number1);
        myList.add(number2);

        assertThat(myList.retrieve(0), equalTo("12345"));
        assertThat(myList.retrieve(1), equalTo("6789"));
        assertThat(myList.retrieve(2), equalTo(""));
    }

}
