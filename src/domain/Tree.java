package domain;

public class Tree extends Product {
	
	private double height;
	
	
	public Tree(int code, String name, double price, int stock, double height, String category) throws Exception {
		super(code, name, price, stock, category);
		
		if(height<=0)
			throw new Exception();
		if(!category.equalsIgnoreCase("tree"))
			throw new Exception();

		this.height = height;
	
	}

	public  double getHeight() {
		return height;
	}

	public  void setHeight(double height) {
		this.height = height;
	}
	
}
