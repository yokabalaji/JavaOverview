package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmpName {
	public static void main(String[] args) {
		ArrayList<String> empName = new ArrayList<>();
		empName.add("schine");
		empName.add("shewak");
		empName.add("mithali");
		empName.add("kannan");
		empName.add("manikandan");
	// empName.stream().filter(x->x.contains("s")).forEach(x->System.out.println(x));
	// List<String>l=empName.stream().filter(x->x.contains("s")).collect(Collectors.toList());
	// l.forEach(z->System.out.println(z));
//	for(String s:l) {
	//	System.out.println(s);
//	}
		// empName.stream().filter(x->x.equals("kannan")).forEach(x->System.out.println(x.toUpperCase()));
		List<String>l=empName.stream().filter(x->x.equals("kannan")).collect(Collectors.toList());
	//	l.forEach(z->System.out.println(z.toUpperCase()));
		for(String s:l) {
			System.out.println(s.toUpperCase());
		}
	
	
}
}
