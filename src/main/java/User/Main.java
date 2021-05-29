package User;

import java.util.*;


import userServices.userInfoService;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
				  String name;
				  int no;
				  String mail;

				      Scanner sc= new Scanner(System.in);
				      
				      System.out.println("Your Contacts!");
				     Diary d= userInfoService.createDiary();
				     userInfoService u1=new userInfoService();
				     
				  
				      boolean add = true;
					
				      while(add)
						{
							System.out.println("\nMenu");
							System.out.println("1 Add a new contact");
							System.out.println("2 Display Starred Contacts");
							System.out.println("3 Delete a contact");
							System.out.println("4 View Your Contacts");
							System.out.println("5 Delete Contact Diary");
							System.out.println("6 EXIT");
						    System.out.println("Select a menu option\n");
						    
						    
						    int choice = sc.nextInt();
							if (choice <1 || choice >6)
							{
								System.out.println("Enter a value between 1 and 6:");
							}
							else
							{
								switch(choice)
								{
								case 1:
									System.out.print ("User Name: ");
						            name = sc.next();
						          

						            System.out.print ("Enter the Number: ");
						             no= sc.nextInt();
						             if(String.valueOf(no).charAt(0)=='0') {   
						             try
						             { 
						                 
						                 throw new MyException("Invalid Number"); 
						                 
						                  
						             } 
						             catch (MyException ex) 
						             { 
						                
						   
						                 System.out.println(ex.getMessage()); 
						             } }

						            System.out.print ("Enter Mail Id : ");
						             mail = sc.next();
						             
						             int verify=d.getUserByUserNo(no);
						             if(verify==1) {
						            	 System.out.println("User Already Exists");
						             }
						             else {
						            	 d.addUserToDiary(userInfoService.createDiary(name,no,mail));
						             }
						             
						             System.out.println("Do you want to add it to Starred Contacts..??/n['Y'/'N']");
						             char c = sc.next().charAt(0); 
						             
						             if(c=='Y') {
						            	 d.addUserToStarred(userInfoService.createStarred(name,no,mail));
						             }

								    break;
									
								case 2:
									
									System.out.println("Displaying your Contacts in your Starred List");
									  d.displayStarred();
									  break;
									    
								case 3:
									
									
									System.out.print ("Enter the Number: ");
						             no= sc.nextInt();
						             
						             d.removeFromDiary(d.removeByUserNo(no));
						             
						             
									  
									
									    break;
									
								case 4:
									   System.out.println("Displaying your Contacts in your Diary");
									  d.displayContacts();
									  break;
								case 5:
									    u1.clearDiary(d);
								       
								        break;
									
								case 6:
									//exit
									add= false;
									System.out.println("Exit to menu");
									break;
				 
								}
							}
						}
				      

			}

		}
class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        
        super(s); 
    } 
} 
		
