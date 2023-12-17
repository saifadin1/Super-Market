/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermarket;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 *
 * @author seif medhat
 */
public class dataBase {
    Vector<product> data;
    Map<Integer,Integer> idMap;
    
    private dataBase(){
        data = new Vector<>();
        idMap = new HashMap<>();
    }
    
    static dataBase singleObj;
    
    public static dataBase getDataBase(){
        if(singleObj == null){
            singleObj = new dataBase();
        }
        return singleObj;
    }
    
    static public void addToDataBase(product p){
        if(singleObj == null){
            singleObj = new dataBase();
        }
        singleObj.data.add(p);
        singleObj.idMap.put(p.id, 1);
    }
    
    static public boolean existsId(int _id) {
        if(singleObj == null){
            singleObj = new dataBase();
        }
        return singleObj.idMap.containsKey(_id);
    }
}
