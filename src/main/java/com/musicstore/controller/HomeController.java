package com.musicstore.controller;

import com.musicstore.dao.ProductDao;
import com.musicstore.model.Product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Alucard on 4/24/2016.
 */

@Controller
public class HomeController {

  private ProductDao productDao = new ProductDao();


  @RequestMapping("/")
  public String home() {
    return "home";
  }

  @RequestMapping("/productList")
  public String getProducts(Model model) {
    List<Product> productList = productDao.getProductList();
    Product product = productList.get(0);
    // attach data to the view
    model.addAttribute(product);
    // return the view (with data attached)
    return "productList";
  }

}
