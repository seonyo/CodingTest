//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120845
//블로그 : https://youngging2.tistory.com/37
package programas;
public class D2023_02_20 {
	public static void main(String[] args) {
		int box[] = {10,8,6}; //가로, 세로, 높이
		int n = 3; // 주사위 한 변의 길이
		Solution1 s1 = new Solution1();
		System.out.println(s1.solution(box, n));
	} 
}

class Solution1 {
    public int solution(int[] box, int n) {
        int answer = 0 ;
        return answer=(box[0]/n) * (box[1]/n) * (box[2]/n);
    }
}
