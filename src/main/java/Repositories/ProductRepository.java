/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Entities.Product;

/**
 *
 * @author Nicolás
 */
public class ProductRepository implements IProductRepository {

    private IRepository<Product> repository;

    public ProductRepository(IRepository<Product> repository) {
        this.repository = repository;
    }

    @Override
    public void Add(Product product) {
        this.repository.Add(product);
    }

    @Override
    public void Edit(int id, Product product) {
        this.repository.Edit(id, product);
    }
    
}
