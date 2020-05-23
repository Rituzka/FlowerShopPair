package main;

import controller.FlowerShop;
import domain.Decoration;
import domain.Flower;
import domain.Tree;

public class FlowerShopMain {
	
	private static FlowerShop flowershop = new FlowerShop("The BestFlower Shop");
	private static Flower rosa;
	private static Tree pino;
	private static Decoration decoPlastic;
	private static Flower jasmin;
	private static Tree abeto;

	
	public static void main(String[] args)throws Exception {
	
		 
		//creating Flower, Tree and Decoration objects with methods that added this products to the List
		rosa = flowershop.createFlower(rosa, 11, "Rosa", 35.50, 250, "rojo", "flower");
		decoPlastic = flowershop.createDecoration(decoPlastic, 21, "Decoracion plastico estándar", 350.50, 5, "plastic", "deco");
		pino = flowershop.createTree(pino, 31, "Pino", 58.40, 350, 1.70, "tree");
		jasmin = flowershop.createFlower(jasmin, 12, "Jasmin blanco", 2.50, 60, "blanco", "flower");
		abeto = flowershop.createTree(abeto, 32, "Abetus enormus", 79.50, 40, 1.80, "tree");
		
		System.out.println("STOCK POR PRODUCTO");
		
		//show current stock of each product
		flowershop.getCurrentStocks();
		
		System.out.println("\n"+"STOCK POR CATEGORÍA");
		
		//show stock by categories
		flowershop.getStocksByCategory();
		
	}

}
