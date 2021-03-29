/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.computershop.controller;

import ec.edu.espe.computershop.model.Monitor;
import utils.FileManager;

/**
 *
 * @author Acer
 */
public class MonitorController {

    public void save(Monitor monitor) {

        String data = monitor.getInputstypes() + ", " + monitor.getNumberofinputs() + ", " + monitor.getFrequency() + ", " + monitor.getCompatibility()+ ", " + monitor.getDefinition()+ ", " + monitor.isElectricityconsumption();
        FileManager.save(data, "Monitor");

    }
    public String read(){
        String data;
        data= FileManager.read("Monitor");
        return data;
    }
}
