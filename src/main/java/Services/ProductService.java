/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Product;
import Repositories.IProductRepository;

/**
 *
 * @author Nicolás
 */
public class ProductService implements IProductService {

    private IProductRepository repository;

    public ProductService(IProductRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public void Add(Product product) {
        this.repository.Add(product);
    }
    
}
