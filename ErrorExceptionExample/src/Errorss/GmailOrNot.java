package Errorss;

public class GmailOrNot {
	public static void main(String[] args)throws GmailNot {
		String a="yogabalajigmail.com";
		try {
		if(a.contains("@")) {
			System.out.println("its gmail");
		}else {
			throw new GmailNot();
		}
		}catch(GmailNot gn) {
			System.out.println(gn);
			
			
		}
	}

}
