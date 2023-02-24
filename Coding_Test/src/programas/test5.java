package programas;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234, answer=0;
		int time=1, num=n;
		do {
			num=num/10;
			time*=10;
		} while(num!=0);
		System.out.println(num+" " + time);
		time/=10;
		while(true) {
			answer+=(n/time);
			System.out.println(answer);
			time/=10;
			if(time==1) break;
		}
		
		 System.out.println(answer);
	}

}
