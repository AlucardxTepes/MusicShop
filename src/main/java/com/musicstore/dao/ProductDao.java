package com.musicstore.dao;

import com.musicstore.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alucard on 4/25/2016.
 */
public class ProductDao {

  private List<Product> productList;

  public List<Product> getProductList(){
    // dummy data
    Product product1 = new Product();
    product1.setProductName("BC Rich Warlock");
    product1.setProductCategory("Guitar");
    product1.setProductDescription("BC Rich Warlock electric guitar, 24 frets, two humbucker setup");
    product1.setProductPrice(249);
    product1.setProductCondition("new");
    product1.setProductStatus("Active");
    product1.setUnitInStock(11);
    product1.setProductManufacturer("BC Rich");

    Product product2 = new Product();
    product2.setProductName("Jackson Rhoads");
    product2.setProductCategory("Guitar");
    product2.setProductDescription("Jackson Randy Rhoads guitar, 24 frets, two humbucker setup");
    product2.setProductPrice(299);
    product2.setProductCondition("new");
    product2.setProductStatus("Active");
    product2.setUnitInStock(4);
    product2.setProductManufacturer("Jackson");

    Product product3 = new Product();
    product3.setProductName("Laney Ironheart IRT60H");
    product3.setProductCategory("Amplifier");
    product3.setProductDescription("Laney Ironheart guitar head, 60 watts.");
    product3.setProductPrice(600);
    product3.setProductCondition("new");
    product3.setProductStatus("Active");
    product3.setUnitInStock(10);
    product3.setProductManufacturer("Laney");

    productList = new ArrayList<Product>();
    productList.add(product1);
    productList.add(product2);
    productList.add(product3);

    return productList;
  }
}
