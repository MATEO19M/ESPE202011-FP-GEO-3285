/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.food.controller;

import ec.edu.espe.food.model.Food;
import utils.FileManager;

/**
 *
 * @author Acer
 */
public class FoodCOntroller {
    public void save(Food food) {

        String data = food.toString()+ ", " + food.toString()+ ", " + food.toString()+ ", " + food.toString();
        FileManager.save(data, "Food");

    }
    public String read(){
        String data;
        data= FileManager.read("Food");
        return data;
    }
    
}
