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
    Vector<product> ProductsData;
    Map<Integer,Integer> ProductIdMap;
    
    Vector<Seller> SellersData;
    Map<Integer,Integer> SellersIdMap;
    
    private dataBase(){
        ProductsData = new Vector<>();
        ProductIdMap = new HashMap<>();
    }
    
    static dataBase singleObj;
    
    public static dataBase getDataBase(){
        if(singleObj == null){
            singleObj = new dataBase();
        }
        return singleObj;
    }
    
    static public void addProductToDataBase(product p){
        if(singleObj == null){
            singleObj = new dataBase();
        }
        singleObj.ProductsData.add(p);
        singleObj.ProductIdMap.put(p.id, 1);
    }
    
    static public void addToSellerDataBase(Seller s){
        if(singleObj == null){
            singleObj = new dataBase();
        }
        singleObj.SellersData.add(s);
        singleObj.SellersIdMap.put(s.id, 1);
    }
    
    static public boolean existsProductId(int _id) {
        if(singleObj == null){
            singleObj = new dataBase();
        }
        return singleObj.ProductIdMap.containsKey(_id);
    }
    
    static public boolean existsSellerId(int _id) {
        if(singleObj == null){
            singleObj = new dataBase();
        }
        return singleObj.SellersIdMap.containsKey(_id);
    }
}
