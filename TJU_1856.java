import java.util.Arrays;
import java.util.Scanner;


public class TJU_1856 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int flag[] = new int[26];
		int n;
		n = cin.nextInt();
		cin.nextLine();
		for(int i=0; i < n ;i++) {
			Arrays.fill(flag, 0);
			String a = cin.nextLine();
			String b = cin.nextLine();
			for(int j=0; j < a.length(); j++) {
				int p = (int)a.charAt(j);
				flag[p-97] += 1;
			}
			for(int j=0; j < b.length(); j++) {
				int p = (int)b.charAt(j);
				flag[p-97] -= 1;
			}
			int sum = 0;
			for(int k=0; k < 26; k++) {
				if(flag[k] != 0) {
					sum+=Math.abs(flag[k]);
				}
			}
			System.out.println("Case #"+(i+1)+":  "+sum);
		}
	}
}
