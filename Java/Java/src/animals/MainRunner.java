/**
 * 
 */
package animals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author rucha.joshi
 *
 */
public class MainRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal dog1 = new Animal("Tom",4);
		Animal dog2 = new Animal("Biscuit",4);
		Animal dog3 = new Animal("Cookies",4);
		Animal dog4 = new Animal("Cookies",4);
		Animal dog5 = new Animal("Biscuit",4);
		
		ArrayList<Animal> dogList = new ArrayList<Animal>(Arrays.asList(dog1,dog2,dog3,dog4,dog5));
		
		//Animal[] shahsPet1 = {dog2,dog3}; //array of animals
		
		List<Animal> shahsPet2 = new ArrayList<Animal>(); //arraylist of animals
		shahsPet2.add(dog2);
		shahsPet2.add(dog3);
		shahsPet2.add(dog4);
		
		//another way to add dog2, dog3 in the list
		//List<Animal> shahsPet2 = new ArrayList<Animal>(Arrays.asList(dog2,dog3); //array list of animals
		
		for(Animal animal:shahsPet2) {
			System.out.println(animal.name); //printing Biscuit and Cookies
		}
		
		String animalName = "Cookies";
		
		//Animal animal = null;//creating an object
		
		ArrayList<Animal> aList = new ArrayList<>();
		
		for(int i = 0; i<shahsPet2.size();i++) {
			if(!shahsPet2.get(i).name.equals(animalName)) {
				//if not found continue loop
				continue;
			} else {
				//if match found move to new object and print the name
				//animal = shahsPet2.get(i);//moving found object to new object
				aList.add(shahsPet2.get(i));//add found elements to this new list
			}
		}
		System.out.println("No. of dog with the name : " + aList.size());
		
		/*
		//to remove dog name 
		for(int i = shahsPet2.size()-1; i>=0;i--) {
			if(!shahsPet2.get(i).name.equals(animalName)) {
				//if not found continue loop
				continue;
			} else {
				//if match found then remove				
				shahsPet2.remove(shahsPet2.get(i));//remove pets with name cookies
			}
		}
		System.out.println("No. of dogs in shahsPet : " + shahsPet2.size());
		*/
		
		System.out.println("Here is our available dogs: ");
		for(Animal dog:dogList) {
			System.out.println(dog.name);
		}
		
		ArrayList<Animal> distinct = new ArrayList<Animal>();
		
		for(int i = 0;i<dogList.size();i++) {
			boolean matched = false;
			for(int j = 0; j<i;j++)
			if(dogList.get(i).name.equals(distinct.get(j).name)) {
				matched = true;
				break;
				}
			if(!matched) {
				distinct.add(dogList.get(i));			
			}
		}
		System.out.println("Here is our unique dogs: ");
		for(Animal dog:distinct) {
			System.out.println(dog.name);
		}
		
	}

}
