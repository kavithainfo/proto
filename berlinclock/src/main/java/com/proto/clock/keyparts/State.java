package com.proto.clock.keyparts;

/**
 * enum representing the ON/OFF state of the lamp
 * @author kavitha
 *
 */
public enum State
{
    ON("L"), OFF("O");

    private String value;

    private State(String value)
    {
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }
}