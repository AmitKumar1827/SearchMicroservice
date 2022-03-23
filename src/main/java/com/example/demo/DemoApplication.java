package com.example.demo;

import com.example.demo.Service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

@EnableSolrRepositories(basePackages = "com.example")
@ComponentScan("com.example")
public class DemoApplication {

    @Autowired
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


}
