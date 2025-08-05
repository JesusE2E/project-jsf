package com.jesus.projectjsf.controllers;

import javax.faces.bean.ManagedBean;

/*Clase que permite controlar el funcionamiento
 * de el formurario y lo mapea a un POJO
 * */
@ManagedBean
public class LogingController {

	private String usuario;
	private String password;
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void ingresar() {
		System.out.println("usuaaaaaario"+usuario);
	}
}
