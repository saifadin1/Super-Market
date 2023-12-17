/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermarket;

/**
 *
 * @author seif medhat
 */
public class Seller {
    int id;
    String name , password;
    Gender gender;
    
    public Seller(int _id , String _name, String _password, Gender _gender){
        this.id = _id;
        this.gender = _gender;
        this.name = _name;
        this.password = _password;
    }
}
