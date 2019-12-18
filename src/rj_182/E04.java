package rj_182;

public class E04 {

	public static void main(String[] args) {
		//{}是变量的作用域
		int x=12;
		{
			int y=96;
			System.out.println("x="+x);
			System.out.println("y="+y);
		}
		    System.out.println("x="+x);

	}

}
