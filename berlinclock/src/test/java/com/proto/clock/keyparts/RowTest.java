package com.proto.clock.keyparts;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RowTest
{

    @Test
    public void testCreateRow_Of_1Lamp()
    {
        Row row = new Row(1, new Color[]{Color.RED});
        assertEquals(1, row.getLampCount());
    }

    @Test
    public void testCreateRow_Of_4Lamps()
    {
        Row row = new Row(4, new Color[]{Color.RED, Color.RED, Color.RED, Color.RED});
        assertEquals(4, row.getLampCount());
    }

    @Test
    public void testCreateRow_Of_11Lamps()
    {
        Row row = new Row(11, new Color[]{Color.YELLOW, Color.YELLOW, Color.RED,
                Color.YELLOW, Color.YELLOW, Color.RED,
                Color.YELLOW, Color.YELLOW, Color.RED,
                Color.YELLOW, Color.YELLOW});
        assertEquals(11, row.getLampCount());
    }

    @Test
    public void testSwitchOn_1Lamp()
    {
        Row row = new Row(1, new Color[]{Color.RED});
        row.switchOnLamps(1);

        assertEquals("R", row.toString());
    }

    @Test
    public void testSwitchOn_3_Red_Lamps()
    {
        Row row = new Row(4, new Color[]{Color.RED, Color.RED, Color.RED, Color.RED});
        row.switchOnLamps(3);

        assertEquals("RRRO", row.toString());
    }

    @Test
    public void testSwitchOn_2_YELLOW_Lamps()
    {
        Row row = new Row(4, new Color[]{Color.YELLOW, Color.YELLOW, Color.YELLOW, Color.YELLOW});
        row.switchOnLamps(2);

        assertEquals("YYOO", row.toString());
    }

    @Test
    public void testSwitchOn_ALL_11_Lamps()
    {
        Row row = new Row(11, new Color[]{Color.YELLOW, Color.YELLOW, Color.RED,
                Color.YELLOW, Color.YELLOW, Color.RED,
                Color.YELLOW, Color.YELLOW, Color.RED,
                Color.YELLOW, Color.YELLOW});
        row.switchOnLamps(11);

        assertEquals("YYRYYRYYRYY", row.toString());
    }

    @Test
    public void testLampCount()
    {
        Row row = new Row(1, new Color[]{Color.RED});
        assertEquals(1, row.getLampCount());
    }

    @Test
    public void testToString()
    {
        Row row = new Row(6, new Color[]{Color.YELLOW, Color.YELLOW, Color.YELLOW, Color.YELLOW, Color.RED, Color.RED});
        row.switchOnLamps(6);
        assertEquals("YYYYRR", row.toString());
    }
}
