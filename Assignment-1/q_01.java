
public class q_01 {
	private static void checkprime(int i) {
		// TODO Auto-generated method stub
		int count=0;
		for (int j = 2; j < i/2; j++) {
			if(i%j==0) {
				count++;
			}
		}
		if(count==1) {
			System.out.println(i+" is not a prime number");
		}
		else {
			System.out.println(i+" is a prime number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkprime(7);
	}

	

}
