package Collection;

import java.util.ArrayList;

public class Add {
	public static void main(String[] args) {
		ArrayList<Integer>id=new ArrayList<>();
		id.add(401);
		id.add(402);
		id.add(403);
		id.add(404);
		id.add(2,405);
		//id.remove(2);
		System.out.println(id);
	/*	for(int i=0;i<id.size();i++) {
			System.out.println(id.get(i));
			
		} */
	/*	for(Integer x:id) {
			System.out.println(x);
		}*/
	//	id.forEach((xy)->System.out.println(xy));
	//	id.forEach((xyz)->{if(xyz%2==0) {System.out.println(xyz+"even");}else{System.out.println(xyz+"odd");}});
	}

}
