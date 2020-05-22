package domain;

public class Tree extends Product {
	double height;

	public Tree(int code, String name, double price, int stock, double height) throws Exception {
		super(code, name, price, stock);
		
		if(height<=0) throw new Exception();
	
		this.height = height;
	}

	public  double getHeight() {
		return height;
	}

	public  void setHeight(double height) {
		this.height = height;
	}

	
}
