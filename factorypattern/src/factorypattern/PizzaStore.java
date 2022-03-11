package factorypattern;

public class PizzaStore
{
	Pizza orderPizza(String type)
	{
		Pizza pizza = null;
		
		if(type.equals("chicago style cheese"))
		{
			pizza =new ChicagoStyleCheesePizza();
		}
		else if (type.equals("ny style cheese pizza"))
		{ 
			pizza =new NYStyleCheesePizza();
		}
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	
}
