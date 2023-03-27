/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Entities.Product;
import Persistence.PersistenceController;

/**
 *
 * @author Nicolás
 */
public class Controller {
    
    PersistenceController persistenceController = new PersistenceController();
    
    public void AddProduct (Product product){
        persistenceController.AddProduct(product);
    }
}
