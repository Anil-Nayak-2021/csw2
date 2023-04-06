
public class q_03 {
	public static int reverse(int i) {
		// TODO Auto-generated method stub
		int r=0;
		while(i!=0){
			int x=i%10;
			r=r*10+x;
			i/=10;
		}
		return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(234));
	}

}
