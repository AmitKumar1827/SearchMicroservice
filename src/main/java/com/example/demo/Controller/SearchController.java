package com.example.demo.Controller;

import com.example.demo.Entity.Product;
import com.example.demo.Repository.ProductRepo;
import com.example.demo.Service.ProdService;
import com.example.demo.Service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
public class SearchController {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ProdService prodService;

    @GetMapping (value = "/ProductName")
    public Optional<Product> getProductByName(@RequestParam("name") String ProdName){
        Optional<Product> prod = productRepo.findById(ProdName);
        if(prod.isPresent()){
            return prod;
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
    public void addProd(@RequestParam Product product){
        prodService.addProduct(product);
    }
}
