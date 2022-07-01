package mega;

public class Weekday {
	public void findDay(String day1) {
		if(day1.equalsIgnoreCase("monday")||day1.equalsIgnoreCase("tuesday")||day1.equalsIgnoreCase("wednesday")||day1.equalsIgnoreCase("thursday")||day1.equalsIgnoreCase("friday")) {
			System.out.println("weekday");
		}
		else {
			System.out.println("weekend");
		}
	}
	public void findDay(String day2,int month) {
		if(day2.equalsIgnoreCase("monday")||day2.equalsIgnoreCase("tuesday")||day2.equalsIgnoreCase("wednesday")||day2.equalsIgnoreCase("thursday")||day2.equalsIgnoreCase("friday")) {
			System.out.println("weekday");
		}
		else {
			System.out.println("weekend");
		}
		switch(month) {
		case 1:
			System.out.println("jan");
			break;
		case 2:
			System.out.println("feb");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("april");
			break;
		case 5:
			System.out.println("jan");
			break;
		case 6:
			System.out.println("feb");
			break;
		case 7:
			System.out.println("march");
			break;
		case 8:
			System.out.println("april");
			break;
		case 9:
			System.out.println("jan");
			break;
		case 10:
			System.out.println("feb");
			break;
		case 11:
			System.out.println("march");
			break;
		case 12:
			System.out.println("april");
			break;
			default:
				System.out.println("invalid");
		}
	}
}

			
			
			
		
		
	


