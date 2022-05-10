import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
        System.out.print("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50): ");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int []arr=new int[10];
        int cs = 0;
        
        for(int i = 1 ; i <= 9; i++)
        {
        	arr[i] = (int)(Math.random()*50+1);
        	System.out.print(arr[i]+ " ");
        }
        System.out.println(" ");
        for(int i = 0 ; i<= 9 ;i++)
        {
        	if(num == arr[i])
        		cs = 1;
        }
	if(cs==1){
		System.out.println("당첨! 일치하는 숫자가 있습니다");
	}else
	{
		System.out.println("꽝~ 다음기회에~~~");
	}
	}
}

