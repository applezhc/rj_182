package rj_182;

public class Text {
	//构造方法的重载overload
	public Text() {
		System.out.println("构造方法一被调用了");
	}
	public Text(int x) {
		//this关键字在这里指代本类
		this();
		System.out.println("构造方法二被调用了");
	}
	public Text(boolean b) {
		this(1);
		System.out.println("构造方法三被调用了");
	}
	public void openMouth() {}
	public void speak() {this.openMouth();}
	public static void main(String[] args) {
		new Text(true);

	}

}
