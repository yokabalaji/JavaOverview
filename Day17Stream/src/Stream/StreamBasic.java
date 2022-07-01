package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBasic {
	public static void main(String[] args) {
		ArrayList<String> empName = new ArrayList<>();
		empName.add("schine");
		empName.add("shewak");
		empName.add("mithali");
		empName.add("kannan");
		empName.add("manikandan");
		// empName.stream().map(x->x.toUpperCase()).forEach(y->System.out.println(y));
		// empName.stream().map(x->x.length()>6).forEach(y->System.out.println(y));
		// empName.stream().map(x->x.charAt(x.length()-1)).forEach(y->System.out.println(y));
		// empName.stream().map(x->x.startsWith("s")).forEach(y->System.out.println(y));
// List<String>l=empName.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
 //l.forEach(x->System.out.println(x));
//		for(String s:l) {
		// System.out.println(s);
		// }
		// List<Boolean>l=empName.stream().map(x->x.length()>6).collect(Collectors.toList());
		// l.forEach(x->System.out.println(x));
		// for(boolean s:l) {
		// System.out.println(s);
	//	List<Character> l = empName.stream().map(x -> x.charAt(x.length() - 1)).collect(Collectors.toList());
		// l.forEach(x->System.out.println(x));
	//	for (Character s : l) {
	//		System.out.println(s);
	//	}
	}

}
