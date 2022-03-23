package com.example.demo.Entity;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import javax.persistence.Entity;

@Entity
@SolrDocument(collection = "products")
public class Product {

    @Field
    private Integer pid;
    @Id
    @Field
    private String prodName;
    @Field
    private String prodDescription;
    @Field
    private String category;

    @Field
    private String ProductTitle;

    @Field
    private String ProductImage;

    public Product(Integer pid, String prodName, String prodDescription, String category, String productTitle, String productImage) {
        this.pid = pid;
        this.prodName = prodName;
        this.prodDescription = prodDescription;
        this.category = category;
        ProductTitle = productTitle;
        ProductImage = productImage;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdDescription() {
        return prodDescription;
    }

    public void setProdDescription(String prodDescription) {
        this.prodDescription = prodDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductTitle() {
        return ProductTitle;
    }

    public void setProductTitle(String productTitle) {
        ProductTitle = productTitle;
    }

    public String getProductImage() {
        return ProductImage;
    }

    public void setProductImage(String productImage) {
        ProductImage = productImage;
    }

    public Product() {
    }
}
