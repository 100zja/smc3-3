import java.util.Scanner;
public class TestExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		System.out.println("500 ������ �ڿ����� �Է��ϼ���.");
		int a = sc.nextInt();
		int sum = 0;
		for(int i = 3 ; i<=a ; i++)
		{
			if(i % 3 == 0 && i % 7 ==0)
			{
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("1~" + a + "������ 3�� ����̸鼭 7�� ����� ���� ���� " + sum + "�Դϴ�.");
	}

}
