package hw;

public class hw01_1050210XX {
	import java.util.Scanner;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入n:");
		double n = scn.nextInt();
		n=Math.pow(n,1/3.0);
		System.out.print((int)n);
	}

}
