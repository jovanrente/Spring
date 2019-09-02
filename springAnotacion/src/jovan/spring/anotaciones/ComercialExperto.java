package jovan.spring.anotaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ComercialExperto implements Empleados {

	@Autowired
	@Qualifier("imfomerFiancieroDos")
	private CreacionInformeFinanciero infofina;
	
	//injection con construtor 
	/*@Autowired
	public ComercialExperto(CreacionInformeFinanciero infofina) {
		this.infofina = infofina;
	}*/
	
	
	/*
	@Autowired	
	public void setInfofina(CreacionInformeFinanciero infofina) {
		this.infofina = infofina;
	}*/



	@Override
	public String getTareas() {
		return "vender, vender, vender mas";
	}

	@Override
	public String getInforme() {
		return "generado por el coemercial experto :" + infofina.getInfoFinan();
	}

}
