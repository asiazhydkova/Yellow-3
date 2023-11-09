package org.example.lab_04.homework_02;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.example.lab_04.homework_02.Main.readNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;


class MainTest {

    @Test
    public void readNumber1() {

        String input = "100";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(100, readNumber(1,100));
    }
}