package application;

import java.util.*;
public class AverageSensor implements Sensor{
    private List<Sensor> list;
    private List<Integer> readings;

    public AverageSensor() {
        list = new ArrayList<>();
        readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        list.add(toAdd);
    }

    public void setOn() {
        list.stream().forEach(s -> s.setOn());
    }

    public void setOff() {
        list.stream().forEach(s -> s.setOff());
    }

    public boolean isOn() {
        for(Sensor i: list) {
            if(!i.isOn()) {
                return false;
            }
        }

        return true;
    }

    public int read() {
        if(!this.isOn() || list.size() == 0) {
            throw new IllegalStateException();
        }

        int reading = 0;

        for(Sensor i: list) {
            reading += i.read();
        }
        reading = reading/list.size();
        readings.add(reading);
        return reading;
    }

    public List<Integer> readings() {
        return readings;
    }
}
