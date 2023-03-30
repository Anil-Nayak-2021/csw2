package practice_1;

public class q_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,6,7,8,5,3,1,7};
		int max = Integer.MIN_VALUE;
		
		for (int i = arr.length-1; i >0; i--)
	    {
	        if(max<arr[i]) {
	        	System.out.println(arr[i]);
	        	max=arr[i];
	        }
	    }
		
	}

}
