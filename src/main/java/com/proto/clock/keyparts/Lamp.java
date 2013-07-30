package com.proto.clock.keyparts;

public class Lamp
{
    private Color color;
    private State state = State.OFF;

    public Lamp()
    {
    }

    public Lamp(Color color)
    {
        this.color = color;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    public Color getColor()
    {
        return color;
    }

    public void setSwitchOn()
    {
        state = State.ON;
    }

    public void setSwitchOff()
    {
        state = State.OFF;
    }

    public boolean isSwitchedOFF()
    {
        return (state == State.OFF);
    }

    public State getState()
    {
        return state;
    }

    @Override
    public String toString()
    {
        if(isSwitchedOFF())
        {
            return state.getValue();
        }
        return color.getValue();

    }

}
