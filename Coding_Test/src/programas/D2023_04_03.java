package programas;

public class D2023_04_03 {

	public static void main(String[] args) {
		String keyinput[] = {"right", "right", "right", "right","left", "left", "left", "left"};
		int board [] = {5,5};
		int answer[] = {0,0};
		for(int i=0; i<keyinput.length; i++) {
			switch (keyinput[i]) {
			case "up" :
				if(answer[1]< ((board[1]/2))) {
					answer[1]++;
				}
				break;
			case "down" :
				if(answer[1] > (board[1]/2)*-1) {
					answer[1]--;
				}
				break;
			case "left" :
				if(answer[0] > (board[0]/2)*-1) {
					answer[0]--;
				}
				break;
			case "right" : 
				if(answer[0] < (board[0]/2)) {
					answer[0]++;
				}
				break;
			}
		}
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}
