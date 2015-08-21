import java.util.Scanner;


public class TJU_1626 {
	public static int memo[][][];
	
	public static int w(int a, int b, int c) {
		if(a <= 0 || b <= 0 || c <= 0)
			return 1;
		if(a > 20 || b > 20 || c > 20)
			return 1048576;
		if(memo[a][b][c]!=0) return memo[a][b][c];
		if(a == b && b == c)  memo[a][b][c] = (int)Math.pow((double)2, (double)a);
		else if(a < b && b < c)  memo[a][b][c] = (int)Math.pow((double)2, (double)a);
		else  memo[a][b][c] = (w(a-1,b,c) + w(a-1, b-1, c) + w(a-1,b,c-1) - w(a-1,b-1,c-1));
		return memo[a][b][c];
	}
	
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(true) {
			memo = new int[21][21][21];
			int a = cin.nextInt();
			int b = cin.nextInt();
			int c = cin.nextInt();
			if(a == -1 && b == -1 && c == -1) break;
			System.out.println("w("+a+", "+b+", "+c+") = " + w(a,b,c));
		}
	}
}
