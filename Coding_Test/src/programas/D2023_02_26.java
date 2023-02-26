/*문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120825*/
package programas;
class D0226{
    public String solution(String my_string, int n) {
        String answer = "";
        char temp[] = my_string.toCharArray();
        for(int i=0; i<my_string.length(); i++){
            for(int j=0; j<n; j++){
                answer+=temp[i];
            }
        }
        return answer;
    }
}

public class D2023_02_26 {
	public static void main(String[] args) {
		String my_string = "hello";
		int n = 3;
		D0226 s1 = new D0226();
		System.out.print(s1.solution(my_string, n));
	}
}
