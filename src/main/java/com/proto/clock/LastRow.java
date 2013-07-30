package com.proto.clock;

import com.proto.clock.keyparts.Color;

/**
 * @author kavitha
 * Last row has 4 rectangular lamps, all 4 will glow yellow if switched on
 * each lamp represents 1 minute
 */
public class LastRow extends FourLampsRow
{


    public LastRow()
    {
        super(Color.YELLOW);
    }
}
