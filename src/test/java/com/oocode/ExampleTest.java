package com.oocode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ExampleTest {
    @Test
    public void canAnswerTheUniversalQuestion() {
        assertThat(new Example().answer(), equalTo(42));
    }
}
