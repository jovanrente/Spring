package jovan.spring.anotaciones;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsosAnotaconesDos {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Empleados antonio = context.getBean("comercialExperto", Empleados.class);
		Empleados jovan = context.getBean("comercialExperto", Empleados.class);
		//validar si apunta al mismoobjeto en memoria 
		if(antonio == jovan) {
			System.out.println("apunta al mismo lugar en memoria ");
			System.out.println(antonio+"\n"+jovan);
		}else {
			System.out.println("No apunta al mismo lugar en memoria ");
			System.out.println(antonio+"\n"+jovan);
		}
		
		context.close();
	}

}
