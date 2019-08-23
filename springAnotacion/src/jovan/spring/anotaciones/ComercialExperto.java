package jovan.spring.anotaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperto implements Empleados {

	private CreacionInformeFinanciero infofina;
	
	@Autowired
	public ComercialExperto(CreacionInformeFinanciero infofina) {
		this.infofina = infofina;
	}

	@Override
	public String getTareas() {
		return "vender, vender, vender mas";
	}

	@Override
	public String getInforme() {
		return "generado por el coemercial experto :" + infofina.getInfoFinan();
	}

}
