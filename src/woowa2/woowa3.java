package woowa2;
import java.util.Scanner;

public class woowa3 {

	public static void main(String[] args) {
		int result=0;
		Scanner sc= new Scanner(System.in);
		int num1 = sc.nextInt();
		
		for(int y=1;y<=num1;y++) {
			int x=y;
			while(x!=0) {
				if(x %10 ==3 ||x %10 ==6||x %10 ==9) result++;
				x /=10;
			}
			
		}
		
		System.out.println(result);
	}

}
