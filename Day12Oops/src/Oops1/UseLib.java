package Oops1;

public class UseLib {
	public static void main(String[] args) {
		Book b=new Book("secret");
		Library l=new Library(b);
		System.out.println(l);
	}

}
