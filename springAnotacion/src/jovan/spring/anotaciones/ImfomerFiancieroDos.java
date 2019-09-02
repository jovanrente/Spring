package jovan.spring.anotaciones;

import org.springframework.stereotype.Component;

@Component
public class ImfomerFiancieroDos implements CreacionInformeFinanciero {

	@Override
	public String getInfoFinan() {
		// TODO Auto-generated method stub
		return "Pecentaconde informe dejemplo dos ";
	}

}
