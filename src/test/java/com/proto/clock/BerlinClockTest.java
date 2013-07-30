package com.proto.clock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BerlinClockTest
{
    @Test
    public void testBerlinClock()
    {
        BerlinClock berlinClock = new BerlinClock();

        System.out.println("Checking for the correctness of the clock display format with all lamps OFF: \n" + berlinClock.toString());

        /**
         * expected output string format
         * O
         * OOOO
         * OOOO
         * OOOOOOOOOOO
         * OOOO
         */
        StringBuffer buffer = new StringBuffer();
        buffer.append("O\n");
        buffer.append("OOOO\n");
        buffer.append("OOOO\n");
        buffer.append("OOOOOOOOOOO\n");
        buffer.append("OOOO\n");

        assertEquals(buffer.toString(), berlinClock.toString());

    }

}
