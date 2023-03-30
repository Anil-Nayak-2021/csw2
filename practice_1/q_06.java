package practice_1;

public class q_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,5};
		for (int i = 0; i < a.length; i++) {
			if(a[i] != i+1) {
				System.out.println(i+1+" is missing ");
			}
		}
		
	}

}
