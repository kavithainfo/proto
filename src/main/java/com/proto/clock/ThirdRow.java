package com.proto.clock;

import com.proto.clock.keyparts.Color;
import com.proto.clock.keyparts.Lamp;

/**
 * @author kavitha
 *
 * Third row has 11 rectangular lamps, every lamp represents 5 minutes.
 * In this row the 3rd, 6th and 9th lamp are red and indicate the first quarter,
 * half and last quarter of an hour. The other lamps are yellow.
 */
public class ThirdRow
{
    private final Lamp lamp1;
    private final Lamp lamp2;
    private final Lamp lamp3;
    private final Lamp lamp4;
    private final Lamp lamp5;
    private final Lamp lamp6;
    private final Lamp lamp7;
    private final Lamp lamp8;
    private final Lamp lamp9;
    private final Lamp lamp10;
    private final Lamp lamp11;

    private final Lamp[] elevenLamps;


    public ThirdRow()
    {
        //create the lamps and default them to off
        lamp1 = new Lamp(Color.YELLOW);
        lamp2 = new Lamp(Color.YELLOW);
        lamp3 = new Lamp(Color.RED);
        lamp4 = new Lamp(Color.YELLOW);
        lamp5 = new Lamp(Color.YELLOW);
        lamp6 = new Lamp(Color.RED);
        lamp7 = new Lamp(Color.YELLOW);
        lamp8 = new Lamp(Color.YELLOW);
        lamp9 = new Lamp(Color.RED);
        lamp10 = new Lamp(Color.YELLOW);
        lamp11 = new Lamp(Color.YELLOW);

        elevenLamps = new Lamp[]{lamp1, lamp2, lamp3, lamp4, lamp5, lamp6, lamp7, lamp8
                , lamp9, lamp10, lamp11};
    }

    /**
     * light as many lamps as per the value specified in the @param 'numberOfLamps'
     * @param numberOfLamps
     */
    public void switchOnLamps(int numberOfLamps)
    {
        for(int n = 0; n < numberOfLamps; n++)
        {
            elevenLamps[n].setSwitchOn();
        }
    }

    @Override
    public String toString()
    {
        StringBuffer buffer = new StringBuffer();

        for(int n = 0; n < elevenLamps.length; n++)
        {
            buffer.append(elevenLamps[n].toString());
        }
        return buffer.toString();
    }

    public Lamp[] getLamps()
    {
        return elevenLamps;
    }
}
