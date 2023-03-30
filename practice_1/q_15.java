package practice_1;

import java.util.Arrays;

public class q_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]= {1,1,2,4,2};
		int a2[]= {2,2,-3,1,3};
		Arrays.sort(a1); //1, 1, 2, 2, 4 
		Arrays.sort(a2); //-3, 1, 2, 2, 3
		int sum=0;
		for (int i = 0; i < a2.length; i++) {
			sum += a1[i]*a2[a2.length-i-1] ;
			
		}
		System.out.print(sum+" ");
	}

}
