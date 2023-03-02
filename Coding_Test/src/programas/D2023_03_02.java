package programas;

import java.util.Arrays;
import java.util.stream.Stream;

public class D2023_03_02 {

	public static void main(String[] args) {
		String my_string = "hi12392";		
		//방법 1
		int [] answer = new int [my_string.length()];
		int temp = Integer.parseInt(my_string.replaceAll("[^0-9]", ""));
		answer=Stream.of(String.valueOf(temp).split("")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(answer);
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]);
		}
		
		System.out.println();
		
		//방법 2
		my_string = my_string.replaceAll("[^0-9]", "");
		for(int i=0; i<my_string.length(); i++) {
			answer[i] = my_string.charAt(i) - '0';
		}
		Arrays.sort(answer);
		
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]);
		}

	}

}
