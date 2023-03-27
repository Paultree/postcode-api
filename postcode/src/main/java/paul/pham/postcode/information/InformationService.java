package paul.pham.postcode.information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class InformationService {
	@Autowired
	private InformationRepository repository;
	
	public Information create(InformationCreateDTO data) {
		Information newInformation = new Information(data.getPostcode(), data.getSuburb());
		this.repository.save(newInformation);
		return newInformation;
	}
	
	
}
