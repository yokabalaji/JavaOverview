package Oops1;

public class UseAc {
	public static void main(String[] args) {
		String a[]=args[0].split(",");
		String b[]=args[1].split(",");
		Compressor com=new Compressor(a[0],Integer.parseInt(a[1]),Float.parseFloat(a[2]));
		Ac ac=new Ac(b[0],Integer.parseInt(b[1]),Boolean.parseBoolean(b[2]),com);
		System.out.println(ac+","+com);
		
	}

}
