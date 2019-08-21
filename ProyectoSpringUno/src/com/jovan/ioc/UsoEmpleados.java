package com.jovan.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.jovan.ioc.Empledos;

public class UsoEmpleados {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empledos juan = context.getBean("miEmpleado",Empledos.class);
		System.out.println(juan.getTareas());
		System.out.println(juan.getInforme());
		
		SecretarioEmpleado pedro = context.getBean("secretario",SecretarioEmpleado.class);
		
		System.out.println(pedro.getInforme());
		System.out.println(pedro.getEmail());
		System.out.println(pedro.getNomreEmpresa());

		
		context.close();
		
	} 

}
