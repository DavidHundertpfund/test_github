package linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class CheeseInserter {
	//private = Sichtbarkeit auf die eigene Klasse beschr�nkt 
	//static = unabh�ngig von einem Objekt, geh�rt zur Klasse 
	//final = Wert der Variable bleibt nach Initalsierung unver�ndert
	private static final Pattern vegetables = Pattern.compile(
			"Zucchini|Paprikas?|Tomaten?|Zwiebeln?"
			);
	
	private static void insertCheeseAroundVeggetable(List<String> ingredients) {
		//For Schleife alt Iterator als Laufvariable
		for(ListIterator<String> iterator = ingredients.listIterator();
				iterator.hasNext();) {
			//Auslesen der momentanen Zutat
			String ingredient = iterator.next();
			//�berpr�fen, ob die Zutat zu unserem Vegtable Pattern passt
			if(vegetables.matcher(ingredient).matches()) {
				iterator.add("K�se");
			}
		}
						
		
		
	}
			

	public static void main(String[] args) {
		List<String>ingredients = new ArrayList<>();
		Collections.addAll(ingredients, "Gnocchi", "Zucchini", "Paprika", "Milch", "Zwiebeln", "Melanzani");
		insertCheeseAroundVeggetable(ingredients);
		System.out.println(ingredients);
	}

}
