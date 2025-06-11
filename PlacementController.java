package project.G9.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class PlacementController {

    @Autowired
	PlacementService placementService;
	
	@PostMapping("/placement")
	 public Placement savePlacement(@RequestBody Placement Placement) {
	 	
	 	return placementService.savePlacement(Placement);
	 }
	 
	@GetMapping("/placement")
	public List<Placement> fetchplacementList()  {
	    return placementService.fetchplacementList();
	}	

	@GetMapping ("/placement/{id}")
	public Placement fetchplacementById(@PathVariable("id") Long placementId)
	{
	return placementService.fetchplacementById(placementId);
}
	@DeleteMapping("/placement/{id}")
	public String deleteplacementById (@PathVariable ("id") Long placementId) 
	{
		 placementService.deleteplacementById(placementId);
		return "placement deleted successfully!!";
		
}
	
	@PutMapping ("/placement/{id}")
	public Placement updateplacement (@PathVariable ("id") Long placementId,
	                                  @RequestBody Placement placement) {
	return placementService.updateplacement(placementId, placement);
}
}