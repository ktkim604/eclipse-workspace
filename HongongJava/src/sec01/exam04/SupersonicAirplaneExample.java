package sec01.exam04;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeoff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.S;
		
		sa.fly();
		sa.flyMode = SupersonicAirplane.N;
		sa.fly();
		sa.land();
	}

}
