package domain;

public class Flower extends Product {
	
	String color;

	public Flower(int code, String name, double price, int stock, String color)throws Exception {
		
		super( code,  name,  price,  stock);
		this.color=color;

		if (color.equalsIgnoreCase(""));
		throw new Exception();

		
	}

	public  String getColor() {
		return color;
	}

	public  void setColor(String color) {
		this.color = color;
	}

}