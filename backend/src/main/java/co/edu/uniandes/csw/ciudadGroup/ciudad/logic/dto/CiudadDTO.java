package co.edu.uniandes.csw.CiudadGroup.ciudad.logic.dto;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CiudadDTO {
    private String id;

    private String nombre;
    private String descripcion;
    private String link;
    private String pasaporte;


    public String getPasaporte()
    {
        return pasaporte;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void Link(String link) {
        this.link = link;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link)
    {
        this.link = link;
    }
    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
}