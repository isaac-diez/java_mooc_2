/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author isaac
 */
public class TemperatureSensor implements Sensor {

    private boolean temperatureSensor;

    public TemperatureSensor() {
        this.temperatureSensor = false;
    }

    @Override
    public boolean isOn() {
        return temperatureSensor;
    }

    @Override
    public void setOn() {
        if (!temperatureSensor) {
            temperatureSensor = true;
        }
    }

    @Override
    public void setOff() {
        if (temperatureSensor) {
            temperatureSensor = false;
        }
    }

    @Override
    public int read() {

        if (temperatureSensor) {
            return new Random().nextInt(61) - 30;
        } else {
            throw new IllegalStateException("The sensor is off.");

        }

    }

}
