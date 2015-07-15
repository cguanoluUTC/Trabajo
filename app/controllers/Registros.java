package controllers;

import models.Registro;
import play.mvc.Controller;

public class Registros extends Controller {

	public static void registro(){
		
	}
	public static void main(long code, String inpNombre, String inpApellido,String inpDireccion,String inpEmail,String inpContraseña){
		String nombre=inpNombre;
		String apellido=inpApellido;
		String direccion=inpDireccion;
		String email= inpEmail;
		String clave= inpContraseña;
		//creava una intanci y acedia a la clase guardaba
		Registro registros= new Registro(code, nombre, apellido, direccion, email, clave);
		registros.save();
		render(nombre,apellido,direccion,email, clave);

	}
	
	public static void secion(){
		render();
		
	}
	//acediendo al metod en el caso la interfaz
	public static void historial(){
		render();
		
	}
	
	public static void main2(String inpCedula,String inpNombres,String inpApellidos ,String inpDireccion2 ,String inpTelefono, String tfMensaje ){
		String cedula=inpCedula;
		String nombres = inpNombres;
		String apellidos = inpApellidos;
		String direccion2=inpDireccion2;
		String telefono= inpTelefono;
		String mensaje=tfMensaje;
		
		
		//Registro historiales= new Registro(1, cedula, nombres, apellidos, direccion2,telefono, mensaje);
		//Registro.save();
		
		render(cedula, nombres, apellidos, direccion2,telefono, mensaje);
		
	}
}
