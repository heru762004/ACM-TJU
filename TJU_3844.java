import java.util.Scanner;


public class TJU_3844 {
	public static void main(String[] args) {
		String db[] = {"000", "001", "010", "011", "100", "101", "110", "111"};
		Scanner cin=new Scanner(System.in);
		int n = cin.nextInt();
		for(int i=0; i < n; i++) {
			String x = cin.next();
			String result = "";
			while(true) {
				if(x.length() == 0) break;
				if(x.length() == 2) x = "0" + x;
				if(x.length() == 1) x = "00" + x;
				String temp = x.substring(x.length()-3, x.length());
				for(int j=0; j < 8; j++) {
					if(db[j].equals(temp)) {
						result = j + result;
						break;
					}
				}
				x = x.substring(0, x.length()-3);
			}
			System.out.println(result);
		}
	}
}
