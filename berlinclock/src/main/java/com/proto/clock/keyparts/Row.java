package com.proto.clock.keyparts;

/**
 * TBD
 */
public class Row
{
    private final Lamp[] lamps;

    public Row(Color... lampColors)
    {
        lamps =  createLamps(lampColors);
    }

    public void switchOnLamps(int nLamps)
    {
        for(int n = 0; n < nLamps; n++)
        {
            lamps[n].on();
        }
    }

    @Override
    public String toString()
    {
        StringBuffer buffer = new StringBuffer();

        for(int n = 0; n < lamps.length; n++)
        {
            buffer.append(lamps[n].toString());
        }
        return buffer.toString();
    }

    public int getLampCount()
    {
        return lamps.length;
    }

    private Lamp[] createLamps(Color[] lampColors)
    {
        Lamp[] lamps = new Lamp[lampColors.length];
        for(int n=0; n < lampColors.length; n++)
        {
            Lamp lamp = new Lamp(lampColors[n]);
            lamps[n] = lamp;
        }
        return lamps;
    }




}
