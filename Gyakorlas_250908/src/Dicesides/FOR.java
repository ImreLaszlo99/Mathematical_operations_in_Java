package Dicesides;

public class FOR {

	public static void main(String[] args) {
		
		int[] Fibonucci = new int[20];
		Fibonucci[0] = 1;
		Fibonucci[1] = 1;
		
		for ( int i =2; i < 20; i++) {
			Fibonucci[i] = Fibonucci[i - 1] + Fibonucci[i - 2];
		}
		System.out.println(java.util.Arrays.toString(Fibonucci));
	}
	
	
}
