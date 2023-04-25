package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
	int [] a= {3,2,11,4,6,7};
	int [] b= {13,12,10,40,16,7};
//int lengthA,lengthB;
//lengthA=a.length;
//lengthB=b.length;
for (int i = 0; i < a.length; i++) {
	
	for (int j = 0; j < b.length; j++) {
		if(a[i]==b[j])
		{
			System.out.println("First Array Values Should Match in the second Array"); 
			break;
		}
		}
	}

	}

}
