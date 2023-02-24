package programas;

public class test6 {

	public static void main(String[] args) {
		String answer ="";
		String cipher="dfjardstddetckdaccccdegk";
		int code = 4;
		char temp [] = cipher.toCharArray();
		System.out.println(cipher.length());
	      for(int i=code; i<=cipher.length(); i+=code) {
	            answer+=temp[i-1];
	            System.out.println(i);
	    }
	     System.out.println(answer);
	}

}
