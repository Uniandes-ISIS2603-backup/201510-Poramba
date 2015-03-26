package co.edu.uniandes.csw.eventoGroup.evento.logic.dto;

import co.edu.uniandes.csw.eventoGroup.evento.logic.dto.EventoDTO;
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
