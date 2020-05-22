package controller;


import domain.*;
import persistence.Repository;


public class FlowerShopController {
	
	private String name;
	//Repository allProducts = new Repository();
	
	
	public FlowerShopController(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Tree createTree(Tree tree, int code, String name, double price, int stock, double height) throws Exception {
		tree = new Tree(code, name, price, stock, height);
		Repository.addItems(tree);	
		return tree;
	}
	
	public Flower createFlower(Flower flower, int code, String name, double price, int stock, String color) throws Exception {
	    flower = new Flower(code, name, price, stock, color);
		Repository.addItems(flower);
		return flower;
	}
	
	public Decoration createDecoration(Decoration deco, int code, String name, double price, int stock, String material) throws Exception {
		deco = new Decoration(code, name, price, stock, material);
		Repository.addItems(deco);	
		return deco;
	}
	
	public String getCurrentStocks() {
		String currentStocks = "";
		for (Product p: Repository.getItems() ) {
		currentStocks = "STOCK ACTUAL: producto: "+ p.getName() +", stock: "+p.getStock();
		
		System.out.println(currentStocks);
		
		}
		return currentStocks;
	}
}
