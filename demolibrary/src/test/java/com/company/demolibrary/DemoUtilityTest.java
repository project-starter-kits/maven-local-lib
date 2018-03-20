package com.company.demolibrary;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoUtilityTest {

    private DemoUtility target;

    @BeforeEach
    public void setUp() {
        target = new DemoUtility();
    }
    @Test
    public void testEcho() {
        String expected = "message";
        String actual = target.echo(expected);

        assertEquals(expected, actual);
    }
}
