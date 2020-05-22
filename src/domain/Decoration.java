package domain;

public class Decoration extends Product {

	private String material;

	public Decoration(int code, String name, double price, int stock, String material, String category) throws Exception {
		super(code, name, price, stock, category);

		this.material = material;

		if (material.equalsIgnoreCase("") && !material.equalsIgnoreCase("wood")
				&& !material.equalsIgnoreCase("plastic"))
			throw new Exception();
		if (!category.equalsIgnoreCase("deco"))
			throw new Exception();

	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
