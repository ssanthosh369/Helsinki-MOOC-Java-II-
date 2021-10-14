package application;

import java.util.Random;
public class TemperatureSensor implements Sensor{
    private boolean state;
    public TemperatureSensor() {
        state = false;
    }

    public boolean isOn() {
        return state;
    }

    public void setOn() {
        state = true;
    }

    public void setOff() {
        state = false;
    }

    public int read() {
        if(state) {
            return new Random().nextInt(61) - 30;
        }else {
            throw new IllegalStateException("Sensor is off");
        }

        
    }
}
