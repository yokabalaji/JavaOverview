
public class Splity {
	public static void main (String[]args) {
		String a="Java,PYTHON,C++";
		String []b=a.split(",");
		String []c= {"JAVA,PYTHON,C++"};
		System.out.println("split fun: "+b[0]+b[1]+b[2]);
		System.out.println("array length "+b.length);
		System.out.println("string length "+a.length());
		System.out.println("Str lower case "+a.toLowerCase());
		System.out.println("array upper case:");
	}

}
