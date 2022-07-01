package Oops1;

public class AccountHolder {
	private int accountNumber;
	private String accountHolderName;
	private float accountBalance;
	public void setAccountNumber(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	public int getAccountNumber() {
	return accountNumber;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName=accountHolderName;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountBalance(float accountBalance) {
		this.accountBalance=accountBalance;
	}
	public float getAccountBalance() {
		return accountBalance;
	}
}
