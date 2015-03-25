package co.edu.uniandes.csw.usuarioGroup.usuario.logic.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UsuarioDTO {
    private Long id;

    private String pasaporte;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }
    
    public String getPasaporte() {
        return pasaporte;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimento(String fechaNacimiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}