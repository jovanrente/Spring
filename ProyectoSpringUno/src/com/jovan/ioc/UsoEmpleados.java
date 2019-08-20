package com.jovan.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {
	
	public static void main(String[] args) {
		
		/*Empledos emplado1 = new JefeEmpleando();
		Empledos emplado2 = new SecretarioEmpleado();
		System.out.println(emplado1.getTareas());*/
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empledos juan = context.getBean("miEmpleado",Empledos.class);
		System.out.println(juan.getTareas());
		
		context.close();
		
	} 

}
