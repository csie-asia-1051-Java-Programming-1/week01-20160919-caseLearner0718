package hw;
import java.util.Scanner;
import java.util.Random;
public class hw02_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		System.out.print("請輸入n:");
		int n = scn.nextInt();
		int[] val=new int[6];
		for(int a=0;a<6;a++)
		{
			val[a]=rnd.nextInt(n)+1;
			System.out.println(val[a]);
		}
	}

}
