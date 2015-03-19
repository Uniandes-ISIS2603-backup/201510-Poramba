package co.edu.uniandes.csw.SportGroup.hotel.logic.dto;

import co.edu.uniandes.csw.SportGroup.usuario.logic.dto.*;
import co.edu.uniandes.csw.SportGroup.transporte.logic.dto.*;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HotelPageDTO {
    private Long totalRecords;

    private List<HotelDTO> records;

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<HotelDTO> getRecords() {
        return records;
    }

    public void setRecords(List<HotelDTO> records) {
        this.records = records;
    }
}
