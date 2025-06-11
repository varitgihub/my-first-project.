package project.G9.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlacementRespository extends JpaRepository<Placement,Long>{

}
