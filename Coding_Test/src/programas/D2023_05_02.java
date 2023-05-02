package programas;

import java.awt.desktop.PrintFilesEvent;

public class D2023_05_02 {
	public static void main (String args[]) {
		String myString = "PrOgRaMmErS";
		String answer = "";
		char ch[] = myString.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(ch[i]=='a') ch[i] = 'A';
			else if(ch[i]<=90 && Character.isAlphabetic(ch[i])){
				ch[i]=(char) (ch[i]+32);
			}
		}
		answer = String.valueOf(ch);
		System.out.println(answer);
	}

}
