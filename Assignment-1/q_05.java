
public class q_05 {
	
		public static void reverseArray(int[] a, int start, int end) {
			for (int i = start, j = end; i < j; i++, j--) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8};
		int k = 3;
		int n =a.length;
		reverseArray(a, 0, k - 1);
		reverseArray(a, k, n - 1);
		reverseArray(a, 0, n - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}	
	}
		
}
