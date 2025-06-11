package project.G9.demo;

import java.util.List;

public interface PlacementService {

	public Placement savePlacement(Placement placement);

	public List<Placement> fetchplacementList();

	public Placement fetchplacementById(Long placementId);

	public void deleteplacementById(Long placementId);

	 public Placement updateplacement(Long placementId, Placement placement);

}
