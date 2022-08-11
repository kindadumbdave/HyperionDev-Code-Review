package blackout;

public abstract class Users {
	
	String name;
	String surname;
	String emailAddress;
	
	//Users class constructor with arguments for explicit inheritance
	
	public Users(String name, String surname, String emailAddress){
		
		this.name = name;
		this.surname = surname;
		this.emailAddress = emailAddress;
		
	}

	//User class constructor with no arguments for implicit inheritance 
	public Users() {
	
	}

	
	

}
