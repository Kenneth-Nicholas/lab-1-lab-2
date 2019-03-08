package lab1;

public class Lab1Number1 {

	public static void main(String[] args) {
		
		System.out.println(sumLimit(2, 3));
		System.out.println(sumLimit(8, 3));
		System.out.println(sumLimit(8, 1));
		
	}
	
	public static int sumLimit(int a, int b) {
		
		int sum = 0;
		
		if (a + b < 10) {
			
			sum = a + b;
			
		} else {
			
			sum = a;
			
		}
		
		return sum;
		
	}
}