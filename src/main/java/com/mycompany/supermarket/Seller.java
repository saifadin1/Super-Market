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
    
    public Seller(int _id , String _name, String _password, String _gender){
        this.id = _id;
        this.name = _name;
        this.password = _password;
        if(_gender == "Male") this.gender = Gender.Male;
        else if(_gender == "Female") this.gender = Gender.Female;
    }
}
