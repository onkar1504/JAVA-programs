package factorypattern;

public class PizzaDelvery {

	public static void main(String[] args)
	{
		PizzaStore store = new PizzaStore();
		Pizza pizza = store.orderPizza("chicago style cheese");
		System.out.println(pizza);
		
		System.out.println("****************");
		
		Pizza pizza1 = store.orderPizza("ny style cheese pizza");
		System.out.println(pizza1);

	}

}
 