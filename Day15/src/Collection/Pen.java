package Collection;
import java.util.ArrayList;

public class Pen {
	public static void main(String[] args) {
		ArrayList<String>brandName=new ArrayList<>();
		brandName.add("Hero");
		brandName.add("campline");
		brandName.add("stylish");
		brandName.add(2,"france");
		brandName.add("cello");
	//	System.out.println(brandName);
		String a="";
		int max=0;
	//	for(int i=0;i<brandName.size();i++) {
		//	a+=brandName.get(i);
		//	System.out.println(brandName.get(i));
	//	}
		//	System.out.println(a);
	/*	for(String x:brandName) {
			if(x.length()>max) {
				max=x.length();
				a=x;
			}
		}*/
		brandName.forEach((xy)->System.out.println(xy));
		}
		
	}
