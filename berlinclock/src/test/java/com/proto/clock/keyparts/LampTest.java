package com.proto.clock.keyparts;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test an instance of lamp for its changing state(ON/OFF) and Color(RED/YELLOW)
 * The lamp will print R/Y (red/yellow) only when switched on, else will print O
 * @author kavitha
 *
 */
public class LampTest
{

    private final Lamp lamp = new Lamp();

    @Test
    public void test_LampColorRed()
    {
        lamp.setColor(Color.RED);
        assertEquals("R", lamp.getColor().getValue());
    }

    @Test
    public void test_LampColorYellow()
    {
        lamp.setColor(Color.YELLOW);
        assertEquals("Y", lamp.getColor().getValue());
    }


    @Test
    public void testRedLamp_OFF_State()
    {
        lamp.setColor(Color.RED);
        assertEquals("O", lamp.getState().getValue());
    }

    @Test
    public void testRedLamp_ON_State()
    {
        lamp.setColor(Color.RED);
        lamp.on();
        assertEquals("R", lamp.getColor().getValue());
    }

    @Test
    public void testYellowLamp_OFF_State()
    {
        lamp.setColor(Color.RED);
        assertEquals("O", lamp.getState().getValue());
    }

    @Test
    public void testYellowLamp_ON_State()
    {
        lamp.setColor(Color.YELLOW);
        lamp.on();
        assertEquals("Y", lamp.getColor().getValue());
    }

    @Test
    public void test_ToString()
    {
        lamp.setColor(Color.YELLOW);
        lamp.on();
        assertEquals("Y", lamp.getColor().getValue());
    }



}
