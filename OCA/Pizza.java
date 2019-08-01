package OCA;

public class Pizza {
	 private String pizzaSize;
	  private int cheeseToppings;
	  private int pepperoniToppings;
	  private int hamToppings;
	  
	  public Pizza()
		{
			this.pizzaSize = "";
			this.cheeseToppings = 0;
			this.pepperoniToppings = 0;
			this.hamToppings = 0;
		}
	  
	public Pizza(String pizzaSize, int cheeseToppings, int pepperoniToppings, int hamToppings) {
		super();
		this.pizzaSize = pizzaSize;
		this.cheeseToppings = cheeseToppings;
		this.pepperoniToppings = pepperoniToppings;
		this.hamToppings = hamToppings;
	}
	public String getPizzaSize() {
		return pizzaSize;
	}
	public void setPizzaSize(String pizzaSize) {
		this.pizzaSize = pizzaSize;
	}
	public int getCheeseToppings() {
		return cheeseToppings;
	}
	public void setCheeseToppings(int cheeseToppings) {
		this.cheeseToppings = cheeseToppings;
	}
	public int getPepperoniToppings() {
		return pepperoniToppings;
	}
	public void setPepperoniToppings(int pepperoniToppings) {
		this.pepperoniToppings = pepperoniToppings;
	}
	public int getHamToppings() {
		return hamToppings;
	}
	public void setHamToppings(int hamToppings) {
		this.hamToppings = hamToppings;
	}
	public double calcCost() {
		double cost=0.0;
		if(pizzaSize.equals("Small"))
			cost=10+cheeseToppings*2+pepperoniToppings*2+hamToppings*2;
		else if(pizzaSize.equals("Medium")) {
			cost=12+cheeseToppings*2+pepperoniToppings*2+hamToppings*2;
		}
		else if(pizzaSize.equals("Large")) {
			cost=14+cheeseToppings*2+pepperoniToppings*2+hamToppings*2;
		}
		return  cost;
	}
	
	  
}
