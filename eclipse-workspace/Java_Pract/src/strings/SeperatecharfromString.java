package strings;

public class SeperatecharfromString {
	
	public static void main(String[] args) {
		String str= "sf2WDF1%@hs32@f@&Fjds";
		String upper="";
		String lower="";
		String spec="";
		String num="";
		System.out.println(str.length());
		for (int i=0;i<str.length();i++) {
			
			char ch =str.charAt(i);
			
			if(ch>= 'A' && ch<='Z') {
				upper+=ch;
			}
			else if(ch>='a' && ch<='z') {
				lower+=ch;
			}
			else if(ch>='0' && ch<='9') {
				num+=ch;
			}
			else {
				spec+=ch;
			}
		}
		
		System.out.println("Upper Letter- "+ upper+ " : no of letters : "+upper.length());
		System.out.println("Lower Letter- "+ lower+ " : no of letters : "+lower.length());
		System.out.println("Numbers- "+ num+ " : no of letters : "+num.length());
		System.out.println("Special Letter- "+ spec + " : no of letters : "+spec.length());
	}

}
