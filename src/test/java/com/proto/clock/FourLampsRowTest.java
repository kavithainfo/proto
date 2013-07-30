package com.proto.clock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.proto.clock.keyparts.Lamp;

public class FourLampsRowTest
{

    @Test
    public void testTopRowLamps()
    {
        System.out.println("\nTesting the creation and display of Top row, switching 1 lamp incrementally:");
        TopRow topRow = new TopRow();

        // switch off all lamps
        topRow.switchOnLamps(0);
        System.out.println(topRow.toString());
        Lamp[] lamps = topRow.getLamps();
        for(Lamp lampCur: lamps)
        {
            assertEquals("O", lampCur.getState().getValue());

        }

        // switch on 1 lamp
        topRow.switchOnLamps(1);
        System.out.println(topRow.toString());
        assertEquals("R", lamps[0].getColor().getValue());
        assertEquals("O", lamps[1].getState().getValue());
        assertEquals("O", lamps[2].getState().getValue());
        assertEquals("O", lamps[3].getState().getValue());

        // switch on 2 lamps
        topRow.switchOnLamps(2);
        System.out.println(topRow.toString());
        assertEquals("R", lamps[0].getColor().getValue());
        assertEquals("R", lamps[1].getColor().getValue());
        assertEquals("O", lamps[2].getState().getValue());
        assertEquals("O", lamps[3].getState().getValue());

        // switch on 3 lamps
        topRow.switchOnLamps(3);
        System.out.println(topRow.toString());
        assertEquals("R", lamps[0].getColor().getValue());
        assertEquals("R", lamps[1].getColor().getValue());
        assertEquals("R", lamps[2].getColor().getValue());
        assertEquals("O", lamps[3].getState().getValue());

        // switch on 4 lamps
        topRow.switchOnLamps(4);
        System.out.println(topRow.toString());
        assertEquals("R", lamps[0].getColor().getValue());
        assertEquals("R", lamps[1].getColor().getValue());
        assertEquals("R", lamps[2].getColor().getValue());
        assertEquals("R", lamps[3].getColor().getValue());

    }

    @Test
    public void testSecondRowLamps()
    {
        System.out.println("\nTesting the creation and display of Second row, switching 1 lamp incrementally:");
        SecondRow secondRow = new SecondRow();

        // switch off all lamps
        secondRow.switchOnLamps(0);
        System.out.println(secondRow.toString());
        Lamp[] lamps = secondRow.getLamps();
        for(Lamp lampCur: lamps)
        {
            assertEquals("O", lampCur.getState().getValue());

        }

        // switch on 1 lamp
        secondRow.switchOnLamps(1);
        System.out.println(secondRow.toString());
        assertEquals("R", lamps[0].getColor().getValue());
        assertEquals("O", lamps[1].getState().getValue());
        assertEquals("O", lamps[2].getState().getValue());
        assertEquals("O", lamps[3].getState().getValue());

        // switch on 2 lamps
        secondRow.switchOnLamps(2);
        System.out.println(secondRow.toString());
        assertEquals("R", lamps[0].getColor().getValue());
        assertEquals("R", lamps[1].getColor().getValue());
        assertEquals("O", lamps[2].getState().getValue());
        assertEquals("O", lamps[3].getState().getValue());

        // switch on 3 lamps
        secondRow.switchOnLamps(3);
        System.out.println(secondRow.toString());
        assertEquals("R", lamps[0].getColor().getValue());
        assertEquals("R", lamps[1].getColor().getValue());
        assertEquals("R", lamps[2].getColor().getValue());
        assertEquals("O", lamps[3].getState().getValue());

        // switch on 4 lamps
        secondRow.switchOnLamps(4);
        System.out.println(secondRow.toString());
        assertEquals("R", lamps[0].getColor().getValue());
        assertEquals("R", lamps[1].getColor().getValue());
        assertEquals("R", lamps[2].getColor().getValue());
        assertEquals("R", lamps[3].getColor().getValue());

    }


    @Test
    public void testLastRowLamps()
    {
        System.out.println("\nTesting the creation and display of Last row, switching 1 lamp incrementally:");
        LastRow lastRow = new LastRow();

        // switch off all lamps
        lastRow.switchOnLamps(0);
        System.out.println(lastRow.toString());
        Lamp[] lamps = lastRow.getLamps();
        for(Lamp lampCur: lamps)
        {
            assertEquals("O", lampCur.getState().getValue());

        }

        // switch on 1 lamp
        lastRow.switchOnLamps(1);
        System.out.println(lastRow.toString());
        assertEquals("Y", lamps[0].getColor().getValue());
        assertEquals("O", lamps[1].getState().getValue());
        assertEquals("O", lamps[2].getState().getValue());
        assertEquals("O", lamps[3].getState().getValue());

        // switch on 2 lamps
        lastRow.switchOnLamps(2);
        System.out.println(lastRow.toString());
        assertEquals("Y", lamps[0].getColor().getValue());
        assertEquals("Y", lamps[1].getColor().getValue());
        assertEquals("O", lamps[2].getState().getValue());
        assertEquals("O", lamps[3].getState().getValue());

        // switch on 3 lamps
        lastRow.switchOnLamps(3);
        System.out.println(lastRow.toString());
        assertEquals("Y", lamps[0].getColor().getValue());
        assertEquals("Y", lamps[1].getColor().getValue());
        assertEquals("Y", lamps[2].getColor().getValue());
        assertEquals("O", lamps[3].getState().getValue());

        // switch on 4 lamps
        lastRow.switchOnLamps(4);
        System.out.println(lastRow.toString());
        assertEquals("Y", lamps[0].getColor().getValue());
        assertEquals("Y", lamps[1].getColor().getValue());
        assertEquals("Y", lamps[2].getColor().getValue());
        assertEquals("Y", lamps[3].getColor().getValue());

    }

}
