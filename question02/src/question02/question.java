package question02;
import java.util.Scanner;
public class question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入體重:");
		double val=scn.nextDouble();
		val=val/0.45359;
		System.out.print("您的體重為:" + val + "磅");
	}

}
