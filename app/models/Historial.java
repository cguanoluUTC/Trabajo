package models;
import javax.persistence.Entity;

import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class Historial extends Model{
    private long codigo;
    private String cedula_pac;
    private String nombres_pac ;
    private String apellidos_pac ;
    private String direccion2_pac;
    private  String telefono_pac;
    private  String mensaje_pac;

    public Historial (long codigo, String cedula,String nombres,String apellidos ,String direccion2 ,String telefono, String mensaje ){
		
    	this.codigo = codigo;
    	this.cedula_pac = cedula;
    	this.nombres_pac = nombres;
    	this.apellidos_pac = apellidos;
    	this.direccion2_pac=direccion2;
    	this.telefono_pac = telefono;
    	this.mensaje_pac = mensaje;
    	
    	
    	
	}


}
