package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入體重單位 "公斤"，轉換成 "磅" (1磅 = 0.45359 公斤)
 * Date: 2016/09/19
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex02_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入體重:");
		double val=scn.nextDouble();
		val=val/0.45359;
		System.out.print("您的體重為:" + val + "磅");
	}

}
