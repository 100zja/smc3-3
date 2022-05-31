import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String a = sc.next();
		
		if(a.equals("+"))
		{
			System.out.println(num1+num2);
		}
		else if(a.equals("-"))
		{
			System.out.println(num1-num2);
		}
		else if(a.equals("*"))
		{
			System.out.println(num1*num2);
		}
		else if(a.equals("/"))
		{
			System.out.println(num1/num2);
		}
	}

}
