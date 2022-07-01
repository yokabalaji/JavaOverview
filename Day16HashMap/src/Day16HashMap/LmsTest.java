package Day16HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class LmsTest {
	public static void main(String[] args) {
		HashMap<Integer,String>testDetails=new HashMap<>();
		testDetails.put(21,"siva");
		testDetails.put(22,"Priya");
		testDetails.put(23,"sagunthala");
		testDetails.put(24,"ranjani");
//	System.out.println(testDetails);
	//	testDetails.remove(22);
	//	System.out.println(testDetails);
	//	System.out.println(testDetails.keySet());
	//	System.out.println(testDetails.values());
//for(Integer i:   testDetails.keySet()) {
	//System.out.println(i);
//}
//for(String x:testDetails.values()) {
	//System.out.println(x);
//}
	//	for(Integer x:testDetails.keySet()) {
		//	String value=testDetails.get(x);
	//		System.out.println(value+" "+x);
	//	}
	//	testDetails.keySet().forEach(x->System.out.println(x));
	//	testDetails.values().forEach(y->System.out.println(y));
	//	testDetails.forEach((x,y)->System.out.println(y+"  "+x));
	//	Iterator<String>i=testDetails.values().iterator();
	//	while(i.hasNext()) {
	//	System.out.println(i.next());
	//	Iterator<Integer>x=testDetails.keySet().iterator();
	//	while(x.hasNext()) {
	//		System.out.println(x.next());
			Iterator<String>y=testDetails.values().iterator();
			while(y.hasNext()) {
				if(y.next().toLowerCase().contains("p")) {
					y.remove();
				}
		
	}
			System.out.println(testDetails.values());

}
}
