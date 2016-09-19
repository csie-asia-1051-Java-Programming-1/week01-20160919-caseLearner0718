package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入數字 a 與 b，程式 計算 a 的 b 次方後輸出結果 (請使用 Math.pow(a,b) 工具)
 * Date: 2016/09/19
 * Author: 105021025 洪立宇學生
 */
import java.util.Scanner;
public class ex03_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		System.out.println("請輸入兩個正整數");
		System.out.print("a=");
		int a = scr.nextInt();
		System.out.print("b=");
		int b = scr.nextInt();
		double c;
		c=Math.pow(a, b);
		System.out.println(a + "的" + b + "次方=" + (int)c);
	}

}
