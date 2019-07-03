/**
 * 
 */
package javaDay10;

/**
 * @author rucha.joshi
 *
 */
public class CountingCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0;
		int flag = -1;
		String arr1 = "II have a dream";		
		char[] charArray = arr1.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			if(flag == 1) {
				//System.out.println("flag is 1.");
				flag=0;
				continue;
			}
			char temp = charArray[i];
			counter++;
			for(int j=i+1; j<(charArray.length);j++) {
				if(temp == charArray[j]) {
					counter++;
					flag=1;
				}
			}
			System.out.println(charArray[i] + " appeared " + counter + " times in a string");
			counter = 0;
		}
	}
}
