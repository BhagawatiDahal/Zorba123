package mypractice;

import java.util.Arrays;

public class ClassTest1 {

	public static void main(String[] args) {

		int[][][] abc = { { { 123, 234, 456 }, { 546, 567, 998 }, { 678, 764, 908 }, } };

		for (int[][] cd : abc) {
			for (int[] cde : cd) {
				for (int def : cde) {
					System.out.println(def);
				}
			}
		}

		// Vehicle car= new Vehicle("red","suv");
		// car.getColor();

		Vehicle vc[] = { new Vehicle("orange", "le"), new Vehicle("white", "XE"), new Vehicle("black", "xse") };

		for (Vehicle cd : vc) {
			cd.getColor();
			System.out.println(cd.type);

		}

		// for(Vehicle i=0;i<vc.length; i++) {

		// }

	}
}

class Vehicle {
	private String color;
	String type;

	public Vehicle(String col, String ty) {
		this.color = col;
		this.type = ty;
	}

	public void getColor() {
		System.out.println(this.color);

	}

	public void start() {
		System.out.println("I can start");
	}

	public void stop() {

		System.out.println(" I can stop");

	}
}