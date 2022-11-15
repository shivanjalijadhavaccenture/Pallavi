package test;

public class String_into_char_array {
	public static void main(String[] args) {
		String p="kantara";
		char[] ch=new char[p.length()];
		
		for(int i=0;i<p.length();i++) {
			ch[i]=p.charAt(i);
		}
		for(char c:ch) {
			System.out.print(c);
		}
	}

}
