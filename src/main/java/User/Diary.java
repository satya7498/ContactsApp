package User;

import java.util.ArrayList;
import java.util.List;





public class Diary {
	
	private List<UserInfo> items=new ArrayList<UserInfo>();
	private List<StarredContacts> list1=new ArrayList<StarredContacts>();
	
	
	
	public List<StarredContacts> getList1() {
		return list1;
	}




	public void setList1(List<StarredContacts> list1) {
		this.list1 = list1;
	}




	public List<UserInfo> getItems() {
		return items;
	}




	public void setItems(List<UserInfo> items) {
		this.items = items;
	}




	public int getUserByUserNo(int userno) {
		
		int ur=0;
		List<UserInfo> items=this.getItems();
		for(UserInfo i:items) {
			 if(i.getMobNo()==userno) {
				 ur=1;
				 break;
			 }
			 else
				 return 0;
		}
		
		return ur;
	}
	
public UserInfo removeByUserNo(int userno) {
		
		UserInfo ur=null;
		List<UserInfo> items=this.getItems();
		for(UserInfo i:items) {
			 if(i.getMobNo()==userno) {
				 ur=i;
				 break;
			 }
			 else
				 return null;
		}
		
		return ur;
	}
	
	public boolean addUserToDiary(UserInfo u) {
		
		return this.items.add(u);
		
	
	
}
	
public boolean addUserToStarred(StarredContacts s) {
		
		return this.list1.add(s);
		
	
	
}
public boolean removeFromDiary(UserInfo u) {
		
		return this.items.remove(u);
		
	
	
}
	
	
	
	
	
	
	public void displayContacts() {
		// TODO Auto-generated method stub
		for(UserInfo i:items)
	       {
			System.out.println(i);
	       }
		}
	
	
	public void displayStarred() {
		// TODO Auto-generated method stub
		for(StarredContacts l:list1)
	       {
			System.out.println(l);
	       }
		}
    
}
