/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.weatherforecast;

import java.util.Random;

/**
 *
 * @author isaac
 */
public class WeatherMan {
        private Random random;

    public WeatherMan() {
        this.random = new Random();
    }

    public String forecast() {
        double probability = this.random.nextDouble();

        if (probability <= 0.1) {
            return "It rains";
        } else if (probability <= 0.4) { // 0.1 + 0.3
            return "It snows";
        } else { // rest, 1.0 - 0.4 = 0.6
            return "The sun shines";
        }
    }

    public int makeAForecast() {
        return (int) (4 * this.random.nextGaussian() - 3);
    }
}
