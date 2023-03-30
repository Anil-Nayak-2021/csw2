
package practice_1;

import java.util.Arrays;

public class q_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int u[] = {4,3,2,1,5,7,8};
		int v[] = {9,5,7,3,4,1,2,6};
		Arrays.sort(u);
		int sum=0;
		for (int i = 0; i < u.length; i++) {
			for (int j = 0; j < v.length; j++) {
				sum = u[i]+v[j];
				if(sum == 10) {
					System.out.print("("+u[i]+","+v[j]+") ");
				}
			}
		}
	}

}
