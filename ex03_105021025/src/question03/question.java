package question03;
import java.util.Scanner;
public class question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		System.out.println("�п�J��ӥ����");
		System.out.print("a=");
		int a = scr.nextInt();
		System.out.print("b=");
		int b = scr.nextInt();
		double c;
		c=Math.pow(a, b);
		System.out.println(a + "��" + b + "����=" + (int)c);
	}

}
