package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsePen {
public static void main(String[] args) {
	Pen p1=new Pen("cello",20,false,"blue");
	Pen p2=new Pen("renold",24,true,"yellow");
	Pen p3=new Pen("hero",27,true,"red");
	Pen p4=new Pen("razar",14,false,"red");
	Pen p5=new Pen("flair",22,true,"green");
	ArrayList<Pen>penDetails=new ArrayList<>();
	penDetails.add(p1);
	penDetails.add(p2);
	penDetails.add(p3);
	penDetails.add(p4);
	penDetails.add(p5);
	// penDetails.stream().map(x->x.getColor().toUpperCase()).forEach(x->System.out.println(x));
//	List<String>l1=penDetails.stream().map(x->x.getColor().toUpperCase()).collect(Collectors.toList());
//	l1.forEach(x->System.out.println(x));
//	for(String s:l1) {
//		System.out.println(s);
//	}
//	List<Pen>l2=penDetails.stream().filter(x->x.getIsUseAndThrow()==true).collect(Collectors.toList());
//	l2.forEach(x->System.out.println(x.getBrand()));
//	for(Pen s:l2) {
	//	System.out.println(s.getBrand());
//	penDetails.stream().filter(x->x.getIsUseAndThrow()==true).forEach(x->System.out.println(x.getBrand()));
//	penDetails.stream().filter(x->x.getIsUseAndThrow()==false&&x.getColor().equalsIgnoreCase("blue")).forEach(x->System.out.println(x.getBrand().toUpperCase()));
	List<Pen>l3=penDetails.stream().filter(x->x.getIsUseAndThrow()==false&&x.getColor().equalsIgnoreCase("blue")).collect(Collectors.toList());
//	l3.forEach(x->System.out.println(x.getBrand().toUpperCase()));
//	for(Pen s:l3) {
	//	System.out.println(s.getBrand().toUpperCase());
//	}
	//List<Pen>l4=penDetails.stream().filter(x->x.getBrand().contains("o")).collect(Collectors.toList());
//  l4.forEach(x->System.out.println(x.getPrice()*x.getPrice()));
//for(Pen s:l4) {
//	System.out.println(s.getPrice()*s.getPrice());
	
//}
//	penDetails.stream().filter(x->x.getBrand().contains("o")).forEach(x->System.out.println(x.getPrice()*x.getPrice()));
//	penDetails.stream().map(x->x.getBrand().toUpperCase()).forEach(x->System.out.println(x.substring(1,x.length()-1)));
//	List<String>l5=penDetails.stream().map(x->x.getBrand().toUpperCase()).collect(Collectors.toList());
//	l5.forEach(x->System.out.println(x.substring(1,x.length()-1)));
	//for(String c:l5) {
//		System.out.println(c.substring(1,c.length()-1));
		
//	}
 //  long a=penDetails.stream().count();
 //   System.out.println(a);
	// long b=penDetails.stream().map(x->x.getPrice()+10).count();
//	System.out.println(b);
//	long c=penDetails.stream().filter(x->x.getBrand().contains("l")).count();
//	System.out.println(c);
//	List<Integer>l=penDetails.stream().filter(x->x.getPrice()>20).map(y->y.getColor().length()).collect(Collectors.toList());
//	l.forEach(z->System.out.println(z));
//	for(Integer s:l) {
	//	System.out.println(s);
//	penDetails.stream().filter(x->x.getPrice()>20).map(y->y.getColor().length()).forEach(x->System.out.println(x));
	}
	
}
	
	
