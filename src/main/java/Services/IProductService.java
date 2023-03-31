/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Entities.Product;
import java.util.List;

/**
 *
 * @author Nicolás
 */
public interface IProductService {
    
    void Add(Product product);
    
    void Edit(int id, Product product);
    
    void Delete(int id);
    
    List<Product> Get();
}
