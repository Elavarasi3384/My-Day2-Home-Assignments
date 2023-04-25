package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
	
		int[] arr = {1,2,3,5,9,7,6,8};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if(i+1!=arr[i])
			{
				i=i+1;
				System.out.println("Missing Element is :" + i );
				break;
			}	
		}
	}

}
