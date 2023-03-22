/*https://school.programmers.co.kr/learn/courses/30/lessons/120849*/
package programas;

public class D2023_03_22 {

	public static void main(String[] args) {
		String my_string = "nice to meet you";
		String answer = "";
		String vowel = "aeiou";
		
		  for(int i=0; i<my_string.length(); i++){
	            if(!vowel.contains(String.valueOf(my_string.charAt(i)))) {
	                answer+=my_string.charAt(i);
	            }
	      }
		  System.out.println(answer);
	}

}
