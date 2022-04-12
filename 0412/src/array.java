import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int j = 0;
		
		for (int i = 0; i <= arr.length; i++) {
			System.out.println(((int)i+1) + "번 입력 : ");
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int max = arr[0];
		for(j = 0 ; j <= arr.length ; j++)
		{
			if (max < arr[j])
				max = arr[j];
		}
		System.out.println("가장 큰 수는 " + ((int)j-1) + "번째 숫자인 " + max + "입니다.");
	}
}
