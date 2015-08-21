
import java.util.Arrays;
import java.util.Scanner;


public class TJU_2870 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext()) {
			int N = cin.nextInt();
			if(N == 0) break;
			int dist[][] = new int[N][N];
			
			int distance[] = new int[N];
			int cityNumber[] = new int[N];
			
			for(int i=0; i < N; i++) {
				Arrays.fill(dist[i], -1);
				cityNumber[i]=i;
			}
			int M = cin.nextInt();
			for(int i=0; i < M; i++) {
				int x = cin.nextInt();
				int y = cin.nextInt();
				int val = cin.nextInt();
				if(x != y) {
					dist[x][y] = val;
					dist[y][x] = val;
				}
			}
			int K = cin.nextInt();
			
			Arrays.fill(distance, Integer.MAX_VALUE);
			// floyd warsall algorithm
			for(int k=0; k < N; k++) {
				for(int i=0; i < N; i++) {
					for(int j=0; j < N; j++) {
						if(dist[i][k] != -1 && dist[k][j] != -1) {
							int sum = dist[i][k] + dist[k][j];
							if(dist[i][j] == -1 || sum < dist[i][j]) {
								dist[i][j] = sum;
							}
						}
						if(k == N-1 && i==0) {
							if(dist[i][j] > -1 && i != j) {
								cityNumber[j] = j;
								distance[j] = dist[i][j];
							}
						}
					}
				}
			}
			
			cityNumber[0] = 0;
			distance[0] = 0;
			
			for(int i=0; i < N; i++) {
				for(int j=i+1; j < N; j++) {
					if(distance[i] > distance[j]) {
						int temp = distance[i];
						distance[i] = distance[j];
						distance[j] = temp;
						
						temp = cityNumber[i];
						cityNumber[i] = cityNumber[j];
						cityNumber[j] = temp;
					}
				}
			}
//			for (int j=0;j<N;j++) {
//                System.out.println("dist to "+cityNumber[j]+" = "+distance[j]);
//            }
			System.out.println(cityNumber[K]);
		}
	}
}
