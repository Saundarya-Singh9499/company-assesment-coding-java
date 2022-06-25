package CodingTest;

import java.util.Scanner;

public class BestTimeToBuyAndSellStock {

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
	
	 public static int buyAndSellStock(int arr[]) {
		 
		   int profit = 0;
		   
		   for(int i = 0 ; i < arr.length ; i++) {
			   
			   for(int j = i + 1 ; j < arr.length ; j++) {
				   
				    int num = arr[j] - arr[i];
				    
				    if(num > profit) {
				    	
				    	 profit = num;
				    }
			   }
		   }
	 
	           return profit;
	 }
	
	public static void main(String[] args) {

     int arr[] = takeInput();
     
     int result = buyAndSellStock(arr);
     
     System.out.println(result);
	
	}

}
