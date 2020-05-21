package domain;

public class Tree extends Product {
	float heigh;

	public Tree(int code, String name, String nameProduct, float price, int stock, float heigh) {
		
		super( code,  name,  price,  stock);
		this.heigh=heigh;
	}

	public  float getHeigh() {
		return heigh;
	}

	public  void setHeigh(float heigh) {
		this.heigh = heigh;
	}

	
}
