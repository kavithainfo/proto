package com.proto.clock.keyparts;

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