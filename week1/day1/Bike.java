package week1.day1;

public class Bike {
	
	public void accessCar()
	{
		Car c1 = new Car();
		
		System.out.println("Access Car Method from Bike");
		
		c1.applyBreak();
		c1.soundHorn();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b1 = new Bike();
		b1.accessCar();

	}

}
