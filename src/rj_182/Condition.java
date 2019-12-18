package rj_182;

public class Condition {

	public static void main(String[] args) {
		//if else条件语句是
		int age=60;
		if(age<50) {
			System.out.println("此人是成年人");
		}
		else if(age>50) {
			System.out.println("此人已经老了");
		}
		//switch case语句条件是离散的
		int month=12;
		switch(month) {
			case 12:
			case 1:
			case 2:
				System.out.println("下雪的季节");
			break;
			case 3:
			case 4:
			case 5:
				System.out.println("长树叶的季节");
			break;
			case 6:
			case 7:
			case 8:
				System.out.println("当前时间为夏季");
			break;
			case 9:
			case 10:
			case 11:
				System.out.println("我最爱的就是纯色");
			break;

			default:
			break;
		}

	}

}
