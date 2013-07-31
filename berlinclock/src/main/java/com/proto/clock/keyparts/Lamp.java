package com.proto.clock.keyparts;

/**
 * Class representing a lamp in a row of the berlin clock
 * @author kavitha
 *
 */
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

    public State getState()
    {
        return state;
    }

    public void on()
    {
        state = State.ON;
    }

    public void off()
    {
        state = State.OFF;
    }

    public boolean isOFF()
    {
        return (state == State.OFF);
    }

    public boolean isON()
    {
        return (state == State.ON);
    }

    @Override
    public String toString()
    {
        if(isOFF())
        {
            return state.getValue();
        }
        return color.getValue();

    }

}
