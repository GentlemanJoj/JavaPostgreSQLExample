/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controllers.Controller;
import Entities.Product;
import Interfaces.IProductService;
import Repositories.ProductRepository;
import Repositories.Repository;
import Services.ProductService;

/**
 *
 * @author Nicolás
 */
public class Start {
    
    private IProductService service;

    public Start() {
        ProductRepository productRepository = new ProductRepository( new Controller() );
        this.service = new ProductService(productRepository);
    }
    
    public void AddProduct(Product product){
        this.service.Add(product);
    }
    
    public static void main(String[] args) {
        Product productExample = new Product();
        productExample.setName("product1");
        productExample.setPrice(1);
        
        var start = new Start();
        start.AddProduct(productExample);
    }
}
