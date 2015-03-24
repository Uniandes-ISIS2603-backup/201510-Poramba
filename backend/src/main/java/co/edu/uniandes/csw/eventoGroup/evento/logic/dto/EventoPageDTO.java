package co.edu.uniandes.csw.SportGroup.evento.logic.dto;

import co.edu.uniandes.csw.SportGroup.usuario.logic.dto.*;
import co.edu.uniandes.csw.SportGroup.transporte.logic.dto.*;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EventoPageDTO {
    private Long totalRecords;

    private List<EventoDTO> records;

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<EventoDTO> getRecords() {
        return records;
    }

    public void setRecords(List<EventoDTO> records) {
        this.records = records;
    }
}