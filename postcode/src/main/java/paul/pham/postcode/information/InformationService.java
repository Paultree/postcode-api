package paul.pham.postcode.information;

import java.util.List;
import java.util.Optional;

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
	
	public List<Information> getByPostCode(String postcode) {
		//verify postcode is between 0-9999
		return this.repository.findByPostcode(postcode);
	}
	
	public List<Information> getBySuburb(String suburb) {
		//verify it is a suburb - doesn't include numbers - only alphabet letters
		return this.repository.findBySuburb(suburb);
	}
}
