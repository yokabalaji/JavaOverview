package Day16HashMap;

public class BankAccount {
	private long accountNumber;
	private String ifscCode;
	private String customerName;
	private int accountBalance;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public BankAccount(long accountNumber, String ifscCode, String customerName, int accountBalance) {
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.customerName = customerName;
		this.accountBalance = accountBalance;
	}

	public String toString() {
		return "BankAccount accountNumber=" + accountNumber + ", ifscCode=" + ifscCode + ", customerName="
				+ customerName + ", accountBalance=" + accountBalance;
}

}
