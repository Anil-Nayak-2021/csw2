
public class q_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7};
		int a2[]=new int[a.length];
		int i=0,j=a.length-1;
		  for (int k = 0; k < a.length; k++) {
		      if ((k & 1) == 0)
		        a2[k] = a[j--];
		      else
		        a2[k] = a[i++];
		    }
		for (int x : a2) {
			System.out.print(x+" ");
		}
	}

}
