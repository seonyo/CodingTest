/*문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120846*/
package programas;
public class D2023_02_24 {
	public static void main(String[] args) {
		  int answer = 0;
	        int n=15, num=1, cnt=0;
	        for(int i=4; i<=n; i++){
	            while (true){
	                if(i%num==0){
	                    cnt++; //약수 개수 세기
	                }
	                num++; // 나눠질 수 
	                if(cnt==3) {
	                	cnt=0; num=1; answer++;	 
	                	break;
	                }
	                if(num>i) {
	                	cnt=0; num=1;
	                	break;
	                }
	            }            
	        }
	        System.out.println(answer);
	}

}
