package programas;

public class D2023_04_05 {
	public static void main(String[] args) {
		int num [] = {0, -31, 24, 10, 1, 9};
		int answer=0;
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num.length; j++) {
				if(i!=j && answer<num[i]*num[j]) answer=num[i]*num[j];
			}
		}
		System.out.println(answer);
	}
}
