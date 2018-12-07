package soket;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int pw = 22;
		int[] allOut = {12, 5, 76, 35, 33, 45, 22, 21 ,78 ,74};

//		方法一:
//		int[] newArr = new int[allOut.length];
//		int index = 0;
//		for (int i = 0; i < allOut.length; i++) {
//			if (pw != allOut[i]) {
//				newArr[index] = allOut[i];
//				index++;
//			}
//		}
//		allOut = Arrays.copyOf(newArr, index);
		
//		方法二:
		for (int i = 0; i < allOut.length; i++) {
			if (allOut[i] == pw) {
				allOut[i] = allOut[allOut.length-1];
				allOut = Arrays.copyOf(allOut, allOut.length-1);
				break;
			}
		}
		
		System.out.println(Arrays.toString(allOut));
		
		
	}

}
