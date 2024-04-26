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

}
