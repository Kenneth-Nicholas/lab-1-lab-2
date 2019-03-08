package lab1;

public class Lab1Number3 {

	public static void main(String[] args) {
		
		System.out.println(greenTicket(1, 2, 3));
		System.out.println(greenTicket(2, 2, 2));
		System.out.println(greenTicket(1, 1, 2));
		
	}
	
	public static int greenTicket(int a, int b, int c) {
		
		int result;
		
		if((a == b) && (b == c)) {
			
			result = 20;
			
		} else if ((a == b) || (b == c) || (a == c)) {
			
			result = 10;
			
		} else {
			
			result = 0;
			
		}
		
		return result;
		
	}
	
}