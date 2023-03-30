package practice_1;

import java.util.Arrays;

public class q_18 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,0,-3,1,3};
		int k=3;
		Arrays.sort(arr);
		//-3,0,1,2,3
		if(k<arr.length-1) {
			System.out.println(arr[k-1]);
		}
		else {
			System.out.println("K should be greater than array length.");
		}
	}
}
