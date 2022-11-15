package test;

public class ReverseSentence {
	public static void main(String[] args) {
		String s="hello good morning";
		String rev = "";
		
		String[] str = s.split(" ");
		for(int i=str.length-1;i>=0;i--) {
			rev=rev+" "+str[i];
			
		}
		System.out.println(rev);
	}

}
