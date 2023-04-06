import java.util.HashMap;

public class q_09 {
	 public static int smallestPositiveMissingEle(int a[]) {
		    HashMap<Integer, Integer> map = new HashMap<>();
		    for (int i = 0; i < a.length; i++) {
		      if (!map.containsKey(a[i])) {
		        map.put(a[i], 1);
		      }
		    }

		    for (int i = 1; i < a.length; i++) {
		      if (!map.containsKey(i)) {
		        return i;
		      }
		    }

		    return -1;
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 3, 5, 8, 2, 7, 9 };
	    System.out.println(smallestPositiveMissingEle(a));
	}

}
