/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isaac
 */
public enum Education {

    PHD("Doctoral degree"),
    MA("Masters degree"),
    BA("Bachelors degree"),
    HS("High School diploma");

    private String code;        // object reference variable

    private Education(String code) { // constructor
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

}
