package com.proto.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.google.common.base.Preconditions;
import com.proto.clock.BerlinClockImpl;
import com.proto.clock.IClock;

public class Main
{
    public static void main(String args[])
    {
        try
        {
            int[] time = parseArgs(args);

            IClock clock = new BerlinClockImpl();
            String displayTime = clock.showTime(time[0], time[1], time[2]);

            System.out.println(displayTime);
        }
        catch (IllegalArgumentException e)
        {
            System.err.println(e.getMessage());
            System.exit(1);
        }

    }


    private static int[] parseArgs(String args[]){

        Preconditions.checkArgument(args.length > 0, "Please specify the time in the format - hh:mm:ss as an input parameter.");

        try
        {
            String time = args[0];

            // first validate the input from the user for its correctness else inform them
            // 1. throw an exception if time is in invalid format, valid format being hh:mm:ss
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
            sdf.parse(time);

            // 2. split the string to extract hh, mm and ss separately
            String[] splitValues = time.split(":");

            int hours = new Integer(splitValues[0]);
            int minutes = new Integer(splitValues[1]);
            int seconds = new Integer(splitValues[2]);

            // check if the time is within 24:00:00
            if((hours > 24) || (minutes > 59) || (seconds > 59) ||
                    (hours == 24 && (minutes != 0 || seconds != 0)))
            {
                throw new IllegalArgumentException("Invalid Time. Please specify a valid time in the format - hh:mm:ss");
            }


            return new int[]{hours, minutes, seconds};

        }
        catch (NumberFormatException e)
        {
            throw new IllegalArgumentException("Invalid Time. Please specify the time in the format - hh:mm:ss");
        }
        catch (ParseException e)
        {
            throw new IllegalArgumentException("Invalid Time. Please specify the time in the format - hh:mm:ss" );
        }
    }

}
