
import java.util.Scanner;

public class Solution {   
	 public  int count(int[] a){ 
		 // Count triples that sum to 0.      
		 int N = a.length;     
		 int c = 0;    
//		 for (int i = 0; i < N; i++)
//		 {
//			 for (int j = i+1; j < N; j++) 
//			 {
//				 for (int k = j+1; k < N; k++) 
//				 {
//					 if (a[i] + a[j] + a[k] == 0)                  
//					 {
//						 c++;
//					 }
//				 }
//				  
//			 }
//				 
//		 }
			    
		 for(int i = 0 ; i < N-2 ; i++)
		 {
			 int j=i+1;
			 int k=N;
			 while(i!=N-2)
			 {
				 if (a[i] + a[j] + a[k] == 0)                  
				 {
					 c++;
					 //i+=2;
					 //j+=1;
					 k=N-1;
				 }
				 else
				 {
					 //i+=2;
					 //j+=1;
					 k=N-1;
				 }
			 }
		 }
					 
					 
					 
					 
		 return c;   
		 }  
	 public static void main(String[] args)    
	 { 
		 Scanner scn=new Scanner(System.in);
		 int n=scn.nextInt();
		 int[] a = new int[n]; 
		 Solution ss=new Solution();
		 for(int i=0;i<n;i++) 
		 {
			 a[i]=scn.nextInt();
		 }
		 System.out.println(ss.count(a));   
	 }
}