package controller;

import domain.*;
import persistence.Repository;

public class FlowerShopController {

	private String name;
	// Repository allProducts = new Repository();

	public FlowerShopController(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Tree createTree(Tree tree, int code, String name, double price, int stock, double height, String category)
			throws Exception {
		tree = new Tree(code, name, price, stock, height, category);
		Repository.addItems(tree);
		return tree;
	}

	public Flower createFlower(Flower flower, int code, String name, double price, int stock, String color,
			String category) throws Exception {
		flower = new Flower(code, name, price, stock, color, category);
		Repository.addItems(flower);
		return flower;
	}

	public Decoration createDecoration(Decoration deco, int code, String name, double price, int stock, String material,
			String category) throws Exception {
		deco = new Decoration(code, name, price, stock, material, category);
		Repository.addItems(deco);
		return deco;
	}

	public String getCurrentStocks() {
		String currentStocks = "";
		for (Product p : Repository.getItems()) {
			currentStocks = "STOCK ACTUAL: producto: " + p.getName() + ", stock: " + p.getStock();

			System.out.println(currentStocks);

		}
		return currentStocks;
	}

	public void getStocksByCategory() {

		String currentStockTree = "";
		String currentStockFlower = "";
		String currentStockDeco = "";
		int newStockTree = 0;
		int newStockFlower = 0;
		int newStockDeco = 0;

		for (Product p : Repository.getItems()) {

			if (p.getCategory().equalsIgnoreCase("tree")) {
				newStockTree += p.getStock();
			}

			if (p.getCategory().equalsIgnoreCase("flower")) {
				newStockFlower += p.getStock();

			}

			if (p.getCategory().equalsIgnoreCase("deco")) {
				newStockDeco += p.getStock();

			}
		}

		currentStockDeco = "Categoría: deco, " + "stock: " + newStockDeco;
		currentStockFlower = "Categoría: flower, " + "stock: " + newStockFlower;
		currentStockTree = "Categoría: tree, " + "stock: " + newStockTree;

		System.out.println(currentStockTree + "\n" + currentStockFlower + "\n" + currentStockDeco);

	}

}
