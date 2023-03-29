/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Entities.Product;
import Services.IProductService;
import Repositories.ProductRepository;
import Repositories.Repository;
import Services.ProductService;
import org.apache.log4j.Logger;

/**
 *
 * @author Nicolás
 */
public class Start {
    
    private IProductService service;
    private static final Logger log = Logger.getLogger(Start.class);

    public Start() {
        ProductRepository productRepository = new ProductRepository( new Repository<Product>(Product.class) );
        this.service = new ProductService(productRepository);
    }
    
    public void Add(Product product){
        try{
            this.service.Add(product);
            log.info("Add product was success");
        }catch(Exception e){
            log.error("Impossible to add, error: " + e.getMessage());
        }
    }
    
    public void Edit(int id, Product product){
        try{
            this.service.Edit(id, product);
            log.info("Edit product was success");
        }catch(Exception e){
            log.error("Impossible to edit, error: " + e.getMessage());
        }
    }
    
    
    
    public static void main(String[] args) {
       /*Product productExample = new Product();
        productExample.setName("product");
        productExample.setPrice(3);
        var start = new Start();
        start.Add(productExample);*/
        Product product = new Product();
        product.setId(4);
        product.setName("MASAKA!");
        product.setPrice(0);
        var start = new Start();
        start.Edit(4, product);
        
        
        System.out.println("This is a change");
    }
}
