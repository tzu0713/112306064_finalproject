public class Tester {
	public static void main(String[] args) {
	Meal eatMeal = new Meal(300, "師大");
	Drink drink = new Drink(150,"校外","手搖");
			
	eatMeal.costOfTheMeal();
	eatMeal.whereToHaveMeal();
	
	drink.costOfTheDrink();
	drink.whereToHaveMeal();
	}
}

