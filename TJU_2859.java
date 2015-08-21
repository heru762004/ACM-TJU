import java.util.Scanner;


public class TJU_2859 {
	public static final int MIN_DEFINED = -999999999;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext()) {
			int n = cin.nextInt();
			if(n == 0) break;
			int max = MIN_DEFINED;
			int prevMax = 0;
			for(int i=0; i < n; i++) {
				int x = cin.nextInt();
				if(max < x) {
					prevMax = max;
					max = x;
				} else {
					if(prevMax < x && x < max) {
						prevMax = x;
					}
				}
			}
			if(prevMax == MIN_DEFINED) {
				System.out.println(max);
			} else {
				System.out.println(prevMax);
			}
		}
	}
}
