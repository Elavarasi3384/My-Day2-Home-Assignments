package week1.day2;

public class Numberispalindrome {

public static void main(String[] args) {
int num=34343;
int temp=0;

while(num>0) {

	temp=temp*10+(num%10);
	num=num/10;
	}
num=34343;
if(temp==num)
{
	System.out.println("Number is Palindrome");
}
else 
{
	System.out.println("Number is Not Palindrome");
}
}
}
	

	


