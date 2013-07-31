package com.proto.clock;

/**
 * Interface representing a Clock whose behaviour is to show/display time given the
 * hours, minutes and seconds
 * @author kavitha
 *
 */
public interface IClock
{

    public String showTime(int hours, int minutes, int seconds);

}
