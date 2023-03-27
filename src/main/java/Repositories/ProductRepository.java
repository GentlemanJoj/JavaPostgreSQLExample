/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Controllers.Controller;
import Entities.Product;
import Interfaces.IProductRepository;
import Interfaces.IRepository;

/**
 *
 * @author Nicolás
 */
public class ProductRepository implements IProductRepository {

    private Controller controller;

    public ProductRepository(Controller controller) {
        this.controller = controller;
    }
    
    @Override
    public void Add(Product product) {
        this.controller.AddProduct(product);
    }
    
}
