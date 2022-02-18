public class Monkey extends RescueAnimal{

	// variables
	private String species;
	private String bodyLength;
	private String height;
	private String tailLength;
	
	
	// constructor
	// constructor will set all attributes for monkey
	public Monkey(String name, String gender, String age,
		    String weight, String acquisitionDate, String acquisitionCountry,
			String trainingStatus, boolean reserved, String inServiceCountry, String tailLength, String height, String bodyLength, String species) {
		        setName(name);
		        setGender(gender);
		        setAge(age);
		        setWeight(weight);
		        setAcquisitionDate(acquisitionDate);
		        setAcquisitionLocation(acquisitionCountry);
		        setTrainingStatus(trainingStatus);
		        setReserved(reserved);
		        setInServiceCountry(inServiceCountry);
		        setTailLength(tailLength);
		        setHeight(height);
		        setBodyLength(bodyLength);
		        setSpecies(species);
		   
		        
}
	// Accessor && Mutator Methods 
	
	public String getSpecies() {
		return species;
	}
	private void setSpecies(String monkeySpecies) {
		species = monkeySpecies;
		
	}
	public String getBodyLength() {
		return bodyLength;
		}
	
	private void setBodyLength(String monkeyBodyLength) {
		bodyLength = monkeyBodyLength;
			
		}
	public String getHeight() {
		return height;
			}
	private void setHeight(String monkeyBodyLength) {
		bodyLength = monkeyBodyLength;
				
			}
	public String tailLength() {
		return tailLength;
		}
    private void setTailLength(String monkeyTailLength) {
    	tailLength = monkeyTailLength;
			
		}
		

   
}
