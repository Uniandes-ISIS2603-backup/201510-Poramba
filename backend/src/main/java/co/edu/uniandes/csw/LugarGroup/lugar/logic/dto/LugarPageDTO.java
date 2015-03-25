package co.edu.uniandes.csw.LugarGroup.lugar.logic.dto;


import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LugarPageDTO {
    private Long totalRecords;

    private List<LugarDTO> records;

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<LugarDTO> getRecords() {
        return records;
    }

    public void setRecords(List<LugarDTO> records) {
        this.records = records;
    }
}
