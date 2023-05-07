package programas;

public class D2023_05_07 {
	public static void main(String[] args) {
		String myString="abcdevwxyz";
		 String answer = "";
	        for(int i=0; i<myString.length(); i++){
	            if(myString.charAt(i)<'l') {
	            	answer+='l';
	            }
	            else answer+=myString.charAt(i);
	        }
	     System.out.println(myString);
	}

}
