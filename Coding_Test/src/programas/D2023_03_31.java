//문제: https://school.programmers.co.kr/learn/courses/30/lessons/120836
package programas;

public class D2023_03_31 {
	public static void main(String[] args) {
		int n = 100;
		int answer=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) answer++;
		}
		System.out.println(answer);
	}

}
