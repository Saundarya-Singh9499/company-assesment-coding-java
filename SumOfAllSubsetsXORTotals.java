package CodingTest;

import java.util.Scanner;

public class SumOfAllSubsetsXORTotals {

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
	
	
	public static int XORTotals(int arr[]) {
		
		
		 int num = 0;
		 
		 int answer = 0;
		 
		 for(int  i = 0 ; i < arr.length ; i++) {
			 
			 num  |=arr[i];
			 
		     answer = num * (int)Math.pow(2, arr.length - 1);
			 
			 		
		 }
	
		     return answer;
	}
    
    public static void main(String[] args) {
		
     int arr[] = takeInput();
     
     int result = XORTotals(arr);
     
     System.out.println(result);
	
    }

}
