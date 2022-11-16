package test;

import java.util.HashMap;

public class CountVowels {
	public static void main(String[] args) {
		String s="welcome";
		//int count=0;
		char[] ch=s.toCharArray();
		
		HashMap<Character, Integer> hm=new HashMap<>();
		
		for(int i=0;i<ch.length;i++) {
		
			//v=s.charAt(i);
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				hm.put(ch[i],hm.get(ch[i])+1);
			}
			else {
				hm.put(ch[i],1);
			}
		}
		System.out.println(hm);
	}

}
