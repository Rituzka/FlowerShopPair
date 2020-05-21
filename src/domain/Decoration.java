package domain;

public class Decoration extends Product  {
	
	String material;

	public Decoration(int code, String name, float price, int stock, String material) throws Exception {
		
		super( code,  name,  price,  stock);
		
		this.material=material;
		
		if (material.equalsIgnoreCase("") && !material.equalsIgnoreCase("wood") && !material.equalsIgnoreCase("plastic"));        
			throw new Exception();
		
	}

	public  String getMaterial() {
		return material;
	}

	public  void setMaterial(String material) {
		this.material = material;
	}
	

}
