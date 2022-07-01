package BeanCls;

public class UseAccountHolder {
	public static void main(String[]args) {
		AccountHolder a=new AccountHolder();
		AccountHolder a1=new AccountHolder();
		AccountHolder a2=new AccountHolder();
		a.name="mano";
		a1.name="savithri";
		a2.name="kamban";
		a.age=26;
		a1.age=25;
		a2.age=30;
		a.gender="male";
		a1.gender="female";
		a2.gender="male";
		a.accountNumber=28330485612583l;
		a1.accountNumber=28330485612584l;
		a2.accountNumber=28330485612585l;
		a.monthlyIncome=21000;
		a1.monthlyIncome=20000;
		a2.monthlyIncome=30000;
		a.savingsPercentage=18;
		a1.savingsPercentage=20;
		a2.savingsPercentage=10;
		a.savingAmt=a.monthlyIncome*a.savingsPercentage/100;
		a1.savingAmt=a1.monthlyIncome*a1.savingsPercentage/100;
		a2.savingAmt=a2.monthlyIncome*a2.savingsPercentage/100;
		System.out.println()
		
	}

}
