package domain;

public class Decoration extends Product  {
	
	String material;

	public Decoration(int code, String name,String nameProduct, float price, int stock, String material) {
		
		super( code,  name,  price,  stock);
		
		this.material=material;
	}

	public  String getMaterial() {
		return material;
	}

	public  void setMaterial(String material) {
		this.material = material;
	}
	

}
