package test;

public class NumberPalindrome {
	public static void main(String[] args) {
		int n=131;
		int n1=n;
		int num=0;
		
		while(n>0) {
			int r=n%10;
			num=num*10+r;
			n=n/10;
		}
		
		if(n1==num) 
			System.out.println("palindrome");
		
		else 
			System.out.println("not palindrome");
		
	}

}
