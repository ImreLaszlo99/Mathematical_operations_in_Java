package Math_ops;

public class Mathematical_Operations {

	public static void main(String[] args) {
		
		
		//the basic numbers
		int a = 2;
		int b = 3;
		
		System.out.println("The basic values of the basic variables:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		
		//basic mathematical operations
		int c = a + b;
		int d = a * b;
		int e = a / b;
		int f = b / a;
		int g = a - b;
		int h = b - a;
		
		System.out.println("The results of the mathematical operations are the followings:");
		System.out.println("a + b = " + c);
		System.out.println("a * b = " + d);
		System.out.println("a / b = " + e);
		System.out.println("b / a = " + f);
		System.out.println("a - b = " + g);
		System.out.println("b - a = " + h);
		
		
		// is greater? 
		int isAgreaterThanB = a >= b ? a : b;
		int isBgreaterThanA = b >= a ? b : a;
		
		System.out.println("Check which one of the basic variables is the greater one. Results are below:");
		System.out.println("is A greater than B? =" + isAgreaterThanB);
		System.out.println("is B greater than A? =" + isBgreaterThanA);
		
		
		//unary prefix
		int k = 5;
		
		System.out.println("Lets check together what does the unary prefix looks like and how does it work:");
		System.out.println("positive prefix: ++k =" + ++k);
		System.out.println("negative prefix: --k =" + --k);
		
		//unary postfix
		int j = 4;
		
		System.out.println("Now lets check together the same, just with postfix");
		System.out.println("positive postfix: j++ =" + j++);
		System.out.println("negative postfix: j-- =" + j--);
	}
	
	
	
}
