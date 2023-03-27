package paul.pham.postcode.information;

import jakarta.validation.constraints.NotBlank;

public class InformationCreateDTO {
	@NotBlank
	private String postcode;
	
	@NotBlank
	private String suburb;
	
	public InformationCreateDTO() {}
	
	public InformationCreateDTO(String postcode, String suburb) {
		this.postcode = postcode;
		this.suburb = suburb;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}
	
}
