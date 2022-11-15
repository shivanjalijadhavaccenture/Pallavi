package test;

public class Word_in_alphabetical_order {
public static void main(String[] args) {
	String str = "monologue";
	char[] ch = str.toCharArray();
	//1st approach
	//for(int i=122;i>=97;i--) {//descending order-
/*		for(int i=97;i<122;i++) {//ascending order
		for(int j=0;j<ch.length;j++) {
			if(ch[j]==i) {
				System.out.print(ch[j]);
			}
		}
	}*/
		
		//2nd Approach
		for(int i=0;i<ch.length;i++) { //sorting logic
			for(int j=0;j<ch.length;j++) {
				//if(ch[i]<ch[j]) {//ascending order
					if(ch[i]>ch[j]) {//descending order
					char temp = ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					
				}
			}
		}
		
		for(char p:ch) {
			System.out.print(p);
		}
		/*for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}*/
}
}
