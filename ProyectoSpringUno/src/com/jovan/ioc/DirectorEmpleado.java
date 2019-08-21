package com.jovan.ioc;

public class DirectorEmpleado implements Empledos {
	
	private CreacionInforme informe; 
	private String email;
	private String nombreEmpresa;
	
	//creacion de cosntructor que inyecta la dependencia 
	public  DirectorEmpleado(CreacionInforme informe) {
		this.informe = informe;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
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
	
	//metodo init. ejecutar tareas antes de que el bean este disponible 
	public void init() {
		System.out.println("dentro del metodo init");
	}
	
	//metodod destroy
	public void metodofinal() {
		System.out.println("metodo ejecuta despues de la utilizacion del bean ");
	}


}
