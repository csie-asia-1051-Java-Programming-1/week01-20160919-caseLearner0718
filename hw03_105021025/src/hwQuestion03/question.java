package hwQuestion03;
import java.util.Scanner;
public class question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] val = new double[6];
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入第1個數");
		val[0]=scn.nextDouble();
		double min = 0;
		for(int a=1;a<6;a++)
		{
			System.out.println("請輸入第" + (a+1) + "個數");
			val[a]=scn.nextDouble();
			min=Math.min(val[a-1], val[a]);
		}
		System.out.println(Math.round(min));
	}

}
