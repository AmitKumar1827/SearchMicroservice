package com.example.demo.Repository;

import com.example.demo.Entity.Product;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends SolrCrudRepository<Product, String> {
}
