public class CoordinateFactoryTester {
	public static void main(String[] args) {

		// test no param Coordinate1D
		testNoParam("1");
		// test no param Coordinate2D
		testNoParam("2d");
		// test no param Coordinate3D
		testNoParam("3D");

		CoordinateFactory coordinateFactory = new CoordinateFactory();
		// to test Coordinate1D with params
		Coordinate first = coordinateFactory.getCoordinate(-2);
		Coordinate second = coordinateFactory.getCoordinate(5);
		first.label("first 1D point");
		second.label("second 1D point");
		if (first.getLabel().equals("first 1D point")) {
			System.out.println("Coordinate1D label methods passed! :D");
		} else {
			System.out.println("Coordinate1D label methods failed :(");
			return;
		}
		System.out.println(first.toString());
		System.out.println(second.toString());
		System.out.println("Distnace: " + first.distance(second));
		if (first.distance(second) == 7) {
			System.out.println("Coordinate1D distance methods passed! :D\n");
		} else {
			System.out.println("Coordinate1D distance methods failed :(");
			return;
		}

		// to test Coordinate2D with params
		first = coordinateFactory.getCoordinate(-2, 0);
		second = coordinateFactory.getCoordinate(5, 0);
		first.label("first 2D point");
		second.label("second 2D point");
		if (first.getLabel().equals("first 2D point")) {
			System.out.println("Coordinate2D label methods passed! :D");
		} else {
			System.out.println("Coordinate2D label methods failed :(");
			return;
		}
		System.out.println(first.toString());
		System.out.println(second.toString());
		System.out.println("Distnace: " + first.distance(second));
		if (first.distance(second) == 7) {
			System.out.println("Coordinate2D distance methods passed! :D\n");
		} else {
			System.out.println("Coordinate2D distance methods failed :(");
			return;
		}

		// to test Coordinate3D with params
		first = coordinateFactory.getCoordinate(-3, -8, 8);
		second = coordinateFactory.getCoordinate(1, -8, 11);
		first.label("first 3D point");
		second.label("second 3D point");
		if (first.getLabel().equals("first 3D point")) {
			System.out.println("Coordinate3D label methods passed! :D");
		} else {
			System.out.println("Coordinate3D label methods failed :(");
			return;
		}
		System.out.println(first.toString());
		System.out.println(second.toString());
		System.out.println("Distnace: " + first.distance(second));
		if (first.distance(second) == 5) {
			System.out.println("Coordinate3D distance methods passed! :D\n");
		} else {
			System.out.println("Coordinate3D distance methods failed :(");
			return;
		}

		// CoordinateFactory coordinateFactory = new CoordinateFactory();
		// // get an object of Coordinate1D and test its methods.
		// Coordinate oneDim = coordinateFactory.getCoordinate("1");
		// Coordinate secondOneDim = coordinateFactory.getCoordinate("1d");
		// oneDim.label("first 1D point");
		// secondOneDim.label("second 1D point");
		// if (oneDim.getLabel().equals("first 1D point")) {
		// System.out.println("Coordinate 1D label methods passed! :D");
		// } else {
		// System.out.println("Coordinate 1D label methods failed :(");
		// return;
		// }
		// System.out.println(oneDim.toString());
		// System.out.println(secondOneDim.toString());
		// System.out.println(oneDim.distance(secondOneDim));
		//
		// // get an object of Coordinate2D and test its methods.
		// Coordinate twoDim = coordinateFactory.getCoordinate("2");
		// Coordinate secondTwoDim = coordinateFactory.getCoordinate("2D");
		// twoDim.label("first 2D point");
		// secondTwoDim.label("second 2D point");
		// if (twoDim.getLabel().equals("first 2D point")) {
		// System.out.println("Coordinate 2D label methods passed! :D");
		// } else {
		// System.out.println("Coordinate 2D label methods failed :(");
		// return;
		// }
		// System.out.println(twoDim.toString());
		// System.out.println(secondTwoDim.toString());
		// System.out.println(twoDim.distance(secondTwoDim));
		//
		// // get an object of Coordinate3D and test its methods.
		// Coordinate threeDim = coordinateFactory.getCoordinate("2");
		// Coordinate secondThreeDim = coordinateFactory.getCoordinate("2D");
		// threeDim.label("first 3D point");
		// secondThreeDim.label("second 3D point");
		// if (twoDim.getLabel().equals("first 3D point")) {
		// System.out.println("Coordinate 3D label methods passed! :D");
		// } else {
		// System.out.println("Coordinate 3D label methods failed :(");
		// return;
		// }
		// System.out.println(threeDim.toString());
		// System.out.println(secondThreeDim.toString());
		// System.out.println(threeDim.distance(secondThreeDim));
	}

	public static void testNoParam(String type) {
		CoordinateFactory coordinateFactory = new CoordinateFactory();
		Coordinate first = coordinateFactory.getCoordinate(type);
		Coordinate second = coordinateFactory.getCoordinate(type);
		first.label("first point");
		second.label("second point");
		if (first.getLabel().equals("first point")) {
			System.out.println("Coordinate label methods passed! :D");
		} else {
			System.out.println("Coordinate label methods failed :(");
			return;
		}
		System.out.println(first.toString());
		System.out.println(second.toString());
		System.out.println("Distance: " + first.distance(second) + "\n");
	}
}
