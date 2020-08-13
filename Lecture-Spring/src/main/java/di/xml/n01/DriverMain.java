package di.xml.n01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("di-xml01.xml");
		
		Car car = (Car)context.getBean("car2");
		car.prnTrieBrand();
		
		/*
		// 방법1 
		Car car = (Car)context.getBean("car");
		Tire tire = (Tire)context.getBean("tire");
		car.setTire(tire);
		
		car.prnTrieBrand();
	
		Car car = new Car();
		
		Tire tire = new HankookTire();
		car.setTire(tire);
		
		car.prnTrieBrand();
		*/
	}
}
