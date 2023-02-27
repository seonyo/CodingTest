//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120887
package programas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D2023_02_27 {

	public static void main(String[] args) {
		 int answer = 0;
		 int i = 1, j = 13, k = 1;
		 for(int f=i; f<=j; f++){
	        String split[] = Integer.toString(f).split(""); 
  		 	for(int s=0; s<split.length; s++) {
  		 	 if(split[s].equals(Integer.toString(k))) { 
				 answer++; 
			 }
  		 	}
	      }
	        System.out.println("답 : " + answer);
	}

}
