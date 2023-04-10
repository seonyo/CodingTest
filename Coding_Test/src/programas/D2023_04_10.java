package programas;

public class D2023_04_10 {

	public static void main(String[] args) {
		String my_string="zZZzzZ";
		String answer="";
		for(int i=0; i<my_string.length(); i++) {
			if(my_string.charAt(i)<=90) 
				answer+= my_string.substring(i,i+1).toLowerCase();
			else 
				answer+= my_string.substring(i,i+1).toUpperCase();
		}
		System.out.println(answer);
	}

}
