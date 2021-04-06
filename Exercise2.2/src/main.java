public class main {

	public static void main(String[] args) {
		WashingMachines a = new WashingMachines();
		String [] functionAndCapacity_A = {"Regular", "Quick", "Water Saving", "Delicates"};
		int rsA1=35,rsA2=40,rsA3=25,rsA4=35;
		a.functionAndCapacity = functionAndCapacity_A;
		a.printWashingMachines("Toshiba", "Black", 41, 10);
		a.printOnOff(true);
		a.printPrice(20, 1000);
		a.function(a.functionAndCapacity, 40, 45, 30, 55);
		
		WashingMachines b = new WashingMachines();
		String [] functionAndCapacity_B = {"Regular", "Quick", "Water Saving", "Delicates"};
		int rsB1=40, rsB2=45, rsB3=30, rsB4=55;
		a.functionAndCapacity = functionAndCapacity_B;
		a.printWashingMachines("LG", "White", 50, 12);
		a.printOnOff(true);
		a.printPrice(50, 2000);
		a.function(a.functionAndCapacity, 45, 50, 25, 50);

		
	}
	
}