package Oops1;

public class UseCar {
	public static void main(String[] args) {
		Engine engine1=new Engine();
		engine1.setEngineNo(11020132);
		engine1.setEngineCc(900);
		Car car1=new Car();
		car1.setBrand("jackwar");
		car1.setPrice(200000);
		car1.setColor("red");
		car1.setEngine(engine1);
		System.out.println("CAR BRAND= "+car1.getbrand()+", "+"CAR PRICE= "+car1.getprice()
		+"CAR COLOR= "+car1.getColor()+", "+"Engine no= "
				+car1.getEngine().getEngineNo()+", "+"Engine cc="+car1.getEngine().getEngineCc());
	}

}
