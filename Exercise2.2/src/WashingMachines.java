
public class WashingMachines {
	
		String brand;
		String colour;
		double weight;
		int warranty;
		double installationService, normalPrice;
		double [] c1, c2, c3, c4;
		int[]timer;
		String[] functionAndCapacity;
		int[] rinseSpin;

		
		void printWashingMachines(String b, String c, int w, int wrty) {
			System.out.println();
			System.out.println("--Detail--");
			System.out.println("Brand : " + b);
			System.out.println("Colour : " + c);
			System.out.println("Weight : " + w +"kg");
			System.out.println("Warranty: " + wrty +"years");
			System.out.println();
		}	
		void printPrice(double installationService, double normalPrice) {
			double totalPrice;
			totalPrice = installationService + normalPrice;
			System.out.println("The total price is RM" + totalPrice);
			System.out.println();
		}
		void printOnOff(boolean onOff) {
			if (onOff == true) {
				System.out.println("The washing machine is on!");
				System.out.println();
			}
			else 
				System.out.println("The washing machine is off!");
		}
		void function(String [] functionAndCapacity, int rs1, int rs2, int rs3, int rs4) {
			System.out.println("--Functions-- ");
			for (int i=0; i < functionAndCapacity.length; i++) {
					System.out.println(functionAndCapacity[i]);
			}System.out.println();
			System.out.println("--Rinse Spin--");
			System.out.println("Regular: " + rs1 + "minutes");
			System.out.println("Quick: " + rs2 + "minutes");
			System.out.println("Water Saving: " + rs3 + "minutes");
			System.out.println("Delicate: " + rs4 + "minutes");
	}
}
		
