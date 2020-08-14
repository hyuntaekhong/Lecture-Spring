package di.collection;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ListMain {
	public static void main(String[] args) {
		
		ApplicationContext container = new GenericXmlApplicationContext("di-collection01.xml");
		
//		ListAddress list = container.getBean("list", ListAddress.class);	//property 주입
//		ListAddress list = container.getBean("list02", ListAddress.class);	//constructor 주입
		ListAddress list = container.getBean("list03", ListAddress.class);	
		
		for(String addr : list.getAddress()) {
			System.out.println(addr);
		}

		for(int number : list.getNumbers()) {
			System.out.println(number);
		}
		
		
		/*
		List<String> address = new ArrayList<String>();
		address.add("서울");
		address.add("부산");
		address.add("공주");
		
		ListAddress list = new ListAddress();
		list.setAddress(address);
		*/
	}
}
