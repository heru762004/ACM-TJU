import java.util.Scanner;


public class TJU_1683 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext()) {
			String a = cin.next();
			String b = cin.next();
			int flag[] = new int[a.length()];
			int sum = 0;
			for(int i=0; i < a.length(); i++) {
				if(flag[i] == 0) {
					int tempSum = 0;
					char x = a.charAt(i);
					flag[i] = 1;
					int startB = b.indexOf(x);
					if(startB != -1) {
						tempSum++;
						for(int j=i+1; j < a.length(); j++) {
							char y = a.charAt(j);
							int temp = b.indexOf(y);
							if(temp != -1) {
								for(int k = startB+1; k < b.length(); k++) {
									char z = b.charAt(k);
									if(y == z) {
										flag[j] = 1;
										startB = k;
										tempSum++;
										break;
									}
								}
							}
						}
						if(sum < tempSum) {
							sum = tempSum;
						}
					}
				}
			}
			System.out.println(sum);
		}
	}
}
