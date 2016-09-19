package hw04_105021025;
import java.util.Scanner;
public class question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入a=");
		double a=scn.nextInt();
		System.out.print("請輸入b=");
		double b=scn.nextInt();
		System.out.print(Math.pow(a, 1.0/b));
	}
}