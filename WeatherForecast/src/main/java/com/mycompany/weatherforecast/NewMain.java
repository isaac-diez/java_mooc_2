/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.weatherforecast;

import java.util.ArrayList;

/**
 *
 * @author isaac
 */
public class NewMain {

    public static void main(String[] args) {
        WeatherMan forecaster = new WeatherMan();

        // save days of the week to a list
        ArrayList<String> days = new ArrayList<>();
        days.add("Mon");
        days.add("Tue");
        days.add("Wed");
        days.add("Thu");
        days.add("Fri");
        days.add("Sat");
        days.add("Sun");

        System.out.println("Next week's weather forecast:");

        for (String day : days) {
            String weatherForecast = forecaster.forecast();
            
            int temperatureForecast = forecaster.makeAForecast();

            System.out.println(day + ": " + weatherForecast + " " + temperatureForecast + " degrees.");
        }
    }
}
