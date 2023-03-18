package programas;

import java.util.Arrays;

public class D2023_03_07 {
	public static void main(String[] args) {
		int [] array = {8,9,8}; int n = 9;
		int abs = Math.abs(array[0]-n); //0번방의 절댓값.
		Arrays.sort(array);
		int answer=array[0];
		for(int i=0; i<array.length; i++) {
			if(Math.abs(array[i]-n)<=abs) { //array[i]와 abs의 절댓값을 비교하여 작거나 같으면
				abs=Math.abs(array[i]-n); //abs값 더 작은 것으로 초기화시킴
				if(i!=0&&Math.abs(answer-n)==abs) continue; //절댓값이 같다면 continue 시켜주기
				answer = array[i]; //answer=array[i] 로 answer값도 초기화.
			}
		}
		System.out.println("답:" + answer);
	}
}