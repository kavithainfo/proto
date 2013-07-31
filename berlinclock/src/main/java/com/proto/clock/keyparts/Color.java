package com.proto.clock.keyparts;

public enum Color
{
    RED("R"), YELLOW("Y");

    private String value;

    private Color(String value)
    {
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }

};
