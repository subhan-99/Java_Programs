package ClassesAndObjects;

public class ClassesObjectDemo {
	public static void main(String[] args) {
		Car car1 = new Car();
	    car1.Speed = 100;
	    car1.colour = "Red";
	    car1.brand = "Toyota";
	    car1.drive();
	    
	    Car car2 = new Car();
	    car2.Speed = 120;
	    car2.brand = "Kia";
	    car2.colour = "White";
	    car2.drive();
	}

}
