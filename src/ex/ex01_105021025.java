package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入「華氏」溫度，輸出「攝氏」溫度 (華氏 = 攝氏*(9/5)+32)
 * Date: 2016/09/19
 * Author: 105021025 洪立宇學生
 */
import java.util.Scanner;
public class ex01_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入華氏溫度:");
		double a = scn.nextInt();
		a=(a-32)/1.8;
		System.out.println("攝氏溫度為:" + a);
	}

}
