package com.proto.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.text.ParseException;

import org.junit.Test;

public class BerlinClockRepresentationTest
{

    @Test
    public void testBerlinClockRepresentation()
    {
        IMain clock = new Main();
        try
        {
            /**
             * test case 1: 00:00:00
             */
            System.out.println("\nBerlin Clock representaion of the following times: ");

            System.out.println("00:00:00");
            String displayTime = clock.createRepresentationOfBerlinClock("00:00:00");
            System.out.println(displayTime);
            /**
             * expected output string format
             * Y
             * OOOO
             * OOOO
             * OOOOOOOOOOO
             * OOOO
             */
            StringBuffer buffer = new StringBuffer();
            buffer.append("Y\n");
            buffer.append("OOOO\n");
            buffer.append("OOOO\n");
            buffer.append("OOOOOOOOOOO\n");
            buffer.append("OOOO\n");

            assertEquals(buffer.toString(), displayTime);



            /**
             * test case 2: 13:17:01
             */
            System.out.println("13:17:01");
            displayTime = clock.createRepresentationOfBerlinClock("13:17:01");
            System.out.println(displayTime);
            /**
             * expected output string format
             * O
             * RROO
             * RRRO
             * YYROOOOOOOO
             * YYOO
             */
            buffer = new StringBuffer();
            buffer.append("O\n");
            buffer.append("RROO\n");
            buffer.append("RRRO\n");
            buffer.append("YYROOOOOOOO\n");
            buffer.append("YYOO\n");

            assertEquals(buffer.toString(), displayTime);

            /**
             * test case 3: 23:59:59
             */
            System.out.println("23:59:59");
            displayTime = clock.createRepresentationOfBerlinClock("23:59:59");
            System.out.println(displayTime);
            /**
             * expected output string format
             * O
             * RRRR
             * RRRO
             * YYRYYRYYRYY
             * YYYY
             */
            buffer = new StringBuffer();
            buffer.append("O\n");
            buffer.append("RRRR\n");
            buffer.append("RRRO\n");
            buffer.append("YYRYYRYYRYY\n");
            buffer.append("YYYY\n");

            assertEquals(buffer.toString(), displayTime);

            /**
             * test case 4: 24:00:00
             */
            System.out.println("24:00:00");
            displayTime = clock.createRepresentationOfBerlinClock("24:00:00");
            System.out.println(displayTime);
            /**
             * expected output string format
             * Y
             * RRRR
             * RRRR
             * OOOOOOOOOOO
             * OOOO
             */
            buffer = new StringBuffer();
            buffer.append("Y\n");
            buffer.append("RRRR\n");
            buffer.append("RRRR\n");
            buffer.append("OOOOOOOOOOO\n");
            buffer.append("OOOO\n");

            assertEquals(buffer.toString(), displayTime);

        }
        catch (ParseException e)
        {
            fail("Invalid time!! " +  e.getMessage());
        }

        catch (NumberFormatException e)
        {
            fail("Invalid time!! " +  e.getMessage());
        }

    }

}
