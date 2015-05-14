package co.edu.uniandes.csw.usuarioGroup.usuario.logic.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UsuarioEntity implements Serializable{

    @Id
    @GeneratedValue(generator = "Usuario")
    private String id;
    private String pasaporte;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;

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
}
