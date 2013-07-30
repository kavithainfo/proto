package com.proto.clock;

import java.text.ParseException;


public interface IClock
{

    public String showTime(String time) throws ParseException, NumberFormatException;

}
