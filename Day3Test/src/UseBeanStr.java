
public class UseBeanStr {
	public static void main(String[] args) {
		BeanStr car1=new BeanStr();
		BeanStr car2=new BeanStr();
		BeanStr car3=new BeanStr();
		car1.brand="Bmw";
		car2.brand="tata";
		car3.brand="swift";
		car1.model="XVI";
		car2.model="IX";
		car3.model="X2V";
		car1.price=400000;
		car2.price=300000;
		car3.price=200000;
		car1.ispetrol=false;
		car2.ispetrol=true;
		car3.ispetrol=true;
		car3.tot=car1.price+car2.price+car3.price;
		System.out.println(car1.brand.length()+" "+car1.brand.toUpperCase()+" "+car1.price+" "+car1.ispetrol);
		System.out.println(car2.brand.length()+" "+car2.brand.toUpperCase()+" "+car2.price+" "+car2.ispetrol);
		System.out.println(car3.brand.length()+" "+car3.brand.toUpperCase()+" "+car3.price+" "+car3.ispetrol);
		System.out.println("tot ="+ car3.tot);
		
	     
		
	}

}
