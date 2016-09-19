package question04;
import java.util.Scanner;
public class question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		System.out.println("請輸入正整數");
		System.out.print("a=");
		double a = scr.nextInt();
		a=Math.sqrt(a);
		System.out.print("a平方根為" + (int)a);
	}

}
