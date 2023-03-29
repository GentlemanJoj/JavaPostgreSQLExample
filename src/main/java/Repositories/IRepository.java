/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

/**
 *
 * @author Nicolás
 * @param <T>
 */
public interface IRepository<T> {
    
    void Add(T object);
    
    void Edit(int id, T object);
}
