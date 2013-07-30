package com.proto.clock;

import com.proto.clock.keyparts.Color;
import com.proto.clock.keyparts.Lamp;

/**
 * TopLamp is a yellow lamp at the top of the clock that blinks on/off every two seconds.
 * 
 * @author kavitha
 *
 */
public class TopLamp extends Lamp
{
    public TopLamp()
    {
        super(Color.YELLOW);
    }

    /**
     * light the lamp as per the value specified in the @param  0 or 1;
     */
    public void switchOnLamps(int lampOnOrOff)
    {
        switch(lampOnOrOff)
        {
        case 0:
            setSwitchOn();
            break;

        case 1:
            setSwitchOff();
            break;

        default:
            setSwitchOff();
        }
    }
}
