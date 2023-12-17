/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermarket;

/**
 *
 * @author seif medhat
 */
public class product {
    int id , quantity;
    double price;
    String name , category;
    
    public product(int _id, int _quantity, double _price, String _name, String _category){
        id = _id;
        quantity = _quantity;
        price = _price;
        name = _name;
        category = _category;
    }
}
