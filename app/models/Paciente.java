package models;
import javax.persistence.Entity;

import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class Paciente extends Model {
    private String cedula_pac;
    private String nombre_pac;
    private String apellido_pac;
    private String direccion_pac;
    private String telefono_pac;

    public void enviarDatos(){
    }

}
