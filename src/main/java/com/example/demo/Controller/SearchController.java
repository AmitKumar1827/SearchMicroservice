package com.example.demo.Controller;

import com.example.demo.Entity.Product;
import com.example.demo.Repository.ProductRepo;
import com.example.demo.Service.ProdService;
import com.example.demo.Service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class SearchController {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ProdService prodService;

    @GetMapping (value = "/ProductName")
    public Product getProductByName(@RequestParam("name") String ProdName){
        Optional<Product> prod = productRepo.findById(ProdName);
        if(prod.isPresent()){
            return prod.get();
        }else{
            return null;
        }
    }

    @GetMapping (value = "/productByCategory")
    public Product getProductByCategory(@RequestParam("category") String category){
        Iterable<Product> prod = productRepo.findAll();
        for(Product product : prod){
            if(product.getCategory().equals(category)){
                return product;
            }
        }

        return null;
    }

    @PostMapping (value="/addProductToSolr")
    public void addProd(@RequestBody Product product){
        prodService.addProduct(product);
    }
}
