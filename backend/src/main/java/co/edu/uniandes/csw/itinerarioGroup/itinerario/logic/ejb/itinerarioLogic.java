package co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.ejb;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.api.IitinerarioLogic;
import co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.dto.itinerarioDTO;
import co.edu.uniandes.csw.itinerarioGroup.itinerario.logic.dto.itinerarioPageDTO;

public class itinerarioLogic implements IitinerarioLogic{

    @PersistenceContext(unitName = "transporteClassPU")
    protected EntityManager entityManager;

	@Override
	public itinerarioDTO createitinerario(itinerarioDTO detail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<itinerarioDTO> getitinerarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public itinerarioPageDTO getitinerarios(Integer page, Integer maxRecords) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public itinerarioDTO getitinerario(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteitinerario(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateitinerario(itinerarioDTO detail) {
		// TODO Auto-generated method stub
		
	}



}
