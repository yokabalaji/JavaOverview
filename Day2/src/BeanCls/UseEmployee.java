package BeanCls;

public class UseEmployee {
	public static void main(String[] args) {
		Employee a=new Employee();
		a.employeeId=789654;
		a.employeeName="yoga";
		a.dateOfBirth="17.04.1998";
		a.mobileNo=5885556555l;
		a.country=" +91 "+a.mobileNo;
		Employee a1=new Employee();
		a1.employeeId=789654;
		a1.employeeName="bala";
		a1.dateOfBirth="17.05.1998";
		a1.mobileNo=5885555555l;
		a1.country=" +91 "+a1.mobileNo;
		System.out.println("id:"+a.employeeId+"name:"+a.employeeName+"dob:"+a.dateOfBirth+"mob no:"+a.mobileNo+"country code"+a.country);
		System.out.println("id:"+a1.employeeId+"name:"+a1.employeeName+"dob:"+a1.dateOfBirth+"mob no:"+a1.mobileNo+"country code"+a1.country);
	}

}
