package programas;

public class D2023_03_23 {

	public static void main(String[] args) {
		int order = 29423;
		int answer = 0;
		String str = Integer.toString(order);
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)%3==0 && str.charAt(i)!=48) answer++;
		}
		System.out.println(answer);
	}

}
