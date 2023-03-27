//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120834
package programas;
public class D2023_03_27 {

	public static void main(String[] args) {
		int age = 23;
		String answer="";
		String temp = Integer.toString(age);
		int arr[] = new int [temp.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = temp.charAt(i) - '0';
			answer += (char)(arr[i]+97);
		}
		System.out.println(answer);
	}
}
