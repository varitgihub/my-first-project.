package project.G9.demo;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlacementserviceImpl implements PlacementService{
    @Autowired
	PlacementRespository placementRespository;

	@Override
	public Placement savePlacement(Placement placement) {
		// TODO Auto-generated method stub
		return  placementRespository.save(placement);
	}

	@Override
	public List<Placement> fetchplacementList() {
		// TODO Auto-generated method stub
		return placementRespository .findAll();
	}

	@Override
	public Placement fetchplacementById(Long placementId) {
		// TODO Auto-generated method stub
		return placementRespository.findById(placementId).get();
	}

	@Override
	public Placement updateplacement(Long placementId, Placement placement) {
		Placement placementDB=placementRespository.findById(placementId).get();
		
		if(Objects.nonNull(placement.getName())&&
		!"".equalsIgnoreCase(placement.getName())){
			placementDB.setName(placement.getName());
}
       
		if(Objects.nonNull(placement.getCollege())&&
		!"".equalsIgnoreCase(placement.getCollege())){
			placementDB.setCollege(placement.getCollege());
		}
		if(Objects.nonNull(placement.getPrivatedate())&&
		!"".equalsIgnoreCase(placement.getPrivatedate())){
					placementDB.setPrivatedate(placement.getPrivatedate());
		}
		if(Objects.nonNull(placement.getQualification())&&
				!"".equalsIgnoreCase(placement.getQualification())){
					placementDB.setQualification(placement.getQualification());
		}
		if(Objects.nonNull(placement.getYear())&&
				!"".equalsIgnoreCase(placement.getYear())){
					placementDB.setYear(placement.getYear());
		}
		return placementRespository.save(placementDB);
	}

	@Override
	public void deleteplacementById(Long placementId) {
		// TODO Auto-generated method stub
		placementRespository.deleteById(placementId);
	}
	}
