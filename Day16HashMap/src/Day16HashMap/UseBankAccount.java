package Day16HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class UseBankAccount {
	public static void main(String[] args) {
		BankAccount details1=new BankAccount(00000000001,"ICIC000123","prakash",2800);
		BankAccount details2=new BankAccount(00000000002,"HDFC000123","balaji",1200000);
		BankAccount details3=new BankAccount(00000000003,"AXIS000123","sagunthala",3884656);
		BankAccount details4=new BankAccount(1245556474,"ICIC000123","ranjani",2800);
		HashMap<Long,BankAccount>accountDetails=new HashMap<>();
		accountDetails.put(details1.getAccountNumber(),details1);
		accountDetails.put(details2.getAccountNumber(),details2);
		accountDetails.put(details3.getAccountNumber(),details3);
		accountDetails.put(details4.getAccountNumber(),details4);
		// Enhanced for: only accountNumber
		
	//	for(Long i:accountDetails.keySet()) {
		//	System.out.println(i);
	//	} 
		// Enhanced for loop only String 
	//	for(BankAccount x:accountDetails.values()) {
		//	System.out.println(x);
	//	}
		//for each print
	//	accountDetails.keySet().forEach(y->System.out.println(y));
	//	accountDetails.values().forEach(z->System.out.println(z));
		// Iterator
		Iterator<BankAccount>b=accountDetails.values().iterator();
		while(b.hasNext()) {
		if(b.next().getAccountBalance()<5000) {
			b.remove();
		}
	}
		System.out.println(accountDetails.values());

	}
}
