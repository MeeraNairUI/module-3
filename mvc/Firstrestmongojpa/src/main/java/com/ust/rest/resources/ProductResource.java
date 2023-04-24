package com.ust.rest.resources;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rest.resource.Product;
import com.ust.rest.services.impl.ProductService;

@RestController
@RequestMapping("/product/api.3.0")
public class ProductResource {
	@Autowired
	ProductService service;
         @GetMapping
        @RequestMapping("/retrieve/{productId}")
//        public Product fetchProduct(@PathVariable long productId) {
         public ResponseEntity<Product> fetchProduct(@PathVariable String productId){
//        	return service.getProduct(productId);
        	 return ResponseEntity.ok(service.getProduct(productId));
        }
       @GetMapping
        @RequestMapping("/retrieve/all")
//       public List<Product> fetchProducts(){
//        	return service.getProducts();
       public ResponseEntity<List<Product>> fetchProducts(){
    	   List<Product> list=service.getProducts();
    	   return ResponseEntity.ok(list);
        }
        
        @PostMapping
        @RequestMapping(value="/create", consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity<Product> addProduct(@RequestBody Product product){
//        	boolean result=service.add(product);
//        	if(result) {
        		return new ResponseEntity<Product>(service.add(product),HttpStatus.ACCEPTED);
        	}
        
        
        @PutMapping
        @RequestMapping(value="/update",
          consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
        public Product updateProduct(@RequestBody Product product){
        	return service.updateProduct(product);
        }
        @DeleteMapping
        @RequestMapping(value="delete/{productId}")
        public void deleteProduct(@PathVariable String productId) {
        	service.deleteProduct(productId);
        }
}

