package Dicesides;

public class While {

	public static void main(String[] args) {
		
		int[] Fibonucci = new int[10];
		Fibonucci[0] = 1;
		Fibonucci[1] = 1;
		
		int k = 2;
		while (k < 10) {
			Fibonucci[k] = Fibonucci[k - 1] + Fibonucci[k - 2];
			k++;
			
		}
		
		System.out.println(java.util.Arrays.toString(Fibonucci));
	}
	
	
}
