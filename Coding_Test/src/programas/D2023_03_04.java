//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120835
package programas;
public class D2023_03_04 {

	public static void main(String[] args) {
		int [] emergency = {30, 10, 23, 6, 100};
		int [] answer = new int [emergency.length];
		int cnt = 1;
		 for(int i=0; i<emergency.length; i++) {
			 for(int j=0; j<emergency.length; j++) {
				 if(emergency[i] < emergency[j]) cnt++;
			 }
			 answer[i]=cnt;
			 cnt=1;
		 }
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
}
