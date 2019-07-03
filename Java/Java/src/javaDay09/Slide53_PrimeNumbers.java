/**
 * 
 */
package javaDay09;

/**
 * @author rucha.joshi
 * Write a program that displays the first 20 prime numbers.
 */
public class Slide53_PrimeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int flag=-1;
		int i = 2;
		
	//for(int i=2;i<=100;i++) {
		while(counter<20) {
		for(int j=2;j<=i;j++) {
			if (i==2) {
				flag =1;
				break;
			}else if(i%2==0){
				//System.out.println("inside if loop " + i + "," + j);
				flag=0;
				break;				
			} else if((i%j==0)&&(i!=j)){
				flag=0;
				break;
			}else {
				flag=1;
			}
		}
			//if((flag==1)&&(counter<20)) {
			if(flag==1) {	
				counter++; 
				System.out.println(i + " is a prime number." );				
		    }
			i++;
		}

	}
}
