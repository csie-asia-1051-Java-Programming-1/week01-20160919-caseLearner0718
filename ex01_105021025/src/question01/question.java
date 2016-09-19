package question01;
import java.util.Scanner;
public class question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入華氏溫度:");
		double a = scn.nextInt();
		a=(a-32)/1.8;
		System.out.println("攝氏溫度為:" + a);
	}

}
