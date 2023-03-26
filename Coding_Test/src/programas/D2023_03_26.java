//https://school.programmers.co.kr/learn/courses/30/lessons/120826
package programas;
public class D2023_03_26 {

	public static void main(String[] args) {
		String my_string = "abcdef";
		String letter = "f";
		
		my_string=my_string.replaceAll(letter, "");
		System.out.println(my_string);
	}

}
