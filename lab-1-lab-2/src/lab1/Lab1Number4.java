package lab1;

public class Lab1Number4 {

	public static void main(String[] args) {
		
		System.out.println(countXX("abcxx"));
		System.out.println(countXX("xxx"));
		System.out.println(countXX("xxxx"));
		
	}
	
	public static int countXX(String string) {
		
		int result = 0;
		
		for(int i = 0; i < string.length() - 1; i++) {
			
			if(string.substring(i, i + 2).equals("xx")) {
				
				result ++;
				
			}
			
		}
		
		return result;
		
	}
	
}