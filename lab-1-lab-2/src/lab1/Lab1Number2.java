package lab1;

public class Lab1Number2 {

	public static void main(String[] args) {
		
		System.out.println(squirrelPlay(70, false));
		System.out.println(squirrelPlay(95, false));
		System.out.println(squirrelPlay(95, true));
		
	}
	
	public static boolean squirrelPlay(int temp, boolean isSummer) {
		
		boolean arePlaying;
		
		if((temp >= 60) && (temp <= 90) && (!isSummer)) {
			
			arePlaying = true;
			
		} else if ((temp >= 60) && (temp <= 100) && (isSummer)) {
			
			arePlaying = true;
			
		} else {
			
			arePlaying = false;
			
		}
		
		return arePlaying;
		
	}
	
}