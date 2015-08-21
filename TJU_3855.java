import java.util.Scanner;


public class TJU_3855 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
			while(cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			String foods[] = new String[a];
			Double prices[] = new Double[a];
			int flag[] = new int[a];
			cin.nextLine();
			for(int i=0; i < a; i++) {
				String input = cin.nextLine();
				String in[] = input.split(" ");
				String priceStr = in[in.length-1];
				String foodStr = input.replace(" "+priceStr, "");
				foods[i] = foodStr;
				prices[i] = Double.parseDouble(priceStr);
			}
			double total = 0.0;
			for(int i=0; i < b; i++) {
				String order = cin.nextLine();
				double selectedPrice = 999999.0;
				int selectedPos = -1;
				for(int j=0; j < a; j++) {
					if(foods[j].equals(order) && flag[j] == 0) {
						flag[j] = 1;
						if(selectedPrice > prices[j]) {
							selectedPrice = prices[j];
							selectedPos = j;
						}
					}
				}
				if(selectedPos > -1 && selectedPrice < 999999.0) {
					total += selectedPrice;
				}
			}
			System.out.printf("%.2f\n", total);
		}
	}
}
