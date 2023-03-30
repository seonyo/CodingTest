package programas;

public class D2023_03_30 {

	public static void main(String[] args) {
		int slice = 7;
		int n =10;
		int answer = (n%slice==0) ? n/slice : n/slice+1; 
		System.out.println(answer);
	}

}
