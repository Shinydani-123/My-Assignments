package week1.day1;

public class Bike {

			
		public void applyGear() {
			
			System.out.println("Applied Gear");
			
		}
		
		public static void main(String[] args) {
			
			Bike check=new Bike();
			Car test=new Car();
			test.applyBreak();
			test.soundHorn();
		check.applyGear();
		}
		
	}

