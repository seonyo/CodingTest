package programas;

public class test7 {
	public static void main(String[] args) {
		String quiz [] = {"3 - 4 = -3", "5 + 6 = 11"};
		String[] answer = {};
		for(int i=0; i<quiz.length; i++) {
			if(quiz[i].charAt(2)=='+') {
				System.out.println(i);
			}
		}

	}
}
