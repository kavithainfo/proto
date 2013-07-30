package com.proto.clock;

import com.proto.clock.keyparts.Color;

/**
 * @author kavitha
 * Second row has 4 rectangular lamps, all 4 will glow Red if switched on
 * each lamp represents 1 hour
 */
public class SecondRow extends FourLampsRow
{
    public SecondRow()
    {
        super(Color.RED);
    }

}
