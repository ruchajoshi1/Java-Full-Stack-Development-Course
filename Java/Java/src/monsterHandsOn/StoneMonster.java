package monsterHandsOn;

public class StoneMonster extends Monster{

	StoneMonster(String name){
		super(name);
	}
	
	public String attack() {
		return "Attack with Stones!";
	}
}
