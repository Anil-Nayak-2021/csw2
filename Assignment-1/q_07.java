import java.util.Arrays;

public class q_07 {
	public static void swap(int a[], int x, int y) {
		int temp =a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,6,4,8,9,0,1,7};
		Arrays.sort(a);
		for (int i = 1; i < a.length-1; i+=2) {
			if(a[i]<a[i+1]) {
				swap(a,i,i+1);
			}
			
		}
		for(int e:a) {
			System.out.print(e+" ");
		}
		
	}

}
