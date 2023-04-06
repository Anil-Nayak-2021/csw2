
public class q_04 {
	public static int BinarySearch(int[] arr, int low, int high, int value) {
		if(low > high) {
			return -1;
		}
		int mid = (low + high) / 2;
		if (arr[mid] == value) {
			return mid;
		} 
		else if (arr[mid] < value) {
			return BinarySearch(arr, mid + 1, high, value);
		} 
		else {
			return BinarySearch(arr, low, mid - 1, value);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9};
		System.out.println(BinarySearch(a,0,a.length,4));
	}

}
