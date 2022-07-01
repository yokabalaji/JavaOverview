package Oops1;

public class UseHuman {
	public static void main(String[] args) {
		Human human = new Human();
		human.setName("bala");
		human.setAge(24);
		human.setColor("black");
		System.out.println("Human Name" + human.getName() + "," + " Human Age" + human.getAge() + "," + " Human Color"
				+ human.getColor());

	}

}
