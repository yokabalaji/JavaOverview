package Basics;

public class Usebean {
	public static void main(String[] args) {
		Beanfun a1=new Beanfun();
		a1.a=20;
		a1.ae=30;
		a1.b=2.5f;
		a1.c=6.8999;
		a1.d=12345678l;
		a1.e="yoka";
		a1.f=a1.a>a1.ae;
		System.out.println(a1.a+"," +a1.b+","+a1.c+","+ a1.f);
	}

}
