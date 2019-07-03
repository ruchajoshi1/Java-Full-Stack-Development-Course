/**
 * 
 */
package monsterHandsOn;

/**
 * @author rucha.joshi
 *
 */
public class TestMonster {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Program at the "interface" defined in the superclass.
	      // Declare instances of the superclass, substituted by subclasses.
	      Monster m1 = new FireMonster("r2u2");   // upcast
	      Monster m2 = new WaterMonster("u2r2");  // upcast
	      Monster m3 = new StoneMonster("r2r2");  // upcast

	      // Invoke the actual implementation
	      System.out.println(m1.attack());  // Run FireMonster's attack()
	      System.out.println(m2.attack());  // Run WaterMonster's attack()
	      System.out.println(m3.attack());  // Run StoneMonster's attack()

	      // m1 dies, generate a new instance and re-assign to m1.
	      m1 = new StoneMonster("a2b2");  // upcast
	      System.out.println(m1.attack());  // Run StoneMonster's attack()

	      // We have a problem here!!!
	      Monster m4 = new Monster("u2u2");
	      
	      System.out.println(m4.attack());  // garbage!!!
	      
	      //up casting, down casting
	      FireMonster f1 = new FireMonster("r2u2");
	      Monster m5 = new FireMonster("r2u2");
	      
	      WaterMonster w1 = new WaterMonster("r2u2");
	      Monster m6 = new WaterMonster("r2u2");
	      
	      f1 = (FireMonster) m5; //down casting as m5 is parent and f1 is a child
	      m5 = f1; //up casting
	      
	      m5 = m6;// as both are parent objects( not from same child)


	}

}
