package com.jovan.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.jovan.ioc.Empledos;

public class UsoEmpleados {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DirectorEmpleado juan = context.getBean("miEmpleado",DirectorEmpleado.class);
		System.out.println(juan.getTareas());
		System.out.println(juan.getInforme());
		System.out.println(juan.getNombreEmpresa());
		
		
		System.out.println("\n*********secre**********\n");
		SecretarioEmpleado pedro = context.getBean("secretario",SecretarioEmpleado.class);
		
		System.out.println(pedro.getInforme());
		System.out.println(pedro.getEmail());
		System.out.println(pedro.getNomreEmpresa());

		
		context.close();
		
	} 

}
