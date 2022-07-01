package Bank;

public class UseShop {
	public static void main(String[] args) {
		Shop s=new Shop();
		System.out.println(s.displayPrice(2500)+","+s.displayPublication(2022)+","+s.getGenre("reete"));
	}

}
