import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;
public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    static private ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    static String printType = "";
    
    public static void printAnimals(String type) {
    	String listType = type;
        
        
    	if (listType.equals("Dog")) {
    		System.out.println(dogList.toString());
    	}
    	else if (listType.equals("Monkey")) {
    		System.out.println(monkeyList.toString());
    	}
    	else if (listType.equals("All")) {
    		System.out.println(dogList.toString() + "" + monkeyList.toString());
    	}
    	else {
    		System.out.print("Error");
    	}
        System.out.println("The method printAnimals needs to be implemented");

    }
    
    public static void main(String[] args) {

        boolean menuLoop = true;
        int choice = 0;
        String menuSelect = "";
        
        
        
        
        initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.

    

    // This method prints the menu options
    while (menuLoop = true) {
    	displayMenu();
    	Scanner scnr = new Scanner(System.in);
    	menuSelect = scnr.next();
    	
    	// Menu loop start
    	if (menuSelect.equals("q")){ // quits menu/app
    		break;
    	}
    	else if (menuSelect.equals("1")) { // in take new dog
    		intakeNewDog(scnr);
    		break;
    	}
    	else if (menuSelect.equals("2")) { // in take new monkey
    		intakeNewMonkey(scnr);
    		break;
    	}
    	else if (menuSelect.equals("3")) {
    		reserveAnimal(scnr); // reserve an animal
    		break;
    	}
    	else if (menuSelect.equals("4")) { // print all dogs
    		printType = "4";
    		printDogs();
    		break;
    	}
    	else if (menuSelect.equals("5")) { // print all monkeys
    		printType = "5";
    		printMonkeys();
    		break;
    	}
    	else if (menuSelect.equals("6")) { // print all not reserved
    		printType = "6";
    		printAnimals(); // 
    		break;
    	}
    	else {
    		System.out.print("Error, please input correct option");
    		continue;
    	}
    	
    
    	} // Menu loop end
    }
    
    	

    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Tony", "Male", "3", "40", "01-01-2021", "United States", "intake", false, "Brazil", "14", "50", "30", "Capuchin");
        monkeyList.add(monkey1);
        
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scnr){
          String name = "";
    	  
    	  System.out.println("What is the dog's name?");
    	  name = scnr.next();

    	  System.out.print("Please input the dog's breed");
    	  String breed = scnr.next();

    	  System.out.print("Please input the dog's gender");
    	  String gender = scnr.next();

    	  System.out.print("Please input the dog's age");
    	  String age = scnr.next();

    	  System.out.print("Please input the dog's weight");
    	  String weight = scnr.next();

    	  System.out.print("Please input the dog's aquisition date");
    	  String aqcDate = scnr.next();

    	  System.out.print("Please input the dog's aquisition location");
    	  String acqLocation = scnr.next();

    	  System.out.print("Please input the dog's training status");
    	  String trainingStatus= scnr.next();



    	  System.out.println("Please input the dog's service country");
    	  String serviceCountry = scnr.nextLine();

    	  RescueAnimal dog4 = new Dog(name, breed, gender, age, weight, aqcDate, acqLocation, trainingStatus, false,
    	                              serviceCountry);
    	  for(Dog dog: dogList) {
    	    if(dog.getName().equalsIgnoreCase(dog4.getName())) {
    	      System.out.println("This dog is already in our system");
    	      return; //returns to menu
    	    }
    	  }

    	  dogList.add((Dog) dog4);
    	  
    	  System.out.print("Thank you, we have taken in a new dog!"); // print statement to tell confirm to user that dog has been added
    	}


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scnr){
            String gender = "";
            String age = "";
            String weight = "";
            String aqcDate = "";
            String acqCountry = "";
            String trainingStatus = "";
            String serviceCountry = "";
            
            
        	
        	
        	
        	System.out.println("What is the monkey's name?");
            String name = scnr.nextLine();
            for(Monkey monkey: monkeyList) {
                if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return;
                }
            }
                
                
                System.out.print("Please input the monkey's name");
                name = scnr.next();
                
                System.out.print("Please input the monkey's gender");
                gender = scnr.next();
                
                System.out.print("Please input the monkey's age");
                age = scnr.next();
                
                System.out.print("Please input the monkey's weight");
                weight = scnr.next();
                
                System.out.print("Please input the monkey's aquisition date");
                aqcDate = scnr.next();
                
                System.out.print("Please input the monkey's aquisition country");
                acqCountry = scnr.next();
                
                System.out.print("Please input the monkey's training status");
                trainingStatus= scnr.next();
                
                System.out.print("Please input the monkey's service country");
                serviceCountry = scnr.next();
               
                
                
                System.out.print("Please input the monkey's tailLength");
                String tailLength = scnr.next();
                
                System.out.print("Please input the monkey's height");
                String height= scnr.next();
                
                System.out.print("Please input the monkey's body length");
                String bodyLength = scnr.next();
                
                System.out.print("Please input the monkey's species");
                String species = scnr.next();
             
                
				
				Monkey monkey2 = new Monkey(name, gender, age, weight, aqcDate, acqCountry, trainingStatus,
                		false, serviceCountry, tailLength, height, bodyLength,  species);
                
				monkeyList.add((Monkey) monkey2);
				System.out.print("Thank you, we have taken in a new monkey!");
				
				
	       
        }
        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scnr) {
            System.out.println("Please input monkey or dog for the type of animal you want to reserve");
            String reserveAnimalChoice = scnr.next();
            System.out.println("You entered : " + reserveAnimalChoice);
            
            if (reserveAnimalChoice.equals("monkey")) {
            	System.out.println("Please enter monkey's service country");
            	String country = scnr.next();
                for(Monkey obj: monkeyList) {
            		if(obj.getInServiceLocation().equalsIgnoreCase(country)) {
            			obj.setReserved(true);
            			return;
            		}
            	}
            }
            
            else if (reserveAnimalChoice.equals("dog")) {
            	System.out.println("Please enter dog's service country");
            	String country = scnr.next();
                for(Dog obj: dogList) {
            		if(obj.getInServiceLocation().equalsIgnoreCase(country)) {
            			obj.setReserved(true);
            			return;
            		}
            		}
            }
            else {
            	System.out.println("Not a valid option");
            	displayMenu();
            	
            
            }
        }
                
            
        

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printDogs() {
        	if (printType.equals("4")) {
        		String dogPrint = dogList.toString();
        		System.out.println("List of Dogs : " + dogPrint);
        		
        	}
        }
        public static void printMonkeys() {
        	if (printType.equals("5")) {
        		String monkeyPrint = monkeyList.toString();
        		System.out.println("List of Dogs : " + monkeyPrint);
        		
        	}
        }
        public static void printAnimals() {
                if (printType.equals("6")) {
            	System.out.println("List of all animals: ");
        	    System.out.println(dogList.toString());
        	    System.out.println(monkeyList.toString());
                }
        }
        	
                
    	
        
        }
