//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120843
package programas;
public class D2023_03_01 {

	public static void main(String[] args) {
		int numbers[]= {1,2,3,4,5,6};
		int index=0;
		int k = 5;
		for(int i=1; i<k; i++) {
			index+=2;
			if(index>=numbers.length) index=0;
		}
		System.out.println(numbers[index]);
	}

}
