package paul.pham.postcode.information;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/employee")
public class InformationController {
	
	Logger logger = LoggerFactory.getLogger(InformationController.class);
	
	@Autowired
	private InformationService service;
	
	@GetMapping("/postcode")
	public ResponseEntity<List<Information>> getByPostcode(@RequestParam String postcode) {
		List<Information> suburb = this.service.getByPostCode(postcode);
		if (suburb.isEmpty()) {
			logger.error("Suburb not found.");
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		logger.info("Suburb found.");
		return new ResponseEntity<>(suburb, HttpStatus.OK);
	}
	
	@GetMapping("/suburb")
	public ResponseEntity<List<Information>> getBySuburb(@RequestParam String suburb) {
		List<Information> postcode = this.service.getBySuburb(suburb);
		if (postcode.isEmpty()) {
			logger.error("Postcode not found.");
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		logger.info("Postcode found.");
		return new ResponseEntity<>(postcode, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Information> create(@RequestBody InformationCreateDTO data) {
		Information createdInfo = this.service.create(data);
		return new ResponseEntity<>(createdInfo, HttpStatus.CREATED);
	}
}
