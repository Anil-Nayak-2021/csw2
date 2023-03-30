package practice_1;

public class q_09 {
	int equilibrium(int[] a,int n) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < n; ++i) {
			int left=0,right=0;
			for (int j = 0; j < i; j++)
				left += a[j];
			System.out.print(left+"  ");
			for (int j = i + 1; j < n; j++)
				right += a[j];
			System.out.println(right);
			if (left == right) 
				return i;
		}
		return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-7, 1, 5, 2, -4, 3, 0};
		q_09 eq = new q_09();
		System.out.println(eq.equilibrium(a,a.length));
	}
}
