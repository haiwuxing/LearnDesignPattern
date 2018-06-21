
public abstract class CoffeineBeverageWithHook {
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		// We've added a little conditional statement that bases its success on a concrete mehtod,
		// customerWantsCondiments(). If the customer WANTS condiments, only then do we call addConidments
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("Boiling water");
	}
	
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	// This is a hook because the subclass can override this method, but does't have to.
	boolean customerWantsCondiments() {
		return true;
	}
}
