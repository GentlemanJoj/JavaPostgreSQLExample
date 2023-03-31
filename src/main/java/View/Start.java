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
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author Nicolás
 */
public class Start {

    private IProductService service;
    private static final Logger logger = Logger.getLogger(Start.class);

    public Start() {
        ProductRepository productRepository = new ProductRepository(new Repository<Product>(Product.class));
        this.service = new ProductService(productRepository);
    }

    public void Add(Product product) {
        try {
            this.service.Add(product);
            /*logger.info("Add product was success");*/
        } catch (Exception e) {
            /*logger.error("Impossible to add, error: " + e.getMessage());*/
        }
    }

    public void Edit(int id, Product product) {
        if (id != product.getId()){
            System.out.println("The id´s are diferent");
            return;
        }
        try {
            this.service.Edit(id, product);
            /*logger.info("Edit product was success");*/
        } catch (Exception e) {
            /*logger.error("Impossible to edit, error: " + e.getMessage());*/
        }
    }
    
    public void Delete(int id){
        try{
            this.service.Delete(id);
            /*logger.info("Delete product was success");*/
        } catch(Exception e) {
            /*logger.error("Impossible to delete, error: " + e.getMessage());*/
        }
        
    }
    
    public List<Product> Get(){
        try{
            return this.service.Get();
            /*logger.info("Get products was successful");*/
        }catch(Exception e){
             /*logger.error("Impossible to get, error: " + e.getMessage());*/
        }
        return null;
    }

    public static void main(String[] args) {
        /*Product productExample = new Product();
        productExample.setId(12);
        productExample.setName("KONO DIO DA!");
        productExample.setPrice(2);*/
        var start = new Start();
        List<Product> products = start.Get();
        
        System.out.println(products.size());
    }
}
