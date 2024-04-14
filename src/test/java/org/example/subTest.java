package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class subTest {

    @Test
    void FirstDevideBy10() {
        sub s = new sub();
        double result = s.DevideBy10(5,7);
        Assertions.assertEquals(2.0,result);
    }
    @Test
    void SecondDevideBy10() {
        sub s = new sub();
        double result = s.DevideBy10(5,11);
        Assertions.assertEquals(2.0,result);
    }
    @Test
    void FirstDevideBy2() {
        sub s = new sub();
        double result = s.DevideBy2(5,7);
        Assertions.assertEquals(6.0,result);
    }
    @Test
    void SecondDevideBy2() {
        sub s = new sub();
        double result = s.DevideBy2(13,7);
        Assertions.assertEquals(7.0,result);
    }
}