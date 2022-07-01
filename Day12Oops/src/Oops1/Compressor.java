package Oops1;

public class Compressor {
	private String brand;
	private int price;
	private float capacity;
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
	public float getCapacity() {
		return capacity;
	}
	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}
	public Compressor(String brand, int price, float capacity) {
		super();
		this.brand = brand;
		this.price = price;
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Cbrand=" + brand + ", "+"price= "+ price + ", "+"capacity= "+ capacity;
	}
}
