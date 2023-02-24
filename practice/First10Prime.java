package loop.practice;

public class First10Prime {

	public static void main(String[] args) {
		First10Prime primeObj=new First10Prime();
		int no=2,count1=0,first=0;
		while(count1<=10)  {
			int result = primeObj.objMethod1(no);
			if (result==0) {
				count1++;
				first++;
				System.out.println("no "+first+ "prime num=" +no);
			}
			if(count1==10) {
				break;
			}
			no=no+1;		
		}

	}

	private int objMethod1(int no) {
		int div=2,count=0;
		while(no>div) {
			if(no%div==0) {
				count++;				
			}
			div++;
		}
		return count;
	}
}
