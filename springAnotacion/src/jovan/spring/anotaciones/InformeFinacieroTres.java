package jovan.spring.anotaciones;

import org.springframework.stereotype.Component;

@Component
public class InformeFinacieroTres implements CreacionInformeFinanciero {

	@Override
	public String getInfoFinan() {
		// TODO Auto-generated method stub
		return "Informe ejemplo 3";
	}

}
