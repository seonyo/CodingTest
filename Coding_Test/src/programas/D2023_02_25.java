package programas;

public class D2023_02_25 {
	public static void main(String[] args) {
		int dot [] = {-7,9};
		int answer1 = 0;
		if(dot[0]>0 && dot[1]>0) answer1 = 1;
		if(dot[0]<0 && dot[1]>0) answer1=2;
		if(dot[0]<0 && dot[1]<0) answer1=3;
		if(dot[0]>0 && dot[1]<0) answer1=4;
	    System.out.println("풀이 1 : "+ answer1);
	    
	    
	    int answer2 = 0;
	    if(dot[0] > 0) 
            if(dot[1] > 0) answer2 = 1;
            else answer2 = 4;
        else 
            if(dot[1] > 0) answer2 = 2;
            else answer2 = 3;
	    System.out.println("풀이 2 : " + answer2);
		
	}

}
