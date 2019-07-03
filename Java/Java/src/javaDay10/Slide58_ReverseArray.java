/**
 * 
 */
package javaDay10;

import java.util.Arrays;

/**
 * @author rucha.joshi
 * reverse the given original array into new reverse array
 */
public class Slide58_ReverseArray {

	/**
	 * @param args
	 */
	
	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];
		
		//this for has both i and j defined in the same loop
		for(int i=0, j = result.length-1; i<list.length; i++, j--) {
			result[j] = list[i];
		}
		
		return result;
	}
	
	public static char[] reverse(char[] list) {
		char[] result = new char[list.length];
		
		//this for has both i and j defined in the same loop
		for(int i=0, j = result.length-1; i<list.length; i++, j--) {
			result[j] = list[i];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] list1 = {1,2,3,4,5,6};
		//reverse array will be stored in this new array
		int[] list2 = reverse(list1);
		
		System.out.println("The original array is: " + Arrays.toString(list1));
		System.out.println("The reversed array is: " + Arrays.toString(list2));
		
		String myText = "I see i and j in my dream";
		
		char[] chars = myText.toCharArray();
		
		System.out.println(Arrays.toString(chars));
		
		char[] myText2 = reverse(chars);
		
		System.out.println(myText2);
		
		//convert character array back to string
		String myText3 = new String(myText2);
		
		System.out.println("Reversed string: " + myText3);


	}

}
