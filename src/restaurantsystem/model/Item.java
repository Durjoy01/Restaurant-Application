/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantsystem.model;

import java.util.Random;

/**
 *
 * @author 
 */
// Here, Inheritance is occurred by extending Super Item
public class Item extends SuperItem{
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
    	super(name);
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int itemBarCodeGenerator() {
		  Random barCode = new Random(); 
	      return (int) barCode.nextInt((int) this.price);
	  } 
}
