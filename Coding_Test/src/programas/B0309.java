package programas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B0309 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		ArrayList  <Integer> arr= new ArrayList <Integer>();
		for(int i=1; i<=n; i++) {
			if(n%i==0) arr.add(n/i);
		}
		Collections.sort(arr);
		if(arr.size()<k)  System.out.println("0");
		else System.out.println(arr.get(k-1));
	}
}
