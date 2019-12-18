package rj_182;

public class Danxunhuan {

	public static void main(String[] args) {
		String[] yb= {"管理学院","音乐学院","设计学院","教育学院","演艺学院","中专部","饮食文化学院","轮空"};
		
		/*队伍0 1 2 3 4 5
		 * 第一轮对阵
		 * 0vs5 1vs4 2vs3
		 * 第二轮对阵:0 5 1 2 3 4
		 * 0vs4 5vs3 1vs2
		 * 第三轮对阵0 5 4 1 2 3
		 * 0vs3 5vs2 4vs1
		 * 第四轮对阵0 3 4 5 1 2
		 * 0vs2 3vs1 4vs5
		 * 第五轮对阵0 2 3 4 5 1
		 * 0vs1 2vs5 3vs4 
		 */
		System.out.println("第九届江汉艺术职业学院篮球赛对阵表:");
		//外循环对应轮次
		for(int i=1;i<yb.length;i++) {
			System.out.println("第"+i+"轮");
		if(i>1){
			String stemp=yb[yb.length-1];
			for(int k=yb.length-1;k>1;k--)
				yb[k]=yb[k-1];
			
			yb[1]=stemp;
		}
		//内循环进行对阵
		for(int j=0;j<yb.length/2;j++) {
			System.out.println(yb[j]+"vs"+yb[yb.length-j-1]);
			if(j==yb.length-1) {
				System.out.println(yb.length-1);
			}
		}
		}

	}
}
