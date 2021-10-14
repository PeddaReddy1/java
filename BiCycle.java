class BiCycle{
	String colour;
	float price;
	String brand;
	CycleTypes type=CycleTypes.GEAR;
	
	BiCycle(String colour,float price,String brand,cycleTypes type)
	{
		System.out.println("invoking bicycle constructor");
		this.colour=colour;
		this.price=price;
		this.brand=brand;
		this.type=type;
	}
	
	void brake()
	{
		System.out.println("invoking instance method brake");
	}
	
	void move()
	{
		System.out.println("invoking instance method move");
	}
	
	void displayDetails()
	{
		System.out.println("invoking display details");
		System.out.println("colour:"+colour);
		System.out.println("price:"+price);
		System.out.println("brand:"+brand);
		System.out.println("cycleTypes:"+type);
	}
}