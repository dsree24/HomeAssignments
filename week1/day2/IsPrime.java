package week1.day2;

public class IsPrime {
	
	public static void main(String[] args) {
		int i =13;
		boolean isPrime = true;
		
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				isPrime = false;
				break;
			}
		}
		
		if (isPrime) {
			System.out.println(i + " is a prime number");
		}
		else {
			System.out.println(i + " is not a prime number");
		}
	}
}