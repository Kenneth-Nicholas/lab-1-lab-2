package lab1;

public class Lab1Number5 {
	
	public static void main(String[] args) {
		
		System.out.println(stringTimes("Hi", 2));
		System.out.println(stringTimes("Hi", 3));
		System.out.println(stringTimes("Hi", 1));
		
	}
	
	public static String stringTimes(String string, int n) {
		
		String result = "";
		
		for(int i = 0; i < n; i++) {
			
			result += string;
			
		}
		
		return result;
		
	}
	
}