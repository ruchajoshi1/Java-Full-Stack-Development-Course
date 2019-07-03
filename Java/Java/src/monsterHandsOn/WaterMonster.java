package monsterHandsOn;

public class WaterMonster extends Monster{

	WaterMonster(String name){
		super(name);
	} 
	
	public String attack() {
		return "Attack with Water!";
	}
}
