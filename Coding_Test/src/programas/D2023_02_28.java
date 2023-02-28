package programas;

import java.util.Arrays;

public class D2023_02_28 {

	public static void main(String[] args) {
		String s = "abcabcadc";
		String answer="";
		String arr [] = s.split("");
		Arrays.sort(arr);
		int cnt=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i].equals(arr[j])) cnt++;
			}
			if(cnt==1) answer+=arr[i];
			cnt=0;
		}
		
		System.out.println("정답 : " + answer);
	}
}
