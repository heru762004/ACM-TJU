import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;


public class TJU_3508 {
	public static void main(String[] args) {
		 Scanner cin=new Scanner(System.in);
	     int T;
	     T = cin.nextInt();
	     int num = 1;
	     while((T--) > 0) {
	    	 BigInteger sum = new BigInteger("0");
	    	 int n = cin.nextInt();
	    	 long a[] = new long[n];
	    	 long b[] = new long[n];
	    	 for(int i=0; i < n; i++) {
	    		 int x = cin.nextInt();
	    		 a[i] = x;
//	    		 System.out.println("x = " + x);
	    	 }
	    	 for(int i=0; i < n; i++) {
	    		 int y = cin.nextInt();
	    		 b[i] = y;
//	    		 System.out.println("y = " + y);
	    	 }
	    	 if(n > 0) {
	    		 Arrays.sort(a);
	    		 Arrays.sort(b);
	    		 if(a[0] < 0 && b[n-1] >= 0) {
	    			 for(int i=0; i < n; i++) {
	    				 sum = sum.add(new BigInteger(Long.toString(a[i] * b[n-i-1])));
	    			 }
	    		 } else if(a[0] < 0 && b[n-1] < 0) {
	    			 if(a[n-1] > 0) {
	    				 for(int i=0; i < n; i++) {
	    					 sum = sum.add(new BigInteger(Long.toString(a[n-i-1] * b[i])));
		    			 } 
	    			 } else {
	    				 for(int i=0; i < n; i++) {
	    					 sum = sum.add(new BigInteger(Long.toString((a[i] * b[n-i-1]))));
		    			 }
	    			 }
	    		 } else if( a[0] >= 0 && b[0] >= 0) {
	    			 for(int i=0; i < n; i++) {
	    				 sum = sum.add(new BigInteger(Long.toString(a[n-i-1] * b[i])));
	    			 }
	    		 } else if( a[0] >= 0 && b[0] < 0) {
	    			 for(int i=0; i < n; i++) {
	    				 sum = sum.add(new BigInteger(Long.toString(a[n-i-1] * b[i])));
	    			 }
	    		 } 
	    	 }
	    	 System.out.println("Case #"+(num++)+": "+sum);
//	    	 if(num == 987) break;
	     }
	}
}
