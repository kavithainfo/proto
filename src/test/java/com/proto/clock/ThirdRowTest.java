package com.proto.clock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.proto.clock.keyparts.Lamp;

public class ThirdRowTest {

    @Test
    public void testThirdRowLamps()
    {
        ThirdRow thirdRow = new ThirdRow();

        System.out.println("Testing the creation and display of third row, switching 1 lamp incrementally:");

        // switch off all lamps
        thirdRow.switchOnLamps(0);
        System.out.println(thirdRow.toString());
        Lamp[] lamps = thirdRow.getLamps();
        for(Lamp lampCur: lamps)
        {
            assertEquals("O", lampCur.getState().getValue());

        }

        // switch on 1 lamp
        thirdRow.switchOnLamps(1);
        System.out.println(thirdRow.toString());
        assertEquals("Y", lamps[0].getColor().getValue());
        assertEquals("O", lamps[1].getState().getValue());
        assertEquals("O", lamps[2].getState().getValue());
        assertEquals("O", lamps[3].getState().getValue());
        assertEquals("O", lamps[4].getState().getValue());
        assertEquals("O", lamps[5].getState().getValue());
        assertEquals("O", lamps[6].getState().getValue());
        assertEquals("O", lamps[7].getState().getValue());
        assertEquals("O", lamps[8].getState().getValue());
        assertEquals("O", lamps[9].getState().getValue());
        assertEquals("O", lamps[10].getState().getValue());

        // switch on 2 lamps
        thirdRow.switchOnLamps(2);
        System.out.println(thirdRow.toString());
        assertEquals("Y", lamps[0].getColor().getValue());
        assertEquals("Y", lamps[1].getColor().getValue());
        assertEquals("O", lamps[2].getState().getValue());
        assertEquals("O", lamps[3].getState().getValue());
        assertEquals("O", lamps[4].getState().getValue());
        assertEquals("O", lamps[5].getState().getValue());
        assertEquals("O", lamps[6].getState().getValue());
        assertEquals("O", lamps[7].getState().getValue());
        assertEquals("O", lamps[8].getState().getValue());
        assertEquals("O", lamps[9].getState().getValue());
        assertEquals("O", lamps[10].getState().getValue());

        // switch on 3 lamps
        thirdRow.switchOnLamps(3);
        System.out.println(thirdRow.toString());
        assertEquals("Y", lamps[0].getColor().getValue());
        assertEquals("Y", lamps[1].getColor().getValue());
        assertEquals("R", lamps[2].getColor().getValue());
        assertEquals("O", lamps[3].getState().getValue());
        assertEquals("O", lamps[4].getState().getValue());
        assertEquals("O", lamps[5].getState().getValue());
        assertEquals("O", lamps[6].getState().getValue());
        assertEquals("O", lamps[7].getState().getValue());
        assertEquals("O", lamps[8].getState().getValue());
        assertEquals("O", lamps[9].getState().getValue());
        assertEquals("O", lamps[10].getState().getValue());

        // switch on 4 lamps
        thirdRow.switchOnLamps(4);
        System.out.println(thirdRow.toString());
        assertEquals("Y", lamps[0].getColor().getValue());
        assertEquals("Y", lamps[1].getColor().getValue());
        assertEquals("R", lamps[2].getColor().getValue());
        assertEquals("Y", lamps[3].getColor().getValue());
        assertEquals("O", lamps[4].getState().getValue());
        assertEquals("O", lamps[5].getState().getValue());
        assertEquals("O", lamps[6].getState().getValue());
        assertEquals("O", lamps[7].getState().getValue());
        assertEquals("O", lamps[8].getState().getValue());
        assertEquals("O", lamps[9].getState().getValue());
        assertEquals("O", lamps[10].getState().getValue());

        // switch on 5 lamp
        thirdRow.switchOnLamps(5);
        System.out.println(thirdRow.toString());
        assertEquals("Y", lamps[0].getColor().getValue());
        assertEquals("Y", lamps[1].getColor().getValue());
        assertEquals("R", lamps[2].getColor().getValue());
        assertEquals("Y", lamps[3].getColor().getValue());
        assertEquals("Y", lamps[4].getColor().getValue());
        assertEquals("O", lamps[5].getState().getValue());
        assertEquals("O", lamps[6].getState().getValue());
        assertEquals("O", lamps[7].getState().getValue());
        assertEquals("O", lamps[8].getState().getValue());
        assertEquals("O", lamps[9].getState().getValue());
        assertEquals("O", lamps[10].getState().getValue());

        // switch on 6 lamps
        thirdRow.switchOnLamps(6);
        System.out.println(thirdRow.toString());
        assertEquals("Y", lamps[0].getColor().getValue());
        assertEquals("Y", lamps[1].getColor().getValue());
        assertEquals("R", lamps[2].getColor().getValue());
        assertEquals("Y", lamps[3].getColor().getValue());
        assertEquals("Y", lamps[4].getColor().getValue());
        assertEquals("R", lamps[5].getColor().getValue());
        assertEquals("O", lamps[6].getState().getValue());
        assertEquals("O", lamps[7].getState().getValue());
        assertEquals("O", lamps[8].getState().getValue());
        assertEquals("O", lamps[9].getState().getValue());
        assertEquals("O", lamps[10].getState().getValue());

        // switch on 7 lamps
        thirdRow.switchOnLamps(7);
        System.out.println(thirdRow.toString());
        assertEquals("Y", lamps[0].getColor().getValue());
        assertEquals("Y", lamps[1].getColor ().getValue());
        assertEquals("R", lamps[2].getColor().getValue());
        assertEquals("Y", lamps[3].getColor().getValue());
        assertEquals("Y", lamps[4].getColor().getValue());
        assertEquals("R", lamps[5].getColor().getValue());
        assertEquals("Y", lamps[6].getColor().getValue());
        assertEquals("O", lamps[7].getState().getValue());
        assertEquals("O", lamps[8].getState().getValue());
        assertEquals("O", lamps[9].getState().getValue());
        assertEquals("O", lamps[10].getState().getValue());

        // switch on 8 lamps
        thirdRow.switchOnLamps(8);
        System.out.println(thirdRow.toString());
        assertEquals("Y", lamps[0].getColor().getValue());
        assertEquals("Y", lamps[1].getColor().getValue());
        assertEquals("R", lamps[2].getColor().getValue());
        assertEquals("Y", lamps[3].getColor().getValue());
        assertEquals("Y", lamps[4].getColor().getValue());
        assertEquals("R", lamps[5].getColor().getValue());
        assertEquals("Y", lamps[6].getColor().getValue());
        assertEquals("Y", lamps[7].getColor().getValue());
        assertEquals("O", lamps[8].getState().getValue());
        assertEquals("O", lamps[9].getState().getValue());
        assertEquals("O", lamps[10].getState().getValue());

        // switch on 9 lamp
        thirdRow.switchOnLamps(9);
        System.out.println(thirdRow.toString());
        assertEquals("Y", lamps[0].getColor().getValue());
        assertEquals("Y", lamps[1].getColor().getValue());
        assertEquals("R", lamps[2].getColor().getValue());
        assertEquals("Y", lamps[3].getColor().getValue());
        assertEquals("Y", lamps[4].getColor().getValue());
        assertEquals("R", lamps[5].getColor().getValue());
        assertEquals("Y", lamps[6].getColor().getValue());
        assertEquals("Y", lamps[7].getColor().getValue());
        assertEquals("R", lamps[8].getColor().getValue());
        assertEquals("O", lamps[9].getState().getValue());
        assertEquals("O", lamps[10].getState().getValue());

        // switch on 10 lamps
        thirdRow.switchOnLamps(10);
        System.out.println(thirdRow.toString());
        assertEquals("Y", lamps[0].getColor().getValue());
        assertEquals("Y", lamps[1].getColor().getValue());
        assertEquals("R", lamps[2].getColor().getValue());
        assertEquals("Y", lamps[3].getColor().getValue());
        assertEquals("Y", lamps[4].getColor().getValue());
        assertEquals("R", lamps[5].getColor().getValue());
        assertEquals("Y", lamps[6].getColor().getValue());
        assertEquals("Y", lamps[7].getColor().getValue());
        assertEquals("R", lamps[8].getColor().getValue());
        assertEquals("Y", lamps[9].getColor().getValue());
        assertEquals("O", lamps[10].getState().getValue());

        // switch on 11 lamps
        thirdRow.switchOnLamps(11);
        System.out.println(thirdRow.toString());
        assertEquals("Y", lamps[0].getColor().getValue());
        assertEquals("Y", lamps[1].getColor().getValue());
        assertEquals("R", lamps[2].getColor().getValue());
        assertEquals("Y", lamps[3].getColor().getValue());
        assertEquals("Y", lamps[4].getColor().getValue());
        assertEquals("R", lamps[5].getColor().getValue());
        assertEquals("Y", lamps[6].getColor().getValue());
        assertEquals("Y", lamps[7].getColor().getValue());
        assertEquals("R", lamps[8].getColor().getValue());
        assertEquals("Y", lamps[9].getColor().getValue());
        assertEquals("Y", lamps[10].getColor().getValue());



    }

}
