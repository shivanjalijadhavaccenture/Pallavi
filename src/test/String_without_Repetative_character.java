package test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class String_without_Repetative_character {
	
		public static void main(String[] args ){
			 
		       String d="coconut";
		      
		      // HashSet<Character> hs=new HashSet<>();//it will give data in random order
		       LinkedHashSet<Character> lhs=new LinkedHashSet<>();//it will maintain order of input
		      // TreeSet<Character> ts=new TreeSet<>();//it will give o/p in ascending order
		       
		       for(int i=0;i<d.length();i++) {
		    	   lhs.add(d.charAt(i));
		    	   
		       }
		       
		       System.out.println(lhs);
		       
	         StringBuilder sb=new StringBuilder();
	         for(Character c:lhs) {
	        	 sb.append(c);
	         }
	         System.out.println(sb);
}
}
