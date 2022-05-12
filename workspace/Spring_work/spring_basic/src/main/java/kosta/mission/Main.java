package kosta.mission;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	
	
	public static void main(String[] args) {
	
		Resource resource = new ClassPathResource("applicationContext.xml");
		
		/*
		 * BeanFactory factory = new GenericXmlApplicationContext(resource);
		 */
		
		ApplicationContext factory = new GenericXmlApplicationContext(resource);
		
		Restaurant restaurant = (Restaurant)factory.getBean("testRestaurant");
		restaurant.insert();
		
	}

}
