import java.util.Arrays;
import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		String str = null;
		Scanner sc = new Scanner(System.in);
		
		str = sc.nextLine();
		String[] arrOfStr = str.trim().split("\\s+"); 
		for(int i=0;i<arrOfStr.length;i++) {
			System.out.println(arrOfStr[i]);
		}
		//System.out.println("output string: " + Arrays.toString(arrOfStr));
	}

}
