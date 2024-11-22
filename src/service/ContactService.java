package service;

import java.util.ArrayList;
import java.util.List;
import model.Contact;

public class ContactService {
    static List<Contact> ContactList = new ArrayList<>();

    public void addContact(String phone, String group, String name, String gender, String address, String dateOfBirth, String email){
        Contact contact = new Contact(phone, group, name, gender, address, dateOfBirth, email);
        ContactList.add(contact);
        System.out.println("Them danh ba thanh cong");
    }

    public void addContact(Contact contact){
        ContactList.add(contact);
    }

    public void displayAllContact(){
        if(ContactList.isEmpty()) {
            System.out.println("Danh ba trong!");
            return;
        }
        for(Contact Contact: ContactList){
            System.out.println(Contact.toString());
        }
    }

    public boolean findContactByPhone(String phone){
        for(Contact Contact: ContactList){
            if(Contact.getPhoneNumber().equalsIgnoreCase(phone)){
                return true;
            }
        }
        return false;
    }

    public void displayContactAfterFind(String phone) {
        for (Contact contact : ContactList) {
            if (contact.getPhoneNumber().equalsIgnoreCase(phone)) {
                System.out.println("Tim thay thong tin:");
                System.out.println(contact.toString());
                return;
            }
        }
    }

    public Contact findContactByName(String name){
        for(Contact Contact: ContactList){
            if(Contact.getName().equalsIgnoreCase(name)){
                return Contact;
            }
        }
        return null;
    }

    public void deleteContactByPhone(String phone){
        Contact temp = new Contact();
        for(Contact Contact: ContactList){
            if(Contact.getPhoneNumber().equalsIgnoreCase(phone)){
                    temp = Contact;
                    break;
            }
        }
        ContactList.remove(temp);
    }

    public void updateContact(String phone, String group, String name, String gender, String address, String dateOfBirth, String email){
        for(Contact Contact: ContactList){
            if(Contact.getPhoneNumber().equalsIgnoreCase(phone)){
                Contact.setGroup(group);
                Contact.setName(name);
                Contact.setGender(gender);
                Contact.setAddress(address);
                Contact.setDateOfBirth(dateOfBirth);
                Contact.setEmail(email);
            }
            return;
        }
    }
}
