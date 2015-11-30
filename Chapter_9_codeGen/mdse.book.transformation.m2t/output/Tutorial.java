package webapp.entities;

import java.io.Serializable;

public class Tutorial implements Serializable {

	private String title;

	public String getTitle() {
		return title;
	}	

	private String presenter;

	public String getPresenter() {
		return presenter;
	}	

	public Boolean checkAvailability() {
		// Start of user code checkAvailability
		// Fill in the operation implementation here!
		return true;
		// End of user code
	}

	public Boolean hasParticipants() {
		// Start of user code hasParticipants
		// Fill in the operation implementation here!
		return true;
		// End of user code
	}

}
