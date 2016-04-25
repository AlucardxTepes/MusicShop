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

    productList = new ArrayList<Product>();
    productList.add(product1);

    return productList;
  }
}
