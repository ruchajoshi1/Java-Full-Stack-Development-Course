/**
 * 
 */
package javaDay10;

/**
 * @author rucha.joshi
 *
 */
public class Slide91_RecursiveBinearySearch {

	/**
	 * @param args
	 */
	public static int binearySearch(int[] arr, int key, int startIndex, int endIndex) {
		
		int midIndex = (startIndex + endIndex)/2;
		
		if(endIndex <= startIndex) {
			return -1;
		}
		
		if(arr[midIndex] == key) {
			return midIndex;
		}
		
		//if key is smaller that middle element
		//calling the same method again with different inputs. - recursion
		if (key < arr[midIndex]) {
			return binearySearch(arr,key,startIndex,(midIndex-1));
		}
		
		//if key is bigger than middle element
		if(key > arr[midIndex]) {
			return binearySearch(arr,key,(midIndex+1),endIndex);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8};
		int key = 15;
		
		int startIndex = 0;
		int endIndex = arr.length-1;
		
		int result = binearySearch(arr,key,startIndex,endIndex);
		if(result == -1) {
			System.out.println("Element is not present in the array.");
		} else {
			System.out.println("Element is present at index: " + result);
		}

	}

}
