package test;

import java.util.HashMap;

public class Count_digit_in_number {
	public static void main(String[] args) {
		String str = "808009696";
		char[] ch = str.toCharArray();
		
		HashMap<Character, Integer> hm=new HashMap<>();
		
		for(int i=0;i<ch.length;i++) {
			if(hm.containsKey(ch[i])) {
				hm.put(ch[i],hm.get(ch[i])+1);
		}
			else {
				hm.put(ch[i],1);
			}
		}
		System.out.println(hm);
	}

}
