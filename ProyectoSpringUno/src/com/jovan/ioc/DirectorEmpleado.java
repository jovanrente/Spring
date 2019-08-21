package com.jovan.ioc;

public class DirectorEmpleado implements Empledos {
	
	private CreacionInforme informe; 
	
	//creacion de cosntructor que inyecta la dependencia 
	public  DirectorEmpleado(CreacionInforme informe) {
		this.informe = informe;
	}

	@Override
	public String getTareas() {
		return "El que manda";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "creado por el director "+informe.getInforme();
	}

}
