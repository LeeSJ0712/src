package woowa2;
import java.util.Scanner;

public class woowa4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		str = scan.nextLine();
		int s_len = str.length();
		char [] chars= str.toCharArray();
		for(int x=0;x<s_len;x++) {
			if(chars[x] <='z' && chars[x] >='a') {
				int a= chars[x] -'a';
				chars[x] = (char)(122-a);
			}
			if(chars[x] <='Z' && chars[x] >='A') {
				int a= chars[x] -'A';
				chars[x] = (char)(90-a);
			}
		}
		String b = new String(chars);
		System.out.println(b);
	}
}