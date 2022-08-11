package blackout;

public class UserLoadshedding extends Users {
	int block;
	String suburb;
	
	//enumerator class for the various loadshedding stages from stage 2-5
	enum Stage {
		Two,
		Three,
		Four,
		Five,
		
	};
	Stage stage;
	
	//UserLoadshedding class constructor with explicit inheritance of the superclass Users 
	UserLoadshedding(String name, String surname, String emailAddress, int block, String suburb, Stage stage) {
		super(name, surname, emailAddress);
		
		this.block = block;
		this.suburb = suburb;
		this.stage = stage;
		
	}
	
	
	//Method detailing what the various stages are using switch statements
	
	public void loadsheddingTimes(int block)
    {
		switch (stage) {
        case Two:
        	
        	System.out.println("Your are on stage 2 loadshedding");
        	
        	if(block == 15) {
        		
        		System.out.println("Times: 08:00 - 10:00");
        		
        	}
        	
        	else if(block == 2) {
        		
        		System.out.println("Times: 12:00 - 14:00");
        		
        	}
        	
        	else {
        		
        		
        	}
        	
        	        	
             break;
        case Three:
        	
        	
            System.out.println("Your are on stage 3 loadshedding");
            
            if(block == 15) {
        		
        		System.out.println("Times: 08:00 - 10:00");
        		
        	}
        	
        	else if(block == 2) {
        		
        		System.out.println("Times: 12:00 - 14:00");
        		
        	}
            
        	else {
        		
        		
        	}
            
            break;
        case Four:
            System.out.println("Your are on stage 4 loadshedding");
            break;
        default:
            System.out.println("Your are on Stage 5 loadshedding");
            break;
        }
    }
	
	
	//UserLoadshedding constructor 

	public UserLoadshedding(Stage stage) {
		
		super();
		
		this.stage = stage;
		
	}
	
	
	
	

	

}
