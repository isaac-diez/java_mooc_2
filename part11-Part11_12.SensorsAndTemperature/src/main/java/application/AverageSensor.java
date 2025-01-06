/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author isaac
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensorList;
    private List<Integer> averageList;
    private boolean temperatureSensor;

    public AverageSensor() {
        this.sensorList = new ArrayList<>();
        this.averageList = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {

        this.sensorList.add(toAdd);

    }

    @Override
    public boolean isOn() {
        this.temperatureSensor = true;
                
        for (Sensor sensor : this.sensorList) {
            if (!sensor.isOn()){
                this.temperatureSensor = false;
            }
        } 
        
        return this.temperatureSensor;
    }

    @Override
    public void setOn() {

        for (Sensor sensor : this.sensorList) {
            sensor.setOn();
        }
        
        this.temperatureSensor = true;

    }

    @Override
    public void setOff() {
        for (Sensor sensor : this.sensorList) {
            sensor.setOff();
        }
        
        this.temperatureSensor = false;
    }

    @Override
    public int read() {

        int average = 0;
        
        if (this.sensorList.size() == 0 || !this.temperatureSensor) {

            throw new IllegalStateException("no sensors added or sensors are off");

        } else {
            
            for (Sensor sensor : this.sensorList) {
                average += sensor.read();
        }
    }
        average = average/this.sensorList.size();
        
        averageList.add(average);
        
        return average;

}
    public List<Integer> readings() {
        return averageList;
    }

}
