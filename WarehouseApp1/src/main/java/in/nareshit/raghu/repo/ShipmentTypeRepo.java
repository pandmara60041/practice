package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.model.ShipmentType;

public interface ShipmentTypeRepo 
	extends JpaRepository<ShipmentType, Integer>
{
	
}
