package hw;

public class hw01_1050210XX {
	import java.util.Scanner;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入n:");
		double a = scn.nextDouble();
		double b = Math.ceil(Math.log(a)/Math.log(2));
		System.out.print("共需" + b + "位元")
	}

}
