package practice_1;

public class q_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {15,-2,-8,1,7,2};
		int len=0;
		for (int i = 0; i < a.length; i++) {
			int sum =0;
			for (int j = i; j < a.length; j++) {
				//System.out.print(a[j] +" ");
				sum += a[j];
				//System.out.print(sum);
				if(sum == 0) {
					len=Math.max(len, j-i+1);
				}
			}
		}System.out.println(len);
	}

}