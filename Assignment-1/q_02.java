
public class q_02 {
	
	private static int dectobin(int i) {
		// TODO Auto-generated method stub
		int binary=0,count=0;
		while(i!=0) {
			binary+=(i%2)*(Math.pow(10, count));
			count++;
			i/=2;
		}
		return binary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dectobin(7));
	}
}