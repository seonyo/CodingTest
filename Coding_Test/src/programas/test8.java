package programas;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num_list [] = {1,2,3,4,5};
		int answer [] = new int [num_list.length];
		 for(int i=num_list.length-1; i>=0; i--){
	            answer[num_list.length-i]=num_list[i-1];
	     }
		 System.out.println();
	}

}
