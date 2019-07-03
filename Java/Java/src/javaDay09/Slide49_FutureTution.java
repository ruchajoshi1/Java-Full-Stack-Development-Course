/**
 * 
 */
package javaDay09;

/**
 * @author rucha.joshi
 *Suppose that the tuition for a university is $10,000 this year and tuition increases 7% every year. 
 *In how many years will the tuition be doubled?
 */
public class Slide49_FutureTution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tuition = 10000;
		//double rate = 7;
		int years = 0;
		
		while(tuition<20000) {
			//every year tuition is increasing by 7%
			tuition = tuition*1.07;
			years++;
		}
		System.out.println("tuition: "+ tuition);
		System.out.println("In " + years + " years tuitions will be doubled");
	}
}
