import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import User.Diary;
import User.UserInfo;
import userServices.userInfoService;

public class ContactsTest {

	
	@BeforeEach
	public void startClass() {
		Diary d1=new Diary();
		userInfoService u=new userInfoService();
		System.out.println("Test case started");
	}
	//To Check Number Format Exception
	@Test
	public void verifyMobNo() throws NumberFormatException{
		try {Diary d1=new Diary();
			d1.addUserToDiary(userInfoService.createDiary("satya",12345678,"satya.rao"));
			d1.addUserToDiary(userInfoService.createDiary("Adhiraj",1236735638,"adhiraj.patel"));
			//"this case won't run"//d1.addUserToDiary(userInfoService.createDiary("Eddy",0345678,"eddy.edds"));
			d1.addUserToDiary(userInfoService.createDiary("navdeep",98765678,"navdeep.rao"));
			
		}catch(Exception e){
			System.out.println("Wrong Format");
		}
	}
	
	//To check Not NUll Case of name 
	@Test
	public void checkForName() {

		Diary d1 = null;
		UserInfo u1 = userInfoService.createDiary("satya",12345678,"satya.rao");
		userInfoService.createDiary("Adhiraj",1236735638,"adhiraj.patel");
		assertNotNull(u1.getName());
	}
	
	
	//To check NUll Case name
	public void checkForisNull() {

		Diary d1 = null;
		UserInfo u1 = userInfoService.createDiary("",12345678,"satya.rao");
		userInfoService.createDiary("",1236735638,"adhiraj.patel");
		assertNull(u1.getName());
	}
	
	//To check Not NUll Case  MAIL
		@Test
		public void checkForMail() {

			Diary d1 = null;
			UserInfo u1 = userInfoService.createDiary("satya",12345678,"satya.rao");
			userInfoService.createDiary("Adhiraj",1236735638,"adhiraj.patel");
			assertNotNull(u1.getMailId());
		}
		
		
		//To check NUll Case MAIL
		public void checkForMailisNull() {

			Diary d1 = null;
			UserInfo u1 = userInfoService.createDiary("",12345678,"");
			userInfoService.createDiary("Adhiraj",1236735638,"");
			assertNull(u1.getMailId());
		}
	
	
	
	
}
