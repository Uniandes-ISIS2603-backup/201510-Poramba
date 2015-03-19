package co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.dto;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class itinerarioPageDTO {
    private Long totalRecords;

    private List<itinerarioDTO> records;

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<itinerarioDTO> getRecords() {
        return records;
    }

    public void setRecords(List<itinerarioDTO> records) {
        this.records = records;
    }
}
