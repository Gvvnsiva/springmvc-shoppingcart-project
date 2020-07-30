package org.dxc.shopping.service;

import java.util.ArrayList;
import java.util.List;

import org.dxc.shopping.model.Product;
import org.springframework.stereotype.Service;
@Service
public class ProductService {
	private List<Product> listOfProduct;
	public List<Product> getProduct(){
	Product product1=new Product(1,"laptop",2,50000.0);
	Product product2=new Product(2,"mobile",20,20000.0);
	Product product3=new Product(3,"earphones",100,100.0);

	listOfProduct=new ArrayList<Product>();
	listOfProduct.add(product1);
	listOfProduct.add(product2);
	listOfProduct.add(product3);

	return listOfProduct;

}}
