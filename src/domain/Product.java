package domain;

public class Product {
	
	protected  int code;
	protected  String name;
	protected double price;
	protected int stock;
	protected String category;
	
	public Product(int code, String name, double price, int stock, String category)throws Exception {

		if (code<=0)
			throw new Exception();
		if (name.equals(""))
			throw new Exception();
		if (price <= 0)
			throw new Exception();
		
		this.code = code;
		this.name= name;
		this.price = price;
		this.stock = stock;
		this.category = category;
		
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public String getCategory() {
		return category;
	}
	
	
	public void currentStockAfterSales(int quantitySale) {
		int currentStock = stock;
		int finalStock = 0;
		
		finalStock = currentStock - quantitySale;
		setStock(finalStock);
		
	}
	
	public void restocking(int newStock) {
		int currentStock = stock;
		int finalStock = 0;
		
		finalStock = currentStock + newStock;
		setStock(finalStock);
	}

}
