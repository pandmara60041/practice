package in.nareshit.raghu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nareshit.raghu.model.ShipmentType;
import in.nareshit.raghu.repo.ShipmentTypeRepo;
import in.nareshit.raghu.service.IShipmentTypeService;

@Service
public class ShipmentTypeServiceImpl 
	implements IShipmentTypeService
{

	@Autowired
	private ShipmentTypeRepo repo; //HAS-A
	
	@Override
	public Integer saveShipmentType(ShipmentType st) {
		st = repo.save(st);
		Integer id = st.getId();
		return id;
	}
}
