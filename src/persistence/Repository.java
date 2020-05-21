package persistence;

import java.util.ArrayList;
import java.util.List;

import domain.Product;

public class Repository {

	static List <Product> items= new ArrayList <Product>();
	
	public Repository() {
	
	}

	public static  List<Product> getItems() {
		return items;
	}

	public static void addItems(Product item) throws Exception {
		
		if (item==null)
			throw new Exception();
		
		   items.add(item);
				
	}
	
 }
