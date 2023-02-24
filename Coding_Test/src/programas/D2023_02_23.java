/*문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120823*/

package programas;
import java.util.Scanner;

public class D2023_02_23 {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        for(int i=1; i<=n; i++) {
	           System.out.println("*".repeat(i));
	        }
	}
}
