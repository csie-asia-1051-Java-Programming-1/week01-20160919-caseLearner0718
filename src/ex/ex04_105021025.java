package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入數字 a，程式 計算 a 平方根並輸出 (請使用 Math.sqrt(a) 工具)
 * Date: 2016/09/19
 * Author: 105021025 洪立宇學生
 */
import java.util.Scanner;
public class ex04_1050210XX {

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
