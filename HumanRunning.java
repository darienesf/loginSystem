package Review326;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@SuppressWarnings("unused")
public class HumanRunning {

	public static void seperator(){
		System.out.println("--------------------");
	}
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
	    Date dateobj = new Date();
		
	    //newHUMAN
		Human human1;
		
		System.out.println("Enter your name...");
		String name = kb.nextLine();
		/*System.out.println("Enter your birth month...");
		String birthday = kb.next();
		System.out.println("Enter your birthyear...");
		int birthyear = kb.nextInt();
		System.out.println("Enter your age...");
		int age = kb.nextInt();
		System.out.println("Enter your weight...");
		double weight = kb.nextDouble();
		System.out.println("Enter your horoscope...");
		String horoscope = kb.next(); */
	
		human1 = new Human(name, null, 1, 1, 1, null);
		
		//human1.PrintInfo();
		
		String[] username = new String[100];
		int[] password = new int[100];
		
		username[1] = "darien27";
		password[1] = 4011;
		
		
		int none = 1;
		
		System.out.println("Welcome to ModernHero!");
		seperator();
		System.out.println("Enter your username... if you do not have one please enter 'newuser'");
		String attemptUser = kb.nextLine();
		int count = 1;
		for (int usercount = count; usercount < 30; usercount--){
			switch(attemptUser){
			case "darien27":
				attemptUser = username[usercount];
				break;
			
			case "newuser":
				System.out.println("Enter your desired username!");
				boolean gate = true;
				if(gate == true){
				attemptUser = kb.nextLine();
				attemptUser = username[usercount];
				
				if(attemptUser == username[usercount]){
					attemptUser = username[usercount++];
					
					System.out.println("New User Added:" + username[usercount++]);
					
					break;
				}
				else
					System.out.println("Welcome " + name+ "." + " Please enter 0000 to register your password.");
					break;
				}	
			}
			if(attemptUser == username[usercount]){
				
				System.out.println("Welcome " + name + ", please enter your password.");
			
				break;
			} //if
			else {
				System.err.println("Outsider Entry Recorded!");
				attemptUser = username[usercount];
				System.out.println("PRINT OF USERNAME:" + username[usercount]);
				if(attemptUser == username[usercount]){
					break;
				}
				}
			
	} //for
		boolean newuser = false;
		
		while(!newuser==true){
		int attemptPass = kb.nextInt();
		for(int passcount = count; passcount < 30; passcount++){
				switch(attemptPass){
					case 1:
						attemptPass = password[passcount];
						passcount++;
						break;
						
					case 0000:
						System.out.println("Enter new password below");
						boolean gate1 = true;
						if(gate1 == true){
						attemptPass = kb.nextInt();
						attemptPass = password[passcount++];
						passcount++;
						if(attemptPass == password[passcount++]){
							System.out.println("Password saved!");
							break;
					}
						}
				}
				if(attemptPass == password[passcount]){	
					System.out.println("Password correct, how can I assist you today " + name + "?");
					break;
				} //if
				else { 
					System.err.println("That is not the password associated with this user!");
					attemptPass = kb.nextInt();
				if(attemptPass == password[passcount]){
					break;
				}
				}
				break;
		} //for
		break;} 
		kb.close();
		}
		
		
		
	/*	while(username[1].equals(attemptUser) && !password[1].equals(attemptPass)) {
			System.err.println("Incorrect credentials, please try again!");
			attemptPass = kb.nextInt();
			
		}
		if(username.equals(attemptUser) && password.equals(attemptPass)) {
			System.out.println("You are logged in!");
		}
		
		kb.nextLine();
		kb.close();
		*/
	
	}

