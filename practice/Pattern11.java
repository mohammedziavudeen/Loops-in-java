package loop.practice;
//Output=11 121 1331 14641
public class Pattern11 {

	public static void main(String[] args) {
		int no=1,count=1;
		while(count<=4) {
			no=no*11;
			count=count+1;
			System.out.println(no);
		}


	}

}
