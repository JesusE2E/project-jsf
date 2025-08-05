package com.jesus.projectjsf.controllers;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

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
		
		// validar las credenciales 
		if(usuario.equals("jesus")&&(password.equals("123"))) {
			FacesContext.getCurrentInstance().addMessage("formLogin:idUsuario", new FacesMessage(FacesMessage.SEVERITY_INFO, "usuario correcto", ""));
			
		}else {
			FacesContext.getCurrentInstance().addMessage("formLoging:idUsuario", new FacesMessage(FacesMessage.SEVERITY_ERROR,"Usuario o pasword incorrectos", ""));
			
		}
	}
	
	
	
	
	
	
	
	
}
