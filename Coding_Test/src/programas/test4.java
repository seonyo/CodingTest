package programas;

public class test4 {

	public static void main(String[] args) {
		String my_string ="jaron";
		String answer;
		char arr [] = new char [my_string.length()];
        for(int i=arr.length-1; i>=0; i--){
            arr[my_string.length()-i-1]=my_string.charAt(i);
        }
        answer= new String(arr);
        System.out.println(answer);
	}

}
