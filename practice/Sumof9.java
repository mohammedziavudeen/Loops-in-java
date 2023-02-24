package loop.practice;

public class Sumof9 {
	public static void main(String[] args) {
		  Sumof9 loop = new Sumof9();  
		  int no = 1;
		  int sumOf = 8;
		  loop.initial(no, sumOf);

		 }

		 public void initial(int no, int sumOf) {
		  while (no <= 1323) {
		  int result = sum_of_digit(no);
		   if(result == sumOf) {
		    System.out.print(no + " ");
		   }
		   no = no + 1;
		  }
		 }

		 public int sum_of_digit(int no) {
		  int sum = 0;
		  while (no > 0) {
		   sum = sum + (no % 10);
		   no = no / 10;
		     }
		  return sum;
		 }
}
