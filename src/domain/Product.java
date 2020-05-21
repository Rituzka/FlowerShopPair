package domain;

public class Product {
	
	protected  int code;
	protected  String name;
	protected float price;
	protected int stock;
	
	public Product(int code, String name, float price, int stock)throws Exception {

		if (code==0)
			throw new Exception();
		if (name.equals(""))
			throw new Exception();
		if (price == 0)
			throw new Exception();
		
		this.code = code;
		this.name= name;
		this.price = price;
		this.stock = stock;
		
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
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
