package Review326;

import java.util.*;

@SuppressWarnings("unused")
public class HumanRunning {

	public static void seperator(){
		System.out.println("--------------------");
	} //seperator end
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		boolean newuser;
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
					if(attemptUser == username[usercount]){
						System.out.println("Welcome " + name + ", please enter your password.");
						newuser = false;
						break;
					}//if 
				}//darien27 end
			switch(attemptUser){
			case "newuser":
				System.out.println("Enter your desired username!");
				attemptUser = kb.nextLine();
				attemptUser = username[usercount];
			  		
				if (attemptUser == username[usercount]){
					System.out.println("New User Added:" + username[usercount]);
					System.out.println("Welcome " + name+ "." + " Please enter 0000 to register your password.");
					newuser = true;
					break;
				}//if end	
			}//newuser end
	} //for
		
		if (newuser==true){
		int attemptPass = kb.nextInt();
		for(int passcount = count; passcount < 30; passcount++){
				switch(attemptPass){
					case 4011:
						attemptPass = password[passcount];
						System.out.println("Password correct, welcome!");
						passcount++;
						break;
				}//case1 end
				switch(attemptPass){	
					case 0000:
						System.out.println("Enter new password below");
						attemptPass = kb.nextInt();
						attemptPass = password[passcount];
						passcount++;
						if(attemptPass == password[passcount]){
							System.out.println("Password saved!");
							break;
					}// if end
						}//switch end
				if(attemptPass == password[passcount]){	
					System.out.println("How can I assist you today ?");
					kb.close();
					break;
				} //if end
				else { 
					System.err.println("That is not the password associated with this user!");
					attemptPass = kb.nextInt();
				if(attemptPass == password[passcount]){
					kb.close();
					break;
				}//if end
				}//else end
		}//for loop
		}//newuser end
	}//humanRunning.java
		
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

