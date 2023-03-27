/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import Entities.Product;

/**
 *
 * @author Nicolás
 */
public class PersistenceController {
    
    ProductJpaController productJpaController = new ProductJpaController();

    public void AddProduct(Product product) {
        productJpaController.create(product);
    }
}
