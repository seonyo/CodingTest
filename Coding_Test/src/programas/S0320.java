/*문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120888*/
package programas;

public class S0320 {
	public static void main(String[] args) {
		String my_string = "We are the World";
		String answer = "";
		for(int i=0; i<my_string.length(); i++) {
			if(i == my_string.indexOf(my_string.charAt(i)))
				answer +=my_string.charAt(i);
		}
		System.out.println(answer);
	}
}
