import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		String str = null;
		String nstr = "";
		Scanner sc = new Scanner(System.in);
		
		str = sc.nextLine();
		for(int i=0;i<str.length(); i++) {
			if(i%2 == 0) {
				Character.toLowerCase(str.charAt(i));
				nstr+=Character.toLowerCase(str.charAt(i));
			}
			else {
				Character.toUpperCase(str.charAt(i));
				nstr+=Character.toUpperCase(str.charAt(i));
			}

		}
		System.out.println(nstr);
	}

}
