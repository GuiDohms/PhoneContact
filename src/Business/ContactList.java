package Business;

import java.util.*;

public class ContactList {
	private ArrayList<Contact> contactList;
	
	public ContactList(){
		ArrayList<Contact> contactList = new ArrayList<Contact>();
	}
	
	public boolean addContact(Contact contact){
		if(contact.equals(contactList.equals(contact))){
			return false;
		}else{
			contactList.add(contact);
		}
		return true;
	}
	
	public boolean removeContact(Contact contact){
		if(contact.equals(contactList.equals(contact))){
			contactList.remove(contact);
			return true;
		}else{
			return false;
		}
	}
	
	public void alfabeticListing(){
		
	}
	
	public Contact findByName(Contact contact){
		return contact;
	}
	
	
	
	
	
}
