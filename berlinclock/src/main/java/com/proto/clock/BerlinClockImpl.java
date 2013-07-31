package com.proto.clock;

import com.proto.clock.keyparts.Color;
import com.proto.clock.keyparts.Row;

/**
 * @author kavitha
 * The Berlin Uhr (Clock) is a rather strange way to show the time.
 * On the top of the clock there is a yellow lamp that blinks on/off every two seconds. The time is calculated by adding rectangular lamps.
 * The top two rows of lamps are red. These indicate the hours of a day.
 * In the top row there are 4 red lamps. Every lamp represents 5 hours.
 * In the lower row of red lamps every lamp represents 1 hour.
 * So if two lamps of the first row and three of the second row are switched on that indicates 5+5+3=13h or 1 pm.
 *
 * The two rows of lamps at the bottom count the minutes.
 * The first of these rows has 11 lamps, the second 4. In the first row every lamp represents 5 minutes.
 * In this first row the 3rd, 6th and 9th lamp are red and indicate the first quarter, half and last quarter of an hour.
 * The other lamps are yellow. In the last row with 4 lamps every lamp represents 1 minute.
 * The lamps are switched on from left to right.
 *
 */
public class BerlinClockImpl implements IClock
{
    private final Row topLamp;
    private final Row row1;
    private final Row row2;
    private final Row row3;
    private final Row row4;

    public BerlinClockImpl()
    {
        topLamp = new Row(Color.YELLOW);
        row1 = new Row(new Color[]{Color.RED, Color.RED, Color.RED, Color.RED});
        row2 = new Row(new Color[]{Color.RED, Color.RED, Color.RED, Color.RED});
        row3 = new Row(new Color[]{Color.YELLOW, Color.YELLOW, Color.RED,
                Color.YELLOW, Color.YELLOW, Color.RED,
                Color.YELLOW, Color.YELLOW, Color.RED,
                Color.YELLOW, Color.YELLOW});
        row4 = new Row(new Color[]{Color.YELLOW, Color.YELLOW, Color.YELLOW, Color.YELLOW});
    }


    /**

     * Algorithm:
     * divide the hours by 5, the quotient will represent the number of lamps switched ON in top row
     * and the modulus will represent the number of lamps lit in the second row
     * Do the same quotient-modulus calculation for 3rd and 4th rows respectively
     * divide the seconds by 2 and if the modulus is 0 then the top lamp should be switched ON glowing Yellow
     */
    @Override
    public String showTime(int hours, int minutes, int seconds)
    {
        // now build the Berlin clock representation
        row1.switchOnLamps(hours / 5);
        row2.switchOnLamps(hours  % 5);
        row3.switchOnLamps(minutes / 5);
        row4.switchOnLamps(minutes  % 5);
        if(seconds % 2 == 0)
        {
            topLamp.switchOnLamps(1);
        }


        return toString();
    }

    @Override
    public String toString()
    {
        StringBuffer buffer = new StringBuffer();
        buffer.append(topLamp.toString() + "\n");
        buffer.append(row1.toString() + "\n");
        buffer.append(row2.toString() + "\n");
        buffer.append(row3.toString() + "\n");
        buffer.append(row4.toString() + "\n");

        return buffer.toString();
    }


}
