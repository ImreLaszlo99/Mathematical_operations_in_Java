package Dicesides;

public class Switch {

	public static void main(String[] args) {
		
		int discountPercentage = 0;
		
		int dayofweek = 4;
		
		switch (dayofweek) {
		case 6: 
			discountPercentage = 60;
			break;
		
		case 7:
			discountPercentage = 70;
			break;
			
		case 4:
			discountPercentage = 40;
			break;
		default:
			discountPercentage = 0;
			
		}
		
		System.out.println("kedvezmény = " + discountPercentage + "%");
	}
	
}
