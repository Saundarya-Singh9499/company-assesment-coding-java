package CodingTest;

import java.util.Scanner;

public class LeaderInTheArray {

	public static int[] takeInput() {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			
			System.out.println("Enter the " + i + "th Element");
			
			arr[i] = sc.nextInt();
		}
	
	        return arr;
	}
	
	public static void leader(int arr[]) {
		
		
		 for(int i = 0 ; i < arr.length ; i++) {
			
			 int j;
			 
	    	for( j = i + 1 ; j < arr.length ; j++) {
		  
	    		if (arr[j] >= arr[i]) {
			        	 
			       break;
			         
	    		}
				 
	    	}
		
	    	
	    	
	    	if(j == arr.length)  {
				 
		      System.out.print(arr[i] + " ");
				 
			 }
		}
		
		   
			}
	
	           
	 public static void main(String[] args) {
		
      int arr[] = takeInput();
      
      leader(arr);
      
      
      
	 }

}
