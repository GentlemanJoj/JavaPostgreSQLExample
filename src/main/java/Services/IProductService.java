/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Entities.Product;

/**
 *
 * @author Nicolás
 */
public interface IProductService {
    
    void Add(Product product);
    
    void Edit(int id, Product product);
}
