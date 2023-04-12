package paul.pham.postcode.information;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InformationRepository extends JpaRepository<Information, Long>{
	List<Information> findBySuburb(String suburb);
	
	List<Information> findByPostcode(String postcode);
}
