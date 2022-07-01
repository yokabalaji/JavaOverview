package day4;

public class IfCineLad {
	public static void main(String[] args) {
		float a=2.1f;
		if(a>=4) {
			System.out.println("its extraordinary");
		}
		else if(a>3&&a<4) {
			System.out.println("ordinary");
		}
		else if(a>2&&a<3) {
			System.out.println("normal");
		}
		else {
			System.out.println("waste");
		}
	}

}
