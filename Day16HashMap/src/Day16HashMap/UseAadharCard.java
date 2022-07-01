package Day16HashMap;
import java.util.HashMap;
import java.util.Iterator;

public class UseAadharCard {
	public static void main(String[] args) {
		AadharCard person1=new AadharCard(63545656894567l,"balaji",40);
		AadharCard person2=new AadharCard(63545655435367l,"sagunthala",45);
		AadharCard person3=new AadharCard(545656894567l,"ranjani",20);
		HashMap<Long,AadharCard>aadharDetails=new HashMap<>();
		aadharDetails.put(person1.getAadharNumber(),person1);
		aadharDetails.put(person2.getAadharNumber(),person2);
		aadharDetails.put(person3.getAadharNumber(),person3);
		int max=0;
		for(AadharCard x:aadharDetails.values()) {
			if(x.getPersonAge()>max) {
				max=x.getPersonAge();
				}
		}
		System.out.println(max);
		aadharDetails.values().forEach((y)->System.out.println(y.getPersonName().substring(1,y.getPersonName().length()-1)));
		Iterator<AadharCard>b=aadharDetails.values().iterator();
		while(b.hasNext()) {
		if(b.next().getPersonAge()<40) {
			b.remove();
	}
		}
		System.out.println(aadharDetails.values());
		for(AadharCard z:aadharDetails.values()) {
			System.out.println(z.getPersonName());
		}
	}
}
