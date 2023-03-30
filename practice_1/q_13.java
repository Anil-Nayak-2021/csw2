package practice_1;

public class q_13 {

	public static String commonPrefix(String s[]) {
	    String res = s[0];
	    for (int i = 1; i < s.length; i++) {
	      String temp = "";
	      for (int j = 0; j < s[i].length(); j++) {
	        if (j < res.length() && s[i].charAt(j) == res.charAt(j))
	          temp += res.charAt(j);
	        else
	          break;
	      }
	      res = temp;
	    }
	    return res;
	  }

	  public static void main(String[] args) {
	    String s[] = { "alex", "alexina", "alexmax", "alextax", "alexcrash" };
	    System.out.println(commonPrefix(s));

	}

}
