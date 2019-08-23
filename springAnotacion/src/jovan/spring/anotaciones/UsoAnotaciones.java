package jovan.spring.anotaciones;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotaciones {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Empleados antonio = context.getBean("comercialExperto", Empleados.class);
		System.out.println(antonio.getInforme());
		System.out.println(antonio.getTareas());
		context.close();
		
	}

}
