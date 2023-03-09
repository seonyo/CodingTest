package programas;

public class D2023_03_07 {
	public static void main(String[] args) {
		int [] array = {9,11,12};
		int n = 10;
		int answer=0;
		int abs = Math.abs(array[0]-n);
		for(int i=0; i<array.length; i++) {
			if(Math.abs(array[i])>=abs) {
				if(Math.abs(array[i]-n)==abs && array[i]>answer) {
					System.out.println("kk");
				}
				else {
					answer = array[i];
				}
				abs = Math.abs(array[i]-n);
			}
		}
		System.out.println("답:" + answer);
	}
}