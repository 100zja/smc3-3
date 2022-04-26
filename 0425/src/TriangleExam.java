public class TriangleExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle(10.2, 17.3);

		System.out.println("삼각형의 넓이는 " + t1.size());
		System.out.println("바뀐 삼각형의 넓이는 " + t1.size_change());
	}

}

class Triangle {
	double width;
	double height;

	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double size() {
		return (width * height) / 2;
	}

	public double size_change() {
		width = 7.5;
		height = 9.2;
		return (width * height) / 2;
	}
}
