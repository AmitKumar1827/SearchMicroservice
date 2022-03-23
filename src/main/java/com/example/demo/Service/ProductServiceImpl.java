package com.example.demo.Service;

import com.example.demo.Entity.Product;
import com.example.demo.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProdService{

    @Autowired
    private ProductRepo productRepo;

    public void addProduct(Product pro){
        productRepo.save(pro);
    }
}
