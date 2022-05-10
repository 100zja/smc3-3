import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("가위 바위 보!");
		String a = scan.next();
		int num;
		int com = (int) (Math.random() * 3);// 가위 = 0, 바위 = 1, 보 = 2
		
		if(a.equals("가위"))
			num = 0;
		else if(a.equals("바위"))
			num = 1;
		else
			num = 2;
		
		switch (num) {
		case 0:
			switch (com) {
			case 0:
				System.out.println("가위");
				System.out.println("비겼습니다.");
				break;
			case 1:
				System.out.println("바위");
				System.out.println("졌습니다.");
				break;
			case 2:
				System.out.println("보");
				System.out.println("이겼습니다.");
				break;
			}
			break;

		case 1:
			switch (com) {
			case 0:
				System.out.println("가위");
				System.out.println("이겼습니다.");
				break;
			case 1:
				System.out.println("바위");
				System.out.println("비겼습니다.");
				break;
			case 2:
				System.out.println("보");
				System.out.println("졌습니다.");
				break;
			}
			break;
		
		case 2:
			switch (com) {
			case 0:
				System.out.println("가위");
				System.out.println("졌습니다.");
				break;
			case 1:
				System.out.println("바위");
				System.out.println("이겼습니다.");
				break;
			case 2:
				System.out.println("보");
				System.out.println("비겼습니다.");
				break;
			}
			break;
		}
		
	}
}