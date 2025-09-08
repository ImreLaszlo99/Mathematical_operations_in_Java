package Dicesides;

public class Switch2 {

	public static void main(String[] args) {
		
		int dayofweek = 4;
		
		int discountPercentage = 0;
		
		switch (dayofweek) {
		case 1:
			discountPercentage = 40;
			break;
		
		case 2:
			discountPercentage = 60;
			break;
			
		case 4:
			discountPercentage = 70;
			break;
			
		default:
			discountPercentage = 0;
			break;
		
	}
	
	System.out.println("Kedzevezmény =" + discountPercentage + "%");
	
}
}