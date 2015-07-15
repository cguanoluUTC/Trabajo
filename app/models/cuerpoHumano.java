package models;
import javax.persistence.Entity;

import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class cuerpoHumano extends Model {
    private int codigo_cuerpo;
    private String partes_cuerpo;
    private int descripcionPartes_cuerpo;
    private String imagenesPartes_cuerpo;
    private String cedula_pac;
    private String cedula_doc;

    public void seleccionar_cuerpo(){
    }

    public void mostrarDescripcion_cuerpo(){
    }

}
