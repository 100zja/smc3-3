import java.util.Scanner;
public class scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1000������ �ڿ����� �Է��ϼ���. : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i<=num ; i++)
		{
			if(i % 4 == 0)
			{
				sum += i;
				System.out.println(i);
			}
		}
		System.out.println("1~" + num + "���� 4�� ����� ���� " + sum + "�Դϴ�.");
	}

}
