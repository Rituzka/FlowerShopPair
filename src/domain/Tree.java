package domain;

public class Tree extends Product {
	float height;

	public Tree(int code, String name, String nameProduct, float price, int stock, float height) throws Exception {
		super(code, name, price, stock);
		
		if(height<=0) throw new Exception();
	
		this.height=height;
	}

	public  float getHeight() {
		return height;
	}

	public  void setHeight(float height) {
		this.height = height;
	}

	
}
