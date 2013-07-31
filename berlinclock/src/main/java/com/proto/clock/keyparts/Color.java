package com.proto.clock.keyparts;

/**
 * enum representing the 2 colors of the lamp (RED/ YELLOW)
 * @author kavitha
 *
 */
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
