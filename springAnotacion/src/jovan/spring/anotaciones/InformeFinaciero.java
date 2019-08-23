package jovan.spring.anotaciones;

import org.springframework.stereotype.Component;

@Component
public class InformeFinaciero implements CreacionInformeFinanciero {

	@Override
	public String getInfoFinan() {
		return "presentacion de informe finaciero";
	}

}
