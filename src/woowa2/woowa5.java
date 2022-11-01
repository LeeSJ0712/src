package woowa2;

import java.util.Scanner;

public class woowa5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int money = sc.nextInt();
		int won50000=0,won10000=0,won5000=0,won1000=0,won500=0,won100=0,won50=0,won10=0,won1=0;
		won50000 += money/50000;
		money %=50000;
		won10000 += money/10000;
		money %=10000;
		won5000 += money/5000;
		money %=5000;
		won1000 += money/1000;
		money %=1000;
		won500 += money/500;
		money %=500;
		won100 += money/100;
		money %=100;
		won50 += money/50;
		money %=50;
		won10 += money/10;
		money %=10;
		won1 += money;
		
		System.out.printf("[%d, %d, %d, %d, %d, %d, %d, %d, %d]",won50000, won10000,won5000,won1000,won500,won100,won50,won10,won1);
		
	}
}
