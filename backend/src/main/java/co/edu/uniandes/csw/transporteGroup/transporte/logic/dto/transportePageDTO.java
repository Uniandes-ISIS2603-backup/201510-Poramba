package co.edu.uniandes.csw.transporteGroup.transporte.logic.dto;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class transportePageDTO {
    private Long totalRecords;

    private List<transporteDTO> records;

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<transporteDTO> getRecords() {
        return records;
    }

    public void setRecords(List<transporteDTO> records) {
        this.records = records;
    }
}
