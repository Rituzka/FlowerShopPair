package domain;

public class Flower extends Product {
	
	String color;

	public Flower(int code, String name, String nameProduct, float price, int stock, String color) {
		
		super( code,  name,  price,  stock);
		this.color=color;


		
	}

	public  String getColor() {
		return color;
	}

	public  void setColor(String color) {
		this.color = color;
	}

}