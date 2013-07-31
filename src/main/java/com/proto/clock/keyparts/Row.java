package com.proto.clock.keyparts;


public class Row
{
    private final Lamp[] lamps;

    public Row(int totalNumberOfLamps, Color... LampColors)
    {
        lamps =  createLamps(totalNumberOfLamps, LampColors);
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

    private Lamp[] createLamps(int totalNumberOfLamps, Color[] LampColors)
    {
        Lamp[] lamps = new Lamp[totalNumberOfLamps];
        for(int n=0; n < totalNumberOfLamps; n++)
        {
            Lamp lamp = new Lamp(LampColors[n]);
            lamps[n] = lamp;
        }
        return lamps;
    }




}
