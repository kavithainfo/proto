package com.proto.clock;

import com.proto.clock.keyparts.Color;
import com.proto.clock.keyparts.Lamp;

/**
 * parent class for rows that have four lamps in a row
 * @author kavitha
 *
 */
public class FourLampsRow
{
    private final Lamp lamp1;
    private final Lamp lamp2;
    private final Lamp lamp3;
    private final Lamp lamp4;

    private final Lamp[] fourLamps;


    public FourLampsRow(Color color)
    {
        //create the lamps and default them to off
        lamp1 = new Lamp(color);
        lamp2 = new Lamp(color);
        lamp3 = new Lamp(color);
        lamp4 = new Lamp(color);

        fourLamps = new Lamp[]{lamp1, lamp2, lamp3, lamp4};
    }

    /**
     * light as many lamps as per the value specified in the @param 'numberOfLamps'
     * @param numberOfLamps
     */
    public void switchOnLamps(int numberOfLamps)
    {
        for(int n = 0; n < numberOfLamps; n++)
        {
            fourLamps[n].setSwitchOn();
        }
    }

    @Override
    public String toString()
    {
        StringBuffer buffer = new StringBuffer();

        for(int n = 0; n < fourLamps.length; n++)
        {
            buffer.append(fourLamps[n].toString());
        }
        return buffer.toString();
    }

    public Lamp[] getLamps()
    {
        return fourLamps;
    }
}
