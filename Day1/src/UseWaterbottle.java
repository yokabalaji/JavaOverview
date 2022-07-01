
public class UseWaterbottle {
	public static void main (String[]args) {
		Waterbottle bottle =new Waterbottle();
		bottle.colour=args[0];
		bottle.material=args[1];
		bottle.price=Integer.parseInt(args[2]);
		System.out.println("Colour="+bottle.colour+","+" Material="+bottle.material+","+" Price="+bottle.price);
}
}
