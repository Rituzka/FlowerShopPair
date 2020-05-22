package controller;

import domain.*;
import persistence.Repository;


public class FlowerShopController {
	
	private String name;
	Repository listProducts = new Repository();
	
	
	public FlowerShopController(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void createTree(int code, String name, double price, int stock,  double height) throws Exception {
		Tree tree = new Tree(code, name, price, stock, height);
		Repository.addItems(tree);	
	}
	
	public void createFlower(int code, String name, double price, int stock,  String color) throws Exception {
		Flower flower = new Flower(code, name, price, stock, color);
		Repository.addItems(flower);	
	}
	
	public void createDecoration(int code, String name, double price, int stock,  String material) throws Exception {
		Decoration deco = new Decoration(code, name, price, stock, material);
		Repository.addItems(deco);	
	}
	
}
