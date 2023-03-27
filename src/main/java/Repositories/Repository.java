/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Interfaces.IRepository;

/**
 *
 * @author Nicolás
 */
public class Repository <T> implements IRepository <T>{
    
    @Override
    public void Add(T object) {
        /*DB connection, CRUD actions*/
        System.out.println("KANSEI DORIFTO!");
    }
    
}
