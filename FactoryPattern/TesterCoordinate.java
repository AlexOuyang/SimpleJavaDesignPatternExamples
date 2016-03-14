/**
 * This is the tester for coordinate factory pattern
 */

import java.util.*;


public class TesterCoordinate {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) System.out.println("\n");

		CoordinateFactory factory = new CoordinateFactory();

		if (factory.getCoordinate("1D") == null) System.out.println("Wrong Result!!!");
		else System.out.println("getCoordinate() passed check");
		if (factory.getCoordinate("2D") == null) System.out.println("Wrong Result!!!");
		else System.out.println("getCoordinate() passed check");
		if (factory.getCoordinate("3D") == null) System.out.println("Wrong Result!!!");
		else System.out.println("getCoordinate() passed check");
		if (factory.getCoordinate("invalid") != null) System.out.println("Wrong Result!!!");
		else System.out.println("getCoordinate() passed check");

		System.out.println("\n");

		// Test1
		Coordinate c1 = factory.getCoordinate(3);
		Coordinate c2 = factory.getCoordinate(4);
		c1.setLabel("c1");
		c2.setLabel("c2");
		String c1L = c1.getLabel() + c1.toString();
		String c2L = c2.getLabel() + c2.toString();
		System.out.println("Distnace between " + c1L + " and " + c2L + " is " + c1.distance(c2));
		if (c1.distance(c2) == 1) System.out.println("Correct distance calculated\n");
		else System.out.println("Wrong Result!!!");

		System.out.println("\n");

		// Test2
		c1 = factory.getCoordinate(3, 0);
		c2 = factory.getCoordinate(0, 4);
		c1.setLabel("c1");
		c2.setLabel("c2");
		c1L = c1.getLabel() + c1.toString();
		c2L = c2.getLabel() + c2.toString();
		System.out.println("Distnace between " + c1L + " and " + c2L + " is " + c1.distance(c2));
		if (c1.distance(c2) == 5) System.out.println("Correct distance calculated\n");
		else System.out.println("Wrong Result!!!");

		System.out.println("\n");


		double result = 0.0;

		// Test2
		c1 = factory.getCoordinate(30, 20.5, 22);
		c2 = factory.getCoordinate(-30, 40.11, -22);
		c1.setLabel("c1");
		c2.setLabel("c2");
		c1L = c1.getLabel() + c1.toString();
		c2L = c2.getLabel() + c2.toString();
		System.out.println("Distnace between " + c1L + " and " + c2L + " is " + c1.distance(c2));
		result = calculateDistanceBetweenTwoPointsForVerification3D(c1, c2);
		if (c1.distance(c2) == result) System.out.println("Correct distance calculated\n");
		else System.out.println("Wrong Result!!!");


		System.out.println("\n");

		c1 = factory.getCoordinate("3D");
		c2 = factory.getCoordinate("3D");
		c1.setLabel("c1");
		c2.setLabel("c2");
		c1L = c1.getLabel() + c1.toString();
		c2L = c2.getLabel() + c2.toString();
		System.out.println("Distnace between " + c1L + " and " + c2L + " is " + c1.distance(c2));
		result = calculateDistanceBetweenTwoPointsForVerification3D(c1, c2);
		if (c1.distance(c2) == result) System.out.println("Correct distance calculated\n");
		else System.out.println("Wrong Result!!!");


		System.out.println("\n");


		// Test2
		System.out.println("Correct!!! An exception should be thrown here saying Param should be of type Coordinate3D");
		c1 = factory.getCoordinate("3D");
		c2 = factory.getCoordinate("2D");
		c1.setLabel("c1");
		c2.setLabel("c2");
		c1L = c1.getLabel() + c1.toString();
		c2L = c2.getLabel() + c2.toString();
		System.out.println("Distnace between " + c1L + " and " + c2L + " is " + c1.distance(c2));
		result = calculateDistanceBetweenTwoPointsForVerification3D(c1, c2);
		if (c1.distance(c2) == result) System.out.println("Correct distance calculated\n");
		else System.out.println("Wrong Result!!!");


		for (int i = 0; i < 5; i++) System.out.println("\n");

	}


	public static double calculateDistanceBetweenTwoPointsForVerification3D(Coordinate c1, Coordinate c2) {
		return Math.sqrt(Math.pow(((Coordinate3D)c1).getX() - ((Coordinate3D)c2).getX(), 2) + Math.pow(((Coordinate3D)c1).getY() - ((Coordinate3D)c2).getY(), 2) + Math.pow(((Coordinate3D)c1).getZ() - ((Coordinate3D)c2).getZ(), 2));
	}


}
