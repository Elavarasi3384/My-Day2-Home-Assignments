package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
	
		int range=8;
		int firstnum=0;
		int secnum=1;
		int sum;
	System.out.println(firstnum);
	System.out.println(secnum);
	for (int i = 1; i <= range; i++) {
		sum=firstnum+secnum;
		System.out.println(sum);
		firstnum=secnum;
		secnum=sum;
			}
	}

}
