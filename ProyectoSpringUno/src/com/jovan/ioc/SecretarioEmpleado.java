package com.jovan.ioc;

public class SecretarioEmpleado implements Empledos {

	private CreacionInforme informe;
	private String email;
	private String nomreEmpresa;
	
	public void setInforme(CreacionInforme informe) {
		this.informe = informe;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNomreEmpresa() {
		return nomreEmpresa;
	}


	public void setNomreEmpresa(String nomreEmpresa) {
		this.nomreEmpresa = nomreEmpresa;
	}


	@Override
	public String getTareas() {
		return "ser secretario del jefe";
	}

	@Override
	public String getInforme() {
		return "creado por secre "+ informe.getInforme();
	}

}
