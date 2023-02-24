package programas;

public class test3 {

	public static void main(String[] args) {
		int hp=999;
		int answer=0, divide=0;
		for(int i=5; i>=1; i-=2) {
			answer+=hp/i;
			hp%=i;
			if(hp<=0) break;
		}
        System.out.println(answer);
	}
}
