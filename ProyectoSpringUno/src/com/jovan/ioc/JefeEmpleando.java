package com.jovan.ioc;

public class JefeEmpleando implements Empledos{
	
	private CreacionInforme informe; 
	
	
	public JefeEmpleando(CreacionInforme informe) {
		this.informe = informe;
	}

	@Override
	public String getTareas() {
		return "Gestiono a mis empleados";

	}

	@Override
	public String getInforme() {
		return "por el jefe "+informe.getInforme();
	}

}
