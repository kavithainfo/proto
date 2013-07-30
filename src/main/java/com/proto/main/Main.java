package com.proto.main;

import java.text.ParseException;

import com.proto.clock.BerlinClock;
import com.proto.clock.IClock;

public class Main implements IMain
{

    @Override
    public String createRepresentationOfBerlinClock(String time) throws ParseException, NumberFormatException
    {

        IClock clock = new BerlinClock();
        return clock.showTime(time);
    }

    public static void main(String args[])
    {
        Main main = new Main();
        try
        {
            String time = args[0];
            String displayTime = main.createRepresentationOfBerlinClock(time);
            System.out.println(displayTime);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid Time! " + e.getMessage() + "\n Please enter a valid time" );
        }
        catch (ParseException e)
        {
            System.out.println("Invalid Time! " + e.getMessage() + "\n Please enter a valid time" );
        }

    }



}
