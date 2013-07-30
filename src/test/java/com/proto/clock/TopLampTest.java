package com.proto.clock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TopLampTest {

    @Test
    public void testTopLamp()
    {
        System.out.println("\nTesting the creation and display of Top lamp, switching lamp OFF and ON:");
        TopLamp topLamp = new TopLamp();

        // switch off lamp
        topLamp.setSwitchOff();
        System.out.println(topLamp.toString());
        assertEquals("O", topLamp.getState().getValue());

        // switch on lamp
        topLamp.setSwitchOn();
        System.out.println(topLamp.toString());
        assertEquals("Y", topLamp.getColor().getValue());

    }

}
