/**
 * 
 */
package javaDay10;

import java.util.Arrays;

/**
 * @author rucha.joshi
 *
 */
public class Test_StringSplit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Math,English ,Law";
		s = s.replaceAll("\\s+","");
		System.out.println("s: " + s);
		String[] sNew = s.split(",");
		System.out.println(Arrays.toString(sNew));
		
		String s1 = "java";
		String s2 = "java";
		
		System.out.println(s1==s2);//true
		
		s1 = s1 + "basics";
		
		System.out.println(s1);// java basics - new memory location
		
		System.out.println(s1  == "java basics"); //false it compares memory address with value
		
		System.out.println(s1.contentEquals("java basics"));//true compares values
		
		System.out.println(s1.contains("j")); //true check for character in string
		
		System.out.println(s1.endsWith("c"));//false as it ends with "s".
		
		System.out.println(s1.equalsIgnoreCase("JAVA Basics"));//true ignores case
		
		System.out.println(s1.indexOf("j"));//gives index as 0
	}

}
