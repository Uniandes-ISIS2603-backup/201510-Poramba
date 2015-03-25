package co.edu.uniandes.csw.usuarioGroup.usuario.logic.dto;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UsuarioPageDTO {
    private Long totalRecords;

    private List<UsuarioDTO> records;

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<UsuarioDTO> getRecords() {
        return records;
    }

    public void setRecords(List<UsuarioDTO> records) {
        this.records = records;
    }
}
