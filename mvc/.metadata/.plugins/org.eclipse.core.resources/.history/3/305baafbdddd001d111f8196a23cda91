//package com.ust.rest.services;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.ust.rest.repository.ProductRepository;
//import com.ust.rest.repository.UserRepository;
//import com.ust.rest.resource.Product;
//import com.ust.rest.resources.User;
//
//@Service
//public class ProductService {
//	@Autowired
//     ProductRepository productRepository;
//	@Autowired
//	UserRepository userRepository;
//	public Product getProduct(long productId) {
//		Optional<Product> optional = productRepository.findById(productId);
//		if(optional.isPresent())
//			return optional.get();
//		else
//			return null;
//	}
////     public Product getProduct(long productId) {
////    	return  repository.getProduct(productId);
////     }
//     public List<Product> getProducts(){
//     	return productRepository.findAll();
//     }
//	@Transactional
//     public boolean add(Product product) {
//
//    		 productRepository.save(product);
//    		 User user = new User();
//    		 user.setUserId(5);
//    		 user.setDateTime(System.currentTimeMillis()+"");
//    		 userRepository.save(user);
//    		 return true;
//    	 }
//    	
//     public boolean validate(Product product) {
//    	 if(product.getName().equals("watch")) {
//    		 return true;
//    	 }else {
//    		 return false;
//    	 }
//     }
//    public Product updateProduct(Product product) {
//   	 return productRepository.save(product);
//    }
//     public void deleteProduct(long productId) {
//    	 productRepository.deleteById(productId);
//     }
//}

package com.ust.rest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ust.rest.repository.ProductRepository;
import com.ust.rest.repository.UserRepository;
import com.ust.rest.resource.Product;
import com.ust.rest.resource.User;
//import com.ust.rest.resource.User;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	UserRepository userRepository;

	
	 public Product getProduct(long productId) {
		 Optional<Product> optional = productRepository.findById(productId);
				 if(optional.isPresent())
				 {
					 return optional.get();
				 }
				 else
				 {
					 return null;
				 }
		 } 
	public List<Product> getProducts() 
	{
	  
	  return productRepository.findAll(); 
	  }
	 
	@Transactional(propagation=Propagation.REQUIRED)
	public Product add(Product product)
	{
		
		Product productT= productRepository.save(product);
		productRepository.save(product);
		
		User user= new User();
		user.setUserId(5L);
		user.setDateTime(System.currentTimeMillis()+"");
		User userT=userRepository.save(user);
//		System.out.println(userT);
//		if(userT!=null && product!=null) {
//		    return true;
//		}
//		else {
//			throw new RuntimeException("record not inserted");
//		}
//	public boolean validate(Product product) {
//		if(product.getName().equals("watch")) {
//			return true;
//		}else
//			return false;
//	}
//	
		return productT;
	}
 public Product updateProduct(Product product) 
	 { 
		 return productRepository.save(product); 
		 } 
 
	 
	 public void deleteProduct(long productId) { 
		 productRepository.deleteById(productId);
		  
		 }
	 	 
	 
}

