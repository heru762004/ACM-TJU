import java.util.Arrays;
import java.util.Scanner;


public class TJU_3843 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int M = cin.nextInt();
		int N = cin.nextInt();
		int input2[] = new int[M];
		int input[] = new int[N];
		for(int i=0; i < M; i++) {
			int temp = cin.nextInt();
			input2[i] = temp;
		}
		int sum = 0;
		for(int i=0; i < N; i++) {
			int temp = cin.nextInt();
			input[i] = temp;
		}
		Arrays.sort(input);
		Arrays.sort(input2);
		int pos = 0;
		for(int i=0; i < input.length;i++) {
			while(true) {
				int status = 0;
				if(pos >= M) break;
//				System.out.println("p = "+input2[pos]);
//				System.out.println("q = "+input[i]);
				if(input[i] < input2[pos])break;
				if(input[i] == input2[pos]) {
//					System.out.println("pos = "+input2[pos]);
					sum++;
					pos++;
					status = 1;
				} else {
					pos++;
				}
				if(pos >= M) break;
				if(status == 1) break;
			}
			if(pos >= M) pos = M-1;
		}
		System.out.println(sum);
	}
}
