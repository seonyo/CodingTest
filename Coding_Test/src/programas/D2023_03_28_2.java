package programas;

public class D2023_03_28_2 {
	public static void main(String[] args) {
		String my_string="aAb1B2cC34oOp";
		int answer=0;
		
		for(int i=0; i<my_string.length(); i++) {
			if(Character.isDigit(my_string.charAt(i))) {
				answer+= my_string.charAt(i) - '0';
				System.out.println("인덱스 값 : "+ my_string.charAt(i)+ " 답 : "+ answer);
			}
		}
		System.out.println(answer);
	}
}
