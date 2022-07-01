package Oops1;

public class UseAccountHolder {
	public static void main(String[] args) {
		AccountHolder accountHolder1=new AccountHolder();
		accountHolder1.setAccountNumber(23455778);
		accountHolder1.setAccountHolderName("balaji");
		accountHolder1.setAccountBalance(258067.56f);
		System.out.println("Account number= "+accountHolder1.getAccountNumber()+", "+"Account hloder name= "+accountHolder1.getAccountHolderName()+", "+"accountbalance "+accountHolder1.getAccountBalance());
	}

}
