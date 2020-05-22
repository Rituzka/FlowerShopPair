package main;

import controller.FlowerShopController;
import domain.Decoration;
import domain.Flower;
import domain.Tree;

public class FlowerShopMain {
	
	static FlowerShopController flowershop = new FlowerShopController("The BestFlower Shop");
	static Flower rosa;
	static Tree pino;
	static Decoration decoPlastic;

	
	public static void main(String[] args)throws Exception {
	
		 
		//creating Flower, Tree and Decoration objects with methods that added this products to the List
		rosa = flowershop.createFlower(rosa, 11, "Rosa", 35.50, 250, "rojo");
		decoPlastic = flowershop.createDecoration(decoPlastic, 21, "Decoracion plastico estándar", 350.50, 36, "plastic");
		pino = flowershop.createTree(pino, 31, "Pino", 58, 340, 1.70);
		
		//show current stock of all products
		flowershop.getCurrentStocks();
		
	}

}
