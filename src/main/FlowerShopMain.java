package main;

import controller.FlowerShopController;

public class FlowerShopMain {
	
	static FlowerShopController flowershop = new FlowerShopController("The BestFlower Shop");

	
	public static void main(String[] args)throws Exception {
		
		flowershop.createFlower(11, "Rosa", 35.50, 250, "rojo");
		flowershop.createDecoration(21, "Decoracion plastico estándar", 350.50, 36, "plastic");
		flowershop.createTree(31, "Pino", 58, 340, 1.70);
		

	}

}
