package Stream;

public class Pen {
	String brand;
	int price;
	boolean isUseAndThrow;
	String color;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean getIsUseAndThrow() {
		return isUseAndThrow;
	}
	public void setUseAndThrow(boolean isUseAndThrow) {
		this.isUseAndThrow = isUseAndThrow;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Pen(String brand, int price, boolean isUseAndThrow, String color) {
		this.brand = brand;
		this.price = price;
		this.isUseAndThrow = isUseAndThrow;
		this.color = color;
	}
	

}
