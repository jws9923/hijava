package hijava.basic;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
	private static CarFactory _instance;
	private Map<String, Car> mapCar = new HashMap<>();

	private CarFactory() {
	}

	public static CarFactory getInstance() {
		if (_instance == null)
			_instance = new CarFactory();
		
		return _instance;
	}
	
	// 김일수 : 김일수의 차
	// 김일수 : 김일수의 차
	// 김이수 : 김이수의 차
	
	public Car createCar(String name) {
		if (!mapCar.containsKey(name))
			mapCar.put(name, new Car(name));
			
		return mapCar.get(name);
			
		// ------------------------
		
//		if (mapCar.containsKey(name)) {
//			return mapCar.get(name);
//			
//		} else {
//			Car car = new Car(name);
//			mapCar.put(name, car);
//			return car;
//		}
		
	}
	
}
