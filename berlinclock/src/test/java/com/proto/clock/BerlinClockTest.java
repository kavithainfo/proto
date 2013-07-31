package com.proto.clock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test the behaviour of the Berlin Clock
 * @author kavitha
 *
 */
public class BerlinClockTest
{

    private final BerlinClockImpl berlinClock = new BerlinClockImpl();

    @Test
    public void testToString_initialState()
    {

        String expectedDisplay =
                "O\n" +
                        "OOOO\n" +
                        "OOOO\n" +
                        "OOOOOOOOOOO\n" +
                        "OOOO\n";

        assertEquals(expectedDisplay, berlinClock.toString());

    }

    @Test
    public void testShowTime_00_00_00()
    {
        String displayTime = berlinClock.showTime(0, 0, 0);
        String expectedDisplay =
                "Y\n" +
                        "OOOO\n" +
                        "OOOO\n" +
                        "OOOOOOOOOOO\n" +
                        "OOOO\n";

        assertEquals(expectedDisplay, displayTime);
    }

    @Test
    public void testShowTime_13_17_01()
    {
        String displayTime = berlinClock.showTime(13, 17, 1);
        String expectedDisplay =
                "O\n" +
                        "RROO\n" +
                        "RRRO\n" +
                        "YYROOOOOOOO\n" +
                        "YYOO\n";

        assertEquals(expectedDisplay, displayTime);
    }

    @Test
    public void testShowTime_23_59_59()
    {
        String displayTime = berlinClock.showTime(23, 59, 59);
        String expectedDisplay =
                "O\n" +
                        "RRRR\n" +
                        "RRRO\n" +
                        "YYRYYRYYRYY\n" +
                        "YYYY\n";

        assertEquals(expectedDisplay, displayTime);
    }

    @Test
    public void testShowTime_24_00_00()
    {
        String displayTime = berlinClock.showTime(24, 00, 00);
        String expectedDisplay =
                "Y\n" +
                        "RRRR\n" +
                        "RRRR\n" +
                        "OOOOOOOOOOO\n" +
                        "OOOO\n";

        assertEquals(expectedDisplay, displayTime);
    }

}
