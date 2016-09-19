package hwQuestion01;
import java.util.Scanner;
public class question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("½Ð¿é¤Jn:");
		double n = scn.nextInt();
		n=Math.pow(n,1/3.0);
		System.out.print((int)n);
	}

}
