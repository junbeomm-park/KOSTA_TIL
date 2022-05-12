package kosta.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	
	
	public static void main(String[] args) {
	
		//Resource resource = new ClassPathResource("applicationContext.xml");
		
		/*
		 * BeanFactory factory = new GenericXmlApplicationContext(resource);
		 */
		
		//ApplicationContext factory = new GenericXmlApplicationContext(resource);
		
		//ApplicationContext factory = new AnnotationConfigApplicationContext(Factory.class);
		
		String configLocations[] = {
				"applicationContext.xml","commonConcern.xml"
		};
		
		ApplicationContext factory = new ClassPathXmlApplicationContext(configLocations);
		
		//Service service = (Service)factory.getBean("writeService");
		//service.insert(); //공통 관심사 메소드도 함께 출력
		
		Kosta service = (Kosta)factory.getBean("kostaService");
		service.insert();
		
	}

}
