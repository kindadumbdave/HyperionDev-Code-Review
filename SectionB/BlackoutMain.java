package blackout;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;


public class BlackoutMain {
	
	public static void main(String[] args) {
		HashMap<String, String> schedules = new HashMap<String, String>();
		
		//dynamic times with user input??
		String meetingTime = "10:00 - 12:00";
		
		
		//time to be stored correctly
		schedules.put("george", "10:00 - 12:00");
		schedules.put("teboho", "12:00 - 14:00");
		schedules.put("david", "08:00 - 10:00");
		schedules.put("bonolo", "10:00 - 12:00");
		schedules.put("sboniso", "20:00 - 22:00");
		schedules.put("peter", "09:00 - 11:00");
		
		
		
		
		Scanner inputUser = new Scanner(System.in); 
			
			
			int a = 1;
			int u = 2;
			System.out.println("Scheduling meeting for 14/07/2022 " + meetingTime);
			
			System.out.println("Enter 1 to query availability for all users");
			System.out.println("Enter 2 to query availavility for a single user");
			
			int option = inputUser.nextInt();
			
			if(option == a) {
				
				for (Entry<String, String> entry : schedules.entrySet()) {
				    String key = entry.getKey();
				    String value = entry.getValue();
				    // ...
				    if(value==meetingTime) {
				    	
				    	 System.out.println(key + " Is loadshedding during this period. \n Loadshedding times " + value +"\n-------------------------------------");	
				    	
				    	
				    	
				    }
				    else {
				    	  System.out.println(key + " Is available during this period \n -------------------------------------");	
				    }
				  
				}
			}
			
			else if (option == u){
				
				Scanner inputUser1 = new Scanner(System.in);
				System.out.println("Enter username:");
				
				String user = inputUser1.nextLine().toLowerCase();
				
							
				String schedule = schedules.get(user);
				
				if(meetingTime.equals(schedule)) {
					
					System.out.println(user + " Is loadshedding");
					
				}
				else {
					System.out.println(user + " is not loadshedding");
					
				}
				
			
			
			
            
			
		}
		
			
		}
	
		
		
		
		

	}


