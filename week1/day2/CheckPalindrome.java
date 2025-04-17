package week1.day2;

public class CheckPalindrome {

	public static void main(String[] args) {
		int originalNum = 5672765;
		int rev = 0;
		
		for (int num = originalNum; num>0; num/=10)
		{
			rev = (rev * 10) + (num % 10);
		}

		if (originalNum == rev) {
			System.out.println(originalNum+ " is a Palindrome");
		}	
		else {
			System.out.println(originalNum+ " is not a Palindrome");
		}
	}
}