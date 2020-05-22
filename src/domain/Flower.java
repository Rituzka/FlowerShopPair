package domain;

public class Flower extends Product {

	private String color;

	public Flower(int code, String name, double price, int stock, String color, String category) throws Exception {
		super(code, name, price, stock, category);

		if (color.equals(""))
			throw new Exception();

		if (!category.equalsIgnoreCase("flower"))
			throw new Exception();

		this.color = color;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}