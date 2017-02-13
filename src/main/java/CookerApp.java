
public class CookerApp {

	public static void main(String[] args) {

		Cooker cooker = new Cooker();
		cooker.cook();
		
		Cooker griller = new Grill();
		griller.cook();
		
		Cooker ovener = new PizzaOven();
		ovener.cook();
		
		Cooker stover = new Stove();
		stover.cook();
	}

}
