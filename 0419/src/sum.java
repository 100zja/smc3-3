import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int a = sc.nextInt();
		System.out.print("������ ���� : ");
		int b = sc.nextInt();
		int sum = 0;
		for(int i = a ; i <= b ; i++)
		{
			sum += i;
		}
		System.out.println(a + "���� " + b + "������ ���� " + sum);
	}

}
