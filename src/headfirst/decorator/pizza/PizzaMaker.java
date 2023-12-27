package headfirst.decorator.pizza;

public class PizzaMaker {
	
	public static void main(String[] args){
		// The PlainPizza object is sent to the Mozzarella constructor
		// and then to the TomatoSauce constructor
		//Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		Pizza pizza = new PlainPizza();
        pizza = new Mozzarella(pizza);
        pizza = new TomatoSauce(pizza);
		System.out.println("Ingredients: " + pizza.getDescription());
		System.out.println("Price: " + pizza.getCost());
	}
}
