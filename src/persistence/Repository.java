package persistence;

import java.util.ArrayList;
import java.util.List;

import domain.Product;

public class Repository {

	static ArrayList <Product> items= new ArrayList <Product>();
	
	public Repository() {
	
	}

	public static  ArrayList<Product> getItems() {
		return items;
	}

	public static  void addItems(Product items) throws Exception {
		
		if (items==null)
			throw new Exception();
		
		((List<Product>) items).add(items);
				
	}
	
 }
