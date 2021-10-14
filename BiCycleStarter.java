class BiCycleStarter{
	public static void main(String[] vehicles)
	{
		String colour="Red";
		float price=6999f;
		BiCycle cycle=new BiCycle(colour,price,"Atlas",c ycleTypes.GEAR);
		cycle.brake();
		cycle.move();
		cycle.displayDetails();
	}
}