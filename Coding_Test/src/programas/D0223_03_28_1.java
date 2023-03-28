//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120818
package programas;

public class D0223_03_28_1 {
	public static void main(String[] args) {

	  int price = 580000;
	  int answer = price;
      price = price / 100000;
      if(price >=5) answer -= answer*0.2;
      else if (price>=3) answer -= answer*0.1;
      else if (price >=1) answer -= answer*0.05;
      System.out.println(answer);
	}
}
