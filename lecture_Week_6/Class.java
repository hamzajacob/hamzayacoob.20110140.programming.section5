package lecture7;


public class Car {
	//1. declare attributes
	String color;
	int year;
	String model;
	
	//2. define methods
	public void start()
	{
		System.out.println("... Starting ...");
	}
	public void beep()
	{
		System.out.println("... Beeeeeeeeep ...");
	}
	public void stop()
	{
		System.out.println("... Stopping ...");
	}
	public int getYear()
	{
		return year;
	}
}