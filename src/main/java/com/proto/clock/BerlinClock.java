package com.proto.clock;

import java.text.ParseException;
import java.text.SimpleDateFormat;


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
public class BerlinClock implements IClock
{

    private final TopLamp topLamp;
    private final TopRow topRow;
    private final SecondRow secondRow;
    private final ThirdRow thirdRow;
    private final LastRow lastRow;

    public BerlinClock()
    {
        topLamp = new TopLamp();
        topRow = new TopRow();
        secondRow = new SecondRow();
        thirdRow = new ThirdRow();
        lastRow = new LastRow();
    }

    @Override
    public String toString()
    {
        StringBuffer buffer = new StringBuffer();
        buffer.append(topLamp.toString() + "\n");
        buffer.append(topRow.toString() + "\n");
        buffer.append(secondRow.toString() + "\n");
        buffer.append(thirdRow.toString() + "\n");
        buffer.append(lastRow.toString() + "\n");

        return buffer.toString();
    }

    /**
     * In the top row there are 4 red rectangular lamps. Every lamp represents 5 hours.
     * In the second row of red rectangular lamps every lamp represents 1 hour.
     * So if two lamps of the first row and three of the second row are switched on that indicates 5+5+3=13h or 1 pm.
     * Algorithm: divide the hours by 5, the quotient will represent the number of lamps switched ON in top row
     * and the modulus will represent the number of lamps lit in the second row
     *
     * The two rows of rectangular lamps at the bottom count the minutes. The first of these rows has 11 lamps, the second 4.
     * In the first row every lamp represents 5 minutes.
     * In the last row with 4 lamps every lamp represents 1 minute
     * Algorithm: Do the same quotient-modulus calculation for 3rd and 4th rows respectively

     * The top lamp is a pump which is blinking on/off every two seconds.
     * If the second is an even number then the lamp is ON, else OFF when odd     *
     * Algorithm: divide the seconds by 2 and if the modulus is 0 then the lamp should be switched ON glowing Yellow
     * @param hours
     * @return
     */
    @Override
    public String showTime(String time) throws ParseException, NumberFormatException
    {
        // first validate the input from the user for its correctness else inform them
        // 1. throw an exception if time is in invalid format, valid format being hh:mm:ss
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        sdf.parse(time);

        // 2. split the string to extract hh, mm and ss separately
        String[] splitValues = time.split(":");

        int hours = new Integer(splitValues[0]);
        int minutes = new Integer(splitValues[1]);
        int seconds = new Integer(splitValues[2]);

        // now build the Berlin clock representation
        topRow.switchOnLamps(hours / 5);
        secondRow.switchOnLamps(hours  % 5);
        thirdRow.switchOnLamps(minutes / 5);
        lastRow.switchOnLamps(minutes  % 5);
        topLamp.switchOnLamps(seconds % 2);

        return toString();
    }

}
