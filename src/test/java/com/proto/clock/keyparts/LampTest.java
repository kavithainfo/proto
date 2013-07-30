package com.proto.clock.keyparts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test an instance of lamp for its changing state(ON/OFF) and Color(RED/YELLOW)
 * The lamp will print R/Y (red/yellow) only when switched on, else will print O
 * @author kavitha
 *
 */
public class LampTest
{

    @Test
    public void testLamp()
    {

        System.out.println("\nTesting the creation of a lamp, and its properties: ON/OFF & RED/YELLOW:");

        // create a new Red lamp, switch on and check if it is on and print the state of the lamp
        Lamp lamp1 = new Lamp();
        lamp1.setColor(Color.RED);
        lamp1.setSwitchOn();

        System.out.println("Lamp1 is " + lamp1.toString());

        assertTrue("True if the lamp is switched on!", !lamp1.isSwitchedOFF());
        assertEquals("R", lamp1.getColor().getValue());

        // now yellow lamp, switched OFF
        lamp1.setColor(Color.YELLOW);
        lamp1.setSwitchOff();

        System.out.println("Lamp1 is now " + lamp1.toString());

        assertTrue("True if the lamp is switched OFF!", lamp1.isSwitchedOFF());
        assertEquals("O", lamp1.getState().getValue());

        // now yellow lamp, switched OFF
        lamp1.setColor(Color.YELLOW);
        lamp1.setSwitchOn();

        System.out.println("Lamp1 is now changed to " + lamp1.toString());

        assertTrue("True if the lamp is switched ON!", !lamp1.isSwitchedOFF());
        assertEquals("Y", lamp1.getColor().getValue());

    }

}
