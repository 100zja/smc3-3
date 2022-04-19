import java.util.Scanner;

public class GradeExam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade me = new Grade();
		Scanner sc = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >>");
		me.math = sc.nextInt();
		me.science = sc.nextInt();
		me.english = sc.nextInt();

		System.out.println("평균은 " + me.average());
	}  
}

class Grade {
	int math;
	int science;
	int english;

	public int average() {
		return (math + science + english) / 3;
	}
}