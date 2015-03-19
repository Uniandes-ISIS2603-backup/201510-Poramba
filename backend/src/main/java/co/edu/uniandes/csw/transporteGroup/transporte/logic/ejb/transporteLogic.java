package co.edu.uniandes.csw.transporteGroup.transporte.logic.ejb;

import co.edu.uniandes.csw.transporteGroup.transporte.logic.api.ITransporteLogic;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.api.ItransporteLogic;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.converter.transporteConverter;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.dto.transporteDTO;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.dto.transportePageDTO;
import co.edu.uniandes.csw.transporteGroup.transporte.logic.entity.transporteEntity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class transporteLogic implements ITransporteLogic{

    @PersistenceContext(unitName = "transporteClassPU")
    protected EntityManager entityManager;

	@Override
	public transporteDTO createtransporte(transporteDTO detail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<transporteDTO> getTrantransportes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public transportePageDTO getTransportes(Integer page, Integer maxRecords) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public transporteDTO gettransporte(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletetransporte(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatetransporte(transporteDTO detail) {
		// TODO Auto-generated method stub
		
	}

}
