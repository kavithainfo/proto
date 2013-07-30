package com.proto.clock;

import com.proto.clock.keyparts.Color;

/**
 * @author kavitha
 * Top row has 4 rectangular lamps, all 4 will glow Red if switched on
 * each lamp represents 5 hours
 */
public class TopRow extends FourLampsRow
{

    public TopRow()
    {
        super(Color.RED);
    }


}
