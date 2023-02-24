package programas;

import java.util.Arrays;

public class test1 {

	public static void main(String[] args) {
		String before = "olleh";
		String after = "hello";
		int answer = 0;
        int cnt=0;
        
        char before_arr[] = before.toCharArray();
        char after_arr[] = after.toCharArray();
        
        Arrays.sort(before_arr);
        Arrays.sort(after_arr);
        
        before=Arrays.toString(before_arr);
        after=Arrays.toString(after_arr);
        
        if(before.equals(after)) answer=1;
        
        System.out.print(answer);
    }
}
