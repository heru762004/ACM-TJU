import java.util.Scanner;


public class TJU_3975 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		double result[] = new double[101];
		result[0] = 0.6;
		result[1] = 0.7;
		int n = cin.nextInt();
		for(int i=0; i < n; i++) {
			double res = 0.0;
			int x = cin.nextInt();
			if(x > 2) {
				if(result[x-1] > 0.0) {
					res = result[x-1];
				} else {
					for(int j=2; j < x; j++) {
						if(result[j] == 0.0) {
							double y = (result[j-1] * 0.6) + (result[j-2] * 0.5);
							result[j] = y;
							res = y;
//							System.out.println("y = " + y);
						} else {
							res = result[j];
						}
					}
				}
			} else {
				res = result[x-1];
			}
			System.out.print("Case "+(i+1)+": ");
			System.out.printf("%.2f\n", res);
		}
	}
}
